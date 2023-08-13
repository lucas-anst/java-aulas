package listas.testes;

import listas.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args){
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.adiciona(1);

        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);
    }
}
