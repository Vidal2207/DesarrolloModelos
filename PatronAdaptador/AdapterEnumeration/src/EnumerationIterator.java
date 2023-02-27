import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator{
    Enumeration enumerator;
    public EnumerationIterator(Enumeration enumerator) {
        this.enumerator = enumerator;
    }
      
    public boolean hasNext() {
        return enumerator.hasMoreElements();
    }
    
    public Object next() {
        return enumerator.nextElement();
    }
    
    public void remove() {
        System.out.println(".remove(): Ups! La operación no es posible");
    }
}
