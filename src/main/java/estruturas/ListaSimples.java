package estruturas;

/**
 * Implementação de uma Lista Simplesmente Encadeada (LSE) em Java.
 * Suporta operações básicas, intermediárias e avançadas conforme o projeto acadêmico.
 */

public class ListaSimples {
    private No cabeca; // Cabeça da lista (primeiro nó)
    /** Construtor padrão: inicializa a lista vazia. */
    public ListaSimples() {
        this.cabeca = null;
    }
    /** Retorna o valor do primeiro elemento. Lança exceção se a lista estiver vazia. */
    public int getPrimeiroDado() {
        if (cabeca == null) throw new IllegalStateException("Lista vazia");
        return cabeca.getDado();
    }
    /** Insere um elemento no início da lista. O(n) = O(1). */
    public void inserirNoInicio(int dado) {
        No novoNo = new No(dado);
        novoNo.setProximo(cabeca);
        cabeca = novoNo;
    }
    /** Insere um elemento no final da lista. O(n) = O(n). */
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
    /** Exibe todos os elementos da lista no console. O(n) = O(n). */
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

    // Operação 1: Validação de existência
    /** Verifica se um elemento existe na lista. O(n) = O(n). */
    public boolean existe(int dado) {
        No temp = cabeca;
        while (temp != null) {
            if (temp.getDado() == dado) return true;
            temp = temp.getProximo();
        }
        return false;
    }

    // Operação 2: Inserção ordenada
    /** Insere um elemento mantendo a ordem crescente. O(n) = O(n). */
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

    // Operação 3: Troca de prioridade
    /** Move um elemento para o início da lista (maior prioridade). O(n) = O(n). */
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

    // Operação 4: Troca de lugar entre elementos
    /** Troca a posição de dois elementos na lista. O(n) = O(n). */
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

    // Operação 5: Cópia de elementos
    /** Cria uma cópia independente da lista. O(n) = O(n). */
    public ListaSimples copiar() {
        ListaSimples novaLista = new ListaSimples();
        No temp = cabeca;
        while (temp != null) {
            novaLista.inserirNoFinal(temp.getDado());
            temp = temp.getProximo();
        }
        return novaLista;
    }

    // Operação 6: Transferência de elementos
    /** Transfere todos os elementos para outra lista, esvaziando a atual. O(n) = O(1). */
    public void transferirPara(ListaSimples destino) {
        if (cabeca == null) return;
        destino.cabeca = cabeca;
        cabeca = null;
    }

    // Operação 7: Partição de uma lista
    /** Divide a lista em duas, movendo elementos >= x para uma nova lista. O(n) = O(n). */
    public ListaSimples particionar(int x) {
        ListaSimples maiores = new ListaSimples();
        No anterior = null, atual = cabeca;
        while (atual != null) {
            if (atual.getDado() >= x) {
                if (anterior == null) {
                    cabeca = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                No temp = atual;
                atual = atual.getProximo();
                temp.setProximo(null);
                maiores.inserirNoFinal(temp.getDado());
            } else {
                anterior = atual;
                atual = atual.getProximo();
            }
        }
        return maiores;
    }

    // Operação 8: Combinação de listas
    /** Combina esta lista com outra, mantendo a ordenação. O(n+m) = O(n). */
    public void combinar(ListaSimples outra) {
        ListaSimples combinada = new ListaSimples();
        No temp1 = this.cabeca;
        No temp2 = outra.cabeca;
        while (temp1 != null && temp2 != null) {
            if (temp1.getDado() <= temp2.getDado()) {
                combinada.inserirNoFinal(temp1.getDado());
                temp1 = temp1.getProximo();
            } else {
                combinada.inserirNoFinal(temp2.getDado());
                temp2 = temp2.getProximo();
            }
        }
        while (temp1 != null) {
            combinada.inserirNoFinal(temp1.getDado());
            temp1 = temp1.getProximo();
        }
        while (temp2 != null) {
            combinada.inserirNoFinal(temp2.getDado());
            temp2 = temp2.getProximo();
        }
        this.cabeca = combinada.cabeca;
    }

    // Operação 9: Diferença entre duas listas
    /** Retorna uma nova lista com elementos exclusivos desta lista. O(n*m) = O(n²). */
    public ListaSimples diferenca(ListaSimples outra) {
        ListaSimples resultado = new ListaSimples();
        No temp = cabeca;
        while (temp != null) {
            if (!outra.existe(temp.getDado())) {
                resultado.inserirNoFinal(temp.getDado());
            }
            temp = temp.getProximo();
        }
        return resultado;
    }

    // Operação 10: Interseção entre duas listas
    /** Retorna uma nova lista com elementos comuns às duas listas. O(n*m) = O(n²). */
    public ListaSimples intersecao(ListaSimples outra) {
        ListaSimples resultado = new ListaSimples();
        No temp = cabeca;
        while (temp != null) {
            if (outra.existe(temp.getDado())) {
                resultado.inserirNoFinal(temp.getDado());
            }
            temp = temp.getProximo();
        }
        return resultado;
    }
    // Operação 11: Balance-line
    /** Verifica se há elementos comuns entre duas listas ordenadas. O(n+m) = O(n). */
    public boolean balanceLine(ListaSimples outra) {
        No temp1 = this.cabeca;
        No temp2 = outra.cabeca;
        while (temp1 != null && temp2 != null) {
            if (temp1.getDado() == temp2.getDado()) {
                return true; // Encontrou um elemento comum
            } else if (temp1.getDado() < temp2.getDado()) {
                temp1 = temp1.getProximo();
            } else {
                temp2 = temp2.getProximo();
            }
        }
        return false; // Nenhum elemento comum
    }

    // Operação 12: Ordenação de uma lista
    /** Ordena a lista usando Merge Sort. O(n log n). */
    public void ordenar() {
        if (cabeca == null || cabeca.getProximo() == null) return;
        cabeca = mergeSort(cabeca);
    }

    private No mergeSort(No no) {
        if (no == null || no.getProximo() == null) return no;

        // Divide a lista em duas metades
        No meio = getMeio(no);
        No proxMeio = meio.getProximo();
        meio.setProximo(null);

        No esquerda = mergeSort(no);
        No direita = mergeSort(proxMeio);

        return merge(esquerda, direita);
    }

    private No getMeio(No no) {
        if (no == null) return no;
        No lento = no;
        No rapido = no.getProximo();
        while (rapido != null) {
            rapido = rapido.getProximo();
            if (rapido != null) {
                lento = lento.getProximo();
                rapido = rapido.getProximo();
            }
        }
        return lento;
    }

    private No merge(No a, No b) {
        if (a == null) return b;
        if (b == null) return a;

        No resultado;
        if (a.getDado() <= b.getDado()) {
            resultado = a;
            resultado.setProximo(merge(a.getProximo(), b));
        } else {
            resultado = b;
            resultado.setProximo(merge(a, b.getProximo()));
        }
        return resultado;
    }

    // Operação 13: Outras operações miscelâneas
    // 13.1: Inversão da lista
    /** Inverte a ordem dos elementos da lista. Util em editores de texto ou historicos. O(n) = O(n). */
    public void inverter() {
        No anterior = null;
        No atual = cabeca;
        No proximo = null;
        while (atual != null) {
            proximo = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = proximo;
        }
        cabeca = anterior;
    }

    // 13.2: Remoção de duplicatas
    /** Remove elementos duplicados de uma lista ordenada. Útil em gerenciamento de dados. O(n) = O(n). */
    public void removerDuplicatas() {
        if (cabeca == null) return;
        No atual = cabeca;
        while (atual.getProximo() != null) {
            if (atual.getDado() == atual.getProximo().getDado()) {
                atual.setProximo(atual.getProximo().getProximo());
            } else {
                atual = atual.getProximo();
            }
        }
    }

    // Método auxiliar para contar elementos (útil para testes)
    /** Retorna o tamanho da lista. O(n) = O(n). */
    public int tamanho() {
        int count = 0;
        No temp = cabeca;
        while (temp != null) {
            count++;
            temp = temp.getProximo();
        }
        return count;
    }
}
