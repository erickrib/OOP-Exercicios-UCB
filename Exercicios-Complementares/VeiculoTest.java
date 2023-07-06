public class VeiculoTest {
    public static void main(String[] args) {
        CarroPasseio carroPasseio = new CarroPasseio();
        Caminhao caminhao = new Caminhao();

        System.out.println("Inserir dados do carro de passeio:");
        carroPasseio.insertData();

        System.out.println("\nDados do carro de passeio:");
        carroPasseio.print();

        System.out.println("\nInserir dados do caminhão:");
        caminhao.insertData();

        System.out.println("\nDados do caminhão:");
        caminhao.print();
    }
}