public class CarFactoryManual extends Factory{
    @Override
    Car modelo(String tipoDoCarro) {
        switch (tipoDoCarro) {
            case "A":
                return new Chevrolet("Celta", "preto");
            case "B":
                return new Fiat("Palio", "amarelo");
            default:
                System.out.println("Infelismente o carro não está disponível.");
                return null;
        }
    }
}
