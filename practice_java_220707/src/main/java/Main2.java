import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main2 {
    public static void main(String[] args) {
        /*
        Java에서의 날짜와 시간  Javaでの日にちと時間
         */
        System.out.println("now()를 활용하여 생성"); //now()を活用して生成
        LocalDate date = LocalDate.now(); //2022-07-07
        LocalTime time = LocalTime.now(); //11:52:35.726
        LocalDateTime dateTime = LocalDateTime.now(); //2022-07-07T11:52:35.726

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of()를 활용하여 생성");  //of()を活用して生成
        LocalDate newDate = LocalDate.of(2021, 03, 29); //2021-03-29
        LocalTime newTime = LocalTime.of(22, 50, 55); //22:50:55

        System.out.println(newDate);
        System.out.println(newTime);

        /*
         날짜와 시간의 형식 수정  日付と時間の形式修正
         */

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shortFormat = formatter.format(LocalTime.now());
        System.out.println(shortFormat); //오전 11:54

        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String myDate = newFormatter.format(LocalDate.now());
        System.out.println(myDate); //2022/07/07

        /*
        날짜와 시간의 차이 계산  日付と時間の差計算
         */

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2021, 8, 9);
        Period period = Period.between(today, birthday);
        System.out.println(period.getMonths());  //-10
        System.out.println(period.getDays());  //-29

        System.out.println();

        /*
        오늘의 날짜와 시간을 [연도/월/일 시간/일자]의 형식으로 값으로 출력해보세요.
         */

        DateTimeFormatter dateFormatNow = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String now = dateFormatNow.format(LocalDateTime.now());
        System.out.println("["+now+"]"); //[2022/07/07 12:01:35]
    }

}
