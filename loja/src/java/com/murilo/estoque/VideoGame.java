package java.com.murilo.estoque;

public class VideoGame extends Produto{
    private String marca;
    private String modelo;
    private Boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, Boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Boolean getUsado() {
        return isUsado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(Boolean usado) {
        isUsado = usado;
    }

    @Override
    public void calculaImposto() {
        double imposto;
        if(this.isUsado){
            imposto = super.getPreco() * 0.25;
        }
        else{
            imposto = super.getPreco() * 0.45;
        }

        System.out.print("Imposto de: " + getNome() + getModelo());
        if(isUsado) System.out.print(" usado ");
        System.out.print(" é: " + imposto + "\n");
    }
}
