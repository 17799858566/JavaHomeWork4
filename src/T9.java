import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] list=new int[num];
        int t,k=0;
        for(int i=0;i<num;i++){
            list[i]=input.nextInt();
        }
        partition(list,num);
        }

    public static void partition(int[] list,int num) {
        int l = 0;
        for (int i = 1; i < num; i++) {
            if (list[i] < list[0]) {
                System.out.print(list[i]+" ");
            }
        }
        System.out.print(list[0]+" ");
        for(int i=1;i<num;i++) {
            if(list[i]>list[0]) {
                System.out.print(list[i]+" ");
            }
        }
     }
}
