package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

	public static void main(String[] args) throws IOException {
		// 入力
		
		System.out.println("数字を入力してください。");
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		
		int num;
		// 処理　
		try {
			num = Integer.parseInt(str); //数値に型変換
			 System.out.println(num + "これは数字です。");
		} catch (Exception unNumber) {
			 System.out.println("数字ではありません。");
		} finally {
			 System.out.println("終了しました。");
		}
			
	}

}
