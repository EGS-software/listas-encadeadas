/**
 * @author jawc
 */
package br.com.jawc.exercicios;

import br.com.jawc.models.NoLUE;

public class Exercicio5 {
    public static NoLUE inverterLUEDinamica(NoLUE comeco) {
        NoLUE anterior = null;
        NoLUE atual = comeco;
        NoLUE proximo = null;

        while (atual != null) {
            proximo = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = proximo;
        }
        return anterior;
    }

    public static void main(String[] args) {
        NoLUE lue = new NoLUE(1);
        lue.prox = new NoLUE(2);
        lue.prox.prox = new NoLUE(3);

        lue = inverterLUEDinamica(lue);
        System.out.println("Novo primeiro elemento (esperado 3): " + lue.info);
    }
}
