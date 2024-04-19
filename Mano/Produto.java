package Mano;

public interface Produto {
    String getNome();
    String getMarca();
    float getPreco();
    void setPreco(float preco);

    float calcularPrecoFinal(float acrescimo);
}