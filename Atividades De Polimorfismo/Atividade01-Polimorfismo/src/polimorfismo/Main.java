package polimorfismo;

public class Main {

    public static void main(String[] args) {
        
        Dvd dvd = new Dvd(20,1, 30, "Galinha Pintadinha volume 1");
        dvd.printDados();
        
        Cd cd = new Cd();
        cd.inserirDados();
        cd.printDados();
    }
    
}
