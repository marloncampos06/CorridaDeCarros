package com.example.corridacarros.service;

import com.example.corridacarros.model.Carro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CorridaService {

    private final List<String> cores = List.of("verde","vermelho","azul","amarelo");
    private final List<Carro> carros = new ArrayList<>();
    private final int linhaChegada = 70;

    public void iniciarCorrida() {
        carros.clear();
        for(String cor : cores){
            carros.add(new Carro(cor));
        }
    }

    public List<Carro> atualizarPosicoes() {
        for(Carro carro : carros){
            carro.andar();
        }
        return carros;
    }

    public String verificarVencedor() {
        for(Carro carro : carros){
            if(carro.getPosicao() >= linhaChegada){
                return carro.getCor();
            }
        }
        return null;
    }
}
