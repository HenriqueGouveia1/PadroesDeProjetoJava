import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Testando e Checando os endereços de memória relacionado ao Design Patter do Singleton: ");

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

        System.out.println();
        System.out.println("Testando o Strategy:");
        Comportamento d = new ComportamentoDefensivo();
        Comportamento n = new ComportamentoNormal();
        Comportamento a = new ComportamentoAgressivo();

        Robo r = new Robo();
        r.setStrategy(n);
        r.mover();

        r.setStrategy(d);
        r.mover();

        r.setStrategy(a);
        r.mover();

        System.out.println("Testando o Facade:");
        Facade f = new Facade();
        f.migrarCliente("nome","123123");


    }
}