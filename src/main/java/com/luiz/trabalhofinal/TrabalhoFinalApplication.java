package com.luiz.trabalhofinal;

import com.luiz.trabalhofinal.usuario.EstadoCivil;
import com.luiz.trabalhofinal.usuario.Sexo;
import com.luiz.trabalhofinal.usuario.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class TrabalhoFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrabalhoFinalApplication.class, args);
    }

    @GetMapping
    public List<Usuario> hello() {
        return Arrays.asList(
                new Usuario(1l, "luizdebem", "123123", "Luiz Guilherme de Bem", "111.111.111.11", new Date(), Sexo.MASCULINO, EstadoCivil.SOLTEIRO)
        );
    }

}
