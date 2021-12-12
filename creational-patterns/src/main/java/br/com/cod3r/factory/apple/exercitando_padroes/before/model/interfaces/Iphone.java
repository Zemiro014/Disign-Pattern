package br.com.cod3r.factory.apple.exercitando_padroes.before.model.interfaces;

public abstract class Iphone {
   public void assemble(){
    System.out.println("Iphone assembled");
    }
    public void certificates(){
        System.out.println("Iphone certificate emmited");
    }

    public void pack(){
        System.out.println("Iphone was packed");
    }

    public abstract void getHardware();
}