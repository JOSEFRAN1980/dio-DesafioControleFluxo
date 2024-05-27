import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        System.out.println("DIGITE O PRIMEIRO NÚMERO");
        Scanner terminal = new Scanner(System.in);
        int parametroUm = terminal.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO");
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser  maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contador = parametroDois - parametroUm;
        for (int indice = 1; indice <= contador; indice++) {

            System.out.println("Imprimindo o número " + indice);
            
        }
    }
}

class ParametrosInvalidosException extends Exception {

}