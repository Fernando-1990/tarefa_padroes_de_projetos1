// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("B", true);
        Factory factory = getCarFactory(customer1);
        Car car1 = factory.create(customer1.getTipoDoCarro());
        car1.ligaMotor();
    }

    private static Factory getCarFactory(Customer customer1) {
        if(customer1.isAuto()) {
            return new CarFactoryAuto();
        } else {
            return new CarFactoryManual();
        }
    }
}