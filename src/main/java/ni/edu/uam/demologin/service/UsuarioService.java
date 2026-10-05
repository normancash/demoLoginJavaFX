package ni.edu.uam.demologin.service;

import ni.edu.uam.demologin.model.Usuario;
import ni.edu.uam.demologin.repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public List<Usuario> findAll() throws Exception{
        return usuarioRepository.findAll();
    }
    public Usuario findById(String id) throws Exception{
        return usuarioRepository.findById(id).get();
    }
    public void save(Usuario usuario) throws Exception{
        usuarioRepository.save(usuario);
    }
}
