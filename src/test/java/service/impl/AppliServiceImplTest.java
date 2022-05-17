package service.impl;

import org.junit.Test;
import pojo.Appli;
import service.AppliService;

import static org.junit.Assert.*;

public class AppliServiceImplTest {
    AppliService appliService = new AppliServiceImpl();

    @Test
    public void test(){
        appliService.signup(new Appli("8008120410","sda","boy","15089921297","acm","无"));
    }


}