/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;

import java.util.ArrayList;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Estoque {

    ArrayList<Produtos> estoque = new ArrayList<>();

    public void adicionarProdutos(String nome, int quantidade) {
        if (nome == "" || quantidade <= 0) {
            throw new IllegalArgumentException("Digite o nome do produto e a quantidade acima de 0");
        }

        for (Produtos produto : estoque) {
            if (produto.getNome().equals(nome)) {
                System.out.println("Produto já existe, adicionando " + quantidade);
                produto.quantidade += quantidade;
                return;

            }
        }

        estoque.add(new Produtos(nome, quantidade));

    }

    public void removerProdutos(String nome, int quantidade) {
        for (Produtos produto : estoque) {
            if (produto.getNome().equals(nome)) {
                produto.quantidade -= quantidade;
                System.out.println("Há " + quantidade + " " + nome);
                if (produto.quantidade == 0) {
                    estoque.remove(produto.nome + produto.quantidade);
                    System.out.println("O produto nao existe!");
                }

            }
        }
    }

    public int consultarQuantidade(String nome) {
        for (Produtos produto : estoque) {
            if (nome == produto.nome) {
                System.out.println(produto.nome + " | " + produto.quantidade);
                return produto.quantidade;
            }
        }
        return 0;
    }

    public String produtoMaisEstocado() {
        int maior = 0;
        for (Produtos produto : estoque) {
            if (produto.quantidade > maior) {
                maior = produto.quantidade;
            }

        }
        for (Produtos produto : estoque) {
            if (maior == produto.quantidade) {
                System.out.println("O produto mais estocado é " + produto.nome);
                return produto.nome;
            }
        }
        return "";
    }

    public void limparEstoque() {
        estoque.clear();
        System.out.println("Estoque foi esvaziado!");
    }

    public void reabastecerEstoque(int quantidade) {
        for (Produtos produto : estoque) {
            produto.quantidade += quantidade;

        }
        System.out.println("Estoque foi reabastecido!");
    }

    public String listarProdutos() {
        String nada = "";
        for (Produtos produto : estoque) {
            nada += produto.nome;
            nada += " ";
        }
        return nada;
    }
}
