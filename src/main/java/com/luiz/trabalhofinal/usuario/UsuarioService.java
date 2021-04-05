package com.luiz.trabalhofinal.usuario;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UsuarioService {
    public List<Usuario> getUsuarios() {
        return Arrays.asList(
                new Usuario(1l, "luizdebem", "123123", "Luiz Guilherme de Bem", "111.111.111.11", new Date(), Sexo.MASCULINO, EstadoCivil.SOLTEIRO)
        );
    }
}
