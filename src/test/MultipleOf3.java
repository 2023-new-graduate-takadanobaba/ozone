package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultipleOf3 {

	public static void main(String[] args) throws Exception {
		int num =0;
		
		// 出力
		System.out.println("数字を入力してください。");
		
//		入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		★ここから繰り返しスタート
		do {	
			String str = reader.readLine();
			
	//		処理 文字列を数値に変換する
			try {
				num = Integer.parseInt(str);
				
//				if (num%3 == 0) {
//					System.out.println("3の倍数です。");
//					System.out.println("以上でシステムを終了します。");
//				}
//				else  {
//					System.out.println("3の倍数ではありません。");
//					System.out.println("以上でシステムを終了します。");
//				}
				
			} catch (NumberFormatException notNum) {
				System.out.println("数字を入力してください。2");
	//			★に戻る
				
			} 
			
		} while(num%3 == 0 || num%3 != 0);
			System.out.println(num);
		
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
