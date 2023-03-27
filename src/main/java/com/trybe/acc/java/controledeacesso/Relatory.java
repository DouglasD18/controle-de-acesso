package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Relatory {
  /**
   * Método principal.
   */
  public static void make(ArrayList<Short> ages) {
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
