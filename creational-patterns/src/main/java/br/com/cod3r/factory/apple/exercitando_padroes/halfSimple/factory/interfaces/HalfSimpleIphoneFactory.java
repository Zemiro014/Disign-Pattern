package br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.interfaces;

import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.interfces.Iphone;

public abstract class HalfSimpleIphoneFactory {

    public Iphone orderIphone(String level){
        Iphone device = null;

        device = createIhone(level);
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
    public abstract Iphone createIhone(String level);
}
