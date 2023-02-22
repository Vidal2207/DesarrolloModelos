public class ToogleDoorCommand implements Command{
    private House house;

    public ToogleDoorCommand(House house){
        this.house = house;
    }

    @Override
    public void execute(){
        house.setDoorOpen(!house.isDoorOpen());
    }
}
