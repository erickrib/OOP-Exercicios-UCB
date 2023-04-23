public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        albertEinstein.informaIdade();
        isaacNewton.informaIdade();
    }
}
