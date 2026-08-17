/**
 * @author jawc
 */
package br.com.jawc.exercicios;

public class Exercicio2 {
    public static int concatenarMatricial(int[] prox, int comecoA, int comecoB) {
        if (comecoA == -1) return comecoB;

        int atual = comecoA;
        while (prox[atual] != -1) {
            atual = prox[atual];
        }
        prox[atual] = comecoB;
        return comecoA;
    }

    public static void main(String[] args) {
        int[] prox = {1, 2, -1, 4, 5, -1};
        int comecoA = 0;
        int comecoB = 3;
        concatenarMatricial(prox, comecoA, comecoB);
        System.out.println("Novo prox do final de A (índice 2): " + prox[2]);
    }
}
