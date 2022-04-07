import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Ex03 carro1 = new Ex03("Ford","1.0");
        Ex03 carro2 = new Ex03("Renault","1.6");

        Scanner leitor = new Scanner(System.in);

        carro1.exibirMensagem();
        carro2.exibirMensagem();

        carro1.getModelo();
        carro1.getMarca();

        carro2.getModelo();
        carro2.getMarca();
        
        System.out.printf("\n\nDigite 1 se deseja ligar o farol:");
        int ligar = leitor.nextInt();

        if (ligar == 1){
           carro1.Ligarfarol();
        }
        
        else{
            carro1.Desligarfarol();
        }

        
        leitor.close();
        
    }
}   