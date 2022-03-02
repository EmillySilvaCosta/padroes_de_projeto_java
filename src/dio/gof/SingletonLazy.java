package dio.gof;
//sigleton preguiçoso
public class SingletonLazy {
	private static SingletonLazy instancia;
	//construtor privado
	private SingletonLazy() {
		super();
	}
    public static SingletonLazy getInstancia() {
    	//preciso instanciar primeiro antes de retorna-la
    	if(instancia == null) {
    		//instanciando
    		instancia = new SingletonLazy();
    	}
    	return instancia;
    }
}
