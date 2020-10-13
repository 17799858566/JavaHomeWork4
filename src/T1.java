import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int[] num= new int[99999];
        int[] t=new int[100];
        int i=0,flag=1;

        Scanner input = new Scanner(System.in);
        for(int j=0;j<100;j++){
            t[j]=0;
        }
        while(flag==1){
             num[i]=input.nextInt();
             if(num[i]==0)
                 break;
            t[num[i]]++;
            i++;
        }
        for(int j=0;j<100;j++){
            if(t[j]!=0)
                System.out.println(j+" occurs "+t[j]+" times ");
        }
    }
}
