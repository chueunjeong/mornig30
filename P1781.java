import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1781 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            
            //문제 수
            int N = Integer.parseInt(br.readLine()); 

            //문제 데드라인과 컵라면 개수
            for(int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String temp = st.nextToken();
                String temp2 = st.nextToken();
                System.out.println(temp+" "+temp2);
            }
        }
    }

}
