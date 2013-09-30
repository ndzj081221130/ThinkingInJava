package ch9;

public class UniCycleFactory implements CycleFactory{

	@Override
	public Cycle createCycle() {
		// TODO Auto-generated method stub
		return new UniCycle();
	}

}
