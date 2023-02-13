public class WindowWithBorder extends WindowDecorator {
    Window ventana;
    public WindowWithBorder(Window window){
        ventana=window;
    }
    @Override
    public String getWindow(){
        return ventana.getWindow() + "\n|    WITH BORDER   |\n--------------------";
    }
}
