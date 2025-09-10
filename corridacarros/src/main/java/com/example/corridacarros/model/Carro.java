package com.example.corridacarros.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Carro {
    @JsonProperty
    private String cor;
    @JsonProperty
    private int posicao;

    public Carro() {}

    public Carro(String cor) {
        this.cor = cor;
        this.posicao = 0;
    }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getPosicao() { return posicao; }
    public void setPosicao(int posicao) { this.posicao = posicao; }

    public void andar() {
        this.posicao += (int)(Math.random() * 5) + 1;
    }
}
