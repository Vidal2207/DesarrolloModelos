public class App {
    public static void main(String[] args) throws Exception {
        Subasta producto1 = new Subasta("Televisión 32\"", 1000);
        Subasta producto2 = new Subasta("Reloj", 455.3);
        Observer licitador1 = new Licitador("Eduardo");
        Observer licitador2 = new Licitador("Martha");
        producto1.addObserver(licitador1);
        producto2.addObserver(licitador2);
        producto2.addObserver(licitador1);
        
        producto1.newPrecio(567.5);
        producto2.newPrecio(1543);
    }
}
