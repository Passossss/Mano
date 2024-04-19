package Mano;

public class Calca extends Roupa {
    private float preco;

    public Calca(String tamanho, String cor, float preco) {
        super(tamanho, cor);
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return "Leg";
    }

    @Override
    public String getMarca() {
        return "Balmain";
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
        float desconto = preco * 0.15f;
        return preco + acrescimo - desconto;
    }
}