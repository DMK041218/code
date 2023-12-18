public class T8Q3 {
    private int x;
    private int y;
    public T8Q3(int x,int y){
        this.x = x;
        this.y = y;     
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void showCoordinate(){
        System.out.printf("The coordinate is (%d , %d)\n",x,y);
    }
    public static void main(String[] args) {
        T8Q3 t = new T8Q3(32, 21);
        t.setX(3);
        t.setY(5);
        t.showCoordinate();
    }
}
