public class Ex03 {
    // CLASSE DE CARRO 
    private String modelo;
    private String marca;

    // armazena o modelo que for digitado
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Pega os dados digitados para exibir no método 
    public String getModelo() {
        return modelo;
    }

    // armazena a marca do carro.
    public void setMarca(String marca) {  
        this.marca = marca;  
    }
    public String getMarca() { 
        return marca;
    }

    //Construtor 
    public Ex03(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo; 
    }

    public void Ligarfarol(){
        System.out.printf("\nFarol Ligado\n"); 
    }

    public void Desligarfarol(){
        System.out.printf("\nFarol desligado\n");
    }

    //Exibe os valores antes digitados pelo usuário 
    public void exibirMensagem (){ 
        System.out.printf ("\nO modelo do carro é: %s \n A marca do carro é: %s ", this.getModelo(), this.getMarca()); 
    }   

}
