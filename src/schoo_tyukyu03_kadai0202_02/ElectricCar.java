package schoo_tyukyu03_kadai0202_02;

import java.util.Scanner;

public class ElectricCar implements Car{
	
	private String ELCarName;

	//引数に名前を持った状態のMainクラスからSelectCarNameを受け取るコンストラクタメソッド
	public ElectricCar(String ELCarName) {
		//setNameにMainクラスからString CarNameで受け取った車の名前をセットする
		setName(ELCarName);
	}

	public String getName() {
		return ELCarName;
	}

	public void setName(String name) {
		//同じクラスのローカル変数のCarNameを優先させる
		this.ELCarName = name;
	}
	
	public void charge() {
		System.out.println("運転手が"+ELCarName+"を運転します");
		System.out.println("充電を何%行いますか：");
		
		Scanner scanner = new Scanner(System.in);
		int fuel_quantity = scanner.nextInt();
		
		System.out.println("電気自動車を"+fuel_quantity+"%充電します");
	}
	
	public void accele() {
		//charge();
		System.out.println("電気自動車が90kmで走行する");
	}
	public void brake() {
		System.out.println("電気自動車が止まる");
	}

}
