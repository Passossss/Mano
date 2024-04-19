import javax.swing.*;
import java.awt.*;

public class InterfaceExibicaoCodigo extends JFrame {

    private JTextArea codigoTextArea;

    public InterfaceExibicaoCodigo() {
        super("Sistema de Vendas de Roupas - Código");

        // Criando e configurando a área de texto para exibir o código
        codigoTextArea = new JTextArea();
        codigoTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        codigoTextArea.setEditable(false); // Desativa a edição do código

        // Adicionando a área de texto ao painel principal
        JScrollPane scrollPane = new JScrollPane(codigoTextArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Ajustando o tamanho da janela
        pack();
        setLocationRelativeTo(null); // Posiciona a janela no centro da tela
        setVisible(true); // Exibe a janela
    }

    public void setCodigo(String codigo) {
        codigoTextArea.setText(codigo);
    }

    public static void main(String[] args) {
        // Carrega o código do sistema de vendas de roupas
        String codigoSistema = gerarCodigoSistema();

        // Cria e exibe a interface gráfica
        SwingUtilities.invokeLater(() -> new InterfaceExibicaoCodigo().setCodigo(codigoSistema));
    }

    private static String gerarCodigoSistema() {
        // Interface Produto
        String codigoInterfaceProduto =
                "public interface Produto {\n" +
                        "    String getNome();\n" +
                        "    String getMarca();\n" +
                        "    float getPreco();\n" +
                        "    void setPreco(float preco);\n" +
                        "}\n";

        // Classe Abstrata Roupa
        String codigoClasseRoupa =
                "public abstract class Roupa implements Produto {\n" +
                        "    private String tamanho;\n" +
                        "    private String cor;\n" +
                        "\n" +
                        "    public Roupa(String tamanho, String cor) {\n" +
                        "        this.tamanho = tamanho;\n" +
                        "        this.cor = cor;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getTamanho() {\n" +
                        "        return tamanho;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setTamanho(String tamanho) {\n" +
                        "        this.tamanho = tamanho;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getCor() {\n" +
                        "        return cor;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setCor(String cor) {\n" +
                        "        this.cor = cor;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public abstract float calcularPrecoFinal(float acrescimo);\n" +
                        "}\n";

        // Classes Concretas Camisa, Calça e Vestido
        String codigoClasseCamisa =
                "public class Camisa extends Roupa {\n" +
                        "    private float preco;\n" +
                        "\n" +
                        "    public Camisa(String tamanho, String cor, float preco) {\n" +
                        "        super(tamanho, cor);\n" +
                        "        this.preco = preco;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public float getPreco() {\n" +
                        "        return preco;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void setPreco(float preco) {\n" +
                        "        this.preco = preco;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public float calcularPrecoFinal(float acrescimo) {\n" +
                        "        float desconto = preco * 0.1f;\n" +
                        "        return preco + acrescimo - desconto;\n" +
                        "    }\n" +
                        "}\n";

        // Classe Calça
        String codigoClasseCalca =
                "public class Calca extends Roupa {\n";
        return codigoInterfaceProduto;
    }
}
