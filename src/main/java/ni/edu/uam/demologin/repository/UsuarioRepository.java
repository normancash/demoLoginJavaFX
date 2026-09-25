package ni.edu.uam.demologin.repository;

import ni.edu.uam.demologin.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    List<Usuario> findAl();

    Optional<Usuario> findById(String id);

    void save(Usuario usuario);
}
