package padroes.factory.veiculo;

public class VeiculoFactory {
    public Veiculo createVeiculo(String tipo) {
        if (tipo == null || tipo.isEmpty())
            return null;
        if ("Carro".equals(tipo)) {
            return new Carro();
        } else if ("Bike".equals(tipo)) {
            return new Bike();
        }
        return null;
    }
}
