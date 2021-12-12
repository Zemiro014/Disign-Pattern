package br.com.cod3r.factory.apple.exercitando_padroes.after.factory;

import br.com.cod3r.factory.apple.exercitando_padroes.after.model.interfaces.Iphone;

public abstract class Iphone11Factory {

    public Iphone orderIphone11(){
        Iphone device = null;

        device = createIPhone11();

        device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
    }

    protected abstract Iphone createIPhone11();
}
