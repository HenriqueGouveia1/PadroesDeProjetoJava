import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando e Checando os endereços de memória relacionado ao Design Patter do Singleton.");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyH = SingletonLazyHolder.getInstancia();
        System.out.println(lazyH);
        lazyH = SingletonLazyHolder.getInstancia();
        System.out.println(lazyH);
    }
}