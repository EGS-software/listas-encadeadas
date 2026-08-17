/**
 * @author jawc
 */
package br.com.jawc.exercicios;

import br.com.jawc.models.NoLDE;

public class Exercicio6 {
    public static NoLDE inverterLDEDinamica(NoLDE comeco) {
        NoLDE atual = comeco;
        NoLDE temporario = null;

        while (atual != null) {
            temporario = atual.ant;
            atual.ant = atual.prox;
            atual.prox = temporario;

            if (atual.ant == null) {
                comeco = atual;
            }
            atual = atual.ant;
        }
        return comeco;
    }

    public static void main(String[] args) {
        NoLDE lde = new NoLDE(100);
        NoLDE lde2 = new NoLDE(200);
        lde.prox = lde2;
        lde2.ant = lde;

        lde = inverterLDEDinamica(lde);
        System.out.println("Novo primeiro elemento (esperado 200): " + lde.info);
    }
}
