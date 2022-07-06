class Phone2 {
    String model;
    String color;
    int price;

    Phone2(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }//여기서 this는 생성된 객체 자신을 가리킨다.   ここでthisはできたオブジェクト自信を示す
}
public class Main2 {
    public static void main(String[] args){
        /*
        Title. 객체지향언어 생성자
        オブジェクト指向言語　コンストラクタ
         */

        /*
        1. 생성자
        생성자 : 인스턴스가 생성될 때 사용되는 '인스턴스 초기화 메소드. 'new'로 자동 호출되는 메소드
        コンストラクタ：インスタンスができる時使用される'インスタンス初期化メソッド'。'new'で自動に呼び出すメソッド
         */

        Phone2 galaxy = new Phone2("Galaxy10", "Black", 100);

        Phone2 iphone =new Phone2("iPhoneX", "Black", 200);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        //철수는 이번에 Galaxy10Black 색상을 100만원에 샀다.
        //田中は今回Galaxy10Black色を100万ウォンに買った。
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
        //영희는 이번에 iPhoneXBlack 색상을 200만원에 샀다.
        //佐藤は今回iPhoneXBlack色を200万ウォンに買った。

    }
}
