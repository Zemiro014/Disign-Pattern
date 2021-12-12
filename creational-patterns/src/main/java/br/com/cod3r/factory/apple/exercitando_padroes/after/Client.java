package br.com.cod3r.factory.apple.exercitando_padroes.after;

import br.com.cod3r.factory.apple.exercitando_padroes.after.factory.Iphone11Factory;
import br.com.cod3r.factory.apple.exercitando_padroes.after.factory.Iphone11ProFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.after.factory.IphoneXFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.after.factory.IphoneXSMaxFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.after.model.concretes.Iphone11;
import br.com.cod3r.factory.apple.exercitando_padroes.after.model.concretes.Iphone11Pro;
import br.com.cod3r.factory.apple.exercitando_padroes.after.model.concretes.IphoneX;
import br.com.cod3r.factory.apple.exercitando_padroes.after.model.concretes.IphoneXSMax;
import br.com.cod3r.factory.apple.exercitando_padroes.after.model.interfaces.Iphone;

public class Client {
    public static void main(String[] args) {
        CreateIPhone11 iphone11 = new CreateIPhone11();
        iphone11.createIPhone11();
        iphone11.orderIphone11();

        System.out.println("\n");
        CreateIPhone11Pro iphone11Pro = new CreateIPhone11Pro();
        iphone11Pro.createIPhone11Pro();
        iphone11Pro.orderIphone11Pro();

        System.out.println("\n");
        CreateIPhoneX iphoneX = new CreateIPhoneX();
        iphoneX.createIPhoneX();
        iphoneX.orderIphoneX();

        System.out.println("\n");
        CreateIPhoneXSMax IphoneXSMax = new CreateIPhoneXSMax();
        IphoneXSMax.createIPhoneXSMax();
        IphoneXSMax.orderIphoneXSMax();
    }
}

class CreateIPhone11 extends Iphone11Factory{

    @Override
    protected Iphone createIPhone11() {
        return new Iphone11();
    }
}

class CreateIPhone11Pro extends Iphone11ProFactory{

    @Override
    protected Iphone createIPhone11Pro() {
        return new Iphone11Pro();
    }
}

class CreateIPhoneX extends IphoneXFactory{

    @Override
    protected Iphone createIPhoneX() {
        return new IphoneX();
    }
}

class CreateIPhoneXSMax extends IphoneXSMaxFactory{

    @Override
    protected Iphone createIPhoneXSMax() {
        return new IphoneXSMax();
    }
}
