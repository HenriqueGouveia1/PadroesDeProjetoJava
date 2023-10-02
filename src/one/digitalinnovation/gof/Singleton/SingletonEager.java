package one.digitalinnovation.gof.Singleton;

public class SingletonEager {
    /*
     * Singleton "apressado"
     */

    private static SingletonEager instancia = new SingletonEager();

    //Pulo do gato do singleton, construtor privado
    private SingletonEager() {
        super();
    }

    //Já vai garantir com a instancia já criada
    public static SingletonEager getInstancia() {
        return instancia;
}
}