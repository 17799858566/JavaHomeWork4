
import java.util.Scanner;


public class T3 {
    public static void main(String[] args) {
        String[] name=new String[99999];
        int[] score =new int[99999];
        int t1;
        String t2;

        Scanner input=new Scanner(System.in);
        System.out.print("学生个数:");
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            name[i]=input.next();
            score[i]=input.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(score[j]>score[i]){
                    t1=score[i];
                    score[i]=score[j];
                    score[j]=t1;
                    t2=name[i];
                    name[i]=name[j];
                    name[j]=t2;
                }
            }
        }
        for(int i=0;i<num;i++){
            System.out.print(name[i]+" ");
        }
    }
}
