package com.cybertek.tests.reviews;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPFLoginTest {

    @DataProvider
    public Object [][] userData (){
        ExcelUtil qa3short = new ExcelUtil("Users.xlsx", "Users");
        String [][] dataArray = qa3short.getDataArrayWithoutFirstRow();
        return  dataArray;
    }

    @Test(dataProvider = "userData")
    public void loginTest(String username, String password, String firstName, String lastName){

        



    }
}
