import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek1244 {//1
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int people_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < people_num; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(sex == 1){
                int index = 1;
                while(num * index <= n){
                    if(arr[num * index - 1] == 1){
                        arr[num * index - 1] = 0;
                    }else{
                        arr[num * index - 1] = 1;
                    }
                    index ++;
                }

            }else{
                int index = 1;
                if(arr[num - 1] == 1){
                    arr[num - 1] = 0;
                }else{
                    arr[num - 1] = 1;
                }
                while(num + index <= n && num - index >= 1){
                    if(arr[num + index - 1] == arr[num - index - 1]) {
                        if (arr[num + index - 1] == 1) {
                            arr[num + index - 1] = 0;
                            arr[num - index - 1] = 0;

                        } else {
                            arr[num + index - 1] = 1;
                            arr[num - index - 1] = 1;

                        }
                    }else{
                        break;
                    }
                    index++;
                }
            }
        }

        int count = 0;

        for(int i : arr){
            if(count % 20 == 0 && count != 0){
                System.out.println(" ");
                //bw.write("\n");
            }
            count++;
            System.out.print(i + " ");
            //bw.write(i + " ");
        }

        //bw.flush();
        //bw.close();
        br.close();
    }
}
