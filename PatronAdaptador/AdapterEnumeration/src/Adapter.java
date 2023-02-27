import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Adapter {
    public static void main(String[] args) throws Exception {
        //////////////////////////////////////////
        // ADAPTADOR DE ENUMERATION A ITERATOR //
        ///////////////////////////////////////
        System.out.println("\n ---- ADAPTADOR DE ENUMERATION A ITERATOR ----\n");
        Vector<String> days_of_week = new Vector<String>();
        days_of_week.add("Lunes");
        days_of_week.add("Martes");
        days_of_week.add("Miércoles");
        days_of_week.add("Jueves");
        days_of_week.add("Viernes");
        days_of_week.add("Sábado");
        days_of_week.add("Domingo");
        System.out.println("--------------------------------------------\nLos días de la semana: \n" + days_of_week+"\n--------------------------------------------");
        Enumeration <String>enumerator = days_of_week.elements();
        Iterator enumeratorIterator = new EnumerationIterator(enumerator);
        while (enumeratorIterator.hasNext())
            System.out.println(".next(): "+enumeratorIterator.next() + " ");
        enumeratorIterator.remove();
        //////////////////////////////////////////
        // ADAPTADOR DE ITERATOR A ENUMERATION //
        ///////////////////////////////////////
        System.out.println("\n ---- ADAPTADOR DE ITERATOR A ENUMERATION ----\n");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Enero");
        list.add("Febrero");
        list.add("Marzo");
        list.add("Abril");
        list.add("Mayo");
        list.add("Junio");
        list.add("Julio");
        System.out.println("--------------------------------------------\nLos primeros 6 meses del año: \n" +list+"\n--------------------------------------------");
        Iterator <String>iterator = list.iterator();
        Enumeration iteratorEnumerator = new IteratorEnumeration(iterator);
        while(iteratorEnumerator.hasMoreElements())
            System.out.print(".nextElement(): "+iteratorEnumerator.nextElement() + "\n");
    }
}
