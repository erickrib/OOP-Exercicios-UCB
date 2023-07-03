package polimorfismo2;

public class Moto extends Veiculos{
    private int ano;

    public Moto(int ano, String modelo, double preco) {
        super(modelo, preco);
        this.ano = ano;
    }

    @Override
    public double getPreco(){
        if (ano >= 2008){
            return getPreco() * 1.1;
        } else {
            return getPreco();
        }
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
}
