package listas;

public class No<T> { // a classe tem como tipagem o tipo generico T
    private T elemento;
    private No<T> proximo; // o proximo elemento da lista sera outro nó (nó = valores do elemento + ponteiro)

    public No(T elemento) { // em algumas ocasiões, usaremos apenas o elemento
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) { // em outras, usaremos o elemento e o proximo
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {

        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
