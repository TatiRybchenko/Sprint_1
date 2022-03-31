package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.*;

public class PageHome {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

     //локатор кнопки куки.
    @FindBy(how = How.XPATH, using = ".//button[@class='App_CookieButton__3cvqF']")
    private SelenideElement cookieButton;

    //локатор кнопки "Заказать" вверх страницы
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g']")
     private SelenideElement orderUpButton;

    //локатор кнопки "Статус заказа" вверх страницы
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton;

    //локатор поля "ВВод заказа"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='Введите номер заказа']")
    private SelenideElement orderNumberInput;

    //локатор кнопки "Go"
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement searchOrderButton;

    //локатор логотипа "самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement logoScooter;

    //локатор логотипа "яндекс"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement logoYandex;

    //локатор кнопки "Заказать" внизу  страницы
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderDownButton;

    //описание локаторов кнопок из выпадающего списка FAQ
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement question_0;

    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement question_1;

    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement question_2;

    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement question_3;

    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement question_4;

    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement question_5;

    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement question_6;

    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement question_7;

    //описание локаторов панелей ответов на вопросы из FAQ
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement response_0;

    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement response_1;

    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement response_2;

    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement response_3;

    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement response_4;

    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement response_5;

    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement response_6;

    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement response_7;

    //метод клика по кнопке "статус заказа"
    public void clickOrderStatusButton() {
        orderStatusButton.click();
    }

    //метод клика по кнопке "заказать" вверху и внизу страницы
    public void clickOrderUpButton() {
        orderUpButton.click();
    }
    public void clickOrderDownButton() {
        orderDownButton.click();
    }

    //метод клика по кнопке "принять куки"
    public void clickCookieButton() {
        cookieButton.click();
    }

    //метод ввода данных в поле "статус заказа" и ввод значений
    public void fillOrderNumberInput(String orderNumber){
        orderNumberInput.click();
        orderNumberInput.sendKeys(orderNumber);
    }

    //метод клика по кнопке "Go"
    public void clickSearchOrderButton(){
        searchOrderButton.click();
    }

    //метод клика по кнопке "Номер вопроса" и получения текста вопроса из FAQ
    public void clickButtonQuestion_0_checkTextQuestion_0() {
        question_0.click();
        question_0.shouldHave(exactText("Сколько это стоит? И как оплатить?"));
    }

    public void clickButtonQuestion_1_checkTextQuestion_1() {
        question_1.click();
        question_1.shouldHave(exactText("Хочу сразу несколько самокатов! Так можно?"));
    }

    public void clickButtonQuestion_2_checkTextQuestion_2() {
        question_2.click();
        question_2.shouldHave(exactText("Как рассчитывается время аренды?"));
    }

    public void clickButtonQuestion_3_checkTextQuestion_3() {
        question_3.click();
        question_3.shouldHave(exactText("Можно ли заказать самокат прямо на сегодня?"));
    }

    public void clickButtonQuestion_4_checkTextQuestion_4() {
        question_4.click();
        question_4.shouldHave(exactText("Можно ли продлить заказ или вернуть самокат раньше?"));
    }

    public void clickButtonQuestion_5_checkTextQuestion_5() {
        question_5.click();
        question_5.shouldHave(exactText("Вы привозите зарядку вместе с самокатом?"));
    }

    public void clickButtonQuestion_6_checkTextQuestion_6() {
        question_6.click();
        question_6.shouldHave(exactText("Можно ли отменить заказ?"));
    }

    public void clickButtonQuestion_7_checkTextQuestion_7() {
        question_7.click();
        question_7.shouldHave(exactText("Я жизу за МКАДом, привезёте?"));
    }

    //метод получения текста ответа на "номер вопроса" из FAQ
    public void checkTextResponse_0() {
        response_0.shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    public void checkTextResponse_1() {
     response_1.shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    public void checkTextResponse_2() {
    response_2.shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    public void checkTextResponse_3() {
    response_3.shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    public void checkTextResponse_4() {
        response_4.shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    public void checkTextResponse_5() {
        response_5.shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    public void checkTextResponse_6() {
        response_6.shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    public void checkTextResponse_7() {
        response_7.shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

    //метод клика по логотипу "самокат"
    public void clickLogoScooter() {
        logoScooter.click();
        webdriver().shouldHave(url("https://qa-scooter.praktikum-services.ru/"));
    }
    //метод клика по логотипу "яндекс"
    public void clickLogoYandex() {
        logoYandex.click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://yandex.ru/"));
    }
}

