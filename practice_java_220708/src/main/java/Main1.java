import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}
public class Main1 {
    public static void main(String[] args){
        /*
        스트림(stream)이란?  ストリーム(stream)とは？
        컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자
        コレクションの保存要素を一つずつ参照してラムダ式に処理できるようにする反復子
         */

        /*
        1) 스트림의 특징  ストリームの特徴
        - 스트림은 데이터 소스를 변경하지 않습니다.
        - 스트림은 작업을 내부적으로 반복 처리합니다.
        - 스트림은 컬렉션의 요소를 모두 읽고 나면 닫혀서 재사용이 불가능합니다. 그러므로 필요할 경우 재생성을 해야합니다.

        - ストリームはデータソースを変更しません。
        - ストリームはジョブを内部的に繰り返し処理します。
        - ストリームはコレクションの要素をすべて読み終えると閉じられて再利用することができません。 そのため、必要に応じて再生成する必要があります。
         */

        /*
        2) 스트림의 구조 ストリームの構造
         1))스트림 생성  ストリーム生成   Stream<T> Collection.stream()
         2))중간 연산  中間演算
           map(변환) / sorted(정렬) / skip(스트림 자르기) / limit(스트림 자르기) 등
           map(変換)/sorted(整列)/skip(ストリーム切り)/limit(ストリーム切り)など
         3))최종 연산  最終演算
           스트림의 요소를 소모해서 결과를 반환하는 단계입니다.
           최종 연산 이후에는 스트림이 닫히게 되고 더 이상 사용할 수 없습니다.
           ストリーム要素を消耗して結果を返す段階
           最終演算以降はストリームが閉じられ、これ以上使用できません。
         */

        /*
        Ex1.  기본 구조  基本構造
         */
        List<String> list = new ArrayList<>();
        list.add("Seoul");
        list.add("Busal");
        list.add("Sokcho");
        list.add("Seoul");

        System.out.println(list);
        //[Seoul, Busal, Sokcho, Seoul]

        List<String> result = list.stream() // 스트림 생성  ストリーム生成
                .limit(2) //중간 연산  中間演算
                .collect(Collectors.toList()); // 최종 연산  最終演算  : 어떤요소를 리턴할 것인가  どんな要素をリターンするのか

        System.out.println(result);
        //[Seoul, Busal]

        System.out.println("list -> transformation -> set");
        //list -> transformation -> set

        Set<String> set = list.stream()
                .filter("Seoul"::equals)  //same Seoul
                .collect(Collectors.toSet());  //return to type is Set

        set.forEach(System.out::println);
        //Seoul

        System.out.println("--------------------------");

        /*
        Ex. Change to Array → Steam
         */
        String[] arr = {"Math", "Korean",
                "Society", "Science"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(className -> System.out.println("Class : " + className));
        /*
        Class : Math
        Class : Korean
        Class : Society
        Class : Science
         */
        System.out.println();

        System.out.println("--------------------------");

        /*
        Ex. Utilize map operations
         */
        List<Sale> saleList = Arrays.asList(
                new Sale("Apple", 5000, 0.05f),
                new Sale("Grape", 3000, 0.1f),
                new Sale("Orange", 4000, 0.2f),
                new Sale("Tangerine", 2000, 0)
        );

        Stream<Sale> saleStream = saleList.stream();
        saleStream.map(sale -> Pair.of(sale.fruitName, sale.price * (1 - sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " Price:  " + pair.getRight() + "Won "));
        /*
        Apple Price:  4750.0Won
        Grape Price:  2700.0Won
        Orange Price:  3200.0Won
        Tangerine Price:  2000.0Won
         */

        System.out.println("--------------------------");

        /*
        Ex. Calculation using reduce

        reduce :
        원소들을 하나씩 소모해가며, 누적 계산을 수행하고 결과값을 리턴하는 메서드
        元素を一つずつ消耗しながら、累積計算を行い、結果値をリターンするメソッド
         */

        List<Integer> numArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer result2 = numArr.stream().reduce(0, Integer::sum);
        //You add 1 to 10 using reduce and sum.
        System.out.println(result2);

    }
}
