import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1018 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int count1 = 0;
                int count2 = 0;

                if(arr[i][j] == 'W'){

                    for(int k = i; k < i + 8; k++){
                        for(int m = j; m < j + 8; m++){
                            if((k + m) % 2 == 0){
                                if(arr[k][m] != 'W'){
                                    count1++;
                                }
                            }else{
                                if(arr[k][m] != 'B'){
                                    count1++;
                                }
                            }

                        }
                    }

                    for(int k = i; k < i + 8; k++){
                        for(int m = j; m < j + 8; m++){
                            if((k + m) % 2 == 0){
                                if(arr[k][m] != 'B'){
                                    count2++;
                                }
                            }else{
                                if(arr[k][m] != 'W'){
                                    count2++;
                                }
                            }

                        }
                    }

                }else{

                    for(int k = i; k < i + 8; k++){
                        for(int m = j; m < j + 8; m++){
                            if((k + m) % 2 == 0){
                                if(arr[k][m] != 'B'){
                                    count1++;
                                }
                            }else{
                                if(arr[k][m] != 'W'){
                                    count1++;
                                }
                            }

                        }
                    }

                    for(int k = i; k < i + 8; k++){
                        for(int m = j; m < j + 8; m++){
                            if((k + m) % 2 == 0){
                                if(arr[k][m] != 'W'){
                                    count2++;
                                }
                            }else{
                                if(arr[k][m] != 'B'){
                                    count2++;
                                }
                            }

                        }
                    }
                }

                int count = Math.min(count1, count2);

                if(min > count){
                    min = count;
                }

            }
        }

        System.out.println(min);
        br.close();
    }
}
