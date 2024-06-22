package padroes.factory.veiculo;

public class Carro implements Veiculo {

    @Override
    public void drive() {
        System.out.println("Dirigindo um carro");
    }
}
