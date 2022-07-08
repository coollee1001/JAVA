import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args){
        /*
        '이'씨 성을 가진 사람들의 수를 세볼려고 합니다. 스트림을 활용해서 코드를 만들어보세요!
        이름 : ["김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수"]

        'イ'氏姓を持った人々の数を数えてみようと思います。 ストリームを活用してコードを作ってみてください！
        名前:[『キム·ジョンウ』『キム·ホジョン』『イ·ハヌル』『イ·ジョンヒ』『パク·ジョンウ』『パク·ジヒョン』『チョン·ウソク』『イ·ジス』]
         */

        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        Stream<String> arr =names.stream();
        long count = arr.filter(str->str.startsWith("이")).count();

        System.out.println("count : "+count);

        /*
        count : 3
         */

    }
}
