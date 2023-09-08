package entities;
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private double precoAtual;

    //método construtor:
    public Carro(String marca, String modelo, String cor, double precoAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.precoAtual = precoAtual;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }
    
    public String toString(){
        return "Marca: " + marca +
                "\nModelo: " +modelo+
                "\nCor: " +cor+
                "Preço atual: " +precoAtual;

    }



}
