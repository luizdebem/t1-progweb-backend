package com.luiz.trabalhofinal.usuario;

import java.util.Date;

public class Usuario {
    private Long id;
    private String login;
    private String senha;
    private String nomeCompleto;
    private String CPF;
    private Date dataDeNascimento;
    private Sexo sexo;
    private EstadoCivil estadoCivil;

    public Usuario() {
    }

    public Usuario(Long id, String login, String senha, String nomeCompleto, String CPF, Date dataDeNascimento, Sexo sexo, EstadoCivil estadoCivil) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public Usuario(String login, String senha, String nomeCompleto, String CPF, Date dataDeNascimento, Sexo sexo, EstadoCivil estadoCivil) {
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", CPF='" + CPF + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", sexo=" + sexo +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}
