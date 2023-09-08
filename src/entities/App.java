package entities;

public class App {
    public static void main(String[] args) throws Exception {
       Cliente cliente1 = new Cliente("Amanda Rangel", 22, 20000);
       Cliente cliente2 = new Cliente("André Miranda", 25, 22000);
       System.out.println(cliente1);
       System.out.println("\n_________________________________________________________");
       System.out.println(cliente2);
       

       Carro[] carrosAmanda = new Carro[3];
       carrosAmanda[0] = new Carro("BWM", "Xuxa", "Prata", 2000000);
       carrosAmanda[1] =  new Carro("Audi", "tt conversivel", "Preto", 300000);
       carrosAmanda[2] = new Carro("Jeep", "Compasse", "Cinza", 123000);
       Carro[] carrosAndre = new Carro[1];
       carrosAndre[0] = new Carro("Jeep", "Compasse", "Cinza", 123000);
       
       System.out.println("\n_________________________________________________________");
       System.out.println(carrosAmanda[1]);
       System.out.println("\n_________________________________________________________");
       System.out.println(carrosAndre[0]);
       
       Garegem garagemAndre = new Garegem(cliente2, carrosAndre);
       Garegem garagemAmanda = new Garegem(cliente1, carrosAmanda);
       
       System.out.println("\n_________________________________________________________");
       garagemAmanda.imprimirFatura();
       garagemAndre.imprimirFatura();

        
    }
}
 