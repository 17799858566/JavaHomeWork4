import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] num=new double[10];
        double t;
        for(int i=0;i<10;i++){
            num[i]=input.nextDouble();
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(num[j]<num[i]){
                    t=num[i];
                    num[i]=num[j];
                    num[j]=t;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.printf("%.0f",num[i]);
            System.out.print(" ");
        }
    }
}
