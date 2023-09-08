package entities;

public class Garegem {
   
    private Cliente cliente;
    private Carro[] carro;
    private double maisValioso;
    private double menosValioso;
    private double valorTotal;
    
    //construtor:
    public Garegem(Cliente cliente, Carro[] carro){
        this.cliente = cliente;
        this.carro = carro;
        valorTotal = 0;
        for(int i = 0; i<carro.length; i++){
            valorTotal += carro[i].getPrecoAtual();
            if(i==0){
                maisValioso = carro[i].getPrecoAtual();
                menosValioso = carro[i].getPrecoAtual();
            }
            else{
                if(carro[i].getPrecoAtual()>maisValioso){
                    maisValioso = carro[i].getPrecoAtual();
                }
                if(carro[i].getPrecoAtual()<menosValioso){
                    menosValioso = carro[i].getPrecoAtual();
                }
            }
        }
    }

    //calcular mensalidade
    private double calcularMensalidade(){
        return  3500 * carro.length  + (0.5/100 * valorTotal);
    }

    //ordenacao dos carros
    private void ordenarCarros(){
        for(int i = 0; i<carro.length-1; i++){
            for(int j = 0; j<carro.length-i-1;j++){
                if(carro[j].getPrecoAtual()>carro[j+1].getPrecoAtual()){
                    Carro carroAux = carro[j];
                    carro[j] = carro[j+1];
                    carro[j+1] = carroAux;
                }
            }
        }
    }

    public void imprimirFatura(){
        ordenarCarros();

        for (Carro c: carro){
            System.out.println(c);
        }
        System.out.println("_______________________________\n");
        System.out.println("Dados do cliente: \n"+cliente);
        System.out.println("Total Pagamento: "+calcularMensalidade());
    }


}

