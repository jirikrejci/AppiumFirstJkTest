package com.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import javax.lang.model.element.Element;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class MyClass {
    AppiumDriver driver;
    @Before
    public void testCaseSetup()throws  Exception
    {


        //service.start();
        //reader.readFile();
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP, "//Volumes/MAC_DATA/Programovani/Android/AppiumFirstTests/android/AppiumFirstJkTest/app/build/outputs/apk/app-debug.apk");
        //cap.setCapability(MobileCapabilityType.APP, "//Volumes/MAC_DATA/Programovani/AcceptanceTests/app-debug.apk");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap) {   // byl port 4444
        };


    }

    @Test
    public void testcase1()throws  Exception
    {
        //driver.findElementById("Example");
        driver.findElementById("btnShowToast").click();
        Assert.assertTrue(driver.findElementById("tvHelloWodrld").isDisplayed());
    }

    @After
    public void testCaseTearDown()
    {
        driver.quit();
    }
}
