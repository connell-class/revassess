package com.tier5.answers;

import java.io.File;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * prompt: Dynamically render the flashcard information obtained from the
 * provided endpoint to the screen
 */
public class Answer3Tests {
    private WebDriver wd;
    private Set<Integer> jsonIds;
    private Set<String> jsonQues, jsonCat;
    private String jsonAns;
    WebElement cardId, cardQstn, cardAns, cardCat;

    @Before
    public void pageSetup() {
        System.setProperty("webdriver.gecko.driver", "src/assets/geckodriver.exe");
        wd = new FirefoxDriver();
        File html = Paths.get("src/main/webapp/html/index.html").toFile();
        wd.navigate().to("file://" + html.getAbsolutePath());

    }

    @Before
    public void answerSetup(){
        jsonQues = new HashSet<>();
            jsonQues.add("core java question");
            jsonQues.add("java reflection question");
            jsonQues.add("java collections question");
            jsonAns = "dummy answer";
            jsonCat = new HashSet<>();
            jsonCat.add("core java");
            jsonCat.add("java reflection");
            jsonCat.add("java collections");
            jsonIds = new HashSet<>();
            jsonIds.add(1);
            jsonIds.add(2);
            jsonIds.add(3);
    }


    /**
     * TODO: finsish selenium test
     */
    @Test
    public void testContent() {
        new WebDriverWait(wd, 10).until(ExpectedConditions.textToBePresentInElementLocated(By.id("cardAns"), "dummy answer"));
    }

}