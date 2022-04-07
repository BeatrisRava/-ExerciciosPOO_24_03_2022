import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Ex01 carro1 = new Ex01();
        Ex01 carro2 = new Ex01();

        Scanner leitor = new Scanner(System.in);

        // leitor ira guardar a marca e o modelo digitados pelo usuário 
        System.out.printf("Qual é o modelo do carro 1?");
        String modelocarro1 = leitor.nextLine();   

        System.out.printf("Qual é a marca do carro 1?");
        String marcacarro1 = leitor.nextLine(); 

        carro1.setModelo(modelocarro1);
        carro1.setMarca(marcacarro1);      
        
         // leitor ira guardar a marca e o modelo digitados pelo usuário para o carro 2
         System.out.printf("\nQual é o modelo do carro 2?");
         String modelocarro2 = leitor.nextLine();   
 
         System.out.printf("Qual é a marca do carro 2?");
         String marcacarro2 = leitor.nextLine(); 
 
         carro2.setModelo(modelocarro2);
         carro2.setMarca(marcacarro2); 

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

