package day14;

import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class ExdThrowEx1 {

	public static void main(String[] args) {
		
		//Exception은 RuntimeException의 자손 클래스가 아니기 때문에 
		//예외를 발생시키면 반드시 예외처리를 해야함(Exception은 런타임Exception의 조상)
		//throw new Exception("예외 발생");
		//throw new RuntimeException("런타임 예외 발생");
		//throwException1();
		//런타임이 아닌 Exception 예외기 때문에 클릭으로 try catch 생성이 가능하지만
		//런타임예외에서는 try catch를 직접 입력해줘야함
		try {
			//throwException2();
			throwException3(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void throwException1() throws RuntimeException {
		throw new RuntimeException();
	}
	public static void throwException2() throws Exception {
		throw new Exception();
	}
	public static void throwException3(int num) 
			throws Exception { // FileNot도 써도되지만 Exception만 있어도 됨
		if(num == 0) {
			throw new Exception("num가 0");
		}
		if(num < 0) {
			throw new FileNotFoundException("num는 음수");
		}
		if(num > 0) {
			throw new ArithmeticException("num는 양수");
		}
	}
}
