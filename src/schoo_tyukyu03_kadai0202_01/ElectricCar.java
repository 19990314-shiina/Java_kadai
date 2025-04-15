package schoo_tyukyu03_kadai0202_01;

public class ElectricCar implements Car{
	
	public void charge() {
		System.out.println("運転手が電気自動車を運転します");
		System.out.println("電気自動車を充電します：80％");
	}
	
	public void accele() {
		charge();
		System.out.println("電気自動車が90kmで走行する");
	}
	public void brake() {
		System.out.println("電気自動車が止まる");
	}

}
