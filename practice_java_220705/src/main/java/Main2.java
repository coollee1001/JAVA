import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        /*
        Title. 조건문 条件文
         */

        /*
        1. if문 if文
         */
        int check = 100;
        int num1 = 150;
        if (num1 > check) {
            System.out.println("100보다 큰 수입니다"); //100より大きい数です。　
        }

        int num2 = 50;
        if (num1 > 100) {
            System.out.println("100보다 큰 수입니다"); //100より大きい数です。
        } else if(num1 > num2){
            System.out.println("50보다 보다 큰 수입니다. 100보다 작거나 같습니다");   //50より大きい数です。100より小さいか同じです。
        }

        /*
        2. switch문 switch文
         */

        char score = 'A';
        switch (score) {
            case 'A':
                System.out.println("A등급입니다.");  //A級です。
                break;
            case 'B':
                System.out.println("B등급입니다.");  //B級です。
                break;
            case 'C':
                System.out.println("C등급입니다.");  //C級です。
                break;
            default:
                System.out.println("C등급보다 낮은 등급입니다.");  //C級より低い級です。
                break;
        }

        /*
        3. 삼항연산자 三項演算子
         */
        int a = 5;

        String reuslt = (a < 10) ? "10보다 작습니다." : "10보다 큽니다.";  //10より小さいです。：10より大きいです。
        System.out.println(reuslt); //10より小さいです


        /*
        조건문 퀴즈 1: 입력받은 점수가 무슨 등급인지 출력해보세요.
        (100~91점 : A등급 , 90점~81점 : B등급 , 80점~71점 : C등급 , 그 외의 점수 : F등급)
        条件文クイズ１：入力された点数がどのような級なのかを出力してみましょう。
        （100～91点：A級、90～81点：B級、80～71点：C級、その以外の点数：F級）
         */

        Scanner sc = new Scanner(System.in);
        int scoreIn = sc.nextInt();
        String result = (90 < scoreIn)? "A" : (80<scoreIn)? "B" : (70<scoreIn)? "C" : "F";
        System.out.println(result);

    }
}
