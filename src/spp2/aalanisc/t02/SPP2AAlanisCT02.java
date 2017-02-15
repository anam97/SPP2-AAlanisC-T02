/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.t02;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLES
        int opEntrada;
    Scanner teclado = new Scanner(System.in);
    int sue, cate, he, sueldo, se;
    
    System.out.println("Sueldos");
    System.out.println("Inserte su categoria");
    System.out.println("1. categoria 1");
    System.out.println("2. categoria 2");
    System.out.println("3. categoria 3");
    System.out.println("4. categoria 4");
    System.out.println("5. categoria 5");
    System.out.println("6. categoria 6");
    System.out.println("7. categoria 7");
    System.out.println("8. categoria 8");
    opEntrada = teclado.nextInt();
    if(opEntrada>=1 && opEntrada<=8){
    switch (opEntrada){
        case 1:
                System.out.println("Usted es categoria 1");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*30;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
            case 2:
                System.out.println("Usted es categoria 2");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*38;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 3:
                System.out.println("Usted es categoria 3");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*50;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 4:
                System.out.println("Usted es categoria 4");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*70;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 5:
                System.out.println("Usted es categoria 5");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*90;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 6:
                System.out.println("Usted es categoria 6");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*120;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 7:
                System.out.println("Usted es categoria 7");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*150;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
            case 8:
                System.out.println("Usted es categoria 4");
                sueldo = pedirSueldo();
                he = horasExtra();
                se = he*70;
                System.out.println("El total de su sueldo es " +(sueldo+se));
                break;
                
    }
    }
    else{
            System.out.print("El numero no esta en el rango");
            }
    }
    
    static int pedirSueldo(){
        Scanner teclado = new Scanner(System.in);
        int sueldo;
        System.out.println("Inserte su sueldo base");
        sueldo = teclado.nextInt();
        return sueldo;
                }
    static int horasExtra(){
        Scanner teclado = new Scanner(System.in);
        int he;
        System.out.println("Inserte las horas extra que trabajó");
        he = teclado.nextInt();
        return he; 
    }
    }
    
            
            
                    
        
    
    

