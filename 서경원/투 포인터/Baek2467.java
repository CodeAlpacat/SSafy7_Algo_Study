import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2467 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = N - 1;
        int min_al = arr[s];
        int min_san = arr[e];

        while( s < e) {

            if(Math.abs(min_al + min_san) > Math.abs(arr[s] + arr[e])){
                min_al = arr[s];
                min_san = arr[e];
            }

            if(arr[s] + arr[e] < 0){
                s++;
            }else{
                e--;
            }

        }

        System.out.println(min_al + " " + min_san);

    }
}
