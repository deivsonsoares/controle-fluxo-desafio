import java.util.InputMismatchException;
import java.util.Scanner;;

public class Contador {

    public static void main(String[] args) {
        try {
            int i = 1;
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro numero: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo numero: ");
            int parametroDois = terminal.nextInt();

            terminal.close();
            if (parametroDois < parametroUm) {
                throw new ParametrosInvalidosException();
            }

            for (int contagem = parametroDois - parametroUm; i != contagem + 1; i++) {

                System.out.println("Imprimindo o número: " + i);

            }
        } catch (InputMismatchException | ParametrosInvalidosException e) {
            System.out.println(
                    "O Segundo paramentro deve ser maior que o primeiro. \n Ou você digitou algo diferente de números inteiros");
        }
    }
}