package java11;

/*
    내부 클래스(Inner Class)
    내부 클래스란 클래스 내부에 선언된 또 다른 클래스를 의미한다.
    두 개의 클래스가 서로 긴밀한 관계를 맺고 있을 때 선언하여 사용한다.
    ex)
        class Outer {   // 외부 클래스
            class Inner {   // 내부 클래스
            }
        }

   내부 클래스의 장점
   1) 내부 클래스에서 외부 클래스 멤버에 손쉽게 접근할 수 있다.
   2) 서로 관련있는 클래스를 묶어서 캡슐화를 증가시킬 수 있다.
   3) 외부에서는 내부 클래스에 접근할 수 없으므로, 복잡성을 줄일 수 있다.

   내부 클래스의 종류
   1) 정적 클래스(Static Class):
        외부 클래스 영역에 선언된 static 키워드를 갖는 클래스를 말하며,
        외부 클래스의 클래스 메소드에 사용될 목적으로 선언된다.
   2) 인스턴스 클래스(Instance Class)
        외부 클래스 영역에 선언된 클래스 중에 static 키워드를 갖지 않는 클래스를 말하며,
        외부 클래스의 인스턴스 변수나 메소드에 사용될 목적으로 선언된다.
   3) 지역 클래스(Local Class)
        외부 클래스의 메소드나 초기화 블록에 선언된 클래스를 의미하며,
        선언된 블록 내에서만 사용할 수 있다.
   4) 익명 클래스(Anonymous Class)
        다른 내부 클래스와 달리 이름을 갖지 않는 클래스로서, 단 하나만의 객체를 생성하는
        일회용의 클래스이다. 생성자를 선언할 수 없으며, 하나의 클래스나 하나의 인터페이스를
        상속받거나 구현할 수 있을 뿐이다. 때문에 매우 작은 클래스를 구현할 때 사용한다.
        ex)
            클래스명 참조변수명 = new 클래스명() {}

*/

public class InnerClass {

}
