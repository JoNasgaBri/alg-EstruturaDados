package testes;

import estruturas.ListaSimples;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaSimplesTest {

    @Test
    public void testInserirNoInicio() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        assertTrue(lista.existe(20));
        assertTrue(lista.existe(10));
    }

    @Test
    public void testInserirOrdenado() {
        ListaSimples lista = new ListaSimples();
        lista.inserirOrdenado(30);
        lista.inserirOrdenado(10);
        lista.inserirOrdenado(20);
        assertTrue(lista.existe(10));
        assertTrue(lista.existe(20));
        assertTrue(lista.existe(30));
    }

    @Test
    public void testTrocarElementos() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        lista.inserirNoFinal(30);
        lista.trocarElementos(10, 30);
        assertEquals(30, lista.getPrimeiroDado()); // Requer getter
    }

    @Test
    public void testBalanceLine() {
        ListaSimples lista1 = new ListaSimples();
        lista1.inserirNoFinal(10);
        lista1.inserirNoFinal(20);
        ListaSimples lista2 = new ListaSimples();
        lista2.inserirNoFinal(15);
        lista2.inserirNoFinal(20);
        assertTrue(lista1.balanceLine(lista2));
        ListaSimples lista3 = new ListaSimples();
        lista3.inserirNoFinal(30);
        assertFalse(lista1.balanceLine(lista3));
    }

    @Test
    public void testOrdenar() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(30);
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        lista.ordenar();
        assertEquals(10, lista.getPrimeiroDado());
        assertEquals(3, lista.tamanho());
    }

    @Test
    public void testInverter() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        lista.inserirNoFinal(30);
        lista.inverter();
        assertEquals(30, lista.getPrimeiroDado());
    }

    @Test
    public void testRemoverDuplicatas() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        lista.removerDuplicatas();
        assertEquals(2, lista.tamanho());
    }

    // Novos testes
    @Test
    public void testExiste() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        assertTrue(lista.existe(10));
        assertFalse(lista.existe(20));
    }

    @Test
    public void testTrocarPrioridade() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        lista.inserirNoFinal(30);
        lista.trocarPrioridade(20);
        assertEquals(20, lista.getPrimeiroDado());
    }

    @Test
    public void testCopiar() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        ListaSimples copia = lista.copiar();
        assertTrue(copia.existe(10));
        assertTrue(copia.existe(20));
        assertEquals(2, copia.tamanho());
    }

    @Test
    public void testTransferirPara() {
        ListaSimples lista1 = new ListaSimples();
        lista1.inserirNoFinal(10);
        lista1.inserirNoFinal(20);
        ListaSimples lista2 = new ListaSimples();
        lista1.transferirPara(lista2);
        assertTrue(lista2.existe(10));
        assertEquals(0, lista1.tamanho());
    }

    @Test
    public void testParticionar() {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(5);
        lista.inserirNoFinal(15);
        lista.inserirNoFinal(10);
        ListaSimples maiores = lista.particionar(10);
        assertTrue(maiores.existe(15));
        assertTrue(maiores.existe(10));
        assertEquals(1, lista.tamanho());
    }

    @Test
    public void testCombinar() {
        ListaSimples lista1 = new ListaSimples();
        lista1.inserirNoFinal(10);
        lista1.inserirNoFinal(30);
        ListaSimples lista2 = new ListaSimples();
        lista2.inserirNoFinal(20);
        lista1.combinar(lista2);
        assertEquals(3, lista1.tamanho());
        assertEquals(10, lista1.getPrimeiroDado());
    }

    @Test
    public void testDiferenca() {
        ListaSimples lista1 = new ListaSimples();
        lista1.inserirNoFinal(10);
        lista1.inserirNoFinal(20);
        ListaSimples lista2 = new ListaSimples();
        lista2.inserirNoFinal(20);
        ListaSimples diff = lista1.diferenca(lista2);
        assertTrue(diff.existe(10));
        assertFalse(diff.existe(20));
    }

    @Test
    public void testIntersecao() {
        ListaSimples lista1 = new ListaSimples();
        lista1.inserirNoFinal(10);
        lista1.inserirNoFinal(20);
        ListaSimples lista2 = new ListaSimples();
        lista2.inserirNoFinal(20);
        lista2.inserirNoFinal(30);
        ListaSimples inter = lista1.intersecao(lista2);
        assertTrue(inter.existe(20));
        assertEquals(1, inter.tamanho());
    }
}