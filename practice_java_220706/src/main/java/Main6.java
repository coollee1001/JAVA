public class Main6 {
    public static void main(String[] args){
        /*
        Title. 객체지향 퀴즈 オブジェクトクイズ
        객체지향에서 배운 개념과 문법을 이용해서 다음 요구조건을 만족하는 클래스를 작성
        [요구사항]
        1. 사람은 자식, 부모님, 조부모님이 있다.
        2. 모든 사람은 이름, 나이, 현재 장소정보(x,y좌표)가 있다.
        3. 모든 사람은 걸을 수 있다. 장소(x, y좌표)로 이동한다.
        4. 자식과 부모님은 뛸 수 있다. 장소(x, y좌표)로 이동한다.
        5. 조부모님의 기본속도는 1이다. 부모의 기본속도는 3, 자식의 기본속도는 5이다.
        6. 뛸때는 속도가 기본속도대비 +2 빠르다.
        7. 수영할때는 속도가 기본속도대비 +1 빠르다.
        8. 자식만 수영을 할 수 있다. 장소(x, y좌표)로 이동한다.

        위 요구사항을 만족하는 클래스들을 바탕으로, Main 함수를 다음 동작을 출력(`System.out.println`)하며 실행하도록 작성하시오. 이동하는 동작은 각자 순서가 맞아야 한다

        1. 모든 종류의 사람의 인스턴스는 1개씩 생성한다.
        2. 모든 사람의 처음 위치는 x,y 좌표가 (0,0)이다.
        3. 모든 사람의 이름, 나이, 속도, 현재위치를 확인한다.
        4. 걸을 수 있는 모든 사람이 (1, 1) 위치로 걷는다.
        5. 뛸 수 있는 모든 사람은 (2,2) 위치로 뛰어간다.
        6. 수영할 수 있는 모든 사람은 (3, -1)위치로 수영해서 간다.

        オブジェクト指向で学んだ概念と文法を利用して次の要求条件を満たすクラスを作成
        [要求事項]
        1.人は子供、両親、祖父母がいる。
        2.すべての人は名前、年齢、現在の場所情報(x、y座標)がある。
        3.「すべての人は歩ける。 場所(x、y座標)に移動する。
        4.子どもと両親は走ることができる。 場所(x、y座標)に移動する。
        5。祖父母の基本速度は1だ。 親の基本速度は3、子どもの基本速度は5だ。
        6。走る時は速度が基本速度対比+2速い。
        7。泳ぐ時は速度が基本速度対比+1速い。
        8。子供だけが泳げる。 場所(x、y座標)に移動する。

        上記の要求事項を満たすクラスをもとに、Main関数を次の動作を出力(「System.out.println」)して実行するように作成しなさい。 移動する動作は各自の順序が合わなければならない

        1.すべての種類の人のインスタンスは1つずつ生成する。
        2.すべての人の最初の位置はx、y座標が(0,0)だ。
        3.すべての人の名前、年齢、速度、現在の位置を確認する。
        4.歩けるすべての人が(1、1)位置に歩く。
        5。走れるすべての人は（2、2）位置に走る。
        6。泳げるすべての人は(3,-1)位置に泳いで行く。
         */

        Human grandParent = new GrandParent("할아버지", 70); //祖父
        Human parent = new Parent("엄마", 50);    //母
        Human child = new Child("나", 20);       //私

        Human[] humans = { grandParent, parent, child };
        for (Human human : humans) {
            System.out.println(human.name + ", 나이: " + human.age + ", 속도: " + human.speed + ", 장소: " + human
                    .getLocation());
        }

        /*
        할아버지, 나이: 70, 속도: 1, 장소: (0, 0)
        엄마, 나이: 50, 속도: 3, 장소: (0, 0)
        나, 나이: 20, 속도: 5, 장소: (0, 0)

        祖父、年齢：70、速度；1、場所（0,0）
        母、年齢：50、速度；3、場所（0,0）
        私、年齢：20、速度；5、場所（0,0）
         */

        System.out.println("<활동 시작>");
        //<활동 시작>
        //<活動開始>

        for (Human human : humans) {
            if (human instanceof Walkable) {
                ((Walkable) human).walk(1, 1);
                System.out.println(" - - - - - - ");
            }
            if (human instanceof Runnable) {
                ((Runnable) human).run(2, 2);
                System.out.println(" - - - - - - ");
            }
            if (human instanceof Swimmable) {
                ((Swimmable) human).swim(3, -1);
                System.out.println(" - - - - - - ");
            }
        }

        /*
        My name is 할아버지. 70 aged.  My name is 祖父. 70 aged.
        walk speed: 1
        Walked to (1, 1)
        My name is 엄마. 50 aged.    My name is 母. 50 aged.
        walk speed: 3
        Walked to (1, 1)
        My name is 엄마. 50 aged.    My name is 母. 50 aged.
        run speed: 5
        Ran to (2, 2)
        My name is 나. 20 aged.      My name is 私. 20 aged.
        walk speed: 5
        Walked to (1, 1)
        My name is 나. 20 aged.      My name is 私. 20 aged.
        run speed: 7
        Ran to (2, 2)
        My name is 나. 20 aged.      My name is 私. 20 aged.
        swimming speed: 6
        Swum to (3, -1)
         */

    }

}
