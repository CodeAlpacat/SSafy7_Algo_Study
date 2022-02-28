import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2003 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n + 1];

        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = 0;
        int count = 0;
        int sum = arr[0];

        while(e < n){
            if(sum == m){
                count++;
                e++;
                sum += arr[e];
            }else if(sum < m){
                e ++;
                sum += arr[e];
            }else{
                sum -= arr[s];
                s ++;
            }

        }

        System.out.println(count);
    }
}
