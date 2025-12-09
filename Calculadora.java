import java.util.Scanner;

public class Calculadora {

    public double n1;
    public double n2;

    public double  sum(){
        return this.n1 + this.n2;
    }

    public double sub(){

        return this.n1 - this.n2;
    }

    public double div(){
        return this.n1 / this.n2;
    }

    public double mult(){
        return this.n1 * this.n2;
    }

    public void clear(){
        this.n1 = 0;
        this.n2 = 0;
    }

    public void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {

        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);

        int option;
        do{
            calculadora.clear();
            calculadora.clearScreen();
            System.out.println("=== CALCULADORA ===\r\n" + //
                            "1.  Somar\r\n" + //
                            "2.  Subtrair\r\n" + //
                            "3.  Multiplicar\r\n" + //
                            "4.  Dividir\r\n" + //
                            "5.  Sair\r\n" + //
                            "Digite sua opção:");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite o 1º número: ");
                    calculadora.n1 = sc.nextInt();
                    System.out.println("Digite o 2º número: ");
                    calculadora.n2 = sc.nextInt();
                    System.out.println("A soma dos numeros é: " + calculadora.sum());
                    Thread.sleep(2000);
                    
                    break;

                    case 2:
                    System.out.println("Digite o 1º número: ");
                    calculadora.n1 = sc.nextInt();
                    System.out.println("Digite o 2º número: ");
                    calculadora.n2 = sc.nextInt();
                    System.out.println("A subtração dos numeros é: " + calculadora.sub());
                    Thread.sleep(2000);
                    
                    break;

                    case 3:
                    System.out.println("Digite o 1º número: ");
                    calculadora.n1 = sc.nextInt();
                    System.out.println("Digite o 2º número: ");
                    calculadora.n2 = sc.nextInt();
                    System.out.println("A multiplicação dos numeros é: " + calculadora.mult());
                    Thread.sleep(2000);
                    
                    break;

                    case 4:
                    System.out.println("Digite o 1º número: ");
                    calculadora.n1 = sc.nextInt();
                    System.out.println("Digite o 2º número: ");
                    calculadora.n2 = sc.nextInt();
                    System.out.println("A divisão dos numeros é: " + calculadora.div());
                    Thread.sleep(2000);

                    break;

                    case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    Thread.sleep(2000);
                    
                    break;

                default:
                    System.out.println("Opção inválida!");
                    Thread.sleep(2000);

                    break;
            }            
        }while(option != 5);    
    }


}