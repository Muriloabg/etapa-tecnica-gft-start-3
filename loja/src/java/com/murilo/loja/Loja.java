package java.com.murilo.loja;

import java.com.murilo.estoque.Livro;
import java.com.murilo.estoque.VideoGame;
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
            System.out.println("A loja não tem livros no seu estoque.");
            return;
        }
        System.out.println(Arrays.toString(livros.toArray()));
    }

    public void listaVideoGames(){
        if(livros.isEmpty()){
            System.out.println("A loja não tem video-games no seu estoque.");
            return;
        }
        System.out.println(Arrays.toString(videoGames.toArray()));
    }

    public void calculaPatrimonio(){
        int sum = 0;

        for(Livro livro : livros){
            sum += livro.getPreco();
        }
        for(VideoGame videoGame : videoGames){
            sum += videoGame.getPreco();
        }

        System.out.println("O patrimonio da loja: " + getNome() + "é de: " + sum);
    }
}
