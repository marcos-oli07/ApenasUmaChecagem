import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int resp, conta = 1;

        while (true){
        System.out.printf("\nChecagem de pau nº"+conta+"\n1 = Duro\n2 = Mole\n3 = Não tenho\n4 = Sair\nResposta: ");
        resp = sc.nextInt();

        if (resp == 1){
            System.out.println("\nBelo pau");
            conta = conta+1;
        }
        else if (resp == 2){
            System.out.println("\nAinda não");
            conta = conta+1;
        }
        else if (resp == 3){
            System.out.println("\nSerá?");
            conta = conta+1;
        }
        else if (resp == 4){
            System.out.println("\nTchauzinho!\n");
            System.exit(0);
        }
        else {
            System.out.println("\nResposta inválida");
            conta = conta+1;
        }
    }
    }
}