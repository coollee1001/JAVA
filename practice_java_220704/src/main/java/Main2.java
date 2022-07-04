public class Main2 {
    public static void main(String[] args){
        /*
        Memo.
        변수 : 어떠한 데이터를 저장하기 위한 메모리 공간의 이름, 지속적으로 변수의 값을 변경 가능
        상수 : 중간에 값이 변할 수 없으며 초기값을 끝까지 사용

        変数：とあるデータをセーブする為のメモリー空間の名、色んな値を変更可能
        定数：途中で値が変更できない、初期値を最後まで使用

         */
        /*
        Title.
        변수　変数
         */

        int number = 5; //정수형 변수 선언 整数型変数宣言
        System.out.println(number); //5

        String world = "Hello world!"; //문자형 변수 선언 文字型変数宣言
        System.out.println(world); //Hello world!
        world = "Goodbye world!"; //이미 선언된 변수에 다른 값 할당 既に宣言された変数に違う値を割り当て
        System.out.println(world); //Goodbye world!


        /*
        Title.
        상수 定数
         */
        final int finalNumber2 = 10; //상수형 변수 선언 : final로 선언 가능 定数型変数宣言 : finalで宣言可能
        //final은 접근제어자 finalは修飾子
        System.out.println(finalNumber2); // 10
        //number2 = 50; //컴파일 에러 コンパイルエラー
    }
}
