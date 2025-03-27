package estruturas;

public class No {
    private int dado; // Pode ser alterado para tipo genérico no futuro
    private No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No[dado=" + dado + "]";
    }
}

