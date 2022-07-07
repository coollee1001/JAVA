import java.util.*;

public class Main3 {
    public static void main(String[] args){
        /*
        컬렉션 コレクション
        1. List : 순서가 있는 데이터의 집합이며 데이터의 중복을 허용합니다.
        → ArrayList, LinkedList, Stack 등
        2. Set : 순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않습니다.
        → HashSet, TreeSet 등
        3. Map : 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합입니다. 순서는 유지되지 않으며 키는 중복을 허용되지 않고 값은 중복을 허용합니다.
        → HashMap, TreeMap 등
        4. Stack : 마지막에 넣은 데이터를 먼저 꺼내는 자료구조입니다. LIFO(Last In First Out)
        → Stack, ArrayDeque 등
        5. Queue : 먼저 넣은 데이터를 먼저 꺼내는 자료구조입니다. FIFO(First In First Out)
        → Queue, ArrayDeque 등

        1.List:順序のあるデータの集合であり、データの重複を許可します。
        → ArrayList、LinkedList、Stackなど
        2.Set:順序を維持しないデータの集合であり、データの重複を許可しません。
        → HashSet、TreeSetなど
        3.Map:鍵(key)と値(value)のペアからなるデータの集合です。 順序は維持されず、鍵の重複は許されず、値は重複を許容します。
        → HashMap、TreeMapなど
        4.Stack:最後に入れたデータを先に取り出す資料構造です。 LIFO(Last In First Out)
        → Stack、ArrayDequeなど
        5.Queue:先に入れたデータを先に取り出す資料構造です。 FIFO(First In First Out)
        → Queue、ArrayDequeなど
         */

        /*
        컬렉션 - 리스트, 셋, 맵 　　コレクション-List,Set,Map
         */

        /*
        1. List
        순서가 있는 나열된 데이터를 표현    順序のある羅列データを表現
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(10); // ArrayList에 값 한개씩 입력  ArrayListに値を1つずつ入力
        System.out.println(list); // [1,5,4,11,10]

        Collections.sort(list); // list 정렬  リスト整列
        System.out.println(list); // [1,4,5,10,11]

        System.out.println(list.size()); // arrayList의 크기 출력  arrayListのサイズ出力  // 5

        list.remove(4); // 인덱스를 활용하여 해당하는 값 제거  インデックスを活用して該当する値を除去
        System.out.println(list);  //[1,4,5,10]

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // get을 이용하여 값 1개씩 출력  getを利用して値を1個ずつ出力
            //1
            //4
            //5
            //10
        }
        for (int current : list) {
            System.out.println(current);
            //1
            //4
            //5
            //10
        }


                /*
        2. Set
        순서를 유지하지 않는 데이터의 집합이며 데이터의 중복을 허용하지 않습니다.    順序を維持しないデータの集合であり、データの重複を許可しません。
         */
        Set<Integer> integerSet = new HashSet<>();
        // Collection의 자료형에는 primitive 타입은 올 수 없습니다. primitive 타입에 해당하는 class 가 존재하니 그것을 사용하세요.
        // Collectionの資料型にはprimitiveタイプは来られません。 primitiveタイプに該当するclassが存在するので、それを使用してください。
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);// 하나씩 값을 삽입합니다. 1つずつ値を挿入します。
        System.out.println(integerSet); //[1, 2, 3, 9]
        // 출력을 해보면 순서가 지켜지지 않는 것을 알 수 있습니다.
        //  出力をしてみると順序が守られていないことが分かります。

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("New York");
        stringSet.add("LasVegas");
        stringSet.add("San Francisco");
        stringSet.add("Seoul");
        System.out.println(stringSet);  //[San Francisco, New York, LasVegas, LA, Seoul]

        stringSet.remove("Seoul");
        //Seoul을 HashSet에서 제거해보겠습니다.  SeoulをHashSetから除去してみます。
        System.out.println(stringSet);  //[San Francisco, New York, LasVegas, LA]

        ArrayList<String> target = new ArrayList<String>();
        target.add("New York");
        target.add("LasVegas");
        //제거할 항목을 ArrayList에 삽입하겠습니다.  削除する項目をArrayListに挿入します。
        stringSet.removeAll(target);//제거항목에 삽입된 도시들을 삭제하겠습니다.  削除項目に挿入された都市を削除します。
        System.out.println(stringSet);  //[San Francisco, LA]

        System.out.println("LA가 포함되어있나요? " + stringSet.contains("LA"));
        //LA가 포함되어있나요? true  LAが含まれていますか。 true

        System.out.println("LasVegas가 포함되어있나요? " + stringSet.contains("LasVegas"));
        //LasVegas가 HashSet에 포함되어있으면 true를, 그렇지 않으면 false를 반환합니다.
        // LasVegasがHashSetに含まれていればtrueを、そうでなければfalseを返します。
        //LasVegas가 포함되어있나요? false  LasVegasが含まれていますか？ false

        System.out.println("현재 HashSet의 크기는 : " + stringSet.size() + "입니다."); //현재 HashSet의 크기는 : 2입니다.  現在のHashSetのサイズは:2です。
        //HashSet의 크기를 반환합니다.  HashSetのサイズを返します。

        stringSet.clear();//HashSet의 모든 아이템들을 삭제합니다.  HashSetのすべてのアイテムを削除します。
        System.out.println(stringSet);  //[]



        /*
        3. Map
        키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합입니다. 순서는 유지되지 않으며 키는 중복을 허용되지 않고 값은 중복을 허용합니다.
        鍵(key)と値(value)のペアからなるデータの集合です。 順序は維持されず、鍵の重複は許されず、値は重複を許容します。
         */

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "berry");
        map.put(3, "cherry");

        System.out.println(map);  //{1=apple, 2=berry, 3=cherry}

        System.out.println("1st in map: " + map.get(1));  //1st in map: apple

        map.remove(2);
        System.out.println(map);  //{1=apple, 3=cherry}
        System.out.println(map.containsKey(2));  //false
        System.out.println(map.containsValue("cherry"));  //true

        map.clear();
        System.out.println(map);  //{}
    }
}
