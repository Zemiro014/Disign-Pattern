package br.com.cod3r.factory.apple.exercitando_padroes.before;

import br.com.cod3r.factory.apple.exercitando_padroes.before.model.concrets.Iphone11Pro;
import br.com.cod3r.factory.apple.exercitando_padroes.before.model.concrets.IphoneX;
import br.com.cod3r.factory.apple.exercitando_padroes.before.model.interfaces.Iphone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		Iphone iphoneX = new IphoneX();
		iphoneX.assemble();
		iphoneX.certificates();
		iphoneX.getHardware();
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		Iphone iphone11HighEnd = new Iphone11Pro();
		iphone11HighEnd.assemble();
		iphone11HighEnd.certificates();
		iphone11HighEnd.assemble();
	}
}