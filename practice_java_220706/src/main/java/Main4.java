import pkg.ModifierTest;

class Child2 extends ModifierTest {
    void callParentProtectedMember() {
        System.out.println("Call my parent's protected method");
        super.messageProtected();
    }
}

public class Main4 {
    public static void main(String[] args){
        /*
         Title. 객체지향언어 접근제어자
         オブジェクト指向言語　接近制御子
         */

        /*
        접근 제어자 : 멤버 변수/함수 혹은 클래스에 사용되며 외부에서의 접근을 제한하는 역할
        接近制御子：メンバー変数・関数もしくはクラスに使用され、外部からの接近を制御する役割

        private : 같은 클래스 내에서만 접근이 가능
        default(nothing) : 같은 패키지 내에서만 접근이 가능
        protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능
        public : 접근 제한이 전혀 없음

        private :　同じクラス内で接近可能
        default(nothing) : 同じパッケージ内で接近可能
        protected : 同じパッケージ内で、そして他のパッケージの子孫クラスで接近可能
        public : 接近制御が全くない
         */


        /*
        예시 : pkg-ModifierTest
        例示：pkg-ModifierTest
         */
        ModifierTest modifierTest = new ModifierTest();

        modifierTest.messageOutside();
//        modifierTest.messageInside(); // compile error
//        modifierTest.messageProtected(); // compile error

        Child2 child = new Child2();
        child.callParentProtectedMember();
    }
}
