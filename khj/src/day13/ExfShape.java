package day13;

/* Draw 인터페이스를 구현한 ExfShape 클래스를 만드세요 */
public abstract class ExfShape implements ExfDraw {
	protected int left, right, top, bottom;
	
	@Override
	public void resize(int width, int height) {
		right = left + width; bottom = top + height;

	}

	@Override
	public void move(int x, int y) {
		int width = right - left;
		int height = bottom - top;
		left = x; top = y;
		right = x + width; bottom = y + height;

	}

	public ExfShape(int x1, int y1, int x2, int y2) {
		left   = x1 > x2 ? x2 : x1;
		right  = x1 > x2 ? x1 : x2;
		top    = y1 > y2 ? y2 : y1;
		bottom = y1 > y2 ? y1 : y2;
	}
}
/* ExfShape을 상속받아 ExfRect클래스와 ExfEllipse 클래스를 만드세요*/