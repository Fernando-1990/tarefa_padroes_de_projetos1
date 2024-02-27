public class CarFactoryAuto extends Factory{
    @Override
    Car modelo(String tipoDoCarro) {
        switch (tipoDoCarro) {
            case "A":
                return new BMW("320i", "branca");
            case "B":
                return new Audi("A4", "vermelha");
            default:
                System.out.println("Infelismente o carro não está disponível.");
                return null;
        }
    }
}
