package padroes.factory.veiculo;

public class VeiculoFactoryTest {
    public static void main(String[] args) {
        VeiculoFactory veiculoFactory = new VeiculoFactory();

        Veiculo veiculo1 = veiculoFactory.createVeiculo("Carro");
        veiculo1.drive();

        Veiculo veiculo2 = veiculoFactory.createVeiculo("Bike");
        veiculo2.drive();
    }
}
