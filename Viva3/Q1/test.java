package Viva3;
public class test {

        public static void main(String[] args) {
            Eunwol.DimensionalPortal portal = () -> {
                Eunwol eunwol = new Eunwol();
                eunwol.setWeapon("Genesis Knuckles");
                eunwol.toString();
                System.out.println(eunwol);
                eunwol.setLocation("Maple World");
                eunwol.toString();
                System.out.println(eunwol);
            };
            portal.travel();
            
        }
    }
    
    

