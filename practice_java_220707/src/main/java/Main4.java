import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args){
        /*
        4. 스택
        마지막에 넣은 데이터를 먼저 꺼내는 자료구조입니다. LIFO(Last In First Out)
        最後に入れたデータを先に取り出す資料構造です。 LIFO(Last In First Out)
         */

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack); // Stack을 출력합니다 Stackを出力します。   [1, 3, 5, 7]

        System.out.println(stack.peek()); // Stack의 가장 상단 값을 출력합니다.(삭제는 하지 않습니다.)   Stackの一番上の値を出力します。(削除はしません。)   7
        stack.pop(); // Stack의 가장 상단 값을 제거합니다.  Stackの一番上の値を削除します。
        System.out.println(stack);  //[1, 3, 5]
        System.out.println(stack.size()); // Stack의 크기를 반환합니다.  Stackのサイズを返します。  3
        System.out.println(stack.contains(1)); //true
        // Stack에 1이라는 값이 있으면 true를, 그렇지 않으면 false를 반환합니다.  Stackに1という値があればtrueを、そうでなければfalseを返します。
        System.out.println(stack.empty()); //  false
        //  Stack이 비어있으면 true를, 그렇지 않으면 false를 반환합니다.  Stackが空いていればtrueを、そうでなければfalseを返します。
        System.out.println(stack);  //[1, 3, 5]


        /*
        5. 큐 Queue
        먼저 넣은 데이터를 먼저 꺼내는 자료구조입니다. FIFO(First In First Out)
        先に入れたデータを先に取り出す資料構造です。 FIFO(First In First Out)
         */

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);//Queue에 값 삽입합니다.  Queueに値を挿入します。
        System.out.println(queue);// [1, 3, 5]
        System.out.println(queue.poll()); //1
        // Queue에서 객체를 꺼내서 반환합니다.  Queueからオブジェクトを取り出して返します。
        queue.add(7);
        queue.add(11);
        queue.add(9);
        System.out.println(queue);  //[3, 5, 7, 11, 9]
        System.out.println(queue.peek()); // 3
        // Queue에서 삭제 없이 요소를 반환합니다.  Queueで削除せずに要素を返します。
        System.out.println(queue); //[3, 5, 7, 11, 9]


        /*
        6. ArrayDeque
        deque의 경우 양 끝에서 삽입과 반환이 가능
        dequeの場合、両端から挿入·返却が可能
         */

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(); // ArrayDeque를 이용한 선언(제네릭스 이용)  ArrayDequeを利用した宣言(ジェネリックス利用)
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4); // arrayDeque의 앞에 값을 삽입  arrayDequeの前に値を挿入
        System.out.println(arrayDeque);  //[4, 3, 2, 1]

        arrayDeque.addLast(0); // arrayDeque의 끝에 값을 삽입  arrayDequeの端に値を挿入
        System.out.println(arrayDeque);  //[4, 3, 2, 1, 0]

        arrayDeque.offerFirst(10);
        // addFirst와 비슷하지만 큐의 크기 문제가 생길 때, offerFirst는 false를,　addFrist는 exception을 반환
        //　addFirstと似ているがキューの大きさの問題が生じるとき、offerFirstはfalseを、addFristはexceptionを返上
        System.out.println(arrayDeque); //[10, 4, 3, 2, 1, 0]

        arrayDeque.offerLast(-1); // arrayDeque의 끝에 값을 삽입  arrayDequeの端に値を挿入
        System.out.println(arrayDeque);  //[10, 4, 3, 2, 1, 0, -1]
        System.out.println(arrayDeque.size()); // 7


        System.out.println(arrayDeque.removeFirst()); // 첫번째 값을 제거하면서 그 값을 리턴  最初の値を除去しながらその値をリターン  //10
        System.out.println(arrayDeque.removeLast()); // 마지막 값을 제거하면서 그 값을 리턴  最後の値を除去しながら、その値をリターン。 //-1
        System.out.println(arrayDeque);  //[4, 3, 2, 1, 0]
        System.out.println(arrayDeque.size()); // 5

        System.out.println(arrayDeque.pollFirst()); // 첫번째 값을 반환 및 제거하면서 그 값을 리턴  最初の値を返上·除去しながら、その値をリターン  4
        System.out.println(arrayDeque); //[3, 2, 1, 0]
        System.out.println(arrayDeque.size()); // 4

        System.out.println(arrayDeque.pollLast()); // 마지막 값을 반환 및 제거하면서 그 값을 리턴  最後の値を返上·除去しながら、その値をリターン  //0
        System.out.println(arrayDeque);//[3, 2, 1]
        System.out.println(arrayDeque.size()); // 3

        System.out.println(arrayDeque.peekFirst()); // 첫번째 값을 반환, 제거하지 않음  最初の値を返却、削除しない。  //3
        System.out.println(arrayDeque.peekLast()); // 마지막 값을 반환, 제거하지 않음  最後の値を返却、削除しない。 //1
        System.out.println(arrayDeque.size()); // 3
    }
}
