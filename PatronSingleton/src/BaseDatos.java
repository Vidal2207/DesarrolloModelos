public class BaseDatos{
    private boolean Conexion;
    private static BaseDatos UniqueBD;

    private BaseDatos(){
        Conexion=false;
    }
    public static BaseDatos getInstance(){
        if(UniqueBD==null){
            UniqueBD = new BaseDatos();
            System.out.println("** Base de datos creada **");  
        }
        else{
            System.out.println("Regresando Base de datos");
        }
        return UniqueBD;
    }
    public boolean isConexion(){
        return Conexion;
    }
    public void ConectarBD(){
        if(!isConexion()){
            Conexion=true;
            System.out.println("Base de datos conectada......");
        }
        else{System.out.println("Error: Base de datos ya conectada");}
    }
    public void DesconectarBD(){
        if(isConexion()){
            System.out.println("Base de datos desconectada......");
        }
        else{System.out.println("Error: Base de datos ya desconectada");}
    }
}