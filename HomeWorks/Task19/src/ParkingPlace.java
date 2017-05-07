public class ParkingPlace {

    public Transport transports[] = new Transport[100];

    public void toDrave(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                if (transport.getNumber() != null) {
                    System.out.println("Паркуйтесь на " + (i + 1) + " место");
                    transports[i] = transport;
                    transport.toDraveParking();
                    break;
                }
            }
        }
    }

    public void toGo(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i].getNumber() == transport.getNumber()) {
                for (int j = i; j < transports.length - 1; j++) {
                    transports[j] = transports[j++];
                }
                transport.toGoParking();
                break;
            }
        }
    }
}
