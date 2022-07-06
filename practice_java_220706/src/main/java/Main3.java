class Animal {
    String name;

    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " is swimming!");
    }
    public void cry() {
        System.out.println(name + " is barking!");
    }
}




public class Main3 {
    public static void main(String[] args){
        /*
        Title. 객체지향언어 상속
        オブジェクト指向言語　継承
         */

        /*
        1. 상속  継承
        상속 : 기존의 클래스를 재사용하는 방식 중의 하나
        継承 : 既存のクラスを際しようする方法の一つ

        특징
        1)부모 클래스로에서 정의된 필드와 메소드를 물려 받는다        親のクラスから定義されたフィールドとメソッドを引き継ぐ
        2)새로운 필드와 메소드를 추가할 수 있다                    新しいフィールドとメソッドを追加できる
        3)부모 클래스에서 물려받은 메소드를 수정할 수 있다           親のクラスから引き継いだメソッドを修正できる
         */

        Dog dog = new Dog("코코");    //ココ
        dog.cry();
        //코코 is crying.
        //ココ is crying.
        dog.swim();
        //코코 is swimming!
        //ココ is swimming!

        Animal dog2 = dog;
        dog2.cry();
        //코코 is crying.
        //ココ is crying.
//        dog2.swim(); // compile error



        /*
        2. 오버로딩 vs 오버라이딩 オーバーロード vs オーバーライド
        오버로딩 : 한 클래스 내에 동일한 이름의 메소드를 여러개 정의하는 것
        조건 : 메소드 이름이 동일해야 한다. 매개변수의 개수 혹은 타입이 달라야 한다.

        オーバーロード：一つのクラス内に同じ名前のメソッドをいくつか定義すること
        条件：メソッドの名前が一致すること。媒介変数の数もしくはタイプが違うこと

        오버라이딩 : 부모 클래스로부터 상속받은 메소드의 내용을 변경하는 것
        조건 : 부모 클래스의 메소드와 이름이 같아야 한다. 매개변수가 같아야 한다. 반환타입이 같아야 한다

        オーバーライド：親のクラスから継承されたメソッドの内容を変更すること
        条件；親のクラスのメソッドと名前が一致すること。媒介変数が同じであること。返還タイプ一緒であること
        */

        /*
        int add(int x, int y, int z) {
            int result = x + y + z;
            return result;
        }

        long add(int a, int b, int c) {
            long result = a + b + c;
            return result;
        }
        // 반환타입은 다르지만 매개변수의 자료형과 개수는 같기에 오버로딩이 아니다
        // 返還タイプは違うけど媒介変数のデータ型と数は一緒であるのでオーバーロードではない

        int add(int a, int b) {
            int result = a + b;
            return result;
        }
        // 오버로딩의 조건에 부합하는 예제
        // オーバーロードの条件に一致する例示

        Animal dog3 = new Dog("코코"); //ココ
        dog3.cry();
        //코코 is barking!
        //ココ is barking!
        */


        /*
        오버로딩, 오버라이딩 비교
        オーバーロード、オーバーライド比較

        오버로딩 : 기존에 없는 새로운 메소드를 정의하는 것
        오버라이딩 : 상속받은 메소드의 내용을 변경하는 것

        オーバーロード：既存にはない新しいメソッドを定義
        オーバーライド：継承されたメソッドの内容を変更
         */

    }

}
