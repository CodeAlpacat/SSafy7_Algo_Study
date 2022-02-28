import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek2527 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int test_case = 0; test_case < 4; test_case++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] x1 = new int[4];
            int[] x2 = new int[4];

            x1[0] = Integer.parseInt(st.nextToken());
            x1[1] = Integer.parseInt(st.nextToken());
            x1[2] = Integer.parseInt(st.nextToken());
            x1[3] = Integer.parseInt(st.nextToken());

            x2[0] = Integer.parseInt(st.nextToken());
            x2[1] = Integer.parseInt(st.nextToken());
            x2[2] = Integer.parseInt(st.nextToken());
            x2[3] = Integer.parseInt(st.nextToken());

            if( x1[0] > x2[2] || x1[1] > x2[3] || x1[2] < x2[0] || x1[3] < x2[1] ){
                bw.write("d\n");
            }else{

                if((x1[2] == x2[0] && x1[1] == x2[3]) || (x1[0] == x2[2] && x1[1] == x2[3]) || (x1[0] == x2[2] && x1[3] == x2[0]) || (x1[2] == x2[0] && x1[3] == x2[1])){
                    bw.write("c\n");
                }else if(x1[0] == x2[2] || x1[1] == x2[3] || x1[2] == x2[0] || x1[3] == x2[1]){
                    bw.write("b\n");
                }else{
                    bw.write("a\n");
                }

            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
