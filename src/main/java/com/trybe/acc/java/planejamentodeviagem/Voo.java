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
      String pattern = "DD/MM/YYYY HH:mm:ss";
      DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern(pattern);
        String stringDeInformaçõesEmbebedadas = "Partida: " +
        formatadorData.format(LocalDateTime.parse(embarque)) + "\n" +
        "Origem: " + origem + "\n\n" +
        "Chegada: " + formatadorData.format(LocalDateTime.parse(desembarque)) + "\n" +
        "Destino: "+ destino + "\n" +
        "Atenção: o desembarque em "+ destino +
        "será: " + formatadorData.format(LocalDateTime.parse(desembarque)) +
        " no horário de "+ destino +
        " e "+ formatadorData.format(LocalDateTime.parse(embarque)) +
        " no horário de " + origem;
    
      return stringDeInformaçõesEmbebedadas;
  }
}
