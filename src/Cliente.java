public class Cliente {
    private String nome;
    private String tipoDeConta;
    private double saldo;

    //Construtor padrão
    public Cliente(String nome, String tipoDeConta, double saldo) {
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getTipoDeConta() {
        return tipoDeConta;
    }
    //Serve para consultar saldo
    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {this.saldo -= valor;;}
        else{System.out.println("Valor insuficiente");};
    }
}
