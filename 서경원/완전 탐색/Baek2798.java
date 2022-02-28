import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2798 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = i + 2; k < N; k++){
                    if(i == j || i == k || j == k){
                        continue;
                    }
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum > result && sum <= M){
                        result = sum;
                        if(sum == M){
                            System.out.println(result);
                            return;
                        }
                    }

                }
            }

        }

        System.out.println(result);

    }
}
