package T9.T9Q1;



public class T9Q1 {
    public static boolean compare(Object ob1,Object ob2){
        if(ob1.getClass()==ob2.getClass()){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isClass(Object obj){
        if(obj instanceof Person){
            return true;
        }
        else{
            return false;
        }
    }
}
