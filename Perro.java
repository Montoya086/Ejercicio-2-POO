/*

 Autor: Andrés Estuardo Montoya Wilhelm
 Programa: Perro.java
 Creación: 16/8/2021   Modificación: 22/8/2021
 Lenguaje: Java
    
*/
public class Perro {
    String tamaño, raza, nombre;
    int edad, salud;
    boolean adoptado;
    public Perro(String tam, String ra, int ed, int sal, String nom){//inicializar perro
        adoptado=false;
        tamaño=tam;
        raza=ra;
        nombre=nom;
        edad=ed;
        salud=sal;
    }
    
    /** 
     * @return String
     */
    public String getTamaño(){//dar tamaño
        return tamaño;
    }
    
    /** 
     * @return String
     */
    public String getRaza(){// dar raza
        return raza;
    }
    
    /** 
     * @return String
     */
    public String getNombre(){// dar nombre
        return nombre;
    }
    
    /** 
     * @return int
     */
    public int getEdad(){// dar edad
        return edad;
    }
    
    /** 
     * @return int
     */
    public int getSalud(){// dar salud
        return salud;
    }
    
    /** 
     * @return boolean
     */
    public boolean getAdoptado(){//dar estado de adopcion
        return adoptado;
    }
    public void setAdoptado(){// cambiar estado de adopción
        adoptado=true;
    }
}
