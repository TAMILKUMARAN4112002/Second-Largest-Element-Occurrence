import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
            }
        }
        int min =0;
        for(Map.Entry<Integer,Integer> e1 : map.entrySet()){
            if((e1.getValue()>min) && (e1.getValue()!=max)){
                min = e1.getValue();
            }
        }
        System.out.println(min);
    }
}
