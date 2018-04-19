
import java.util.*;

public class lx3 {
        public static void main(String[] args) {
            Scanner scanner1=new Scanner(System.in);
            int n=Integer.parseInt(scanner1.nextLine());
            Scanner scanner2=new Scanner(System.in);
            String times=scanner1.nextLine();
            System.out.println();
            String[] timesArray=times.split(" ");
            System.out.println(luckTime(timesArray));//fffff
        }
        //计算幸运时刻函数
        public static int luckTime(String[] timesArray){
            int num=0;
            String[] time=null;
            String a=null;
            String b=null;
            for(int i=0;i<timesArray.length;i++){
                time=timesArray[i].split(":");
                a=time[0];
                b=time[1];
                if((a.equals(b))|| ((Integer.valueOf(a)%11==0)&&(Integer.valueOf(b)%11==0))
                        ||(a.equals(b.split("")[1]+b.split("")[0]))){
                    num++;
                }
            }
            
            return num;
        }

}