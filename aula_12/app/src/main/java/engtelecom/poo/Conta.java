package engtelecom.poo;

public class Conta {
    private long numConta;
    private double saldo;
    private String titular;
    
    public Conta(long numConta, double saldoInicial, String titular) {
        if(!setSaldo(saldoInicial)) return;
        this.numConta = numConta;
        this.titular = titular;
    }

    private boolean setSaldo(double saldo){
        if (saldo < 0) return false;
        this.saldo = saldo;
        return true;
    }

    public boolean depositar(double valor){
        if (valor <= 0) return false;
        double total = saldo + valor;
        if(setSaldo(total)) return true;
        return false;
    }

    public void sacar(double valor){
        if (valor <= 0) return;
        double total = saldo - valor;
        setSaldo(total);
    }

    public long getNumConta(){
        return numConta;
    }
    
    @Override
    public String toString(){
        return "Titular: " + titular + "\nNº conta: " + numConta + "\nSaldo: " + saldo;
    }
}
