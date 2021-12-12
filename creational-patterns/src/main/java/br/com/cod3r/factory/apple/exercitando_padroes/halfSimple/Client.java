package br.com.cod3r.factory.apple.exercitando_padroes.halfSimple;

import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.concretes.Iphone11Factory;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.concretes.IphoneXFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.interfaces.HalfSimpleIphoneFactory;

public class Client {
    public static void main(String[] args) {
        
        HalfSimpleIphoneFactory iphone11 = new Iphone11Factory();
        iphone11.orderIphone("standard");
        System.out.println("\n");
        iphone11.orderIphone("highend");
        System.out.println("\n");

        HalfSimpleIphoneFactory iphoneX = new IphoneXFactory();
        iphoneX.orderIphone("standard");
        System.out.println("\n");
        iphoneX.orderIphone("highend");
        System.out.println("\n");
    }
}
