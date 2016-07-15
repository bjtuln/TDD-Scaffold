package program;
import java.util.Random;
/**
 * Created by linan on 2016/7/9.
 */
public class NumberComparer {
    private int numbera=0;
    private int numberb=0;
    public int input(){
        Random random = new Random();
        int result = random.nextInt(10000);
        int x = (result+1000)%10000;
        return x;
    }


    public String compare(String a, String b){
        if(a.equals(b))
            return "4A0B";
        else{
            for(int i=0;i<=3;i++){
                if(a.charAt(i)==b.charAt(i))
                    numbera++;
                else{
                    for(int j=0;j<=3;j++){
                        if(a.charAt(i)==b.charAt(j))
                           numberb++;
                        else
                            continue;
                    }
                }
            }
            return numbera+"A"+numberb+"B";
        }
    }
    public String compare_4A0B(String a, String b) {
        if (a.equals(b))
            return "4A0B";
        else
            return "else";
    }
    public String compare_XA(String a, String b){
        for(int i=0;i<=3;i++) {
            if (a.charAt(i) == b.charAt(i))
                numbera++;
        }
        return numbera+"A";
    }
    public String compare_XB(String a, String b)
    {
        for(int i=0;i<=3;i++) {
            for (int j = 0; j <= 3; j++) {
                if (a.charAt(i) == b.charAt(j) && i != j)
                    numberb++;
            }
        }
        return numberb+"B";
    }
    public int get_numbera(){
        return numbera;
    }
    public int get_numberb(){
        return numberb;
    }
}
