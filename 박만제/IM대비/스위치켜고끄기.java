package IM대비;


	import java.util.Scanner;

	public class 스위치켜고끄기 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int s = sc.nextInt(); //스위치 개수
	        int arr[] = new int[s]; //스위치 개수만큼
	        for(int i=0;i<s;i++) {
	            arr[i] = sc.nextInt();
	        }

	        int person = sc.nextInt();

	        while(person>0) {
	            int gender = sc.nextInt();
	            int place = sc.nextInt();

	            if(gender ==1) {
	                //남자
	                for(int i = place-1;i<s;i += place) {
	                    if(arr[i] == 0)
	                        arr[i] = 1;
	                    else
	                        arr[i] = 0;
	                }
	            }
	            else {
	                //여자
	                place = place -1;
	                arr[place] = (arr[place]+1) % 2;
	                for(int i=1;i<arr.length;i++) {
	                    if((place-i) >=0 && (place+i)<arr.length) {
	                        if(arr[place -i] == arr[place+i]) {
	                            arr[place-i] = (arr[place-i]+1) % 2;
	                            arr[place+i] = (arr[place+i]+1) % 2;
	                        }
	                        else
	                            break;
	                    }
	                }
	            }
	            person--;
	        }


	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<arr.length;i++) {
	            sb.append(arr[i]+" ");
	            if((i+1) %20 == 0) {
	                sb.setLength(sb.length()-1);
	                System.out.println(sb.toString());
	                sb.delete(0, sb.length());
	            }

	            if(i == arr.length-1 && (i+1)%20 != 0) {
	                sb.setLength(sb.length()-1);
	                System.out.print(sb.toString());
	            }
	        }
	    }
	}