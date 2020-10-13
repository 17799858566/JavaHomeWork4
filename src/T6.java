public class T6 {
    public static void main(String[] args) {
        int[] gui=new int[101];
        for(int i=1;i<=100;i++){
            for(int j=i;j<=100;j=j+i){
                gui[j]=1-gui[j];
            }
        }
        for(int i=1;i<=100;i++){
            if(gui[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
