package schoo_tyukyu03_kadai0202_02;

import java.util.Scanner;
								//c1,c1
public class SportCar implements Car,Refuel  {
//interface Carを使うということは必ずaccele() 、brake()を使う
	
	private String SportCarName;
	
	//引数に名前を持った状態のMainクラスからSelectCarNameを受け取るコンストラクタメソッド
		public SportCar(String SportCarName) {
			//setNameにMainクラスからString SportCarNameで受け取った車の名前をセットする
			setName(SportCarName);
		}

		public String getName() {
			return SportCarName;
		}

		public void setName(String name) {
			//同じクラスのローカル変数のSportCarNameを優先させる
			this.SportCarName = name;
		}
	
	public void refuel() {
		System.out.println("運転手が"+SportCarName+"を運転します");
		System.out.println("燃料を何リットル補充しますか：");
		
		Scanner scanner = new Scanner(System.in);
		int fuel_quantity = scanner.nextInt();
		
		System.out.println("スポーツカーに燃料を補充します："+fuel_quantity+"L");
	}
	public void accele() {
		
		System.out.println("スポーツカーが100㎞で走行する");
	}
	
	public void brake() {
		System.out.println("スポーツカーが止まる");
		System.out.println("運転終了");
	}
	
	
	
	
}
