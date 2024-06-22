package padroes.singleton.pack;

import java.util.Objects;

//garante a existencia de apenas uma instancia de uma classe, mantendo um ponto global de acesso ao objeto
public class ConfigurationApi {

    private static ConfigurationApi instance;

    private ConfigurationApi() {

    }

    public static ConfigurationApi getInstance() {
        synchronized (ConfigurationApi.class) {
            if (Objects.isNull(instance)) {
                instance = new ConfigurationApi();
            }
        }

        return instance;
    }
}

