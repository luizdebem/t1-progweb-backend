package com.luiz.trabalhofinal.usuario;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public Usuario postUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @PutMapping
    public void updateUsuario(@RequestBody Usuario usuario) {
        usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping(path = "{usuarioId}") // variável no path (/users/2 por exemplo)
    public void deleteUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuarioService.deleteUsuario(usuarioId);
    }
}
