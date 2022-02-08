package com.murilo.loja;

import com.murilo.estoque.Livro;
import com.murilo.estoque.VideoGame;

import java.util.Arrays;
import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    List<Livro> livros;
    List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros(){
        if(livros.isEmpty()){
            System.out.println("A loja não tem livros em estoque.");
            return;
        }

        System.out.println("A Loja " + getNome() + " possui estes livros para venda: ");

        for(Livro livro : livros){
            System.out.println("Título: " + livro.getNome() + ", preço: " + livro.getPreco() + ", quantidade: " + livro.getQtd() + " em estoque");
        }
    }

    public void listaVideoGames(){
        if(videoGames.isEmpty()){
            System.out.println("A loja não tem livros em estoque.");
            return;
        }

        System.out.println("A Loja " + getNome() + " possui estes livros para venda: ");

        for(VideoGame videoGame : videoGames){
            System.out.println("Título: " + videoGame.getNome() + ", preço: " + videoGame.getPreco() + ", quantidade: " + videoGame.getQtd() + " em estoque");
        }
    }

    public void calculaPatrimonio(){
        int sum = 0;

        for(Livro livro : livros){
            sum += livro.getPreco() * livro.getQtd();
        }
        for(VideoGame videoGame : videoGames){
            sum += videoGame.getPreco() * videoGame.getQtd();
        }

        System.out.println("O patrimonio da loja: " + getNome() + "é de: " + sum);
    }
}
