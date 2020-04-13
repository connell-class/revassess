package com.tier5.answers;

import java.io.File;
import java.nio.file.Paths;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * prompt: Successfully consume the data at the provided endpoint (rendering
 * data to screen not required)
 */
public class Answer2Tests {

    @Test
    public void testAjax() {
        System.setProperty("webdriver.gecko.driver", "src/assets/geckodriver.exe");
        WebDriver wd = new FirefoxDriver();
        File html = Paths.get("src/main/webapp/html/index.html").toFile();
        wd.navigate().to("file://" + html.getAbsolutePath());
        System.out.println((new WebDriverWait(wd, 10)).until(ExpectedConditions.jsReturnsValue("callFlashcardApi()")));
        // (JavascriptExecutor) wd).executeScript("getResp()"));
        wd.close();
    }
}