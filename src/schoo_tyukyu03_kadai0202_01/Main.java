package schoo_tyukyu03_kadai0202_01;

public class Main {

	public static void main(String[] args) {

		Truck t1 = new Truck();

		//Truckクラスのt1はより大きなCarクラスに入れることができる
		//Car c1 = t1;

		SportCar s1 = new SportCar();

		//TruckからSportCarには変換できない
		//SportCar s2 = t1;

		//Driverクラスのインスタンスを生成してコンストラクタを呼び出す
				
		Driver d1 = new Driver();
		
		ElectricCar e1 = new ElectricCar();
		
		//各車のドライバ経由のメソッド
		d1.drive_t(t1);
		d1.drive_s(s1);
		d1.drive_e(e1);

		

//		t1.accele();
//		t1.brake();
//		s1.accele();
//		s1.brake();
//		e1.accele();
//		e1.brake();

	}

}
