import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek2304 {//1
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int [N][2];

        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[0] - o2[0];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });

        int max = 0;
        int max_index = 0;

        for(int i = 0; i < N; i++){
            if(arr[i][1] > max){
                max = arr[i][1];
                max_index = i;
            }

        }

        int sum = max;
        int left = max_index - 1;
        int right = max_index + 1;

        while(left >= 0){
            int i = left;
            int left_max = 0;
            int left_max_index = left;

            while(i >= 0){
                if(arr[i][1] > left_max){
                    left_max = arr[i][1];
                    left_max_index = i;
                }
                i--;
            }

            sum += ( (arr[left + 1][0] - arr[left_max_index][0]) * left_max);
            left = left_max_index - 1;

        }

        while(right < N){
            int i = right;
            int right_max = 0;
            int right_max_index = right;

            while(i < N){
                if(arr[i][1] > right_max){
                    right_max = arr[i][1];
                    right_max_index = i;
                }
                i++;
            }

            sum += ( (arr[right_max_index][0] - arr[right - 1][0]) * right_max);
            right = right_max_index + 1;
        }

        System.out.println(sum);
    }
}
