import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek2231 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){

            int sum = 0;
            int num = i;

            while(num != 0){
                sum += num % 10;
                num = num / 10;
            }

            sum += i;

            if(sum == N){
                System.out.println(i);
                return;
            }

        }

        System.out.println(0);

    }
}
