package strategy.gof;

public class Robo {
//strategy é o comportamento dele
	private Comportamento strategy;

	public void setStrategy(Comportamento strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
	}
}
