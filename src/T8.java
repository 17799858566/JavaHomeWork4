import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] list1=new int[999999];
        int[]list2=new int[999999];
        int t;

        System.out.print("Enter list1: ");
        int num1=input.nextInt();
        for(int i=0;i<num1;i++){
            list1[i]=input.nextInt();
        }

        System.out.print("Enter list2: ");
        int num2=input.nextInt();
        for(int i=0;i<num2;i++){
            list2[i]=input.nextInt();
        }
        System.out.print("The merged list is ");
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                if(list2[j]<list1[i]){
                    for(int k=num1;k>i;k--){
                        list1[k]=list1[k-1];
                    }
                    list1[i]=list2[j];
                    num1++;
                    for(int k=0;k<num2;k++){
                        list2[k]=list2[k+1];
                    }
                    num2--;
                }
            }
        }
        for(int i=0;i<num1;i++){
            System.out.print(list1[i]+" ");
        }

    }
}
