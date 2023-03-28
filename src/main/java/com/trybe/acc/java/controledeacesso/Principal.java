package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    short option = 1;
    ArrayList<Short> ages = new ArrayList<Short>();
    Scanner scanner = new Scanner(System.in);
    boolean keep = true;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      option = scanner.nextShort();
      if (option == 2) {
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
    short size = (short) ages.size();
    short young = 0;
    short medium = 0;
    short old = 0;
    for (short index = 0; index < size; index++) {
      short age = ages.get(index);
      if (age < 18) {
        young++;
      } else if (age > 49) {
        old++;
      } else {
        medium++;
      }
    }
    float youngPercent = (float) young / size;
    float mediumPercent = (float) medium / size;
    float oldPercent = (float) old / size;
    DecimalFormat df = new DecimalFormat(".00%");
    String youngFormat = df.format(youngPercent);
    String mediumFormat = df.format(mediumPercent);
    String oldFormat = df.format(oldPercent);
    System.out.println("----- Quantidade -----");
    System.out.println("");
    System.out.println("menores: " + young);
    System.out.println("adultas: " + medium);
    System.out.println("a partir de 50: " + old);
    System.out.println("");
    System.out.println("----- Percentual -----");
    System.out.println("menores: " + youngFormat);
    System.out.println("adultas: " + mediumFormat);
    System.out.println("a partir de 50: " + oldFormat);
    System.out.println("");
    System.out.println("TOTAL: " + size);
  }
}
