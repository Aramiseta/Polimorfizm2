package pl.accenture;

public class Car extends Vehicle{
    public Car() {
    }

    @Override
    void go() {
        //super.go();
        System.out.println("Jedzie auto");
    }
    void horn(){
        System.out.println("tu tu tu turutu");
    }
}
