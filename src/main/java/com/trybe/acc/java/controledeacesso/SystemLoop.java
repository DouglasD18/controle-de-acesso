package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemLoop {
  /**
   * Método principal.
   */
  public static ArrayList<Short> run() {
    short option = 1;
    ArrayList<Short> ages = new ArrayList<Short>();
    Scanner scanner = new Scanner(System.in);
    boolean keep = true;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      option = scanner.nextShort();
      if (option == 2 && ages.size() == 0) {
        System.out.println("Para gerar o relatório é necessário ser inserido ao menos um cliente!");
        System.out.println("-----------");
      } else if (option == 2) {
        keep = false;
        break;
      } else if (option == 1) {
        System.out.println("Entre com a sua idade:");
        short age = scanner.nextShort();
        if (age < 18) {
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
          ages.add(age);
        } else if (age >= 18 && age < 50) {
          System.out.println("Pessoa adulta, catraca liberada!");
          ages.add(age);
        } else {
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
          ages.add(age);
        }
      } else {
        System.out.println("Entre com uma opção válida!");
        System.out.println("-----------");
      }
    } while (keep);

    scanner.close();
    return ages;
  }
}
