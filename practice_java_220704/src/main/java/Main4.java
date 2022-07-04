import java.util.Arrays;

public class Main4 {
    public static void main(String[] args){
        /* Title
        Reference Type(참조 자료형) 参照型
         */

        String world = "world !!";
        System.out.println(world); //world!!

        int[] intArray = new int[] {1,2,3,4,5}; // int 배열을 선언과 동시에 초기화 int配列宣言と同時に初期化
        System.out.println(Arrays.toString(intArray)); //{1,2,3,4,5}

        int[] intEmptyArray = new int[5]; //int 배열 선언, 초기화 없을 시 기본값으로 설정 int配列宣言、初期化なかったら基本値に設定
        System.out.println(Arrays.toString(intEmptyArray)); //{0,0,0,0,0}

        String[] strEmptyArray = new String[5];//String 배열 선언, 초기화 없을 시 기본값으로 설정 String配列宣言、初期化なかったら基本値に設定
        //참조 자료형의 경우 기본값이 없기 때문에 아무것도 없다는 뜻의 null 표시 参照型の場合、基本値がないため何もないというnullを表示
        System.out.println(Arrays.toString(strEmptyArray)); //{null, null, null, null, null}

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length-1]); //겨울
    }
}
