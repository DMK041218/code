
package Viva3;

public class Eunwol {
    private String weapon;
    private String location;
    private static String lastLocation;
    public Eunwol(){
        this.weapon = "Basic Knuckles";
        this.location = "Grandis";
        Eunwol.lastLocation = "Grandis";
    }
    public Eunwol(String location){
        this();
    }
    public void setLocation(String location){
        if(!location.equals(Eunwol.lastLocation)){
            this.location = location;
            Eunwol.lastLocation = location;
        }
    }
    public String getLocation(){
        return this.location;
    }
    public void setWeapon(String weapon){
        if(weapon.toLowerCase().contains("knuckles")){
            this.weapon = weapon;
        }
    }
    public String getWeapon(){
        return this.weapon;
    }
    public String toString(){
        return "\nEunwol Info\nWeapon:   "+getWeapon()+"\nLocation:     "+getLocation()+"\n";
    }
    public interface DimensionalPortal {
        void travel();
        
    }
}



