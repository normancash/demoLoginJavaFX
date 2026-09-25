package ni.edu.uam.demologin.repository;

import ni.edu.uam.demologin.config.PostgreSQLConnection;
import ni.edu.uam.demologin.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepositoryJdbc implements UsuarioRepository{

    private final PostgreSQLConnection connection;


    @Override
    public List<Usuario> findAl() {
        String sql = """
                   SELECT id,nombre,apellido,
                          correo,rutaFoto
                   from usuario
                   order by nombre asc
                """;
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection con = connection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                Usuario usuario = new Usuario();

            }
        }
        return List.of();
    }

    public UsuarioRepositoryJdbc(PostgreSQLConnection connection) {
        this.connection = connection;
    }

    @Override
    public Optional<Usuario> findById(String id) {
        return Optional.empty();
    }

    @Override
    public void save(Usuario usuario) {

    }
}
