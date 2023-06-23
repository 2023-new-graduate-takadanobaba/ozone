package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultipleOf3 {

	public static void main(String[] args) throws Exception {
		int num =0;
		boolean notNum = false;
		
		
//		入力
		
//		★ここから繰り返しスタート
		do {	
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("数字を入力してください。3");
			String str = reader.readLine();
			notNum=false;
			
	//		処理 文字列を数値に変換する
			try {
				num = Integer.parseInt(str);
				
			} catch (NumberFormatException Num) {
//				System.out.println("数字を入力してください。2");
				notNum=true;
			} 
			
		} while(notNum==true);
		
		if (num%3 == 0) {
			System.out.println("3の倍数です。");
			System.out.println("以上でシステムを終了します。");
		}
		else  {
			System.out.println("3の倍数ではありません。");
			System.out.println("以上でシステムを終了します。");
		}
		
		

	}

}
