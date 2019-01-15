package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject4l0b {

      Project4l0bDelegate project4l0bDelegate = new Project4l0bDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project4l0bDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
