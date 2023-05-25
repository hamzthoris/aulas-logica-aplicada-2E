public class Pessoa extends Animal {

    //Atributos da Pessoa
    public String sobrenome;
    // Métodos da Classe pessoa
    public void falar() {
        System.out.println("Falei");
    }
    // sobrecarga método falar()
    public String falar(String volume) {
        return "falei" + volume;
    }
    public void comer() {
        System.out.println("comeu como pessoa");
    }
}
