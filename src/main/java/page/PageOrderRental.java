package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PageOrderRental {
    //локатор окна "Про аренду"
    @FindBy(how = How.XPATH, using = ".//div[text()='Про аренду']")
    private SelenideElement textPageFormRental;

    //локатор поле для поля "Когда привезти календарь"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement fieldWhenDeliverScooter;

    //локатор календаря
    @FindBy(how = How.XPATH, using =".//input[@class='react-datepicker__month-container']")
    private SelenideElement calendarFieldWhenDeliverScooter;

    //локатор кнопки календаря "Далее"
    @FindBy(how = How.XPATH, using = ".//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")
    private SelenideElement calendarFieldWhenDeliverScooterButtonNext;

    //локатор кнопки число календаря
    @FindBy(how = How.XPATH, using = ".//div[text()='19']")
    private SelenideElement calendarFieldWhenDeliverScooterNumber;

    //локатор для поля "Срок аренды"
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    private SelenideElement rentalPeriodScooter;

    //локатор чек-бокса "Цвет самоката" - черный
    @FindBy(how = How.ID, using = "black")
    private SelenideElement checkboxLabelBlackColorScooter;

    //локатор чек-бокса "Цвет самоката" - серый
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement checkboxLabelGreyColorScooter;

    //локатор поля "Комментарий"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement placeHolderInputComment;

    //локатор кнопки "Заказать"
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderButtonFormRental;

    //метод получения текста страницы формы Аренды (Про аренду)
    public void checkTextPageFormRental() {
        textPageFormRental.shouldHave(exactText("Про аренду"));     }

    //метод клика по полю "Когда привезти самокат"
    public void clickFieldWhenDeliverScooter(String dateCalendar) {
        fieldWhenDeliverScooter.click();
        fieldWhenDeliverScooter.setValue(dateCalendar).pressEnter();
        fieldWhenDeliverScooter.shouldHave(exactValue(dateCalendar));}

    //метод клика по полю "Срок аренды" и выбора значения из списка
    public void clickRentalPeriodScooter(int dropDownNumberOfDays){
            rentalPeriodScooter.click();
            $$(byClassName("Dropdown-option")).get(dropDownNumberOfDays).click();        }

    //метод клика по чек- боксу "Черный самокат"
    public void clickCheckboxLabelBlackColorScooter(){
        checkboxLabelBlackColorScooter.click();     }

    //метод клика по чек- боксу "Серый самокат"
    public void clickCheckboxLabelGreyColorScooter(){
        checkboxLabelGreyColorScooter.click();     }

    //метод клика и ввода значений в поле "Комментарий для курьера"
    public void clickFillPlaceHolderInputComment(String inputValueComment){
        placeHolderInputComment.click();
        placeHolderInputComment.setValue(inputValueComment);     }

    //метод ввода данных в форму "Про аренду"
    public void fillFormApplicantRental(String dateCalendar, Integer dropDownNumberOfDays, String inputValueComment) {
    clickFieldWhenDeliverScooter(dateCalendar);
    clickRentalPeriodScooter(dropDownNumberOfDays);
    clickFillPlaceHolderInputComment(inputValueComment);       }

    //метод клика по кнопке "Заказать"
    public void clickOrderButtonFormRental(){
        orderButtonFormRental.click();
}
}
