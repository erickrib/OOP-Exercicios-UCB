

public class TesteAnimal {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("Dourado", 0.5, "Água doce");
        Cachorro cachorro1 = new Cachorro("Rex", 10.0, "Labrador");

        System.out.println(peixe1.toString());
        System.out.println(cachorro1.toString());
    }
}