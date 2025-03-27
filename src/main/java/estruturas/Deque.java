package estruturas;

public class Deque {
    private No cabeca;
    private No cauda;

    public Deque() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void inserirInicio(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }
    }

    public void inserirFim(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            cauda.setProximo(novoNo);
            cauda = novoNo;
        }
    }

    public int removerInicio() {
        if (cabeca == null) throw new IllegalStateException("Deque vazio");
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