public class Main {
    public static void main(String[]args) {
        Cuenta c1 = new Cuenta("C005", "Pepe", 0);
        Cuenta c2 = new Cuenta("C059", "Ana", 500.76f);

        c1.retirar(-1);
        c2.retirar(600);

        System.out.println("Cuenta 1: " + c1.getSaldo());
        System.out.println("Cuenta 2: " + c2.getSaldo());
        c2.retirar(400.76f);
        System.out.println("Cuenta 1: " + c1.getSaldo());
        System.out.println("Cuenta 2: " + c2.getSaldo());
        c1.setTitular("Pepe Flores");
        System.out.println("Titular cuenta 1: "+c1.getTitular());
        System.out.println("Titular cuenta 2: "+c2.getTitular());
        c1.depositar(200);
        System.out.println("Cuenta 1: " + c1.getSaldo());
    }
}