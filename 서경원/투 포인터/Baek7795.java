import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek7795 {//1
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 0; test_case < T; test_case++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());   //A의 개수
            int M = Integer.parseInt(st.nextToken());   //B의 개수

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < N; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < M; j++){
                B[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(B);

            int count = 0;
            int s = 0;
            int e = M - 1;

            while(s < N){

                if(A[s] > B[e]){
                    count += e + 1;
                    e = M - 1;
                    s++;
                    continue;
                }

                e--;

                if(e < 0){
                    s++;
                    e = M - 1;
                    continue;
                }
            }
/*
            for(int i = 0; i < N; i++){
                for(int j = M - 1; j >= 0; j--){
                    if(A[i] > B[j]){
                        count += j + 1;
                        break;
                    }
                }
            }*/

            sb.append(count + "\n");

        }

        System.out.print(sb);
        br.close();

    }
}
