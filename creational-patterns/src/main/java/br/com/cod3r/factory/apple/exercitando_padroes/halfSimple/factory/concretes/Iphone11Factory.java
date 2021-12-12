package br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.concretes;

import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.interfaces.HalfSimpleIphoneFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.concretes.Iphone11;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.concretes.Iphone11Pro;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.interfces.Iphone;

public class Iphone11Factory extends HalfSimpleIphoneFactory{

    @Override
    public Iphone createIhone(String level) {
        switch(level.toLowerCase()){
            case "standard" : return new Iphone11();
            case "highend" : return new Iphone11Pro();
            default : return null;
        }
    }
}
