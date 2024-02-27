public abstract class Car {

    private String nome;
    private String cor;


    public Car(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void ligaMotor(){
        System.out.println("O " + nome + " da cor " + cor + " já está ligado e proto para utilização!!!");
    }
}
