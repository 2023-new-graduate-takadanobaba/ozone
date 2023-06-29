package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TDDtraining {
	
	private VendingMachine sut1;
//	private VendingMachine2 sut2;
	
	@BeforeEach
	public void setUp() {
		 sut1 = new VendingMachine();
		 boolean hasInput100 = sut1.payment();
	}

	@Test
	public void ボタンを押すとコーラが返る() {
		// Arrange
		// Act
		String item = sut1.pushButton();
		
		// Assert
		//検証が等しいかどうか
		//選ばれたitemがコーラであるか
		assertEquals("コーラ", item);
		
	}
	
	@Test
	public void _100円を投入してボタンを押すとコーラが返る１() {
		//準備
		
		//実行
		boolean hasInput100 = sut1.payment();  //100円を入れたかどうか
		String item = sut1.pushButton();
		//検証
		assertEquals(true, hasInput100);
		
		assertEquals("コーラ", item);
	}
	
	
//	お題3. ウーロン茶追加
	
	
	
	@Test
	public void ボタンを押したかどうかがわかる() {
		//準備
		//実行
//		Button button = sut1.getButton("コーラ");
//		button.push();
		boolean isButtonPushed = sut1.isButtonPushed();
		//検証
		assertEquals(true, isButtonPushed);
	}	
		

	@Test
	public void ボタンを押していない状態がわかる() {
		//準備
		//実行
		boolean isButtonPushed = sut1.isButtonPushed();
		//検証
		assertEquals(true, isButtonPushed);
	}
	
	@Test
	public void _100円コインを投入したかどうかわかる() {
		//準備
		//実行			
		//検証
//		assertEquals(true, hasInput100);
		
	}

}
