package padroes.strategy.pack;

public class Pessoa {

    private String registro; //CPF ou CNPJ

    public Pessoa(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }
}
