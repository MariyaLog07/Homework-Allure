package ru.desnol;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebStep {
    @Step("Открывем главную страницу")
    public void openMainPage(){
        open("https://github.com/");
    }
    @Step("Ищем репозиторий {repository}")
    public void searchForRepository(String repository){
        $(".header-search-input").click();
        $(".header-search-input").setValue(repository).submit();
    }
    @Step ("Переходим в репозиторий {repository}")
    public void goToRepository(String repository){
        $(By.id("issues-tab")).click();
    }
    @Step("Открываем раздел Issues {repository}")
    public void openIssueTab(){

    }
    @Step("Проверяем наличие Issues с номером {number}")
    public void shouldSeeissueWithNumber(int number){
        $(byText("#" + number)).should(Condition.visible);
    }
}
