import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Baek1644 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[n + 1];

        Arrays.fill(arr, true);

        if(n == 1){             //1이면 바로 0 출력
            System.out.println(0);
            return;
        }

        for(int i = 2; i < n + 1; i ++){        // 소수 구하기

            if(arr[i]){
                if(1L * i * i < n + 1) {
                    for (int j = i * i; j < n + 1; j += i) {
                        arr[j] = false;
                    }
                }
            }

        }

        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = 2; i < n + 1 ; i++){        //ArrayList에 소수들 추가
            if(arr[i]){
                prime.add(i);
            }
        }

        prime.add(0);   // 마지막 0으로 패딩
        int s = 0;
        int e = 0;
        int sum = prime.get(0);
        int count = 0;

        while(e < prime.size() - 1){            //소수 합 구하기
            if(sum == n){
                count++;
                e ++;
                sum += prime.get(e);
            }else if(sum < n){
                e ++;
                sum += prime.get(e);
            }else if(sum > n){
                sum -= prime.get(s);
                s++;
            }
        }

        System.out.println(count);


    }
}
