import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek1436 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N < 7){
            if(N == 1){
                System.out.println("666");
            }else{
                System.out.println((N - 1) + "666");
            }
            return;
        }

        if( (N - 6) % 19 == 0 || (N - 6) % 19 > 10){
            int first = (N - 6) / 20 * 10;
            int second = (N - 6) % 19 - 4;
            if(second == -4){
                second = 15;
            }

            if (first == 0) {
                System.out.println(second + "666");
            }else{
                System.out.println(first + second + "666");
            }

        }else{

            int first = (N - 6) / 20;

            if (first == 0) {
                System.out.println("666" + ((N - 6) % 19 - 1));
            }else{
                System.out.println(first + "666" + ((N - 6) % 19 - 1));
            }

        }


    }
}
