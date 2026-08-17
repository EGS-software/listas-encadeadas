/**
 * @author jawc
 */
package br.com.jawc.exercicios;

public class Exercicio3 {
    public static Integer primeiroAusenteMatricial(int[] info, int[] prox, int comecoA, int comecoB) {
        int atualA = comecoA;

        while (atualA != -1) {
            int valorA = info[atualA];
            boolean encontrou = false;

            int atualB = comecoB;
            while (atualB != -1) {
                if (info[atualB] == valorA) {
                    encontrou = true;
                    break;
                }
                atualB = prox[atualB];
            }

            if (!encontrou) return valorA;
            atualA = prox[atualA];
        }
        return null;
    }

    public static void main(String[] args) {
        int[] info = {10, 20, 30, 15, 25, 40};
        int[] prox = {1, 2, -1, 4, 5, -1};
        System.out.println("Primeiro ausente de A em B: " + primeiroAusenteMatricial(info, prox, 0, 3));
    }
}
