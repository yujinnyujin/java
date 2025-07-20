package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
}

//Object가 제공하는 toString()메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조값(해시코드)를 16진수로 제공한다.

//system.out.println() 메서드는 사실 내부에서 toString()을 호출한다.
//따라서 println()을 사용할 때, toString()을 직접 호출할 필요없이 객체를 바로 전달하면 객체의 정보를 출력할 수 있다.
//Object.toString() 메서드가 클래스 정보와 참조값을 제공하지만 이 정보만으로는 객체의 상태를 적절히 나타내짐 ㅗㅅ한다.
//그래서 보통 toString()을 재정의(오버라이딩)해서 보다 유용한 정보를 제공하는 것이 일반적이다.

