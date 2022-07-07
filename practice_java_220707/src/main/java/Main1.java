import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main1 {
    public static void main(String[] args) {
        /*예외처리란(Exception, Error Handling) 例外処理とは
            목적 目的
            1) 예외의 발생으로 인한 실행 중인 프로그램의 비정상 종료를 막기 위해서
            2) 개발자에게 알려서 코드를 보완할 수 있도록 하게 위해서

            1) 例外の発生による実行中のプログラムの異常終了を防ぐため、
            2) 開発者に知らせてコードを補完できるようにするために
        */

        // 1. try-catch(-finally) 형식 try-catch(-finally) 形式
        /*
        try {
            // 예외가 발생할 가능성이 있는 코드를 구현합니다.
            // 例外が発生する可能性のあるコードを実装します
        } catch (FileNotFoundException e) {
            // FileNotFoundException이 발생했을 경우,이를 처리하기 위한 코드를 구현합니다
            // FileNotFoundExceptionが発生した場合、これを処理するためのコードを実装します。
        } catch (IOException e) {
            // FileNotFoundException이 아닌 IOException이 발생했을 경우,이를 처리하기 위한 코드를 구현합니다.
            // FileNotFoundExceptionではなく、IOExceptionが発生した場合、これを処理するためのコードを実装します。
        } finally {
            // 예외의 발생여부에 관계없이 항상 수행되어야하는 코드를 구현합니다.
            // 例外の発生有無にかかわらず、常に遂行されなければならないコードを具現します。
        }
        */

        int number = 10;
        int result;

        for (int i = 10; i >= 0; i--) {
            try {
                result = number / i;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception발생: " + e.getMessage());  //Exception発生
            } finally {
                System.out.println("항상 실행되는 finally 구문");   //いつも実行されるfinally構文
            }
        }

        /*
        1
        항상 실행되는 finally 구문
        1
        항상 실행되는 finally 구문
        1
        항상 실행되는 finally 구문
        1
        항상 실행되는 finally 구문
        1
        항상 실행되는 finally 구문
        2
        항상 실행되는 finally 구문
        2
        항상 실행되는 finally 구문
        3
        항상 실행되는 finally 구문
        5
        항상 실행되는 finally 구문
        10
        항상 실행되는 finally 구문
        Exception발생: / by zero
        항상 실행되는 finally 구문

                1
        いつも実行されるfinally構文
        1
        いつも実行されるfinally構文
        1
        いつも実行されるfinally構文
        1
        いつも実行されるfinally構文
        1
        いつも実行されるfinally構文
        2
        いつも実行されるfinally構文
        2
        いつも実行されるfinally構文
        3
        いつも実行されるfinally構文
        5
        いつも実行されるfinally構文
        10
        いつも実行されるfinally構文
        Exception発生: / by zero
        いつも実行されるfinally構文
         */


        /*

        2.  try-with-resource 형식  try-with-resource 形式
        try문을 벗어나는 순간 자동적으로 close()가 호출
        try文を離れた瞬間、自動的にclose()が呼び出す

         */

        try (FileOutputStream out = new FileOutputStream("test.txt")) {
            // test.txt file,  Hi World 를 출력  Hi Worldを出力
            out.write("Hi World".getBytes());
            out.flush(); //practice_java_220707\test.txt
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        일반 try catch문을 사용했다면 코드가 길어질 뿐만 아니라 FileOutputStream 을 열고 닫을때 생기는 Exception 까지 그 상위에서 catch를 하거나 throws로 감싸줘야한다
        一般のtry-catch文を使用すると、コードが長くなるだけでなく、FileOutputStreamを開閉する時に生じるExceptionまでその上位でcatchするかthrowsで包み込まなければならない。
         */

        /*
        throws 키워드가 있는 함수를 호출한다면, caller 쪽에서 catch와 관련된 코드를 작성해주어야 한다
        throwsキーワードのある関数を呼び出すなら、caller側からcatchに関するコードを作成する必要がある
         */

        try {
            practice p = new practice();
            p.method();
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }


    }

    /*
    3. 메소드에서의 예외 선언 メソッドでの例外宣言
    catch문을 이용해서 예외처리를 하지 않은 경우, 메소드에 throws로 예외가 발생할 수 있다는 것을 알려주어야 한다
    catch文を利用して例外処理をしていない場合、メソッドにthrowsで例外が発生する可能性があることを知らせる必要がある
     */
    static class practice {
        public void method() throws IndexOutOfBoundsException, IllegalArgumentException {
            //메소드의 내용
        }
    }
}
