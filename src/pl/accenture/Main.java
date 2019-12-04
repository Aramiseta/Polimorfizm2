package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle refVehicleObiektSportCar = new SportCar();
        Vehicle [] vehicles = {vehicle, car, refVehicleObiektSportCar };
                    //1szy sposób
                    //SportCar sc = ((SportCar) refVehicleObiektSportCar);
                    //2gi sposób
                    //((SportCar) refVehicleObiektSportCar).go();

        for(Vehicle a : vehicles) {

                if (a instanceof SportCar ){
                a.go();
                ((SportCar) a).horn();
                ((SportCar) a).turbo();
                }
                if (a instanceof Car ){
                    a.go();
                    ((Car) a).horn();
                }
                if (a instanceof Vehicle){
                       a.go();
                   }



                }
        }
    }

