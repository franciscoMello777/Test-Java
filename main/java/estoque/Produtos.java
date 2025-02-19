/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Produtos {

    public String nome;
    public int quantidade;

    public Produtos(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }
}
