package com.tier5.answers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import static com.tier5.answers.PointsTests.addPoints;

/**
 * prompt:
 * Create an HTML file which 
 * includes the Bootstrap CDN 
 * link and script tags, as 
 * well as a script tag that 
 * imports your own JavaScript file.
 */
public class Answer1Tests {

    String[] sources = new String[5];
    @Before
    public void setup(){
            sources[0]="https://code.jquery.com/jquery-3.4.1.slim.min.js";
            sources[1]="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js";
            sources[2]="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js";
            sources[3]="js/index.js";
            sources[4]="../js/index.js";
    }
    @Test
    public void testScriptTags() {
        try {
            Document html = Jsoup.parse(new File("src/main/webapp/html/index.html"), "UTF-8");
            Elements scripts = html.getElementsByTag("script");
            assertEquals(4, scripts.size());
            scripts.forEach(e->assertNotEquals(-1,Arrays.asList(sources).indexOf(e.attr("src"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        addPoints(10);
    }

}