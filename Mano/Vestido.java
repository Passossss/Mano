package Mano;
public class Vestido extends Roupa {
    private float preco;

    public Vestido(String tamanho, String cor, float preco) {
        super(tamanho, cor);
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return "Dress";
    }

    @Override
    public String getMarca() {
        return "Fendi";
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
        float desconto = preco * 0.2f;
        return preco + acrescimo - desconto;
    }
}