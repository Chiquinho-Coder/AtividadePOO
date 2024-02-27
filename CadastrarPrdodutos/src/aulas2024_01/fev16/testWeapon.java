package aulas2024_01.fev16;


import java.util.Scanner;
public class testWeapon {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int operation = 0;
        /* ------------------------------------------ EL ARSENAL ------------------------------------------*/
        
        
        /*System.out.println("--------------------------- Arsenal ---------------------------");*/
        
        String type1 = "AK-47";
        String caliber1 = "7.62x39mm"; 
        int magazine1 = 30;
        
        weapon w1 = new weapon(type1, caliber1, magazine1);
        
        /*System.out.println("Weapon 1\n---------");
        System.out.println("Type: "+w1.type);
        System.out.println("Caliber : "+w1.caliber);
        System.out.println("Magazine size: "+w1.magazine+" rounds");*/
        
        
        String type2 = "M4A4";
        String caliber2 = "5,56x45mm NATO"; 
        int magazine2 = 30;
        
        weapon w2 = new weapon(type2, caliber2, magazine2);
        
        /*System.out.println("\nWeapon 2\n---------");
        System.out.println("Type: "+w2.type);
        System.out.println("Caliber : "+w2.caliber);
        System.out.println("Magazine size: "+w2.magazine+" rounds");*/
        
        
        String type3 = "Glock 18";
        String caliber3 = "9x19mm"; 
        int magazine3 = 19;
        
        weapon w3 = new weapon(type3, caliber3, magazine3);
        
        /*System.out.println("\nWeapon3 \n---------");
        System.out.println("Type: "+w3.type);
        System.out.println("Caliber : "+w3.caliber);
        System.out.println("Magazine size: "+w3.magazine+" rounds");*/
        
        
        String type4 = "";
        String caliber4 = "";
        int magazine4 = 0;
        while (!(operation == 3)){
         
            System.out.println("\n--------------------------- Armory ---------------------------");
            System.out.println("\n Choose a option:\n1: Register a new weapon\n2: Show weaponary\n3: Exit\n");
            System.out.println("Insert: ");
            operation = ler.nextInt();
            
            switch (operation) {
            
                case 1:
        System.out.println("\nWeapon type: ");
        ler.nextLine();
        type4 = ler.nextLine();
           
        System.out.println("\nWeapon caliber: ");
        caliber4 = ler.nextLine();

        System.out.println("\nMagazine size: ");
        magazine4 = ler.nextInt();
        break;

    // Outros casos (se houver)...

    default:
        System.out.println("Operação inválida.");
        break;
                
                    
                case 2:
                    System.out.println("\n--------------------------- Armory ---------------------------");
                    
                    weapon w4 = new weapon(type4, caliber4, magazine4);
                    
                    System.out.println("\nWeapon 1\n---------");
                    System.out.println("Type: "+w1.type);
                    System.out.println("Caliber : "+w1.caliber);
                    System.out.println("Magazine size: "+w1.magazine+" rounds");
                    
                    System.out.println("\nWeapon 2\n---------");
                    System.out.println("Type: "+w2.type);
                    System.out.println("Caliber : "+w2.caliber);
                    System.out.println("Magazine size: "+w2.magazine+" rounds");
                    
                    System.out.println("\nWeapon 3\n---------");
                    System.out.println("Type: "+w3.type);
                    System.out.println("Caliber : "+w3.caliber);
                    System.out.println("Magazine size: "+w3.magazine+" rounds");
                    
                    System.out.println("\nWeapon 4\n---------");
                    System.out.println("Type: "+w4.type);
                    System.out.println("Caliber : "+w4.caliber);
                    System.out.println("Magazine size: "+w4.magazine+" rounds");
                
                    
                case 3: System.out.println("\nBye bye Big Boss");
            
            
            }
            
        }
        
    }
}