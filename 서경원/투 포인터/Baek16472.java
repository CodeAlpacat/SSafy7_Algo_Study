import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Baek16472 {//1
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int max = 1;
        int count = 1;
        int s = 0;
        int e = 0;

        TreeMap<Character, Integer> treemap = new TreeMap<>();
        treemap.put(str.charAt(s), 1);

        while(s < str.length() - 1){

            if(treemap.size() == N + 1 ){
                count--;

                if(max < count){
                    max = count;
                }
                if(treemap.get(str.charAt(s)) == 1){
                    treemap.remove(str.charAt(s));
                }else{
                    treemap.put(str.charAt(s), treemap.get(str.charAt(s)) - 1);
                }
                s++;
                continue;
            }

            if(e == str.length() - 1){
                if(max < count){
                    max = count;
                }
                break;
            }

            e++;
            count++;
            if(treemap.containsKey(str.charAt(e))){
                treemap.put(str.charAt(e), treemap.get(str.charAt(e)) + 1);
            }else {
                treemap.put(str.charAt(e), 1);
            }
        }

        System.out.println(max);

    }
}
