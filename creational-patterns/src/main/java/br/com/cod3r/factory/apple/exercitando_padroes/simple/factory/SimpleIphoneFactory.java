package br.com.cod3r.factory.apple.exercitando_padroes.simple.factory;

import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.concretes.Iphone11;
import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.concretes.Iphone11Pro;
import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.concretes.IphoneX;
import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.concretes.IphoneXSMax;
import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.interfaces.Iphone;

public class SimpleIphoneFactory {

    public static Iphone orderIPhone(String generation, String level){
        Iphone device = null;
        switch(generation.toLowerCase()){
            case "11":{
                if("standard".equalsIgnoreCase(level))
                    device = new Iphone11();
                else if ("highend".equalsIgnoreCase(level))
                    device = new Iphone11Pro();
                else 
                    device = null;
            }
            break;
            case "x":{
                if("standard".equalsIgnoreCase(level))
                    device = new IphoneX();
                else if ("highend".equalsIgnoreCase(level))
                    device = new IphoneXSMax();
                else 
                    device = null;
            }
            break;
            default : device = null;
        }
        if(device != null){
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }
        return device;
    }
}
