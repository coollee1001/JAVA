public class Main3 {
    public static void main(String[] args){
        /*
        Title. 반복문　繰り返し処理
         */

        /*
        1. for문 for文
         */
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);    //55

        /*
        2. for-each문　for-each文
         */
        String[] days = {"1", "2", "3", "4", "5"};

        for (String day : days) {
            System.out.print(day+" ");    //1 2 3 4 5
        }
        System.out.println();
        /*
        3. while문   while文
         */

        int i = 0;
        int sum2 = 0;
        while (i < 10) {
            sum2 += i + 1;
            i += 1;
        }
        System.out.println(sum2); //55

        int i2 = 0;
        while (i2 < 10){
            if (i2==5){
                break;
            }
            i2 += 1;
        }
        System.out.println(i2); // 5

        for(int i3=0;i3<10;i3++){
            if (i3==5){
                continue;
            }
            System.out.print(i3+" "); //0 1 2 3 4 6 7 8 9
        }
        /*
        4. do-while문　do-while文
         */

        int i4 = 1;
        int result = 0;
        do {
            result += i4;
            i4 += 1;
        } while (i4 < 2);
        System.out.println(result); //1





        /*
        1) 반복문 퀴즈 1: 1부터 100까지의 합을 구하는 반복문 코드를 작성해보세요.
        1) 繰り返し処理クイズ１：1から100までの合計をさがす繰り返し処理コードを作成してみましょう。
         */

        int sum0 = 0;
        for(int j = 1; j<=100; j++){
            sum0 += j;
        }
        System.out.println(sum0); //5050

        /*
        2) 반복문 퀴즈 2: 5초부터 시작하는 카운트다운을 반복문을 사용하여 만들어보세요.
        2) 繰り返し処理クイズ：５秒から始まるカウントダウンを繰り返し処理を使って作ってみましょう。
         */
        int second = 0;
        for(int j = 5; j>=0; j--){
            System.out.print(j+" "); //5 4 3 2 1 0
        }
        System.out.println();

        /*
        3) 조건문 & 반복문 퀴즈 1: 1부터 30까지 홀수의 합과 짝수의 합을 구하고 각각 출력하는 프로그램을 만들어보세요.
        3) 条件文＆繰り返し処理クイズ１：１から３０まで奇数の合計と偶数の合計をさがしてそれぞれ出力するプログラムを作ってみましょう。
         */
        int oddSum = 0;
        int evenSum = 0;
        for(int j = 1; j<=30; j++){
            if(j%2==0) evenSum+=j;
            else oddSum+=j;
        }
        System.out.println("oddSum = "+oddSum); //225
        System.out.println("evenSum = "+evenSum); //240
    }


}
