package day12;

public class ExaShape {
	// 도형 클래스 : 그림판에서 그려지는 모든 도형을 대표할 수 있는 클래스
	// day10 Rect1, Rect2, Ellipse 클래스 참고
	/* 모든 도형은 사각형안에 그릴 수 있고, 그 사각형은 왼쪽위의 점과 오른쪽아래 점으로 표현할 수 있다.
	 * 도형은 위치를 이동시킬 수 있다.(크기는 변하지 않음)
	 * 도형은 크기를 변환시킬 수 있다.(방향은 마음대로)
	 * 도형은 방향에 상관없이 그릴 수 있다. = > 기본생성자 안만듦 => 왜??
	 * */
	protected int left, top, right, bottom;
	//도형을 그릴때 대각선 점 2개 필요
	public ExaShape(int x1, int y1, int x2, int y2) {
		left   = x1 < x2 ? x1 : x2;
		right  = x1 < x2 ? x2 : x1;
		top    = y1 < y2 ? y1 : y2;
		bottom = y1 < y2 ? y2 : y1;
		/* if(x1 < x2){
		 * 		left = x1;
		 * 		right = x2;
		 * }else{
		 * 		left = x2;
		 * 		right = x1
		 *위 2줄이 if문 6줄
		 *조건선택연산자 잘 활용하면 코드를 깔끔하게 해줄수있다.
		 * */
		
	}
	//도형의 너비를 계산하는 기능
	public int getWidth() {
		return right - left;
	}
	//도형의 높이를 계산하는 기능
	public int getHeight() {
		return bottom - top;
	}
	
	//도형은 위치를 이동시킬 수 있다(왼쪽위의 점)
	public void move(int left, int top) {
		this.right=left+getWidth();
		this.bottom=top+getHeight();
		this.left=left;	
		this.top=top;
		// this.left=left, top 에서 left와 top의 값이 변하기 때문에 뒤에 써주어야 한다.
		
		
		
	}

	//도형은 크기를 바꿀 수 있다(방향은 마음대로)
	/* direction
	 * 1인 경우: 우하 방향
	 * 2인 경우: 좌하 방향
	 * 3인 경우: 좌상 방향
	 * 4인 경우: 우상 방향
	 * */ 
	public void resize(int width, int height, int direction) {

		switch(direction) {
		case 1: 
			right = left + width;
			bottom = top + height;
			break;
		
		case 2:
			left = right - width;
			bottom = top + height;
			break;
		
		case 3: 
			left = right - width;
			top = bottom - height;
			break;
		
		case 4: 
			right = left + width;
			top = bottom - height;
			break;
		default :
			System.out.println("잘못된 방향입니다.");
		}
	}
	//도형을 그리기
	public void print(){
		System.out.println("---도형---");
		System.out.println("좌상점 : " + left + "," + top);
		System.out.println("우하점 : " + right + "," + bottom);
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getBottom() {
		return bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

}
	
