public class House {
    private boolean lightsOn = false;
    private boolean doorOpen = false;

    public boolean isLightsOn() {
        return lightsOn;
    }
    public boolean isDoorOpen() {
        return doorOpen;
    }
    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen=doorOpen;
        if(doorOpen){System.out.println("Puerta abierta");}
        else{System.out.println("Puerta cerrada");}
    }
    public void setLightsOn(boolean lightsOn) {
        this.lightsOn=lightsOn;
        if(lightsOn){System.out.println("Luz encendida");}
        else{System.out.println("Luz apagada");}
    }

}
