package entities;

public class Cliente{
    private String nome;
    private int idade;
    private double rendaAnual;

    //método construtor
    public Cliente(String nome, int idade, double rendaAnual){
        this.nome = nome;
        this.idade = idade;
        this.rendaAnual = rendaAnual;
    }

    //métodos para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public String toString() {
        return "Nome=" + nome + "\nIdade=" + idade + "\nSalario Anual=" + rendaAnual;
    }





}