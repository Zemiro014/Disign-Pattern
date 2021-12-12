package br.com.cod3r.factory.apple.exercitando_padroes.after.factory;

import br.com.cod3r.factory.apple.exercitando_padroes.after.model.interfaces.Iphone;

public abstract class IphoneXSMaxFactory {
    
    public Iphone orderIphoneXSMax(){
        Iphone device = null;

        device = createIPhoneXSMax();

        device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
    }

    protected abstract Iphone createIPhoneXSMax();
}
