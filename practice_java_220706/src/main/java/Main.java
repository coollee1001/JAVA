
class Phone {
    String model;
    String color;
    int price;
}

class Calculation {
    int add(int x, int y) {
        int result = x + y;
        return result;
    }// 두 값을 더한 결과　二つの値を足す結果

    int subtract(int x, int y) {
        int result = x - y;
        return result;
    }// 두 값을 뺀 결과   二つの値を引く結果
}


public class Main {
    public static void main(String[] args){
        /*
        Title. 객체지향언어 클래스, 인스턴스, 메소드
        オブジェクト指向言語クラス、インスタンス、メソッド
         */

        /*
        1. 클래스(Class) クラス
        클래스 : 표현하고자 하는 대상의 공통 속성을 한 군데에 정의해 놓은 것. 즉, 클래스는 객체의 속성을 정의해 놓은 것
        クラス：表現しようとする対象の共通属性を一か所に正義すること。つまり、クラスはオブジェクトの属性を定義したこと
        멤버 변수 : 클래스 내부의 정보
        メンバー変数：クラス内部の情報
         */

        /*
        2. 인스턴스 インスタンス
        인스턴스 : 어떠한 클래스로부터 만들어진 객체
        インスタンス；とあるクラスから作られたオブジェクト
         */

        Phone galaxy = new Phone();
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        Phone iphone =new Phone();
        iphone.model = "iPhoneX";
        iphone.color = "Black";
        iphone.price = 200;


        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        //철수는 이번에 Galaxy10Black 색상을 100만원에 샀다.
        //田中は今回Galaxy10Black色を100万ウォンに買った。
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
        //영희는 이번에 iPhoneXBlack 색상을 200만원에 샀다.
        //佐藤は今回iPhoneXBlack色を200万ウォンに買った。


        /*
        3. 메소드 メソッド
        메소드 : 작업을 수행하는 코드를 하나로 묶어 놓은 것
        メソッド：作業を修行するコードを一つに絞らせてもらったもの

        메소드가 필요한 이유 メソッドが必要な理由
        - 재사용성         再使用
        - 중복된 코드 제거 中腹のコード消し
        - 프로그램 구조화  プログラムオブジェクト化
         */

        Calculation calculation = new Calculation();
        int addResult = calculation.add(100, 90);
        int subResult = calculation.subtract(90, 70);

        System.out.println("두 개를 더한 값은 " + addResult);
        //두 개를 더한 값은 190
        //二つを足した値は190
        System.out.println("두 개를 뺀 값은 " + subResult);
        //두 개를 뺀 값은 20
        //二つを引いた値は20



    }
}
