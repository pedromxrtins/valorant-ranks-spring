package com.valorant.valorant_ranking.repository;


import com.valorant.valorant_ranking.model.Jogador;
import com.valorant.valorant_ranking.model.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import com.valorant.valorant_ranking.model.Rank;


import java.util.List;



public interface JogadorRepository extends JpaRepository < Jogador, Long > {
        List<Jogador> findByNomeContaining (String nome);
        List<Jogador> findByRank (Rank rank);
    }
