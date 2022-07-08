import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        /*
        1. 람다
         람다식(Lambda expression)이란?  ラムダ式(Lambdaexpression)とは？
         "식별자 없이 실행 가능한 함수"
         「識別子なしで実行可能な関数」
         */

        /*
        람다식의 형식  ラムダ式の形式
         */

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("korea", "japan", "china", "france", "england"));
        Stream<String> stream = strList.stream();
        stream.map(str -> str.toUpperCase()).forEach(System.out::println);

        /*
        3) 이중 콜론 연산자(::)  二重コロン演算子(::)
        매개변수를 중복해서 사용하고 싶지 않을 때
        媒介変数を重複して使用したくないとき
         */
        List<String> cities = Arrays.asList("Seoul", "Busan", "Sokcho", "Soowon", "Deagu");
        cities.forEach(System.out::println);

    }
}
