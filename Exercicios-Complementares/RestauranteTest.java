public class RestauranteTest {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        System.out.println("Inserir dados do restaurante:");
        restaurante.insertData();

        System.out.println("\nDados do restaurante:");
        restaurante.printData();
    }
}
