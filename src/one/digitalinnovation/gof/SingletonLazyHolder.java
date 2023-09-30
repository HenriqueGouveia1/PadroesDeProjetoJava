package one.digitalinnovation.gof;

public class SingletonLazyHolder {
    /*
     * Singleton "Lazy Holder"
     */

    //Classe servirá para encapsular a instancia
    private   class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    //Pulo do gato do singleton, construtor privado
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return Holder.instancia;
    }
}
