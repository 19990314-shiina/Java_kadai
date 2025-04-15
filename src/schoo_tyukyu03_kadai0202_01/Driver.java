package schoo_tyukyu03_kadai0202_01;

public class Driver {
	
	//Car c
	//Car interface を引数に取る
	//Car interface を実装しているクラスは何でも受けられる
	
	//Refuel r
	//Refuel interfaceもCar interface同様引数にとる
	//Refuel interfaceを実装しているクラスは何でも受けられる
	//Car interface用の説明書として一つ目のt1
	//1つめのt1にaccele()とbreak()
	//Refuel interface用の説明所として２つ目のt1
	
//	//トラックとスポーツカーのメソッド
//		public void drive(Car c ,Refuel r){
//			 c.accele();
//			 c.brake();
//			 r.refuel();
//
//		}
//		
//		//電気自動車限定のメソッド
//		public void drive_e(ElectricCar ec) {
//			ec.accele();
//			ec.brake();
//			ec.charge();
//		}
	
	//↓より簡潔にした各自動車のメソッド
	
	//スポーツカーのメソッド
					//sはSportCarというクラスの「インスタンス」（＝オブジェクト）
	public void drive_s(SportCar s){
		 s.refuel();
		 s.accele();
		 s.brake();
		 

	}
	
	//電気自動車限定のメソッド
	public void drive_e(ElectricCar ec) {
		ec.charge();
		ec.accele();
		ec.brake();
		
	}
	
	//Truck限定のメソッド
	public void drive_t(Truck t) {
		t.refuel();
		t.accele();
		t.brake();
		
	}
	

}
