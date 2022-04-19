package com.trybe.acc.java.planejamentodeviagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   */
  public Viagem(String embarque,String origem,String destino,double distanciaKm) {
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return voo.retornarTempoVoo(distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    Voo voo = new Voo();
    String pattern = "DD/MM/YYYY HH:mm:ss";
    DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern(pattern);

    String informaçãoVoo = voo.retornarInformacaoVoo(this.embarque, this.origem, tempoViagem.retonarDesembarqueHorarioLocalDestino(), tempoViagem.retonarDesembarqueHorarioLocalOrigem());
    String AtencaoDesembarqueHorarioLocalDestinoEOrigem = 
    "Atenção: o desembarque em "+ this.destino +
    "será: " + formatadorData.format(LocalDateTime.parse(tempoViagem.retonarDesembarqueHorarioLocalDestino())) +
    " no horário de "+ this.destino +
    " e "+ formatadorData.format(LocalDateTime.parse(tempoViagem.retonarDesembarqueHorarioLocalOrigem())) +
    " no horário de " + this.origem;
        return informaçãoVoo + AtencaoDesembarqueHorarioLocalDestinoEOrigem;
  }
}
