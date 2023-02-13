public class ScrollingWindow extends WindowDecorator {
    Window ventana;
    public ScrollingWindow(Window window){
        ventana=window;
    }
    @Override
    public String getWindow(){
        return ventana.getWindow() + "\n|  WITH SCROLLING  |\n--------------------";
    }
}
