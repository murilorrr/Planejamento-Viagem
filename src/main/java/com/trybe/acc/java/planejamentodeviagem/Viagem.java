package com.trybe.acc.java.planejamentodeviagem;

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
    System.out.println(tempoViagem);
    String stringDeInformaçõesEmbebedadas = "Partida: 22/01/2022 18:30:00\n" +
    "Origem: Recife\n\n" +
    "Chegada: 24/01/2022 06:30:00\n" +
    "Destino: Tokyo\n" +
    "Atenção: o desembarque em Tokyo será: 24/01/2022 06:30:00 no horário de Tokyo e 23/01/2022 18:30:00 no horário de Recife";
    return stringDeInformaçõesEmbebedadas;
  }
}
