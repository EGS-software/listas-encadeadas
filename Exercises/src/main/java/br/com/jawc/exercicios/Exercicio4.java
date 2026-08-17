/**
 * @author jawc
 */
package br.com.jawc.exercicios;

public class Exercicio4 {
    public static int intercalarMatricial(int[] info, int[] prox, int comecoA, int comecoB) {
        if (comecoA == -1) return comecoB;
        if (comecoB == -1) return comecoA;

        int comecoC = -1;
        int atualC = -1;
        int atualA = comecoA;
        int atualB = comecoB;

        while (atualA != -1 && atualB != -1) {
            int menorIndice;
            if (info[atualA] <= info[atualB]) {
                menorIndice = atualA;
                atualA = prox[atualA];
            } else {
                menorIndice = atualB;
                atualB = prox[atualB];
            }

            if (comecoC == -1) {
                comecoC = menorIndice;
                atualC = menorIndice;
            } else {
                prox[atualC] = menorIndice;
                atualC = menorIndice;
            }
        }

        if (atualA != -1) prox[atualC] = atualA;
        if (atualB != -1) prox[atualC] = atualB;

        return comecoC;
    }

    public static void main(String[] args) {
        int[] infoOrd = {5, 10, 15, 8, 12};
        int[] proxOrd = {1, 2, -1, 4, -1};
        int novoC = intercalarMatricial(infoOrd, proxOrd, 0, 3);

        System.out.print("Lista intercalada: ");
        int at = novoC;
        while(at != -1) {
            System.out.print(infoOrd[at] + " ");
            at = proxOrd[at];
        }
        System.out.println();
    }
}
