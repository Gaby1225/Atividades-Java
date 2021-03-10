/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg1.estrutura;

import java.util.Scanner;

/**
 *
 * @author Gabrielle
 */
public class Atividade1Estrutura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);
        
        String opcao;
        System.out.println("Digite 1 para testar a fila.");
        opcao = scanner1.next();
        if (opcao.equals("1") ) {
            TestaFila();
        } else {
            System.out.println("Opção inválida!");
            scanner1.next();
        }
    }

    public static void TestaFila() {

        String opcao = "", valor;
        Fila minhafila = new Fila();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("testa fila circular");
        do {
            try {
                System.out.println("Digite: 1->Enfileirar 2->Desenfileirar "
                        + "3-> Tamanho 9->Sair");
                opcao = scanner2.next();
                switch (opcao) {
                    case "1":
                        System.out.println("Digite um valor para enfileirar:");
                        valor = scanner2.next();
                        minhafila.Enfileirar(valor);
                        break;
                    case "2":
                        System.out.println("Desenfileirado: " + minhafila.Desenfileira());
                        break;
                    case "3":
                        System.out.println("Tamanho da fila:" + minhafila.Tamanho());
                        break;
                    case "9":
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                        break;
                }
            } catch (Exception erro) {
                System.out.println(erro);
            }
        } while (!opcao.equals("9"));
    }

}
