import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2116 {//1

    public static int N;
    public static int[] offside = {5, 3, 4, 1, 2, 0};
    public static int[][] arr;
    public static int max;
    public static int sum;

    public static void recur(int num, int up_position){

        if(sum < max - (N - num) * 6){
            return;
        }

        if(num == N){

            if(sum > max){
                max = sum;
            }
            return;
        }

        int up_index = 0;

        for(int i = 0; i < 6; i++){
            if(up_position == arr[num][i]){
                up_index = i;
                break;
            }
        }

        int max_side = 0;

        for(int i = 0; i < 6; i++){
            if(i != up_index && i != offside[up_index]){
                if(max_side < arr[num][i]){
                    max_side = arr[num][i];
                }

            }
        }

        sum += max_side;
        recur(num + 1, arr[num][offside[up_index]]);

    }


    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][6];
        int up_position = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
            arr[i][4] = Integer.parseInt(st.nextToken());
            arr[i][5] = Integer.parseInt(st.nextToken());
        }

        max = 0;
        for(int i = 0 ; i < 6; i++) {
            int zero_max = 0;
            for(int j = 0; j < 6; j++){
                if(j != i && j != offside[i]){
                    if(zero_max < arr[0][j]){
                        zero_max = arr[0][j];
                    }
                }
            }
            sum = zero_max;
            recur(1, arr[0][i]);
        }
        System.out.println(max);
    }
}
