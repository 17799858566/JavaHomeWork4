import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] rank=new int[num];
        int isRank=1;

        for(int i=0;i<num;i++){
            rank[i]=input.nextInt();
        }
        if(num!=1){
            for(int i=1;i<num-1;i++){
                if((rank[i]<=rank[i-1]&&rank[i]>=rank[i+1])||(rank[i]>=rank[i-1]&&rank[i]<=rank[i+1])){
                    isRank=1;
                }
                else{
                    isRank=-1;
                    break;
                }
            }
        }
        if(isRank==-1){
            System.out.println("The list is not sorted");
        }
        else{
            System.out.println("The list is already sorted");
        }
    }
}
