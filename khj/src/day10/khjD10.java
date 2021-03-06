package day10;

public class khjD10 {
/*
 * ### 멤버변수 : 클래스 변수와 객체 변수(인스턴스 변수) p.153

* 객체 변수

  * 객체를 생성해야 멤버 변수가 할당
  * 객체 생성 없이 멤버 변수를 사용할 수 없다
  * 객체 변수는 각 객체마다 변수들이 만들어짐

  ```java
  클래스명 객체명 = new 클래스명();
  객체명.변수명 = 10;
  ```

  

* 클래스 변수(static)

  * 객체 생성 없이 변수를 사용할 있다
  * 클래스 이름을 통해 호출
  * 클래스 변수는 각 객체들이 하나의 클래스 변수를 공유함

  ```java
  클래스.변수명 = 10;
  //하지만 객체를 생성해서 사용해도 됨
  클래스명 객체명 = new 클래스명();
  객체명.변수명 = 10;//이와 같이 사용해도 가능은 하지만 경고 표시가 뜸
  ```

* KiaCar클래스를 만들려고 한다. 이 때 logo라는 변수를 만드려고 하는데 클래스 변수로 해야할까? 아니면 객체 변수로 해야할까? 클래스 변수

### 클래스 메소드와 객체 메소드

* 클래스 메소드(static)
  * 클래스를 통해 호출
* 객체 메소드
  * 객체를 통해 호출



### 클래스 변수/메소드와 객체변수/메소드

1. 객체 메소드에 객체 변수를 사용할 수 있다.
2. 객체 메소드에 클래스 변수를 사용할 수 있다.
3. 객체 메소드에 객체 메소드를 사용할 수 있다.
4. 객체 메소드에 클래스 메소드를 사용할 수 있다.
5. 클래스 메소드에 객체 변수를 사용할 수 없다.
6. 클래스 메소드에 클래스 변수를 사용할 수 있다.
7. 클래스 메소드에 객체 메소드를 사용할 수 없다.
8. 클래스 메소드에 클래스 메소드를 사용할 수 있다.

* 객체 메소드는 모든 변수와 메소드를 호출 할 수 있다
* 클래스 메소드는 클래스 변수와 클래스 메소드만 호출할 수 있다



### 클래스 메소드가 많은 클래스 : Math

* Math 클래스는 대부분 클래스 메소드
* Math 클래스는 대부분 클래스 변수
 	**/
}
