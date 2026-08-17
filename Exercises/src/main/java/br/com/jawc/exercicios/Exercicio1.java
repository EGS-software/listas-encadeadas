/**
 * @author jawc
 */
package br.com.jawc.exercicios;

public class Exercicio1 {
    public static int contarNosMatricial(int[] prox, int comeco) {
        int count = 0;
        int atual = comeco;
        while (atual != -1) {
            count++;
            atual = prox[atual];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] prox = {1, 2, -1, 4, 5, -1};
        int comeco = 0;
        System.out.println("Nós válidos: " + contarNosMatricial(prox, comeco));
    }
}
