abstract class Bird {
    private int x, y, z;

    void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");   //移動します
        this.x = x;
        this.y = y;
        if (flyable(z)) {
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다");  //その高さでは飛べません
        }
        printLocation();
    }

    abstract boolean flyable(int z);

    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");  //現在位置（x,y,z)
    }
}
class Pigeon extends Bird {
    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class Peacock extends Bird {
    @Override
    boolean flyable(int z) {
        return false;
    }
}

interface Bird2 {
    void fly(int x, int y, int z);
}

class Pigeon2 implements Bird2{
    private int x,y,z;

    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("날아갑니다."); //飛んでいきます
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }
    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");  //現在位置(x,y,z)
    }
}
public class Main5 {
    public static void main(String[] args){
        /*
        Title. 객체지향언어 추상클래스, 인터페이스
        オブジェクト指向言語抽象クラス、インターフェース
         */

        /*
        1. 추상클래스 抽象クラス
        추상클래스 :추상클래스는 추상메소드를 선언할 수 있는 클래스
        抽象クラス：抽象クラスは抽象メソッドを宣言できるクラス
         */

        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();
        System.out.println("-- 비둘기 --");        //鳩
        pigeon.fly(1, 1, 3);
        //현재위치(0,0,0)
        //이동합니다
        //현재위치(1,1,3)

        //現在位置（0,0,0）
        //移動します
        //現在位置（1,1,3）

        System.out.println("-- 공작새 --");        //クジャク
        peacock.fly(1, 1, 3);
        //현재위치(0,0,0)
        //이동합니다
        //그 높이로는 날 수 없습니다

        //現在位置（0,0,0）
        //移動します
        //その高さでは飛べません

        System.out.println("-- 비둘기 --");        //鳩
        pigeon.fly(3, 3, 30000);
        //현재위치(1,1,3)
        //이동합니다
        //그 높이로는 날 수 없습니다
        //현재위치(3,3,3)

        //現在位置（1,1,3）
        //移動します
        //その高さでは飛べません
        //現在位置（3,3,3）


        /*
        2. 인터페이스 インターフェース
        인터페이스 : 객체의 특정 행동의 특징을 정의하는 간단한 문법
        インターフェース；オブジェクトの特定行動の特賞を定義する簡単な文法
         */
        Bird2 bird = new Pigeon2();
        bird.fly(1, 2, 3);
        //현재위치(0,0,0)
        //날아갑니다
        //현재위치(1,2,3)

        //現在位置（0,0,0）
        //飛んでいきます
        //現在位置（1,2,3）


//        bird.printLocation(); // compile error


        /*
        인터페이스 vs 추상클래스  インターフェースvs抽象クラス
        ・인터페이스
        1)구현하려는 객체의 동작의 명세
        2)다중 상속 가능
        3)implements를 이용하여 구현
        4)메소드 시그니처(이름, 파라미터, 리턴 타입)에 대한 선언만 가능
        ・추상클래스
        1)클래스를 상속받아 이용 및 확장을 위함
        2)다중 상속 불가능 , 단일 상속
        3)extends를 이용하여 구현
        4)추상메소드에 대한 구현 가능

        ・インターフェース
        1)具現しようとするオブジェクトの動作の明細
        2)多重継承可能
        3)implementsを使って具現
        4)メソッドシグネチャー（名前、パラメータ、リターンタイプ）に対する宣言のみ可能
        ・抽象クラス
        1)クラスを継承されて利用および拡張のため
        2)多重継承不能、単位継承
        3)extendsを利用して具現
        4)抽象メソッドに対する具現可能
         */

    }
}
