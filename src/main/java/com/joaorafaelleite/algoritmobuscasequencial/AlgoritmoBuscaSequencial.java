/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.joaorafaelleite.algoritmobuscasequencial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoBuscaSequencial {

    public static void main(String[] args) {
       
    //Demonstração do algoritmo de busca sequêncial em JAVA.

    /*O programa funciona com base no fornecimento de 3 informações, um limite mínimo, um limite máximo e um valor X que será utilizado como critério,
    após o fornecimento das informações, o programa irá criar uma lista para os valores válidos e se manterá em looping solicitando um novo valor para
    teste até que o valor 0 seja digitado, esse novo valor será verificado e se caso estiver dentro do intervo mínimo e máximo, for divisível por X e 
    não estiver na lista, ele será inserido. Ao final o programa exibe a lista de valores válidos, bem como a soma e a média dos itens constantes na lista.*/


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Integer> listaValores = new ArrayList<>();

    System.out.print("Digite um valor para o Limite Mínimo: ");
    int limiteMinimo = sc.nextInt();

    while (limiteMinimo < 0) {
            System.out.print("Digite um valor para o Limite Mínimo: ");
            limiteMinimo = sc.nextInt();
    }

    System.out.print("Digite um valor para o Limite Máximo: ");
    int limiteMaximo  = sc.nextInt();

    if (limiteMaximo < limiteMinimo){
            System.out.println("Caro usuário, os valores dos Limites Minimo e Maximo foram digitados invertidos, irei corrigir para você");
            int A = limiteMinimo;
            limiteMinimo = limiteMaximo;
            limiteMaximo = A;
    }

    System.out.print("Digite X: ");
    int X = sc.nextInt();

    while (X == 0) {
            System.out.print("Digite X: ");
            X = sc.nextInt();
    }

    System.out.println();

    int soma = 0;
    int valor;

    //Implementação do algoritmo de busca sequencial.

    do{
        boolean Achou = false;
        int i = 0;
        System.out.print("Digite um valor: ");
        valor = sc.nextInt();
        if (valor >= limiteMinimo && valor <= limiteMaximo && valor % X == 0){
                while (i < listaValores.size() && Achou == false){
                          if (valor == listaValores.get(i)){
                              Achou = true;
                          }
                          else {
                                  i += 1;
                          }
                }    
                if (Achou == false && valor != 0){
                          listaValores.add(valor);
                          soma += valor;
                }
        }
    }while (valor != 0);

    double media = (double) soma / listaValores.size();

    System.out.println();
    Collections.sort(listaValores);
    System.out.println(listaValores);
    System.out.printf("A lista possui %d valores%n",listaValores.size());
    System.out.printf("A soma dos valores da lista é %d%n",soma);
    System.out.printf("A média dos valores da lista é %.2f%n", media);

    sc.close();
   }
}
