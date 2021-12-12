package br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.concretes;

import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.interfces.Iphone;

public class IphoneX extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
    }    
}
