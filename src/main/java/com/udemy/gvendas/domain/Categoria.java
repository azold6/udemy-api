package com.udemy.gvendas.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;

    public Categoria(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return codigo.equals(categoria.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
