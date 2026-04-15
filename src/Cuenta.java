public class Cuenta {
    private String numero;
    private String titular;
    private float saldo;

    public Cuenta(String numero, String titular, float saldo){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public String getTitular(){
        return titular;

    }
    public void depositar(float cantidad){
        if(cantidad<=0){
            System.out.println("No se puede depositar montos negativos");
        }
        else{
            saldo=saldo+cantidad;
            System.out.println("Se deposito correctamente");
            System.out.println("Su nuevo saldo es: "+saldo);
        }
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public void retirar(float cantidad){
        if(cantidad<=0){
            System.out.println("No se puede retirar montos negativos");
        }
        else if(saldo>=cantidad){
            saldo=saldo-cantidad;
            System.out.println("Se retiro correctamente");
            System.out.println("Su nuevo saldo es: "+saldo);
        }
        else{
            System.out.println("No puede retirar la cantidad");
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo Actual: "+getSaldo());
        }
    }


}