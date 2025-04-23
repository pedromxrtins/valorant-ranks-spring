package com.valorant.valorant_ranking.controller;

import com.valorant.valorant_ranking.model.Jogador;
import com.valorant.valorant_ranking.repository.JogadorRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")

public class JogadorController {

    private final JogadorRepository repository;

    public JogadorController(JogadorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Jogador criar (@RequestBody @Valid Jogador jogador){
        return repository.save(jogador);
    }

    @GetMapping
    public List<Jogador> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Jogador atualizar(@PathVariable Long id, @RequestBody @Valid Jogador jogador) {
        jogador.setId(id);
        return repository.save(jogador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
