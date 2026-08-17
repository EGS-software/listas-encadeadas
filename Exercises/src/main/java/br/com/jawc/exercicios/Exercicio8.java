/**
 * @author jawc
 */
package br.com.jawc.exercicios;

import br.com.jawc.models.NoPolinomio;

public class Exercicio8 {
    public static double avaliarPolinomio(NoPolinomio P, double x) {
        double resultado = 0.0;
        NoPolinomio atual = P;

        while (atual != null) {
            resultado += atual.a * Math.pow(x, atual.i);
            atual = atual.elop;
        }
        return resultado;
    }

    public static void main(String[] args) {
        NoPolinomio p1 = new NoPolinomio(2.0, 2);
        NoPolinomio p2 = new NoPolinomio(3.0, 1);
        p1.elop = p2;
        p2.eloa = p1;

        System.out.println("P(2) para 2x^2 + 3x^1: " + avaliarPolinomio(p1, 2));
    }
}
