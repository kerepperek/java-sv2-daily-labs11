package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetPlusElevation(){
        Hiking hiking=new Hiking();
        float sum=hiking.getPlusElevation(Arrays.asList(10f,20f,15f,18f));
        assertEquals(13,sum);
    }
}