package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.UploadFile;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class LinkedInTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login Into LinkedIn Application Through Valid Credentials ")
    @Test
    public static void login_into_application() throws IOException, InterruptedException {
        Login login = new Login(driver);
        login.getLogin();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Uploading File Through Robot Class")
    @Test
    public static void upload_file_using_robot_class() throws InterruptedException, AWTException {
        UploadFile file = new UploadFile(driver);
        file.uploadFile();
    }

}
