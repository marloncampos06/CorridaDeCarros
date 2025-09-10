package com.example.corridacarros.controller;

import com.example.corridacarros.model.Carro;
import com.example.corridacarros.service.CorridaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corrida")
@CrossOrigin
public class CorridaController {

    private final CorridaService corridaService;
    private String corJogador;

    public CorridaController(CorridaService corridaService) {
        this.corridaService = corridaService;
    }

    @PostMapping("/iniciar")
    public void iniciar(@RequestParam String cor) {
        this.corJogador = cor;
        corridaService.iniciarCorrida();
    }

    @GetMapping("/posicoes")
    public List<Carro> getPosicoes() {
        return corridaService.atualizarPosicoes();
    }

    @GetMapping("/vencedor")
    public String getVencedor() {
        return corridaService.verificarVencedor();
    }

    @GetMapping("/corJogador")
    public String getCorJogador() {
        return corJogador;
    }
}
