import java.util.*;


public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
Queue<Integer> arr=new ArrayDeque<>();
        for(int i=0;i<6;i++) {
            int a = sc.nextInt();
            arr.offer(a);
        }
        System.out.println(arr);
for(int i=0;i<2;i++) {
    System.out.print(arr.poll());
    System.out.print(" ");
}
        System.out.println();
        System.out.print(arr);
    }
}
