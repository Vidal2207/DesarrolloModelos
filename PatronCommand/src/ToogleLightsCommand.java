public class ToogleLightsCommand implements Command {
    private House house;

    public ToogleLightsCommand(House house){
        this.house = house;
    }

    @Override
    public void execute(){
        house.setLightsOn(!house.isLightsOn());
    }
}
