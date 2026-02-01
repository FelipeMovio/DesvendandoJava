package aula5;

public class ContaBanco {
    // Atributos
   public double numConta;
   protected String tipo;
   private String dono;
   private double saldo;
   private boolean status;


    // Construtor
     public ContaBanco() {
        this.saldo = 0.0;
        this.status = false;
     }

    // Métodos personalizados

    // Estado atual da conta
    public void estadoAtual() {
        System.out.println("----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50.0);
        } else if (t.equals("CP")) {
            this.setSaldo(150.0);
        } else {
            System.out.println("Tipo de conta inválido.");
            this.setStatus(false);
            return;
        }
        System.out.println("conta aberta com sucesso.");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo, não é possível fechar.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com débito, não é possível fechar.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }

    }

    public void depositar(double v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso." + this.getDono());
        } else {
            System.out.println("Conta fechada, não é possível depositar.");
        }

    }
    public void sacar(double v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso." + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Conta fechada, não é possível sacar.");
        }

    }
    public void pagarMensal(){
        double valorMensal = 0.0;
        if (this.getTipo().equals("CC")) {
            valorMensal = 12.0;
        } else if (this.getTipo().equals("CP")) {
            valorMensal = 20.0;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valorMensal);
                System.out.println("Pagamento mensal realizado com sucesso." + this.getDono());
        } else {
            System.out.println("Saldo insuficiente para pagamento mensal.");
        }
    }

    // Métodos especiais

    public double getNumConta() {
        return numConta;
    }
    public void setNumConta(double n) {
        this.numConta = n;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }

}
