public class Main {

    public static void main(String[] args) {

        Transport car1 = new Car("Р060ХН");
        Transport car2 = new Car("К915РА");
        Transport moto = new Motorcycle("ВА2545Т");
        Transport bike = new Bike();

        ParkingPlace parking = new ParkingPlace();

        parking.toDrave(car1);
        parking.toDrave(car2);
        parking.toDrave(moto);
        parking.toDrave(bike);
        parking.toGo(car2);


        for (int i = 0; i < parking.transports.length; i++) {
            if (parking.transports[i] != null) {
                System.out.println(parking.transports[i].toString());
            }
        }
        for (int i = 0; i < parking.transports.length; i++) {
            if (i == parking.transports.length - 1) {
                System.out.println("Нет места на парковке!");
            }
        }
    }
}
