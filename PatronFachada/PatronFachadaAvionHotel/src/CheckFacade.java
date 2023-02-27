public class CheckFacade {
    Avion avion;
    Hotel hotel;
    CheckFacade(Avion a, Hotel h){
        avion=a;
        hotel=h;
    }
    public void Buscar(String Destino,String Origen,String Fecha,String Hora){
        System.out.println("Resultados de la búsqueda: ");
        System.out.println("**************** Bolet de Avión ****************");
        avion.buscarVuelo(Destino, Origen, Fecha, Hora);
        System.out.println("**************** Hotel ****************");
        hotel.buscarHotel(Destino, Fecha);
    }
}
