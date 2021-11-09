package day10;
//도형 직사각형을 타나내는 클래스를 생성하고, 객체를 만들어 테스트하세요.
//시작점과 가로, 세로
public class Rect1 {
	private int x,y;
	private int width, height; // private 일때 getter setter 필요
	
	public Rect1(){}
	public Rect1(int x, int y, int width, int height) {
		super();
		this.x = x;			this.y = y;
		this.width = width;	this.height = height;
	}

//사각형 정보 출력 기능
	public void print() {
		System.out.println("---사각형---");
		System.out.println("시작점 : " + x + ","+y);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("----------");
	}
	
	//시작점 이동 기능
	public void move(int x, int y) {
		this.x = x; this. y=y;
	}
	//사각형 크기 변경 가능
	public void resize(int width, int height) {
		this.width = width; this.height = height;
	}
	
}


