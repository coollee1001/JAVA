public class Main3 {
    public static void main(String[] args){
        /* Title
        Primitive Type(기본 자료형) 基本データ型
        */

        /* 숫자 数字 */
        short s = 1; //2바이트 이내로 표현할 수 있는 정수형 변수 선언 2バイト以内で表現できる整数型変数宣言
        System.out.println(s); //1

        int a = 3; //정수형 변수 선언 整数型変数宣言
        System.out.println(a); // 3

        long b = 1234567890L; //Long 정수형 변수 선언 Long整数型変数宣言
        System.out.println(b); //1234567890

        float c = 5.5F; //float 실수형 변수 선언 float浮動小数点型変数宣言
        System.out.println(c); //5.5

        double d = 9.12345678901234567890d; //double 실수형 변수 선언 double浮動小数点型変数宣言
        System.out.println(d); //9.123456789012346

        // 각 자료형의 MAX, MIN 값을 가져올 수 있다 個別のデータ型のMAX、MINの値を持ってくることができる
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Long.MIN_VALUE); //-9223372036854775808
        System.out.println(Float.MAX_VALUE); //3.4028235E38
        System.out.println(Float.MIN_VALUE); //1.4E-45
        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); //4.9E-324


        /* 문자 文字 */
        char alphabet = 'A'; // 문자형 변수 선언　文字型変数宣言
        System.out.println(alphabet); //A
        // char type은 default 값이 없다. char typeはdefault値がない


        /* 논리 論理 */
        boolean fact = true; // 논리형 변수는 true, false의 값을 가진다.　論理型変数はtrue,falseの値を持つ
        System.out.println(fact); //true
        // boolean type은 default 값이 없다 boolean typeはdefault値がない


        /* 바이트 バイト*/
        byte data = 'd';
        System.out.println(data); //100
        // 알파벳 d는 ASCII code 에서 십진법으로 100이기 때문에 100이라는 글자가 출력된다
        // アルファベットｄはASCII codeで十進法として100のため、100の文字が出力される


    }
}
