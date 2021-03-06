package all;

public class ExceptionError {
	/* # 예외처리

### 에러

* 프로그램 코드로 해결할 수 없는 상황



### 예외

* 프로그램 코드로 해결할 수 있는 상황



### 예외 종류

* 런타임 예외 : 프로그램 실행 시 발생하는 예외로, 특정 상황에서 발생
* 런타임이 아닌 예외



### 런타입 예외(Runtime Exception) p.335

1. ArrayIndexOutOfBoundsException
   * 배열에 접근할 때 잘못된 번지로 접근할 때 발생
   * 5개짜리 배열이 있으면 0~4번지까지 접근이 가능, 이 때 5번지에 접근하려할 때 예외가 발생
2. ArithmeticException
   * 정수 / 정수에서 0으로 나누었을 때, 나누기 연산자나 나머지 연산자를 사용할 때 발생
3. NullPointerException
   * 객체의 멤버변수나 멤버 메소드를 이용할 때 발생할 수 있다
   * 객체가 null인데 멤버 변수나 멤버 메소드를 호출할 때 발생
4. NumberFormatException
   * 문자열을 수치(정수나 실수 등)으로 변환할 때 발생할 수 있다
5. ClassNotFoundException
   * 클래스를 찾을 수 없을 때 발생

### IOException

* FileNotFoundException
  * 파일을 다룰 때 없는 파일을 다루려고 할 때 발생할 수 있다



### 예외처리

* 예외가 발생할 때 예외처리를 안하면 코드가 중단 됨
* 예외가 발생했을 때 코드가 중단되지 않고 이어서 잘 실행되도록 처리하는 것을 예외처리라 함
* 런타임 예외는 예외처리를 안해도 프로그램은 실행 됨
* 런타임 예외가 아닌 예외들은 예외처리를 안하면 빨간줄이 떠서 프로그램 실행이 안됨
  * 런타임 예외가 아닌 예외들은 반드시 예외처리를 해야함



### 예외처리 방법

* 예외가 발생한 메소드에서 직접 예외처리(try catch문을 이용)
  * catch는 반드시 1개 이상이어야 한다 (최소 1개)
  * 예외 클래스1은 예외 클래스2의 조상이 오면 안됨
    * 예외클래스1이 조상, 예외 클래스2가 자손이면 안됨
  * 가능하면 마지막 catch에 Exception을 두는 좋다

```java
//예외가 발생했을 때 첫번째 catch로 가서 발생한 예외 클래스와 예외클래스1과 비교를 하여 예외 클래스1로 자동 클래스 변환이 가능하면 예외처리 1을 실행
try{
    //예외가 발생할 수 있는 코드들
}catch(예외클래스1 객체명){
    //예외처리1
}catch(예외클래스2 객체명){
    //예외처리2
}

try{
    int num1 = 1, num2 = 0;
    int res = num1 / num2;
    //예외 발생후 콘솔에 ArithmeticException 예외가 출력
}catch(ArithmeticException e){
	System.out.println("ArithmeticException 예외");
}catch(Exception e){
	System.out.println("Exception 예외");
}

try{
    int num1 = 1, num2 = 0;
    int res = num1 / num2;
    //예외 발생후 콘솔에 Exception 예외가 출력
}catch(NullPointerException e){
	System.out.println("NullPointerException 예외");
}catch(Exception e){
	System.out.println("Exception 예외");
}
```

* 예외가 발생한 메소드를 부른 메소드가 예외처리(throw를 이용)
  * 조건문을 이용하여 직접 throw로 예외 객체를 알려줄 수 있다
  * 예외가 발생하면 자동으로 예외 객체를 알려줄수 있다
  * throws는 런타임 예외이면 생략할 수 있고, 아니면 생략하면 안됨
  * throw은 메소드안에서 예외를 발생시킬때 사용
  * throws은 메소드에서 어떤 예외들이 발생할 수 있는지 알려주는 부분

```java
public 리턴타입 메소드명(매개변수들) throws 예외클래스명1, 예외클래스명2{
    //예외 상황이면 예외를 발생시킴
    if(예외 상황){
        throw 예외 객체;
    }
}
public 리턴타입 메소드명(매개변수들) throws 예외클래스명1, 예외클래스명2{
 	//예외가 발생할 수 있는 코드
}
```














	 * */
}
