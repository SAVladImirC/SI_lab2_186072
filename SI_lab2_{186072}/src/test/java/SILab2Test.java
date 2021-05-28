import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    private final SILab2 lab = new SILab2();

    @Test
    void function(){
        List<Time> testWrongTimes = new ArrayList<>(8);
        List<Time> testCorrectTimes = new ArrayList<>(2);
        List<Integer> secconds = new ArrayList<>(2);

        testWrongTimes.add(new Time(-3,0,0));
        testWrongTimes.add(new Time(25,0,0));
        testWrongTimes.add(new Time(10,-1,0));
        testWrongTimes.add(new Time(10,60,0));
        testWrongTimes.add(new Time(10,30,70));
        testWrongTimes.add(new Time(10,30,-5));
        testWrongTimes.add(new Time(24,1,0));
        testWrongTimes.add(new Time(24,0,1));

        testCorrectTimes.add(new Time(10,30,30));
        testCorrectTimes.add(new Time(24,0,0));

        secconds.add(37830);
        secconds.add(86400);

        assertArrayEquals(secconds.toArray(), lab.function(testCorrectTimes).toArray());

        //assertThrows(Exception.class, ()-> lab.function(testWrongTimes));
    }

    @Test
    void function2(){
        //for#Wrong ili for#Correct, oznachuvaat broevi za uslovite numerirani kako na CFG slikata
        List<Time> for1Wrong = new ArrayList<>(2);
        List<Time> for1Correct = new ArrayList<>(1);
        for1Wrong.add(new Time(-3,0,0));
        for1Wrong.add(new Time(25,0,0));
        for1Correct.add(new Time(5,0,0));
        assertEquals(18000, (int)lab.function(for1Correct).get(0));
       // assertThrows(Exception.class, ()-> lab.function(for1Wrong));

        List<Time> for4Wrong = new ArrayList<>(2);
        List<Time> for4Correct = new ArrayList<>(1);
        for4Wrong.add(new Time(4,0,0));
        for4Wrong.add(new Time(4,60,0));
        for4Correct.add(new Time(4,30,0));
        assertEquals(16200, (int)lab.function(for4Correct).get(0));
        //assertThrows(Exception.class, ()-> lab.function(for4Wrong));

        List<Time> for5Wrong = new ArrayList<>(2);
        List<Time> for5Correct = new ArrayList<>(1);
        for5Correct.add(new Time(4,30,30));
        for5Wrong.add(new Time(4,30,65));
        for5Wrong.add(new Time(4,30,-1));
        assertEquals(16230, (int)lab.function(for5Correct).get(0));
        //assertThrows(Exception.class, ()-> lab.function(for5Wrong));

        List<Time> for6Wrong = new ArrayList<>(2);
        List<Time> for6Correct = new ArrayList<>(1);
        for6Correct.add(new Time(24,0,0));
        for6Wrong.add(new Time(24,0,3));
        for6Wrong.add(new Time(24,1,0));
        assertEquals(86400, (int)lab.function(for6Correct).get(0));
        //assertThrows(Exception.class, ()-> lab.function(for6Wrong));
    }
}
