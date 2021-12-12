package br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.concretes;

import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.factory.interfaces.HalfSimpleIphoneFactory;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.concretes.IphoneX;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.concretes.IphoneXSMax;
import br.com.cod3r.factory.apple.exercitando_padroes.halfSimple.model.interfces.Iphone;

public class IphoneXFactory extends HalfSimpleIphoneFactory{

    @Override
    public Iphone createIhone(String level) {
        switch(level.toLowerCase()){
            case "standard" : return new IphoneX();
            case "highend" : return new IphoneXSMax();
            default : return null;
        }
    }
}
