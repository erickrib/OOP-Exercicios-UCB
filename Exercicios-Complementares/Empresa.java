import java.util.Scanner;

class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da empresa: ");
        nome = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Cidade: ");
        cidade = scanner.nextLine();
        System.out.print("Estado: ");
        estado = scanner.nextLine();
        System.out.print("CEP: ");
        cep = scanner.nextLine();
        System.out.print("Telefone: ");
        fone = scanner.nextLine();
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + fone);
    }
}

class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
        super();
        this.tipoComida = "";
        this.precoMedioPrato = 0.0;
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
            String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void insertData() {
        insert();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo de comida: ");
        tipoComida = scanner.nextLine();
        System.out.print("Preço médio do prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    public void printData() {
        print();
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preço médio do prato: " + precoMedioPrato);
    }
}

