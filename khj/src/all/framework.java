package all;

public class framework {
/* # 컬렉션 프레임워크

* 데이터를 편리하게 관리하기 위해 나온 클래스
* Collection과 Map으로 구성
* Collection은 List와 Set으로 구성



### List

* value 하나를 관리
* 순서를 기억(순서를 보장)
* 중복된 정보를 저장
* List<클래스명1>
* List는 인터페이스
* 리스트 객체 선언

```java
List<클래스명> 객체명 = new 구현클래스<클래스명>();
구현클래스<클래스명> 객체명 = new 구현클래스<클래스명>();
List<클래스명> list = new ArrayList<클래스명>();
List<클래스명> list = new LinkedList<클래스명>();
ArrayList<클래스명> list = new ArrayList<클래스명>();
```

* 리스트에 객체를 저장. 객체는 참조변수이고, 주소를 저장하는 변수이다. 리스트에 주소를 저장

### 리스트 멤버 메소드

* int size() 
  * 리스트에 들어있는 객체들의 갯수
* boolean add(Object e)
  * 리스트에 객체를 추가
* boolean addAll(Collection<? extends Object> c)
  * 리스트에 다른 리스트를 추가
* boolean contains(Object o)
  * 리스트에 o 객체와 일치하는 객체가 있는지 없는지 알려줌
* boolean containsAll(Collection<?> c)
  * 리스트에 다른 리스트 객체들이 모두 있는지 없는지 알려줌. 부분만 있으면 없다고 알려줌
* void clear()
  * 리스트를 비워줌
* boolean remove(Object o) 
  * 리스트에서 o 객체와 일치하는 객체를 삭제하고 삭제여부를 알려줌
* Object remove(int index)
  * 리스트에서 index 번지에 있는 객체를 삭제 후 반환
* boolean removeAll(Collection<?> c)
  * 리스트에서 c리스트에 있는 객체들을 삭제
* Iterator<Object> iterator() 
  * 리스트를 이용하여 반복자를 반환
* int indexOf(Object o)
  * 리스트에 객체가 몇번지에 있는지 알려줌. 없으면 -1을 알려줌
* Object get(int index)
  * 리스트에만 있고, 셋에는 없음
  * 리스트에서 index 번지에 있는 객체를 반환
* Obejct set(int index, Object o)
  * 리스트에만 있고, 셋에는 없음
  * 없는 번지인 경우 예외 발생
  * 리스트에서 index번지에 있는 객체를 o 객체로 수정 후 기존에 있는 객체정보를 반환

### Set

* value 하나를 관리
* 순서를 보장하지 않음
* 중복이 불가능. 이때 중복 체크는 equals를 이용
* Set은 인터페이스
* Set<클래스명1>



### Map

* key와 value 두개를 관리
* 순서를 보장하지 않음
* key는 중복이 불가능, value는 중복이 가능
* Map은 인터페이스
* Map<클래스명1, 클래스명2>
*  */
	
}
