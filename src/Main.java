public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int contador = 0;

        while (contador < 10) {
            System.out.println("Contador = " + contador);
            //incremento
            contador++;
            // Laço do para faça - for
            for (int x = 0; x < 10; x++) {
                System.out.print("Contador = " + x);
            }
            int cont = 1;
            do {
                //Processo
                System.out.println(cont);
                cont++;
            } while (cont <= 10);
        }
    }
}