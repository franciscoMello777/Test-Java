/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class EstoqueTest {

    private Estoque est;

    @BeforeEach
    public void criar() {
        est = new Estoque();
    }

    @Test
    public void addProdutoTest() {
        est.adicionarProdutos("Pao", 2);
        assertEquals("Pao", est.produtoMaisEstocado(), "Erro");
    }

    @Test
    public void testConsultar() {
        est.adicionarProdutos("Pao", 2);
        assertEquals(2, est.consultarQuantidade("Pao"), "Erro");
    }

    @Test
    public void removerTest() {
        est.adicionarProdutos("Pao", 2);
        est.removerProdutos("Pao", 1);
        assertEquals(1, est.consultarQuantidade("Pao"), "Erro");
    }

    @Test
    public void maisEstocadoTest() {
        est.adicionarProdutos("Pao", 2);
        est.adicionarProdutos("Cell", 1);
        assertEquals("Pao", est.produtoMaisEstocado(), "Erro");
    }

    @Test
    public void limparTest() {
        est.removerProdutos("Cell", 1);
        est.limparEstoque();
        assertTrue(est.estoque.isEmpty(), "Erro");
    }

    @Test
    public void reabasteceTest() {
        est.adicionarProdutos("Pao", 2);
        est.reabastecerEstoque(5);
        assertEquals(7, est.consultarQuantidade("Pao"), "Erro");
    }

    @Test
    public void listaProduto() {
        est.adicionarProdutos("Pao", 2);
        est.adicionarProdutos("Cell", 3);
        assertEquals("Pao Cell ", est.listarProdutos(), "Erro");
    }

    @Test
    public void addProdutoExistente() {
        est.adicionarProdutos("Pao", 2);
        est.adicionarProdutos("Pao", 2);
        assertEquals(4, est.consultarQuantidade("Pao"), "Erro");
    }
    
    @Test
    public void removerProdutoExata() {
        est.adicionarProdutos("Pao", 2);
        est.removerProdutos("Pao", 2);
        assertEquals("", est.produtoMaisEstocado(), "Erro");
    }

}
