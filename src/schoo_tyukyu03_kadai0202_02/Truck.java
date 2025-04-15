package schoo_tyukyu03_kadai0202_02;

import java.util.Scanner;

							//t1,t1
public class Truck implements Car, Refuel {
	private String CarName;

	//引数に名前を持った状態のMainクラスからSelectCarNameを受け取るコンストラクタメソッド
	public Truck(String CarName) {
		//setNameにMainクラスからString CarNameで受け取った車の名前をセットする
		setName(CarName);
	}

	public String getName() {
		return CarName;
	}

	public void setName(String name) {
		//同じクラスのローカル変数のCarNameを優先させる
		this.CarName = name;
	}

	public void refuel() {
		System.out.println("運転手が" + CarName + "を運転します");
		System.out.println("燃料を何リットル補充しますか：");
		
		Scanner scanner = new Scanner(System.in);
		int fuel_quantity = scanner.nextInt();
		
		System.out.println("トラックに燃料を補充します："+fuel_quantity+"L");
	}

	public void accele() {

		System.out.println("トラックが50kmで走行する");
	}

	public void brake() {
		System.out.println("トラックが止まる");
		System.out.println("運転終了");
	}

}
