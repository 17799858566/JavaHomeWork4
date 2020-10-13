import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int[] t=new int[99999];
        int[] num=new int[10];
        int[] end=new int[99999];
        int j=0;

        Scanner input= new Scanner(System.in);
        for(int i=0;i<10;i++){
            num[i]=input.nextInt();
            t[num[i]]++;
            if(t[num[i]]==1) {
                end[j] = num[i];
                j++;
            }
        }
        System.out.println("The number of distinct number is "+j);
        System.out.print("The distinct numbers are: ");
        for(int i=0;i<j;i++){
            System.out.print(end[i]+" ");
        }
    }
}
