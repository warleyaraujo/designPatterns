package padroes.factory;

import padroes.factory.pack.PizzaFactory;

public class Factory {

    public static void main(String [] args){

        var pizza = PizzaFactory.getInstance(true);
        var pizza2 = PizzaFactory.getInstance(false);

        System.out.println(pizza);
        System.out.println(pizza2);

    }
}
