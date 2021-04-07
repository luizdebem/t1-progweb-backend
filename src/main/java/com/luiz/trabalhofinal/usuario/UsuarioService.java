package com.luiz.trabalhofinal.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void updateUsuario(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.findById(usuario.getId()).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Usuário não encontrado."));

        usuarioExistente.setCPF(usuario.getCPF());
        usuarioExistente.setDataDeNascimento(usuario.getDataDeNascimento());
        usuarioExistente.setEstadoCivil(usuario.getEstadoCivil());
        usuarioExistente.setLogin(usuario.getLogin());
        usuarioExistente.setSenha(usuario.getSenha());
        usuarioExistente.setNomeCompleto(usuario.getNomeCompleto());
        usuarioExistente.setSexo(usuario.getSexo());
        usuarioRepository.save(usuarioExistente);

    }

    public void deleteUsuario(Long usuarioId) {
        boolean usuarioExiste = usuarioRepository.existsById(usuarioId);

        if (!usuarioExiste) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Usuário não encontrado.");
        }

        usuarioRepository.deleteById(usuarioId);
    }
}
