package java.com.murilo.estoque;

import java.util.Objects;

public class Livro extends Produto{
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    @Override
    public void calculaImposto() {
        double imposto;
        if(Objects.equals(this.tema, "educativo")){
            imposto = 0d;
        }
        else{
            imposto = super.getPreco() * 0.1;
        }

        System.out.println("Imposto de: " + getNome() + " é: " + imposto);
    }
}
