class Calculation{
    int[] arr = {0,1,2,3,4};
    public int divide(int denomintorIndex, int numeratorIndex) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        return arr[denomintorIndex]/arr[numeratorIndex];
    }
}

public class Main1_Q {
    public static void main(String[] args){
        /*
        예외, 에러 처리 퀴즈 例外、エラー処理クイズ
        1. throws 키워드를 통해서 divide() 함수에서 발생할 수 있는 exception의 종류가 무엇인지 알게 해주세요.
        2. Main 함수에서 try-catch 문을 이용해서, 다음 동작을 구현하세요.
            a. ArithmeticException이 발생할 때는 잘못된 계산임을 알리는 문구를 출력하세요.
            b. ArrayIndexOutOfBoundsException이 발생할 때는 현재 배열의 index범위를 알려주는 문구를 출력하세요.

        1.throwsキーワードを通じてdivide()関数で発生しうるexceptionの種類が何なのか教えてください。
        2.Main関数でtry-catchのドアを利用して、次の動作を実行してください。
            a。ArithmeticExceptionが発生するときは、誤った計算であることを知らせる文句を出力してください。
            b。ArrayIndexOutOfBoundsExceptionが発生するときは、現在の配列のindex範囲を知らせるフレーズを出力してください。
         */
        Calculation calc = new Calculation();
        try{
            System.out.println("2/1="+calc.divide(2,1));
            System.out.println("1/0="+calc.divide(1,0)); //java.lang.ArithmeticException: "/ by zero"
        }catch (ArithmeticException e){
            System.out.println("잘못된 계산입니다. : " + e.getMessage());
            //잘못된 계산입니다. : / by zero
            //誤った計算です。：/ by zero
        }finally {
            System.out.println("done");
        }
        try{
            System.out.println("Try to divide using out of index element = "
                    + calc.divide(5, 0)); //// java.lang.ArrayIndexOutOfBoundsException: 5
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위가 벗어났습니다. 인덱스 범위는 0~"+(calc.arr.length-1)+"까지 입니다");
            // 인덱스 범위가 벗어났습니다. 인덱스 범위는 0~4까지 입니다
            // インデックス範囲が外れてます。インデックス範囲は0～4までです
        }finally {
            System.out.println("done");
        }
    }
}
