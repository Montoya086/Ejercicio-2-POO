/*

 Autor: Andrés Estuardo Montoya Wilhelm
 Programa: Perrera.java
 Creación: 16/8/2021   Modificación: 22/8/2021
 Lenguaje: Java
    
*/
public class Perrera {
    Perro perro;
    Familia[] familias;
    int nfam;
    String[] razasPeligrosas={"Pit bull terrier","American Staffordshire terrier","Tosa Inu","Dogo argentino","Dogo Guatemalteco","Fila brasileño","Presa canario","Dóberman","Gran perro japonés","Mastín napolitano","Presa Mallorqui","Dogo de burdeos","Bullmastiff","Bull terrier inglés","Bulldog americano","Rhodesiano","Rottweiler"};

    public Perrera(){//inicializar perrera
        nfam=0;
        familias=new Familia[15];
    } 
    
    /** 
     * @param tam
     * @param ra
     * @param ed
     * @param sal
     * @param nom
     * @return Perro
     */
    public Perro nuevoPerro(String tam, String ra, int ed, int sal, String nom){//crear nuevo perro
        perro=new Perro(tam, ra, ed, sal, nom);
        return perro;
    }
    
    /** 
     * @param i
     */
    public void nuevaFamilia(int i){
        familias[nfam++]=new Familia(i);//crea una nueva familia por defecto y aumenta la posicion del arreglo
    }
    
    /** 
     * @param np
     * @param ng
     * @param ad
     * @param ap
     */
    public void nuevaFamilia(int np, int ng, int ad, String ap){
        familias[nfam++]=new Familia(np, ng, ad, ap);//crea una nueva familia ingresada por el usuario y aumenta la posicion del arreglo
    }
    
    /** 
     * @return Familia
     */
    public Familia buscarFamilia(){
        int numfam=-1;
        //inicio de la verificacion de raza peligrosa
        boolean razaPeligrosa=false;
        for(int j=0;j<razasPeligrosas.length;j++){//busqueda entre las razas
            if(perro.getRaza().toLowerCase().equals(razasPeligrosas[j].toLowerCase())){
                razaPeligrosa=true;
            }
        }
        //fin de la verificación
        boolean bandera=false;
        for(int i=0;i<15 && bandera==false;i++){//busqueda de las familias
            if(familias[i]!=null){
                if(familias[i].getPerros()<4){
                    if(razaPeligrosa==false && perro.getTamaño().toLowerCase().equals("pequeno")){// condicion en la cual cualquier familia puede adoptar
                        numfam=i;
                        bandera=true;
                    }
                    if(razaPeligrosa==true && familias[i].getNiños_grandes()==0 && familias[i].getNiños_pequeños()==0){//condicion en la cual solo familias con adultos pueden adoptar por raza peligrosa
                        numfam=i;
                        bandera=true;
                    }
                    if(razaPeligrosa==false && familias[i].getNiños_grandes()==0 && familias[i].getNiños_pequeños()==0 && perro.getTamaño().toLowerCase().equals("grande")){//condicion en la cual solo familias con adultos pueden adoptar por tamaño grande
                        numfam=i;
                        bandera=true;
                    }
                    if(razaPeligrosa==false && familias[i].getNiños_pequeños()==0){//condicion en la que solo familias sin niños pequeños pueden adoptar por raza mediana y no peligrosa
                        numfam=i;
                        bandera=true;
                    }
                }
            }
        }
        if(numfam==-1){//devuelve null si no encuentra una familia adecuada
            return null;
        }else{//devuelve la familia elegida
            familias[numfam].setPerros();
            return familias[numfam];
        }
        
    }
    
    /** 
     * @param a
     * @return boolean
     */
    public boolean comprobarApellido(String a){//comprobación de que el apellido ingresado no exista
        boolean r=true;
        for(int i=0;i<15 && r==true;i++){// busqueda por familia
            if(familias[i]!=null){
                if(familias[i].getApellido().equals(a)){// compracion de apellidos
                    r=false;
                }
            }
        }
        return r;
    }
    
    /** 
     * @return Familia[]
     */
    public Familia[] getFamilias(){//devolver arreglo de familias
        return familias;
    }
    
    /** 
     * @return int
     */
    public int getNumeroDeFamilias(){// devolver la posicion en la que está la siguiente familia a ingresar
        return nfam;
    }
}
