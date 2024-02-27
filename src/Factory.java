public abstract class Factory {

    public Car create(String tipoDoCarro) {
        Car car = modelo(tipoDoCarro);
        return car;
    }
    abstract Car modelo(String tipoDoCarro);
}
