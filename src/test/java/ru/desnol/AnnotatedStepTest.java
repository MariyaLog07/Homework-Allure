package ru.desnol;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AnnotatedStepTest {
    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final Integer ISSUE_NUMBER = 68;
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testGithub() {
       WebStep steps = new WebStep();
       steps.openMainPage();
       steps.searchForRepository(REPOSITORY);
       steps.goToRepository(REPOSITORY);
       steps.openIssueTab();
       steps.shouldSeeissueWithNumber(ISSUE_NUMBER);
    }
}
