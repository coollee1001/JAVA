import retrofit2.Call;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args){
        /*
        네트워킹(Networking)  ネットワーキング(Networking)
            두 대이상의 컴퓨터를 케이블 또는 인터넷으로 연결하여 네트워크를 구성하는 것
            二台以上のコンピュータをケーブル又はインターネットで接続してネットワークを構成すること
         */

        /*
        클라이언트(Client) / 서버(Server) (컴퓨터간의 관계를 역할로 구분)
            - 서버 : 서비스를 제공하는 컴퓨터, 요청에 응답하는 컴퓨터
            - 클라이언트 : 서비스를 사용하게 되는 컴퓨터, 요청을 하는 컴퓨터
        クライアント(Client)/サーバ(Server)(コンピュータ間の関係を役割に区分)
            - サーバー:サービスを提供するパソコン、リクエストに答えるパソコン
            - クライアント:サービスを使用するコンピュータ、要求するコンピュータ
         */

        /*
        IP address
            컴퓨터를 구별하는데 사용된느 고유한 값으로 인터넷에 연결이 되어있는 모든 컴퓨터는 IP 주소를 갖습니다.
            コンピュータを区別するのに使用された固有の値で、インターネットに接続されている全てのコンピュータはIPアドレスを持ちます。
         */

        /*
        URL(Uniform Resource Locator)
            URL은 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접근할 수 있는 주소를 표현하기 위한 것
            URLはインターネットに存在する複数のサーバが提供するリソースにアクセスできるアドレスを表現するためのもの。
        API(Application Programming Interface)
            응용 프로그램에서 사용할 수 있도록 운영체제나 프로그래밍 언어가 제공하는 기능을 제어 할 수 있게 해주는 인터페이스를 의미
            アプリケーションで使用できるようにオペレーティングシステムやプログラミング言語が提供する機能を制御できるようにするインターフェースを意味する。
         */

        /*
        Retrofit 라이브러리를 활용하여 API 호출하기  Retrofitライブラリーを活用してAPIを呼び出す
            Retrofit 라이브러리를 사용하게 될 경우 복잡한 구현들을 감소
            Retrofitライブラリーを使用する場合、複雑な実装を減少

                * reqres.in  LIST USERS  Request  :: https://reqres.in/api/users?page=2
         */

        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2);
        //Call은 retrofit라이브러리의 인터페이스이며 서버에서 응답하는 값을 담는 역할을 합니다.
        //Callはretrofitライブラリのインターフェースであり、サーバーから応答する値を入れる役割をします。
        try {
            System.out.println(retrofitTest.execute().body());
            //서버에서 받은 데이터를 확인해보겠습니다.
            //サーバーで受信したデータを確認してみます。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
