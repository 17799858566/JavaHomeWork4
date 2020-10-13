public class T7 {
    public static void main(String[] args) {
        int a;
        int b;
        int i=0,flag1=0,flag2=0,flag3=0,flag4=0;
        String[] color=new String[9999];
        String[] num=new String[9999];
        String[] fincolor=new String[5];
        String[] finnum=new String[5];

    while(flag1==0||flag2==0||flag3==0||flag4==0) {
        a = (int) (Math.random() * 13 + 1);
        b = (int) (Math.random() * 4 + 1);
        switch (a) {
            case 1:
                num[i] = "Ace";
                break;
            case 2:
                num[i] = "2";
                break;
            case 3:
                num[i] = "3";
                break;
            case 4:
                num[i] = "4";
                break;
            case 5:
                num[i] = "5";
                break;
            case 6:
                num[i] = "6";
                break;
            case 7:
                num[i] = "7";
                break;
            case 8:
                num[i] = "8";
                break;
            case 9:
                num[i] = "9";
                break;
            case 10:
                num[i] = "10";
                break;
            case 11:
                num[i] = "Jack";
                break;
            case 12:
                num[i] = "Queen";
                break;
            case 13:
                num[i] = "King";
                break;
        }
        switch (b) {
            case 1:
                color[i] = " of Clubs";
                if(flag1==0){
                    flag1=1;
                    finnum[0]=num[i];
                    fincolor[0]=color[i];
                }
                break;
            case 2:
                color[i] = " of Diamonds";
                if(flag2==0){
                    flag2=1;
                    finnum[1]=num[i];
                    fincolor[1]=color[i];
                }
                break;
            case 3:
                color[i] = " of Hearts";
                if(flag3==0){
                    flag3=1;
                    finnum[2]=num[i];
                    fincolor[2]=color[i];
                }
                break;
            case 4:
                color[i] = " of Spaders";
                if(flag4==0){
                    flag4=1;
                    finnum[3]=num[i];
                    fincolor[3]=color[i];
                }
                break;
        }
        i++;
      }
        System.out.println(finnum[0]+fincolor[0]);
        System.out.println(finnum[1]+fincolor[1]);
        System.out.println(finnum[2]+fincolor[2]);
        System.out.println(finnum[3]+fincolor[3]);
        System.out.println("Number of picks: "+i);
    }
}
