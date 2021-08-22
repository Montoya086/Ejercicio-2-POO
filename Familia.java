/*

 Autor: Andrés Estuardo Montoya Wilhelm
 Programa: Familia.java
 Creación: 16/8/2021   Modificación: 22/8/2021
 Lenguaje: Java
    
*/
import java.util.Random;
public class Familia {
    int niños_pequeños, niños_grandes, adultos, perros;
    String apellido;
    Random rnd=new Random();
    String[] apellidos= {"Juarez","Perez","Lopez"};//apellidos por defecto
    public Familia(int i){// inicializar familias por defecto
        adultos=2;
        perros=0;
        niños_pequeños=rnd.nextInt(3);
        niños_grandes=rnd.nextInt(3);        
        apellido=apellidos[i];
    }
    public Familia(int np, int ng, int ad, String ap){//inicializar familias ingresadas
        niños_pequeños=np;
        niños_grandes=ng;
        adultos=ad;
        apellido=ap;
        perros=0;
    }
    
    /** 
     * @return int
     */
    public int getNiños_pequeños(){// dar numero de niños pequeños
        return niños_pequeños;
    }
    
    /** 
     * @return int
     */
    public int getPerros(){// dar numero de perros
        return perros;
    }
    
    /** 
     * @return int
     */
    public int getAdultos(){// dar numero de adultos
        return adultos;
    }
    
    /** 
     * @return int
     */
    public int getNiños_grandes(){// dar numero de niños grandes
        return niños_grandes;
    }
    
    /** 
     * @return String
     */
    public String getApellido(){// dar apellido de la familia
        return apellido;
    }
    public void setPerros(){// agregar un nuevo perro
        perros++;
    }
}
