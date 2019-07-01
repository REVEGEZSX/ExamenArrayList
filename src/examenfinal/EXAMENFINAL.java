package examenfinal;
import java.util.*;
public class EXAMENFINAL {
    public static ArrayList <String> nombre = new ArrayList(); 
    public static ArrayList <Float> velocidad = new ArrayList();
    public static ArrayList <Float> tiempo = new ArrayList();
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int cantE;
        System.out.println("ingrese la cantidad de estudiantes");
        cantE = leer.nextInt();
        for(int x=0; x<cantE; x++)
        {
            System.out.println("ingrese el nombre del estudiante "+(x+1));
            nombre.add(leer.next());
            System.out.println("ingrese la velocidad del estudiante "+(x+1));
            velocidad.add(leer.nextFloat());
            tiempo.add(100/velocidad.get(x));
        }
        System.out.println("Lista de estudiantes");
        for(int x=0; x<cantE; x++)
        {
            System.out.println(nombre.get(x)+" "+velocidad.get(x)+" "+tiempo.get(x));
        }
    }
    
}
