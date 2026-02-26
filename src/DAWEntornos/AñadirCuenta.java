package DAWEntornos;

public class AñadirCuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        // cuenta1.saldo = 200;
        cuenta1.deposita(200);
        System.out.println(cuenta1.getSaldo());

        // cuenta1.saldo += 100;
        cuenta1.deposita(100);
        System.out.println(cuenta1.getSaldo());

        Cuenta cuenta2 = new Cuenta();
        // cuenta2.saldo = 50;
        cuenta2.deposita(50);

        System.out.println("primera Cuenta tiene " + cuenta1.getSaldo());
        System.out.println("segunda Cuenta tiene " + cuenta2.getSaldo());

        System.out.println(cuenta1.getAgencia());
        System.out.println(cuenta1.getNumero());

        System.out.println(cuenta2.getAgencia());

        // cuenta2.agencia = 146;
        cuenta2.setAgencia(146);
        System.out.println("Ahora la segunda cuenta esta en la agencia " + cuenta2.getAgencia());

        if(cuenta1 == cuenta2) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes");
        }

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }

}
