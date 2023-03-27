package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    ArrayList<Short> ages = SystemLoop.run();
    Relatory.make(ages);
  }
}
