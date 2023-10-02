package one.digitalinnovation.gof.Singleton;

public class SingletonLazy {
    /*
     * Singleton "preguiçoso"
     */

    private static SingletonLazy instancia;

    //Pulo do gato do singleton, construtor privado
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;    }
}
