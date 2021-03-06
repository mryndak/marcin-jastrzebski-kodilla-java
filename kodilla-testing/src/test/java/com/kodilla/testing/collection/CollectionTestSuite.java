package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("\nTest Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.clear();
        //When
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        System.out.println("Testing emptyList");
        //Then
        Assert.assertEquals(emptyList,list);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        //When
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        evenList.add(8);
        evenList.add(10);
        System.out.println("Testing evenList");
        //Then
        Assert.assertEquals(evenList,OddNumberExterminator.exterminate(list));
    }
}
