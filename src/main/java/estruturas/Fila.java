package estruturas;

public class Fila {
    private No cabeca;
    private No cauda;

    public Fila() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void enfileirar(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            cauda.setProximo(novoNo);
            cauda = novoNo;
        }
    }

    public int desenfileirar() {
        if (cabeca == null) throw new IllegalStateException("Fila vazia");
        int dado = cabeca.getDado();
        cabeca = cabeca.getProximo();
        if (cabeca == null) cauda = null;
        return dado;
    }

    public void exibir() {
        No temp = cabeca;
        while (temp != null) {
            System.out.print(temp.getDado() + " -> ");
            temp = temp.getProximo();
        }
        System.out.println("null");
    }
}