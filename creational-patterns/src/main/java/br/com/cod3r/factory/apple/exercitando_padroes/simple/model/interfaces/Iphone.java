package br.com.cod3r.factory.apple.exercitando_padroes.simple.model.interfaces;

public abstract class Iphone {
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}
    public abstract void getHardware();
}
