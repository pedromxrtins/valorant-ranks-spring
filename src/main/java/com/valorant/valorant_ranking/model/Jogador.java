package com.valorant.valorant_ranking.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Player precisa ser informado")
    private String nome;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Rank precisa ser informado")
    private Rank rank;

    private LocalDateTime ultimaVezOnline;

    public Jogador() {
    }

    public Jogador(Long id, String nome, Rank rank, LocalDateTime ultimaVezOnline) {
        this.id = id;
        this.nome = nome;
        this.rank = rank;
        this.ultimaVezOnline = ultimaVezOnline;
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

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public LocalDateTime getUltimaVezOnline() {
        return ultimaVezOnline;
    }

    public void setUltimaVezOnline(LocalDateTime ultimaVezOnline) {
        this.ultimaVezOnline = ultimaVezOnline;
    }
}
