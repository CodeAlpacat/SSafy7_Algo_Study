import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2559 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for(int test_case = 0; test_case < n; test_case++){
            arr[test_case] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n - k + 1; i++){
            int sum = 0;
            for(int j = 0; j < k; j++){
                sum = sum + arr[i + j];
            }

            if(sum > max){
                max = sum;
            }
        }

        System.out.println(max);
    }
}
