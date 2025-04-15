package schoo_tyukyu03_kadai0202_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num = 0;

		while (num != 1) {
			System.out.println("1.トラックを作成");
			System.out.println("2.スポーツカーを作成");
			System.out.println("3.電気自動車を作成");
			System.out.println("4.システム終了");

			// 入力を促すメッセージ
			System.out.print("番号を選択してください:");

			// Scannerクラスのインスタンスを作成
			// 引数で標準入力System.inを指定する
			
			Scanner scanner1 = new Scanner(System.in);

			//入力された内容をインスタンスから取得
			int Select_CarNum = scanner1.nextInt();

			if (Select_CarNum == 1) {
				System.out.print("車の名前を入力してください:");
				// Scannerクラスのインスタンスを作成
				// 引数で標準入力System.inを指定する
				Scanner scanner2 = new Scanner(System.in);

				//入力された内容をインスタンスから取得
				String Select_CarName = scanner2.nextLine();

				//Driverクラスのインスタンスを生成してコンストラクタを呼び出す				
				Driver d1 = new Driver();
				//Truckクラスのインスタンスを生成
				Truck t1 = new Truck(Select_CarName);
				d1.drive_t(t1);
//
//				scanner1.close();
//				scanner2.close();

			} else if (Select_CarNum == 2) {

				System.out.print("車の名前を入力してください:");

				Scanner scanner2 = new Scanner(System.in);
				String Select_CarName = scanner2.nextLine();

				Driver d1 = new Driver();
				SportCar s1 = new SportCar(Select_CarName);
				d1.drive_s(s1);

//				scanner1.close();
//				scanner2.close();

			} else if (Select_CarNum == 3) {
				System.out.print("車の名前を入力してください:");

				Scanner scanner2 = new Scanner(System.in);
				String Select_CarName = scanner2.nextLine();

				Driver d1 = new Driver();
				ElectricCar e1 = new ElectricCar(Select_CarName);
				d1.drive_e(e1);

//				scanner1.close();
//				scanner2.close();
				
			} else if (Select_CarNum == 4) {
				System.out.println("システムを終了します。");
				
				num=1;
				
				scanner1.close();

			}

		}
	}
}


	    
	    
	  


	











//package schoo_kadai0202_02;
//
//import java.util.Scanner;
//
//public class Main {
//
//
//	public static void main(String[] args) {
//		
//		System.out.println("1.トラックを作成");
//		System.out.println("2.スポーツカーを作成");
//		System.out.println("3.電気自動車を作成");
//		System.out.println("4.システム終了"); 
//
//		// 入力を促すメッセージ
//	    System.out.print("番号を選択してください:");
//	    
//	    // Scannerクラスのインスタンスを作成
//	    // 引数で標準入力System.inを指定する
//		Scanner scanner1 = new Scanner(System.in);
//
//	    //入力された内容をインスタンスから取得
//	    int Select_CarNum = scanner1.nextInt();
//	    
//	    System.out.print("車の名前を入力してください:");
//	    
//	    // Scannerクラスのインスタンスを作成
//	    // 引数で標準入力System.inを指定する
//		Scanner scanner2 = new Scanner(System.in);
//
//	    //入力された内容をインスタンスから取得
//	    String  Select_CarName = scanner2.nextLine();
//	    
//	    
//	    // Scannerクラスのインスタンスをクローズ
//	    scanner1.close();
//		
//	 // Scannerクラスのインスタンスをクローズ
//	    scanner2.close();
//	    
//	    
//	  //Driverクラスのインスタンスを生成してコンストラクタを呼び出す				
//	  		Driver d1 = new Driver();
//	  		
//	    if(Select_CarNum == 1) {
//	    	Truck t1 = new Truck(Select_CarName);
//	    	d1.drive_t(t1);
//	    }else if(Select_CarNum == 2) {
//	    	SportCar s1 = new SportCar(Select_CarName);
//	    	d1.drive_s(s1);
//	    }else if(Select_CarNum == 3) {
//	    	ElectricCar e1 = new ElectricCar(Select_CarName);
//	    	d1.drive_e(e1);
//	    }else if(Select_CarNum == 4) {
//	    	System.out.println("システム終了");
//	    }
//
//
//	}
//
//}
