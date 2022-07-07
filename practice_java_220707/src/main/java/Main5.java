
import java.util.Iterator;

public class Main5 {
    public static void main(String[] args){
        /*
        1) 제네릭스(Generics)란?  ジェネリックス（Generics）とは？
        타입 체크를 해주는 기능          タイプチェックをしてくれる機能

        객체의 타입을 컴파일 시에 체크하기 때문에 안정성이 높아집니다
        オブジェクトのタイプをコンパイル時にチェックするため、安定性が高まります。

        - <T> == Type
        - <E> == Element
        - <K> == Key
        - <V> == Value
        - <N> == Number
        - <R> == Result
         */
    }
    public interface Collection<E> extends Iterable<E> {
        int size();
        boolean isEmpty();
        Iterator<E> iterator();  //다음 요소에 읽을 것이 있는지 체크하는 기능  次の要素に読み物があるかチェックする機能
        boolean add(E e);
        <T> T[] toArray(T[] a);
        boolean containsAll(Collection<?> c);  //물음표는 모든 타입  はてなマークはすべてのタイプ
        boolean addAll(Collection<? extends E> c);
    }

    public interface List<E> extends Collection<E> {
        // Collection 에 있는 메소드들 모두 포함  Collectionにあるメソッドをすべて含む
        // + List 에만 있는 메소드들  + Listだけにあるメソッド
        boolean add(E e);
    }


}
