package program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComparerTest {
    @Test
    public void rutern_4A4B(){
        NumberComparer compare = new NumberComparer();
        String result = compare.compare("1234","1234");
        assertEquals("4A0B",result);
    }
    @Test
    public void rutern_xAxB(){
        NumberComparer compare = new NumberComparer();
        String result = compare.compare("1234","1369");
        assertEquals("1A1B",result);
    }
    /****
    @Test
    public boolean select(int input){
        int temp1,temp2,temp3,temp4;
        temp1 = input/1000;
        temp2 = input/100;
        temp3 = input/10;
        temp4 = input%10;
        if(temp1!=temp2 && temp1!=temp3 && temp1!=temp4)
            if(temp2!=temp3 && temp2!=temp4)
                if(temp3!=temp4)
                    return true;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
    ****/
}
