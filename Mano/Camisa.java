package Mano;
public class Camisa extends Roupa {
    private float preco;

    public Camisa(String tamanho, String cor, float preco) {
        super(tamanho, cor);
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return "T-shirt";
    }

    @Override
    public String getMarca() {
        return "Nike";
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        float desconto = preco * 0.1f;
        return preco + acrescimo - desconto;
    }
}