package com.tier4.answers;

import com.tier3.answers.Answer2Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    Answer1Tests.class,
    Answer2Tests.class,
    Answer3Tests.class,
    Answer3Tests.class,
    PointsTests.class
})
public class Tier4Tests {

}