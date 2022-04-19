package com.trybe.acc.java.planejamentodeviagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
  private int velocidadeMediaDoVoo = 700;
  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    int duracao = (int) (distanciaKm / velocidadeMediaDoVoo);
    return duracao;

  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
        String stringDeInformaçõesEmbebedadas = "Partida: " +
        embarque + "\n" +
        "Origem: " + origem + "\n\n" +
        "Chegada: " + desembarque + "\n" +
        "Destino: "+ destino + "\n";

    
      return stringDeInformaçõesEmbebedadas;
  }
}
