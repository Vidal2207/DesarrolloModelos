public class App {
    public static void main(String[] args) throws Exception {
        BaseDatos baseDatos1 = BaseDatos.getInstance();
        BaseDatos baseDatos2 = BaseDatos.getInstance();

        baseDatos1.ConectarBD();
        baseDatos2.ConectarBD();
        baseDatos2.DesconectarBD();
    }
}
