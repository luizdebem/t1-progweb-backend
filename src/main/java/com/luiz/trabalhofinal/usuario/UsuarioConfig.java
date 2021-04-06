package com.luiz.trabalhofinal.usuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Date;

@Configuration
public class UsuarioConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository repository) {
        return args -> {
            Usuario josias = new Usuario("josias", "123123", "Josias", "222.222.222.22", new Date(), Sexo.MASCULINO, EstadoCivil.SOLTEIRO);
            Usuario luiz = new Usuario("luizdebem", "123123", "Luiz Guilherme de Bem", "111.111.111.11", new Date(), Sexo.MASCULINO, EstadoCivil.SOLTEIRO);
            repository.saveAll(Arrays.asList(josias, luiz));
        };
    }
}
