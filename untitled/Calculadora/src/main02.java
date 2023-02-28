import java.util.Scanner;

public class main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual operação deseja efetuar (+, -, *, /)");
            int operacao = sc.nextLine().charAt(0);
            System.out.println("Quantos números voce deseja ?");
            int quantidade = Integer.parseInt(sc.nextLine());

            double resultado = 0;
            boolean primeiroNumero = true;

            for (int i = 1; i <= quantidade; i++) {
                System.out.println("Digite o " + i + "º número:" );
                double numero = Double.parseDouble(sc.nextLine());
                if (primeiroNumero) {
                    resultado = numero;
                    primeiroNumero = false;
                } else {
                    switch (operacao) {
                        case '+':
                            resultado += numero;
                            break;
                        case '-':
                            resultado -= numero;
                            break;
                        case '*':
                            resultado *= numero;
                        case '/':
                            resultado /=numero;
                            break;
                    }
                }
            }
            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja continuar usando a calculadora? S/N");
            int resposta = sc.nextLine().charAt(0);
            if (resposta == 'N')
            {
                continuar = false;
                System.out.println("Adeus!");
            }if (resposta == 'n'){
                continuar = false;
                System.out.println("Adeus!");
            }
        }
        sc.close();
    }
}
