package jp.wsf.jDriver.test;

public class ExpectExceptionTest {
	public void isPassed(int i) {
		if(i<0){
			 throw new IllegalArgumentException
             ("1以上のの値を入力してください");
		}else{
			throw new NullPointerException();
		}
	}
}
