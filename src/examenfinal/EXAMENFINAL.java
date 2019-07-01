package examenfinal;
import java.util.*;
public class EXAMENFINAL {
    public static ArrayList <String> nombre = new ArrayList(); 
    public static ArrayList <Float> velocidad = new ArrayList();
    public static ArrayList <Float> tiempo = new ArrayList();
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int t=1, x=0;
        while(t!=0)
        {
            System.out.println("ingrese el nombre del estudiante "+(x+1));
            nombre.add(leer.next());
            System.out.println("ingrese la velocidad del estudiante "+(x+1));
            velocidad.add(leer.nextFloat());
            tiempo.add(100/velocidad.get(x));
            System.out.println("Desea terminar?/ ingrese 0 para salir");
            t = leer.nextInt();
            x=x+1;
        }
        System.out.println("Lista de estudiantes");
        System.out.println("Nombre___Velocidad_____tiempo");
        for(int i=0; i<nombre.size(); i++)
        {
            System.out.println(nombre.get(i)+"_______"+velocidad.get(i)+"________"+tiempo.get(i));
        }
    }
    
}
