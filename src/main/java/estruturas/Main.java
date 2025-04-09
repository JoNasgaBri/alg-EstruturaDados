package estruturas;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.inserirNoFinal(30);
        lista.exibirLista(); // Saída: 20 -> 10 -> 30 -> null
    }
}
