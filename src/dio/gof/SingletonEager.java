package dio.gof;
//singleton apressadinho
public class SingletonEager {
	//instancia antes
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
    public static SingletonEager getInstancia() {
    	
    	return instancia;
    }
}
