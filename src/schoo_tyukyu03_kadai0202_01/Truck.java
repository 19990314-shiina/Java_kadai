package schoo_tyukyu03_kadai0202_01;
							//t1,t1
public class Truck implements Car,Refuel{
	
	public void refuel() {
		System.out.println("運転手がトラックを運転します");
		System.out.println("トラックに燃料を補充します：50L");
	}
	
	public void accele() {
	
		System.out.println("トラックが50kmで走行する");
	}
	public void brake() {
		System.out.println("トラックが止まる");
		System.out.println("運転終了");
	}

	
	
}
