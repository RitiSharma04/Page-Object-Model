package com.pom;

import org.testng.annotations.Test;

public class Anno_Test1 {
    @Test
    public void OrangeHRMVerifyLogin(){
        System.out.println("Login Validated");
    }
    @Test(groups = {"OrangeHRMVerifyLogin","TestNGVerifyLogin"})
    public void TestNGVerifyLogin(){
        System.out.println("Test Login Validated");
    }
    @Test(dependsOnGroups = {"TestNGVerifyLogin","OrangeHRMVerifyLogin"})
    public void  AmazonVerifyLogin(){
        System.out.println("Login Validated");
    }
}
