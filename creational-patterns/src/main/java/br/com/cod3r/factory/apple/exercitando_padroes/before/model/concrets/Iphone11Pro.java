package br.com.cod3r.factory.apple.exercitando_padroes.before.model.concrets;

import br.com.cod3r.factory.apple.exercitando_padroes.before.model.interfaces.Iphone;

public class Iphone11Pro extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Hardware configuration of Iphone 11 pro");       
    }
    
}
