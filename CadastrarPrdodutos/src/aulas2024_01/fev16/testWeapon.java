package aulas2024_01.fev16;



public class testWeapon {
    
    public static void main(String[] args) {
        
        /* ------------------------------------------ EL ARSENAL ------------------------------------------*/
        
        
        System.out.println("--------------------------- Arsenal ---------------------------");
        
        String type1 = "AK-47";
        String caliber1 = "7.62x39mm"; 
        int magazine1 = 30;
        
        weapon w1 = new weapon(type1, caliber1, magazine1);
        
        System.out.println("Weapon 1\n---------");
        System.out.println("Type: "+w1.type);
        System.out.println("Caliber : "+w1.caliber);
        System.out.println("Magazine size: "+w1.magazine+" rounds");
        
        
        String type2 = "M4A4";
        String caliber2 = "5,56x45mm NATO"; 
        int magazine2 = 30;
        
        weapon w2 = new weapon(type2, caliber2, magazine2);
        
        System.out.println("\nWeapon 2\n---------");
        System.out.println("Type: "+w2.type);
        System.out.println("Caliber : "+w2.caliber);
        System.out.println("Magazine size: "+w2.magazine+" rounds");
        
        
        String type3 = "Glock 18";
        String caliber3 = "9x19mm"; 
        int magazine3 = 19;
        
        weapon w3 = new weapon(type3, caliber3, magazine3);
        
        System.out.println("\nWeapon3 \n---------");
        System.out.println("Type: "+w3.type);
        System.out.println("Caliber : "+w3.caliber);
        System.out.println("Magazine size: "+w3.magazine+" rounds");
        
    }
}