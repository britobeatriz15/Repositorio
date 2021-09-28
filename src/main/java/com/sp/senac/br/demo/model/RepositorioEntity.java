package com.sp.senac.br.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "repositorio")
public class RepositorioEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String url;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String linguagens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    @Override
    public String toString() {
        return "RepositorioEntity{" +
                "url='" + url + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", linguagens='" + linguagens + '\'' +
                '}';
    }
}
