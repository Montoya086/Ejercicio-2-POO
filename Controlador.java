/*

 Autor: Andrés Estuardo Montoya Wilhelm
 Programa: Controlador.java
 Creación: 16/8/2021   Modificación: 22/8/2021
 Lenguaje: Java
    
*/
public class Controlador {
    
    /** 
     * @param args
     */
    public static void main(String[] args){
        Vista v=new Vista();
        Perro perro=null;
        int op=0;
        Perrera perrera = new Perrera();
        for(int i=0;i<3;i++){// creacion de las familias por defecto
           perrera.nuevaFamilia(i);
        }
        v.msgBienvenida();// mensaje de bienvenida
        while(op!=6){// ciclo de opciones
            op=v.mostrarOpciones();// opciones
            switch (op) {
                case 1:// agregar familias
                    if(perrera.getNumeroDeFamilias()<15){// ver si hay cupo de familias
                        int num = v.numerodeFamiliares();// pedir numero de familiares
                        if(num>=2){//comprobar que sen por lo menos 2
                            int numnp=0;
                            int numng=0;
                            int numad=0;
                            for(int i=0;i<num;i++){// ciclo por familiar
                                v.ingNombre(i+1);
                                int ed=v.ingEdad(i+1);// ingreso de edad
                                //comprobación de su edad
                                if(ed<=10){
                                    numnp++;
                                }else if(ed>10 && ed<18){
                                    numng++;
                                }else if(ed>=18){
                                    numad++;
                                }
                            }
                            boolean noexiste=false;
                            while(!noexiste){// comprobacion de apellido no repetido
                                String apellido = v.pedirApellido();
                                noexiste=perrera.comprobarApellido(apellido);
                                if(noexiste){// si el apellido no esta repetido
                                    perrera.nuevaFamilia(numnp, numng, numad, apellido);
                                    v.familiaCreada(numnp,numng,numad,apellido);
                                }else{// si el apellido esta repetido
                                    v.apellidoExiste();
                                }
                            }
                        }else{
                            v.familiaInvalida();
                        }
                    }else{
                        v.baseLlena();
                    }

                    break;
                case 2:// agregar nuevo perro
                    // pedir datos
                    String tam = v.ingTamaño();
                    String ra = v.ingRaza();
                    int ed= v.ingEdad();
                    int sal= v.ingSalud();
                    String nom=v.ingNombre();
                    perro=perrera.nuevoPerro(tam, ra, ed, sal, nom);//crear perro
                    v.nuevoPerro();
                    break;
                case 3:// buscar familia para perro
                    if(perro!=null){//ver si hay un perro cread
                        if(!perro.getAdoptado()){// ver si el perro no ha sido adoptado
                            Familia adoptiva= perrera.buscarFamilia();
                            if (adoptiva != null){//comprobar si hubo una familia candidata
                                perro.setAdoptado();
                                v.mostrarDatosFamilia(adoptiva.getApellido(), adoptiva.getAdultos(), adoptiva.getNiños_grandes(), adoptiva.getNiños_pequeños());
                            }else{//la perrera lo acoge 
                                v.mensajePerrera();
                                perro.setAdoptado();
                            }
                        }
                        else{// el perro ya ha sido adoptado
                            v.msgPerroYaAdoptado();
                        }   
                    }else{// no ha sido ingresado ningun perro
                        v.msgNoperro();
                    }
                    break;
                case 4:// mostrar el perro
                    if(perro!=null){// si el perro fue creado
                        String estado_de_adopcion="No adoptado";
                        if(perro.getAdoptado()){// verificar estado de adopción
                            estado_de_adopcion="Adoptado";
                        }
                        v.datosPerro(perro.getEdad(), perro.getNombre(), perro.getRaza(), perro.getTamaño(), perro.getSalud(), estado_de_adopcion);// mostrar datos
                    }else{
                        v.msgNoperro();// el perro no fue creado
                    }
                    break;
                case 5:// mostrar las familias
                    v.msgDatosFamilias();
                    boolean bandera=true;
                    for(int i=0;i<15;i++){
                        if(perrera.getFamilias()[i]!=null){// mostrar las familias existentes
                            v.DatosFamilias(perrera.getFamilias()[i].getNiños_pequeños(), perrera.getFamilias()[i].getNiños_grandes(), perrera.getFamilias()[i].getAdultos(), perrera.getFamilias()[i].getPerros(), perrera.getFamilias()[i].getApellido());
                            bandera=false;// cambiar estado a que si hay por lo menos una familia
                        }
                    }
                    if(bandera){// no hay familias disponibles
                        v.msgNoFamilias();
                    }
            
                default:
                    break;
            }
        }

    }
}
