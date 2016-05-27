/*
 *   UNIANDES - PUYO
 *   Sistema Lista de Animales 2016
 *   Octavo Semestre
 *   Alexander Ulloa
 *   26/05/2016
 */
package listaanimales;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pc01
 */
public class ListaAnimales {

    public static void main(String[] args) {
                   
         ArrayList<clsAnimal> animales = new ArrayList<>();
        
        clsAnimal a0 = new clsAnimal(1,"GATO",2016/05/06,3,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Viviparos);
        clsAnimal a1 = new clsAnimal(2,"PERRO",null,7,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Viviparos);
        clsAnimal a2 = new clsAnimal(3,"CONEJO",null,2,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Viviparos);
        clsAnimal a3 = new clsAnimal(4,"AVEJA",null,1,clsAnimal.ReinoAnimal.Invertebrados,clsAnimal.Nacimiento.Oviparos);
        clsAnimal a4 = new clsAnimal(5,"MARIPOSA",null,01,clsAnimal.ReinoAnimal.Invertebrados,clsAnimal.Nacimiento.Oviparos);
        clsAnimal a5 = new clsAnimal(6,"LEON",null,30,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Viviparos);
        clsAnimal a6 = new clsAnimal(7,"ORUGA",null,1,clsAnimal.ReinoAnimal.Invertebrados,clsAnimal.Nacimiento.Oviparos);
        clsAnimal a7 = new clsAnimal(8,"PATO",null,10,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Oviparos);
        clsAnimal a8 = new clsAnimal(9,"POLLO",null,5,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Oviparos);
        clsAnimal a9 = new clsAnimal(10,"CABALLO",null,20,clsAnimal.ReinoAnimal.Vertebrados,clsAnimal.Nacimiento.Viviparos);
       
        animales.add(a0);
        animales.add(a1);
        animales.add(a2);
        animales.add(a3);
        animales.add(a4);
        animales.add(a5);
        animales.add(a6);
        animales.add(a7);
        animales.add(a8);
        animales.add(a9);
        
        imprimir(animales);
        
    }
    
    
public static void imprimir(ArrayList<clsAnimal> a)
{
 
   
    for(clsAnimal animales : a){
         System.out.println("***********************");
         System.out.println("  ID: " + animales.ID());
         System.out.println("  NOMBRE: " + animales.Nombres());
         System.out.println("  APAREAMIENTO: " + animales.Apareamiento());
         System.out.println("  PESO: " + animales.Peso());
         System.out.println("  REINO ANIMAL: " + animales.ReinoA());
         System.out.println("  NACIMIENTO: " + animales.Nacimiento());
    }
    
   public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
}

