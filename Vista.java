/*

 Autor: Andrés Estuardo Montoya Wilhelm
 Programa: Vista.java
 Creación: 16/8/2021   Modificación: 22/8/2021
 Lenguaje: Java
    
*/
import java.util.Scanner;
public class Vista {
    Scanner sc;
    public Vista(){
        sc=new Scanner(System.in);
    }
    
    public void msgBienvenida(){// mensaje de bienvenida
        System.out.println("Bienvenido al sistema de asignacion de familias temporales caninas");
    }
    
    /** 
     * @param numerodeFamiliares(
     * @return int
     */
    public int mostrarOpciones(){ // menú de selección y registro de la selección
        System.out.println("***Seleccione una de las siguientes opciones:***");
        System.out.println("1. Nueva familia");
        System.out.println("2. Nuevo perro");
        System.out.println("3. Buscar familia");
        System.out.println("4. Perro buscando familia");
        System.out.println("5. Familias inscritas");
        System.out.println("6. Salir");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    /** 
     * @return int
     */
    public int numerodeFamiliares(){// ingreso de la cantidad de familiares
        System.out.println("Ingrese el numero de integrantes en su familia (minimo 2)");
        int num = Integer.parseInt(sc.nextLine());
        return num;
    }
    public void familiaInvalida(){// mensaje de familia invalida
        System.out.println("La familia es invalida");
    }
    public void baseLlena(){// se llenó el arreglo de familias
        System.out.println("La base de datos de familias está llena");
    }
    public void apellidoExiste(){// el apellido está repetido
        System.out.println("El apellido ya existe en la base de datos");
    }
    
    /** 
     * @param i
     */
    public void ingNombre(int i){ // pedir el nombre del familiar
        System.out.println("Ingrese el nombre del familiar "+i+":");
        sc.nextLine();
    }
    
    /** 
     * @param i
     * @return int
     */
    public int ingEdad(int i){ // pedir la edad del familiar
        System.out.println("Ingrese la edad del familiar "+i+":");
        int edad = Integer.parseInt(sc.nextLine());
        return edad;
    }
    
    /** 
     * @return String
     */
    public String pedirApellido(){// pedir apellido de la familia
        System.out.println("Ingrese el apellido de la familia:");
        String apellido = sc.nextLine();
        return apellido;
    }
    
    /** 
     * @param niños_pequeños
     * @param niños_grandes
     * @param adultos
     * @param apellido
     */
    public void familiaCreada(int niños_pequeños, int niños_grandes, int adultos, String apellido){//Indicar que la familia fue creada
        System.out.println("Se ha creado la familia "+apellido+" con:");
        System.out.println(niños_pequeños+" Niño(s) pequeño(s)");
        System.out.println(niños_grandes+" Niño(s) grande(s)");
        System.out.println(adultos+" Adulto(s)");
    }
    
    /** 
     * @return String
     */
    public String ingTamaño(){//ingresar el tamaño del perro
        System.out.println("Ingrese el tamaño del perro (pequeno, mediano, grande):");
        String tamaño = sc.nextLine();
        return tamaño;
    }
    
    /** 
     * @return String
     */
    public String ingRaza(){// ingresar la raza del perro
        System.out.println("Ingrese la raza del perro (colocar mestizo en caso no saber):");
        String raza = sc.nextLine();
        return raza;
    }
    
    /** 
     * @return int
     */
    public int ingEdad(){// ingreso de la edad del perro
        System.out.println("Ingrese la edad aproximada del perro:");
        int edad = Integer.parseInt(sc.nextLine()) ;
        return edad;
    }
    
    /** 
     * @return int
     */
    public int ingSalud(){// ingreso de la salud del perro
        System.out.println("Ingrese la salud del perro (0-100):");
        int salud = Integer.parseInt(sc.nextLine()) ;
        return salud;
    }
    
    /** 
     * @return String
     */
    public String ingNombre(){// ingreso del nombre del perro
        System.out.println("Ingrese el nombre del perro:");
        String nombre = sc.nextLine();
        return nombre;
    }
    public void msgNoperro(){// no existe el perro
        System.out.println("-------------------------------------");
        System.out.println("Actualmente no hay perros disponibles");
        System.out.println("-------------------------------------");
    }
    
    /** 
     * @param a
     * @param ad
     * @param ng
     * @param np
     */
    public void mostrarDatosFamilia(String a, int ad, int ng, int np){// mostrar datos de la familia
        System.out.println("El perro ha sido adoptado por la familia: "+ a+", la cual tiene:");
        System.out.println(ad+" adulto(s)");
        System.out.println(ng+" niño(s) grande(s)");
        System.out.println(np+" niño(s) pequeño(s)");
    }
    public void mensajePerrera(){// mensaje de no se encontro dueño
        System.out.println("--------------------------------------------------------");
        System.out.println("No se encontro dueño por lo que se quedara en la perrera");
        System.out.println("--------------------------------------------------------");
    }
    public void msgPerroYaAdoptado(){// mesnaje de que el perro ya ha sido adoptado
        System.out.println("-------------------------------------");
        System.out.println("Este perro ya tiene un dueño temporal");
        System.out.println("-------------------------------------");
    }
    
    /** 
     * @param edad
     * @param nombre
     * @param raza
     * @param tamaño
     * @param salud
     * @param estado
     */
    public void datosPerro(int edad, String nombre, String raza, String tamaño, int salud, String estado){//Mostrar los datos del perro
        System.out.println("\nDatos del perro \""+nombre+"\":");
        System.out.println("Raza: "+raza);
        System.out.println("Tamaño: "+tamaño);
        System.out.println("% de salud: "+salud+"%");
        System.out.println("Edad: "+edad);
        System.out.println("Estado de adopción: "+estado+"\n");
    }
    public void msgDatosFamilias(){// mostrar los datos de las familias(titulo)
        System.out.println("Datos de las familias inscritas al sistema de adopción: \n");
    }
    
    /** 
     * @param niños_pequeños
     * @param niños_grandes
     * @param adultos
     * @param perros
     * @param apellido
     */
    public void DatosFamilias(int niños_pequeños,int niños_grandes, int adultos, int perros, String apellido){//mostrar los datos de las familias
        System.out.println("Familia "+apellido);
        System.out.println("Niño(s) pequeño(s): "+niños_pequeños);
        System.out.println("Niño(s) grandes(s): "+niños_grandes);
        System.out.println("Adulto(s): "+adultos);
        System.out.println("Perros adoptados: "+perros+"\n");
        System.out.println("*****************************************************\n");
    }
    public void msgNoFamilias(){// mensaje no hay familias disponibles
        System.out.println("---------------------------------------");
        System.out.println("Actualmente no hay familias disponibles");
        System.out.println("---------------------------------------");
    }
    public void nuevoPerro(){//mensaje de que el perro ha sido ingresado
        System.out.println("--------------------------");
        System.out.println("El perro ha sido ingresado");
        System.out.println("--------------------------");
    }
}
