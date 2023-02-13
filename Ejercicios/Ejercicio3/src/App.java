public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Window ventana = new WindowA();
        Window ventanaa = new WindowA();
        System.out.println(ventana.getWindow());
        ventana = new ScrollingWindow(ventana);
        System.out.println(ventana.getWindow());
        Window ventanab = new WindowB();
        ventanab = new ScrollingWindow(ventanab);
        ventanab = new WindowWithBorder(ventanab);
        System.out.println(ventanab.getWindow());
        System.out.println(ventanaa.getWindow());
    }
}
