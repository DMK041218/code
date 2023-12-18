public class Connection {
    private int connectionNumber = 0;
    public Connection(int number){
        this.connectionNumber = number;
    }
    public void disConnect(){

    }
    public void setConnectionNumber(int number){
        this.connectionNumber = number;
    }
    public int getConnectionNumber(){
        return this.connectionNumber;
    }
    public void display(){
        System.out.println("The number of connections to the server is: "+getConnectionNumber());
    }
}
