package all;

public class abstractInterface {
/*
 * # 추상 클래스

### 추상 메소드

* 메소드를 선언만하고, 정의하지 않음
* 구현하는 부분이 없음
* 해당 클래스에서 기능은 사용하지 않지만 자식 클래스들이 공통적으로 가질 수 있는 기능을 추상 메소드로 미리 만들어 놓음
* 다형성을 활용하기 위해서 => 코드를 효율적으로 작성하기 위해서

```java
접근제한자 abstract 리턴타입 메소드명(매개변수들);
```



### 추상 클래스

* 추상 메소드를 가지고 있는 클래스
* 클래스에 추상 메소드를 가지고 있다 => 무조건 추상 클래스이다(O)
* 추상 클래스이다 => 클래스에 무조건 추상 메소드를 가지고 있다 (X) p.260 10번 내용

```java
접근제한자 abstract class 클래스명{
	//멤버 변수들
    //멤버 메소드들
    //멤버 추상메소드들
}
```

* 추상 클래스는 해당 클래스를 이용하여 객체를 만들 수 없다
* 추상 클래스는 자식 클래스를 이용하여 객체를 만들 수 있다
* 추상 클래스를 상속받은 자식 클래스들은 추상 클래스가 안되려면 부모의 추상 메소드를 오버라이딩해야한다

```java
abstract class Parent{
    public abstract void test();
}
//부모에 있는 추상 메소드를 오버라이딩 하지 않고 본인도 추상 클래스가 되는 경우
abstract class Child1 extends Parent{
    
}
//부모에 있는 추상 메소드를 오버라이딩으로 구현하여 일반 클래스가 되는 경우
class Child2 extends Parent{
    @Override
    public void test(){
        
    }
}
```



### 인터페이스

* 상수와 추상 메소드로 구성되어 있다.
* default 메소드와 static 메소드도 있을 수 있다.(JAVA 8버전)
* private 메소드가 있을 수 있다.(JAVA 9버전)

* 기능을 나열한 설명서에서 목차 부분 해당
* 인터페이스는 인터페이스를 이용하여 객체를 만들 수 없다
* 인터페이스를 이용하여 클래스를 만드려면 구현을 해야한다 : implements
* default 메소드 : 구현부가 비어 있는 메소드
* 인터페이스에서는 추상 메소드 앞에 abstract를 생략해도 됨

```java
interface 인터페이스명{
    //추상메소드들;
    //상수;
    //디폴트 메소드들;
}
class 클래스명 implements 인터페이스명{
    //인터페이스의 추상메소드를 오버라이딩해야 함
}
```



### 디폴트 메소드

* 메소드에 default를 붙여줘야한다
* 인터페이스에서 사용
* 인터페이스에 추가 되도 구현 클래스에서 꼭 오버라이딩 하지 않아도 됨



### 인터페이스의 상속

* 인터페이스는 다중 상속이 가능 => 부모가 여러명
  * 메소드가 구현되지 않아서
* xxx이 인터페이스를 상속 받았다. xxx은 클래스? 인터페이스? => 인터페이스



### 구현 클래스

* 인터페이스를 구현한 클래스
* 구현 클래스는 여러 인터페이스를 구현할 수 있다.
* 구현 클래스는 다른 클래스를 상속 받을 수 있다.

```java
class 클래스명1 extends 클래스명2 implements 인터페이스1, 인터페이스2{
    
}
```
















 		**/
}
