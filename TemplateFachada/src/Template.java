import java.util.Scanner;

public abstract class Template {
    private double largo=0,ancho=0;
    protected String name;
    private boolean acabado=false;
    private void SetMedidas(){
        Scanner reader = new Scanner(System.in);
        do {
            System.out.print("Ingresa la medida del largo en centimetros: ");
            try {largo = reader.nextDouble();}
            catch (Exception e){
                System.out.print("Ingresa una medida valida: ");
                reader.next();
            }
        } while (largo<=0);

        do {
            System.out.print("Ingresa la medida del ancho en centimetros: ");
            try {ancho = reader.nextDouble();}
            catch (Exception e){
                System.out.print("Ingresa una medida valida: ");
                reader.next();
            }
        } while (ancho<=0);
        boolean opcion=false;
        System.out.println("Dar acabado al material ");
        System.out.println("  1 - Si");
        System.out.println("  2 - No");
        do {
            System.out.print("Introduce una opción: ");
            try {
                int opc = reader.nextInt();
                switch(opc){
                    case 1:
                        acabado=opcion=true;
                        break;
                    case 2:
                        acabado=false;
                        opcion=true;
                        break;
                    default:
                        //System.out.println("Opción incorrecta");
                }
            } catch (Exception im){
            }
        } while (!opcion);
        reader.close();
    }
    private void Laminar(){
        System.out.println("Obteniendo piezas laminadas de "+ name);
    }   
    abstract void ObtenerAcabado();
    private void Empacar(){
        System.out.println("Piezas empaquetadas en grupos de 5");
    }
    public void SetPedido(){
        System.out.println("------- Pedido de "+name+" -------");
        SetMedidas();
    }
    public void GetPedido(){
        System.out.println("---------------------------------------------------");
        Laminar();
        System.out.println("Laminas cortadas con las medidas: Largo: "+largo+"cm y Ancho: "+ancho+"cm");
        if(acabado){ObtenerAcabado();}
        Empacar();
        System.out.println("---------------------------------------------------");
    }
}
