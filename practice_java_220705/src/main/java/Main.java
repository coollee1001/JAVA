public class Main {
    public static void main(String[] args){
        /* Title
        연산자 演算子
         */

        /*
        1. 산술연산자　算術演算子
         */
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2); // 더하기 연산　加算演算 //15
        System.out.println(num1 - num2); // 빼기 연산　減算演算 //5
        System.out.println(num1 * num2); // 곱하기 연산　乗算演算 //50
        System.out.println(num1 / num2); // 나누기 연산　除算演算 //2
        System.out.println(num1 % num2); // 나머지 연산　剰余演算 //0

        /*
        ２.　대입연산자 代入演算子
         */
        int num3 = 10;
        int num4 = 5;

        num3 += num4; // num3 = num3 + num4
        System.out.println(num3); //15

        num3 -= num4; // num3 = num3 - num4
        System.out.println(num3); //10

        num3 *= num4; // num3 = num3 * num4
        System.out.println(num3); //50

        num3 /= num4; // num3 = num3 / num4
        System.out.println(num3); //10

        num3 %= num4; // num3 = num3 % num4
        System.out.println(num3); //0


        /*
        3. 관계연산자 関係演算子
         */
        int num5 = 10;
        int num6 = 20;
        int num7 = 10;

        System.out.println(num5 > num6); // 10 > 20     //false
        System.out.println(num5 >= num7); // 10 >= 10   //true
        System.out.println(num5 < num6); // 10 < 20     //true
        System.out.println(num5 <= num6); // 10 <= 20   //true
        System.out.println(num5 == num7); // 10 == 10   //true
        System.out.println(num5 != num6); // 10 != 20   //true

        /*
        4. 논리연산자 論理演算子
         */
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        // &&는 두가지 모두 참일 경우에는 true를, 그렇지 않을 경우에는 false를 반환
        // &&は二つがすべて真である場合trueを、そうでない場合はfalseを返還
        System.out.println(a || b);
        // ||는 두가지 모두 거짓일 경우에는 false를, 그렇지 않을 경우에는 true를 반환
        // ||は二つがすべて偽りの場合にはfalseを、そうでない場合はtrueを返還
        System.out.println(!b);
        // !는 피연산자의 논리값을 바꿈. true는 false로 , false는 true로 반환
        // !は被演算子の論理値を変える。trueはfalseに、falseはtrueへ返還

        /*
        연산자 퀴즈 演算子クイズ
        문제의 출력 결과를 생각해보기
        問題の出力結果を考えてみよう
         */

        int num10 = 10;
        int num20 = 3;
        boolean bool1 = true;
        boolean bool2 = false;
        num10 += num10;
        num20 *= num10;
        System.out.println(num10); //20
        System.out.println(num20); //60
        System.out.println(bool1 && bool2); //false

    }
}
