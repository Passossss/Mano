public class Mano {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa("M", "Branca", 50.00f);
        Calca calca1 = new Calca("38", "Jeans", 80.00f);
        Vestido vestido1 = new Vestido("P", "Floral", 120.00f);

        float precoFinalCamisa1 = camisa1.calcularPrecoFinal(5.00f);
        float precoFinalCalca1 = calca1.calcularPrecoFinal(5.00f);
        float precoFinalVestido1 = vestido1.calcularPrecoFinal(5.00f);

        System.out.printf("Camisa %s - Preço Final: R$%.2f\n", camisa1.getNome(), precoFinalCamisa1);
        System.out.printf("Calça %s - Preço Final: R$%.2f\n", calca1.getNome(), precoFinalCalca1);
        System.out.printf("Vestido %s - Preço Final: R$%.2f\n", vestido1.getNome(), precoFinalVestido1);
    }
}
