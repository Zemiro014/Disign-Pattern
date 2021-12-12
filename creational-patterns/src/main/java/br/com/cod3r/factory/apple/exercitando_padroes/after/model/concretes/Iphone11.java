package br.com.cod3r.factory.apple.exercitando_padroes.after.model.concretes;

import br.com.cod3r.factory.apple.exercitando_padroes.after.model.interfaces.Iphone;

public class Iphone11 extends Iphone {

    @Override
    public void getHardware() {
        System.out.println("All resources of Iphone11's hardware was created");
    }
}