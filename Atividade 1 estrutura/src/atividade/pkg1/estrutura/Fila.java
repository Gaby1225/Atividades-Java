/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg1.estrutura;


/**
 *
 * @author Gabrielle
 */
public class Fila {

    Lista lista = new Lista();

    public int Tamanho() {
        return lista.Tamanho();
    }

    public void Enfileirar(String valor) throws Exception {
        try {
            lista.InsereNoFim(valor);
        } catch (Exception e) {
            throw new Exception("A fila está cheia!!!!");
        }
    }

    public String Desenfileira() throws Exception {

        try {
            return lista.RemoveDaPosicao(0);
        } catch (Exception e) {
            throw new Exception("A fila está vazia!");
        }
    }
}
