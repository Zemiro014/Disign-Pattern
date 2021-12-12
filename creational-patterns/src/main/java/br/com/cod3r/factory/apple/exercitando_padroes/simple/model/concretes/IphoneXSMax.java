package br.com.cod3r.factory.apple.exercitando_padroes.simple.model.concretes;

import br.com.cod3r.factory.apple.exercitando_padroes.simple.model.interfaces.Iphone;

public class IphoneXSMax extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Iphone X S Max Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
    }
}