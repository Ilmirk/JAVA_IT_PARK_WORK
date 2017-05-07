public abstract class Transport implements ParkingObject {

    private String number;

    @Override
    public String getNumber() {
        return this.number;
    }

    public Transport () {
        this.number = null;
    }

    public Transport(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        return number.equals(transport.number);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public void toDraveParking() {
        System.out.println("Ok");
    }

    @Override
    public void toGoParking() {
        System.out.println("Выезжаю");
    }


    @Override
    public String toString() {
        return "На парковке:  " + number;
    }
}