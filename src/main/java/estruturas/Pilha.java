package estruturas;

public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(int dado) {
        No novoNo = new No(dado);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public int desempilhar() {
        if (topo == null) throw new IllegalStateException("Pilha vazia");
        int dado = topo.getDado();
        topo = topo.getProximo();
        return dado;
    }

    public void exibir() {
        No temp = topo;
        while (temp != null) {
            System.out.print(temp.getDado() + " -> ");
            temp = temp.getProximo();
        }
        System.out.println("null");
    }
}