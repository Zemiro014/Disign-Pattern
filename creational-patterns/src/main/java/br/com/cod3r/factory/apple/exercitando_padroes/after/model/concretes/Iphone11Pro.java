package br.com.cod3r.factory.apple.exercitando_padroes.after.model.concretes;

import br.com.cod3r.factory.apple.exercitando_padroes.after.model.interfaces.Iphone;

public class Iphone11Pro extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("All resources of Iphone11Pro's hardware was created");      
    }
}
