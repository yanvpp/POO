package engtelecom.poo.exemplo;

public class Caixa<T> {
    private T conteudo;

    public Caixa(T obj) {
        this.conteudo = obj;
    }

    public T getConteudo() {
        return this.conteudo;
    }

}
