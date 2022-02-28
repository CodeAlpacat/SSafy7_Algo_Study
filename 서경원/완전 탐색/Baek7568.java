import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek7568 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] rank = new int[N];
        int[] weight = new int[N];
        int[] height = new int[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < N; j++){
              if(i != j ){
                if(weight[i] < weight[j] && height[i] < height[j]){
                    count++;
                }
              }
            }

            rank[i] = count;
        }

        for(int i : rank){
            sb.append((1 + i) + " ");
        }

        System.out.print(sb);
        br.close();
    }
}
