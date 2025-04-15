package schoo_tyukyu03_kadai0202_01;
								//c1,c1
public class SportCar implements Car,Refuel  {
//interface Carを使うということは必ずaccele() 、brake()を使う
	
	
	public void refuel() {
		System.out.println("運転手が車を運転します");
		System.out.println("スポーツカーに燃料を補充します：50L");
		
	}
	public void accele() {
		
		System.out.println("スポーツカーが100㎞で走行する");
	}
	
	public void brake() {
		System.out.println("スポーツカーが止まる");
		System.out.println("運転終了");
	}
	
	
	
	
}
