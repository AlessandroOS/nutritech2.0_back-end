package com.alessandro.nutritech.domain.entity;

import com.alessandro.nutritech.domain.enumaration.Genero;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Genero genero;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="dieta_id")
    private List<Dieta> dietas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "peso_id")
    private Peso peso;
    private Double altura;

    private String email;
    private String senha;

    public Paciente() {}

    public Paciente(Long id, String nome, Genero genero, List<Dieta> dietas, Peso peso, Double altura, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.dietas = dietas;
        this.peso = peso;
        this.altura = altura;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGender() {
        return genero;
    }

    public void setGender(Genero genero) {
        this.genero = genero;
    }

    public List<Dieta> getDietas() {
        return dietas;
    }

    public void setDietas(List<Dieta> dietas) {
        this.dietas = dietas;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
