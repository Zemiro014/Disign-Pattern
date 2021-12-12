package br.com.cod3r.factory.apple.exercitando_padroes.simple;

import br.com.cod3r.factory.apple.exercitando_padroes.simple.factory.SimpleIphoneFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.interfaces.Iphone;

public class Client {
    public static void main(String[] args) {
        System.out.println("\n");
        Iphone iphone11 = SimpleIphoneFactory.orderIPhone("11", "standard");
        System.out.println("\n");
        iphone11 = SimpleIphoneFactory.orderIPhone("11", "highend");
        System.out.println("\n");

        Iphone iphoneX = SimpleIphoneFactory.orderIPhone("X", "standard");
        System.out.println("\n");
        iphoneX = SimpleIphoneFactory.orderIPhone("X", "highend");
    }
}