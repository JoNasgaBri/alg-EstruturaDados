package estruturas;

public class ListaSimples {
    private No cabeca;

    public ListaSimples() {
        this.cabeca = null;
    }

    public void inserirNoInicio(int dado) {
        No novoNo = new No(dado);
        novoNo.setProximo(cabeca);
        cabeca = novoNo;
    }

    public void inserirNoFinal(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            return;
        }
        No temp = cabeca;
        while (temp.getProximo() != null) {
            temp = temp.getProximo();
        }
        temp.setProximo(novoNo);
    }

    public void exibirLista() {
        No temp = cabeca;
        if (temp == null) {
            System.out.println("Lista vazia");
            return;
        }
        while (temp != null) {
            System.out.print(temp.getDado() + " -> ");
            temp = temp.getProximo();
        }
        System.out.println("null");
    }

    // 1. Validação de existência
    public boolean existe(int dado) {
        No temp = cabeca;
        while (temp != null) {
            if (temp.getDado() == dado) return true;
            temp = temp.getProximo();
        }
        return false;
    }

    // 2. Inserção ordenada (assumindo ordem crescente)
    public void inserirOrdenado(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null || cabeca.getDado() >= dado) {
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
            return;
        }
        No atual = cabeca;
        while (atual.getProximo() != null && atual.getProximo().getDado() < dado) {
            atual = atual.getProximo();
        }
        novoNo.setProximo(atual.getProximo());
        atual.setProximo(novoNo);
    }

    // 3. Troca de prioridade (move elemento para o início)
    public void trocarPrioridade(int dado) {
        if (cabeca == null || cabeca.getDado() == dado) return;
        No anterior = null;
        No atual = cabeca;
        while (atual != null && atual.getDado() != dado) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual == null) return; // Elemento não encontrado
        anterior.setProximo(atual.getProximo());
        atual.setProximo(cabeca);
        cabeca = atual;
    }

    // 4. Troca de lugar entre elementos
    public void trocarElementos(int dado1, int dado2) {
        if (dado1 == dado2) return;
        No anterior1 = null, no1 = cabeca;
        No anterior2 = null, no2 = cabeca;
        while (no1 != null && no1.getDado() != dado1) {
            anterior1 = no1;
            no1 = no1.getProximo();
        }
        while (no2 != null && no2.getDado() != dado2) {
            anterior2 = no2;
            no2 = no2.getProximo();
        }
        if (no1 == null || no2 == null) return;

        if (anterior1 != null) anterior1.setProximo(no2);
        else cabeca = no2;
        if (anterior2 != null) anterior2.setProximo(no1);
        else cabeca = no1;

        No temp = no1.getProximo();
        no1.setProximo(no2.getProximo());
        no2.setProximo(temp);
    }

    // 5. Cópia de elementos
    public ListaSimples copiar() {
        ListaSimples novaLista = new ListaSimples();
        No temp = cabeca;
        while (temp != null) {
            novaLista.inserirNoFinal(temp.getDado());
            temp = temp.getProximo();
        }
        return novaLista;
    }

}