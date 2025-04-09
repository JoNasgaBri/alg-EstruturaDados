**PROJETO ACADÊMICO - Estruturas de Dados 1**
**Implementação de Listas Simplesmente Encadeadas Dinâmicas em Java**
**Grupo: Jonas Gabriel//Luiz Gustavo Echaque Lima Barbosa**
**Professor: Silvia Brandão**
**Data de Entrega: 10 de Abril de 2025**

---

#### **1. Introdução**

Este projeto acadêmico tem como objetivo a implementação de uma Lista Simplesmente Encadeada (LSE) dinâmica em Java, uma estrutura de dados fundamental em Ciência da Computação. A LSE foi desenvolvida com base em um cronograma estruturado, que incluiu a criação da estrutura base, variações (Fila, Pilha e Deque), e um conjunto de 13 operações específicas, além de duas operações miscelâneas que demonstram sua aplicabilidade prática. O desenvolvimento foi realizado no ambiente IntelliJ IDEA, com testes unitários utilizando o framework JUnit e controle de versão no GitHub.

A LSE é uma estrutura linear que organiza dados em nós encadeados, onde cada nó contém um valor e uma referência ao próximo nó. Sua natureza dinâmica permite inserções e remoções eficientes em cenários onde o tamanho da coleção é desconhecido ou variável. Este trabalho explora tanto operações básicas quanto avançadas, destacando a versatilidade da estrutura em problemas reais.

---

#### **2. Objetivos**

- Implementar uma LSE em Java com suporte a operações básicas, intermediárias e avançadas.
- Desenvolver variações da LSE (Fila, Pilha e Deque) com políticas específicas de acesso.
- Criar e testar um conjunto de 13 operações especificadas, mais duas operações miscelâneas práticas.
- Documentar o código-fonte e validar a implementação por meio de testes unitários.
- Demonstrar a aplicabilidade da LSE em cenários reais, atendendo aos requisitos do projeto acadêmico.

---

#### **3. Metodologia**

O desenvolvimento seguiu um cronograma dividido em etapas semanais, conforme especificado no enunciado:

- **06/03/2025**: Estrutura base da LSE (classe `No` e `ListaSimples`).
- **13/03/2025**: Implementação das variações (Fila, Pilha, Deque).
- **20/03/2025**: Operações básicas (1 a 5).
- **27/03/2025**: Operações intermediárias (6 a 10).
- **03/04/2025**: Operações avançadas (11 a 13) e testes unitários.
- **10/04/2025**: Entrega final com apresentação e relatório.

O projeto foi estruturado em dois pacotes principais:
- **`estruturas`**: Contém as classes `No`, `ListaSimples`, `Fila`, `Pilha`, `Deque` e `Main`.
- **`testes`**: Contém a classe `ListaSimplesTest` para testes unitários com JUnit 5.

**Ferramentas Utilizadas:**
- **IntelliJ IDEA**: IDE para desenvolvimento e execução do código.
- **Java 17**: Linguagem de programação com suporte a tipos primitivos e orientação a objetos.
- **JUnit 5**: Framework para testes unitários, garantindo a validação de todas as operações.
- **GitHub**: Controle de versão e armazenamento do código-fonte (repositório a ser submetido).

O código foi documentado com comentários Javadoc, descrevendo o propósito, complexidade e uso de cada método. A validação foi realizada por meio de 15 testes unitários, cobrindo todas as operações implementadas.

---

#### **4. Estrutura do Projeto**

A implementação foi dividida em classes que refletem os conceitos de encapsulamento e modularidade:

1. **`No.java`**:
   - Representa um nó da lista, com um valor inteiro (`dado`) e uma referência ao próximo nó (`proximo`).
   - Métodos de acesso e modificação simples (getters e setters).

2. **`ListaSimples.java`**:
   - Classe principal da LSE, contendo todas as 13 operações exigidas, mais duas miscelâneas.
   - Usa um atributo privado `cabeca` como ponto de entrada da lista.

3. **`Fila.java`, `Pilha.java`, `Deque.java`**:
   - Variações da LSE com políticas específicas:
     - **Fila**: FIFO (First-In, First-Out).
     - **Pilha**: LIFO (Last-In, First-Out).
     - **Deque**: Inserção e remoção em ambas as extremidades.

4. **`Main.java`**:
   - Classe de demonstração para a apresentação, exibindo operações em sequência.

5. **`ListaSimplesTest.java`**:
   - Contém testes unitários para validar cada operação.

**Estrutura de Diretórios:**

![image](https://github.com/user-attachments/assets/bbb977f1-56bc-476f-90f3-af9c43de5273)


---

#### **5. Operações Implementadas**

Abaixo, descrevemos todas as operações implementadas na classe `ListaSimples`, com detalhes sobre funcionalidade, complexidade e uso prático.

##### **5.1 Operações Básicas**
1. **Validação de Existência (`existe`)**
   - **Descrição**: Verifica se um valor está presente na lista.
   - **Complexidade**: O(n).
   - **Uso**: Busca em listas não ordenadas, como verificar se um ID existe.

2. **Inserção Ordenada (`inserirOrdenado`)**
   - **Descrição**: Insere um elemento mantendo a ordem crescente.
   - **Complexidade**: O(n).
   - **Uso**: Manutenção de listas ordenadas, como rankings.

3. **Troca de Prioridade (`trocarPrioridade`)**
   - **Descrição**: Move um elemento específico para o início da lista.
   - **Complexidade**: O(n).
   - **Uso**: Gerenciamento de tarefas com priorização dinâmica.

4. **Troca de Lugar entre Elementos (`trocarElementos`)**
   - **Descrição**: Troca a posição de dois elementos na lista.
   - **Complexidade**: O(n).
   - **Uso**: Reorganização manual de itens em uma playlist.

5. **Cópia de Elementos (`copiar`)**
   - **Descrição**: Cria uma cópia independente da lista.
   - **Complexidade**: O(n).
   - **Uso**: Backup de dados antes de modificações.

##### **5.2 Operações Intermediárias**
6. **Transferência de Elementos (`transferirPara`)**
   - **Descrição**: Move todos os elementos para outra lista, esvaziando a original.
   - **Complexidade**: O(1).
   - **Uso**: Transferência de tarefas entre filas de processamento.

7. **Partição de uma Lista (`particionar`)**
   - **Descrição**: Divide a lista em duas, separando elementos >= x.
   - **Complexidade**: O(n).
   - **Uso**: Filtragem de dados acima de um limite (ex.: notas de alunos).

8. **Combinação de Listas (`combinar`)**
   - **Descrição**: Junta duas listas ordenadas em uma única lista ordenada.
   - **Complexidade**: O(n + m).
   - **Uso**: Fusão de logs de eventos de sistemas diferentes.

9. **Diferença entre Duas Listas (`diferenca`)**
   - **Descrição**: Retorna elementos exclusivos da lista atual em relação a outra.
   - **Complexidade**: O(n * m).
   - **Uso**: Identificação de itens únicos em comparações.

10. **Interseção entre Duas Listas (`intersecao`)**
    - **Descrição**: Retorna elementos comuns às duas listas.
    - **Complexidade**: O(n * m).
    - **Uso**: Busca de interesses comuns entre usuários.

##### **5.3 Operações Avançadas**
11. **Balance-line (`balanceLine`)**
    - **Descrição**: Verifica eficientemente a existência de elementos comuns entre duas listas ordenadas.
    - **Complexidade**: O(n + m).
    - **Uso**: Comparação rápida de conjuntos de dados ordenados.

12. **Ordenação de uma Lista (`ordenar`)**
    - **Descrição**: Ordena a lista usando o algoritmo Merge Sort adaptado para LSE.
    - **Complexidade**: O(n log n).
    - **Uso**: Organização de grandes volumes de dados.

13. **Outras Operações Miscelâneas**
    - **Inversão da Lista (`inverter`)**
      - **Descrição**: Reverte a ordem dos elementos.
      - **Complexidade**: O(n).
      - **Uso Prático**: Reverter a ordem de linhas em um editor de texto ou histórico de ações.
    - **Remoção de Duplicatas (`removerDuplicatas`)**
      - **Descrição**: Elimina elementos duplicados em uma lista ordenada.
      - **Complexidade**: O(n).
      - **Uso Prático**: Limpeza de listas de contatos ou IDs duplicados.

---

#### **6. Resultados**

##### **6.1 Demonstração no `Main`**
A classe `Main.java` foi ajustada para exibir as seguintes operações em sequência:

Inserção no final: 30 -> 10 -> 20 -> null
Ordenação: 10 -> 20 -> 30 -> null
Inversão: 30 -> 20 -> 10 -> null
Troca de prioridade (20): 20 -> 30 -> 10 -> null
Adição e remoção de duplicatas: 20 -> 30 -> 10 -> 20 -> null → 20 -> 30 -> 10 -> null
Combinação com outra lista (15, 25): 15 -> 20 -> 25 -> 30 -> 10 -> null

Os resultados foram exibidos no console, demonstrando o funcionamento correto das operações.

##### **6.2 Testes Unitários**
Foram implementados 15 testes na classe `ListaSimplesTest.java`, cobrindo todas as operações. Todos os testes passaram com sucesso no IntelliJ IDEA, conforme relatório gerado pelo JUnit:
- **Total de Testes**: 15.
- **Resultados**: 15/15 passaram (100% de sucesso).
- **Exemplo de Testes**:
  - `testInserirOrdenado`: Verifica inserção em ordem crescente.
  - `testOrdenar`: Confirma ordenação com Merge Sort.
  - `testRemoverDuplicatas`: Garante eliminação de duplicatas.

##### **6.3 Validação**
A implementação foi validada por meio de:
- Execução manual no `Main.java`.
- Testes automatizados no JUnit.
- Revisão do código documentado para garantir clareza e corretude.

---

#### **7. Discussão**

A LSE demonstrou ser uma estrutura versátil, capaz de suportar operações simples (como inserção) e complexas (como ordenação e combinação). As operações miscelâneas (`inverter` e `removerDuplicatas`) destacam sua aplicabilidade em cenários reais, como manipulação de históricos e limpeza de dados. A escolha do Merge Sort para ordenação reflete um equilíbrio entre eficiência (O(n log n)) e adequação à estrutura encadeada.

Alguns desafios encontrados:
- **Complexidade em Operações como `diferenca` e `intersecao`**: O(n * m) poderia ser otimizado com estruturas auxiliares (ex.: HashSet), mas foi mantido simples para atender ao escopo.
- **Testes Abrangentes**: Garantir cobertura total exigiu a criação de casos específicos para cada operação.

---

#### **8. Conclusão**

O projeto alcançou todos os objetivos propostos, implementando uma LSE funcional com variações e operações completas. A experiência aprofundou o entendimento de estruturas de dados dinâmicas, algoritmos de ordenação e práticas de teste. A documentação e os testes unitários reforçam a qualidade do entregável, enquanto as operações miscelâneas mostram o potencial da LSE em aplicações práticas.

Para futuros trabalhos, sugere-se:
- Uso de tipos genéricos para suportar diferentes dados.
- Otimização de operações com complexidade quadrática.
- Integração com interfaces gráficas para demonstrações interativas.

---

#### **9. Referências**

- ASCENCIO, A. F. G.; ARAÚJO, G. S. *Estrutura de Dados*. São Paulo: Pearson, 2010.
- GOODRICH, M. T.; TAMASSIA, R. *Estruturas de Dados e Algoritmos em Java*. Porto Alegre: Bookman, 2013.
- CORMEN, T. H. et al. *Introduction to Algorithms*. 3ª ed. MIT Press, 2009.
- Documentação Oficial do Java 17: https://docs.oracle.com/en/java/javase/17/
- JUnit 5 User Guide: https://junit.org/junit5/docs/current/user-guide/

---

#### **10. Anexos**

- **Código-Fonte**: Disponível no repositório GitHub [insira o link aqui].
- **Capturas de Tela**:
  - Resultados do `Main.java` no console.
  - Relatório de testes do JUnit no IntelliJ IDEA.
- **Instruções de Execução**:
  1. Abra o projeto no IntelliJ IDEA.
  2. Execute `Main.java` para demonstração.
  3. Execute `ListaSimplesTest.java` para testes unitários.
