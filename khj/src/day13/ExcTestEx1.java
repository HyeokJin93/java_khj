package day13;

public class ExcTestEx1 {

	public static void main(String[] args) {
		/* 추상 클래스는 추상 클래스를 이용하여 객체를 만들 수 없다
		 * */
		//ExcP p = new ExcP();//추상 클래스를 이용하여 객체를 만들 수 없어서 에러 발생
		ExcP p = new ExcC();//추상 클래스도 자식 클래스를 이용하면 객체를 만들 수 있다.
		p.test();
	}

}
abstract class ExcP{
	public abstract void test();
	
}
class ExcC extends ExcP{

	@Override
	public void test() {
		System.out.println("추상 메소드");
		
	}
	
}