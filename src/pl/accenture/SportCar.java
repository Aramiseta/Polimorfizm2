package pl.accenture;

public class SportCar extends Car {
    public SportCar() {
    }

    @Override
    void go() {
        //super.go();
        System.out.println("Jedzie sportowy samochod");
    }

    void turbo(){
        System.out.println("Bardzo glosny ryk silnika");
    }

    @Override
    void horn() {
      //  super.horn();
        System.out.println("tu tu tu turutu");
    }
}
