package padroes.strategy;

import padroes.strategy.pack.Pessoa;

public class Strategy {
    //delega as responsabilidades adquiridas pelas entidades, atribuindo, portanto, o comportamento

    public static void main(String [] args) {
        var pessoa = new Pessoa("12345678911");
        validadorPessoaFisica(pessoa, new ValidadorPessoaFisica());
//        validadorPessoaFisica(pessoa, new ValidadorPessoaJuridica());

    }

    public static void validadorPessoaFisica(Pessoa pessoa, IValidador validador) {
        validador.validacao(pessoa);
    }

    interface IValidador {
        void validacao(Pessoa pessoa);
    }

    private static class ValidadorPessoaFisica implements IValidador {
        @Override
        public void validacao(Pessoa pessoa) {
            if(pessoa.getRegistro().length() > 11) {
                throw new IllegalArgumentException("Problema com o CPF!");
            }
        }
    }

    private static class ValidadorPessoaJuridica implements IValidador {
        @Override
        public void validacao(Pessoa pessoa) {
            if(pessoa.getRegistro().length() < 14) {
                throw new IllegalArgumentException("Problema com o CNPJ!");
            }
        }
    }
}
