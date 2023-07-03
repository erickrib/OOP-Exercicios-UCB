package polimorfismo2;

public class Carro extends Veiculos{
    private double km;

    public Carro(double km, String modelo, double preco) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    public double getPreco(){
        if(km > 100000){
            return getPreco()* 0.92;
        } else {
            return getPreco();
        }
    }
}
