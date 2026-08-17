/**
 * @author jawc
 */
package br.com.jawc.exercicios;

import br.com.jawc.models.NoLDE;

public class Exercicio7 {
    public static NoLDE concatenarLDEDinamica(NoLDE comecoA, NoLDE comecoB) {
        if (comecoA == null) return comecoB;
        if (comecoB == null) return comecoA;

        NoLDE atual = comecoA;
        while (atual.prox != null) {
            atual = atual.prox;
        }

        atual.prox = comecoB;
        comecoB.ant = atual;

        return comecoA;
    }

    public static void main(String[] args) {
        NoLDE a = new NoLDE(1);
        NoLDE b = new NoLDE(2);
        NoLDE res = concatenarLDEDinamica(a, b);
        System.out.println("Segundo elemento após concatenar: " + res.prox.info);
    }
}
