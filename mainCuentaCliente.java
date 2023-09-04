public class mainCuentaCliente {
    public mainCuentaCliente() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        cliente c = new cliente("lalalalla", "lalalalla", "1-2");
        cuenta cuent = new cuenta(c, 500, 2);
        System.out.println("nombre " + c.nombre + " " + c.apellido);

        // cuenta
        c.asiganaCuenta(cuent);
        System.out.print("saldo ");
        (c.ccc).consultaSaldo();

        (c.ccc).gira(600);
        System.out.println((c.ccc).saldo);
        System.out.println("\n");

        // cuenta ahorro
        cliente c2 = new cliente("juanito", "perez", "1-3");
        System.out.println("nombre " + c2.nombre + " " + c2.apellido);
        cuentaAhorro cuent2 = new cuentaAhorro(c2, 600, 3);
        c2.asiganaCuentaAhorro(cuent2);
        System.out.print("saldo ");
        (c2.ccc2).consultaSaldoAhorro();
        (c2.ccc2).depositoAhorro(200);
        System.out.print("saldo despues del deposito ");
        (c2.ccc2).consultaSaldoAhorro();
        (c2.ccc2).giroAhorro(20);
        System.out.print("saldo despues del giro ");
        (c2.ccc2).consultaSaldoAhorro();
        System.out.println("\n");

        // cuenta corriente
        cliente c3 = new cliente("marcelo", "salas", "1-4");
        System.out.println("nombre " + c3.nombre + " " + c3.apellido);
        cuentaCorriente cuent3 = new cuentaCorriente(c3, 1000, 500, 3);
        c3.asiganaCuentaCorriente(cuent3);
        System.out.print("saldo ");
        (c3.ccc3).consultaSaldoCorriente();
        (c3.ccc3).depositoCorriente(10000);
        System.out.print("saldo despues del deposito ");
        (c3.ccc3).consultaSaldoCorriente();

    }
}