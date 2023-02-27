public class App {
    public static void main(String[] args) throws Exception {
        Avion arolinea = new Avion();
        Hotel hotel = new Hotel();
        CheckFacade ViajesRes = new CheckFacade(arolinea, hotel);
        ViajesRes.Buscar("Puerto Vallarta, Jalisco", "Huejotzingo,Puebla", "01 de julio de 2023", "9:40");
    }
}
