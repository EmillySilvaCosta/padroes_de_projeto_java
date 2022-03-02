package strategy.gof;

import Facade.Facade;
import dio.gof.SingletonEager;
import dio.gof.SingletonLazy;
import dio.gof.SingletonLazyHolder;

public class Main {

	public static void main(String[] args) {
		//testes relacionados ao Design Pattern Singleton
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		//estou reatribuindo
		lazy = SingletonLazy.getInstancia();
		//o endereço de memoria é o mesmo
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		//o comportamento dele vai variar de acordo com o número de implementações que eu realizar
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Emilly", "81720-000");
	
	}

}
