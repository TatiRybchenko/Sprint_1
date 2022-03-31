package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$$;

public class PageOrder {
    //локатор поле для Заголовка "Для кого самокат"
    @FindBy(how = How.XPATH, using = ".//div[text()='Для кого самокат']")
    private SelenideElement textPageFormApplicant;

    //локатор поле для ввода "Имени"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
    private SelenideElement placeHolderInputName;

    //локатор текста ошибки ввода для поля "Имя"
    @FindBy(how = How.XPATH, using = ".//div[text()='Введите корректное имя']")
    private SelenideElement errorMessageInputName;

    //локатор поле для ввода "Фамилии"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement placeHolderInputSurname;

    //локатор текста ошибки ввода для поля "Фамилия"
    @FindBy(how = How.XPATH, using = ".//div[text()='Введите корректную фамилию']")
    private SelenideElement errorMessageInputSurname;

    //локатор поле для ввода "Адреса"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement placeHolderInputAddress;

    //локатор текста ошибки ввода для поля "Адреса"
    @FindBy(how = How.XPATH, using = ".//div[text()='Введите корректный адрес']")
    private SelenideElement errorMessageInputAddress;

    //локатор поле для ввода "Станция метро"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Станция метро']")
    private SelenideElement placeHolderInputSubwayStation;

    //локатор текста ошибки выбора "Станция метро"
    @FindBy(how = How.XPATH, using = ".//div[text()='Выберите станцию']")
    private SelenideElement errorMessageInputSubwayStation;

    //локатор поле для ввода "номер Телефона"
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement placeHolderInputPhoneNumber;

    //локатор текста ошибки  для поля "номер Телефона"
    @FindBy(how = How.XPATH, using = ".//div[text()='Введите корректный номер']")
    private SelenideElement errorMessageInputPhoneNumber;

    //локатор кнопки Далее
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement nextOrderButton;

    //метод получения текста страницы формы Заявителя (Для кого самокат)
    public void checkTextPageFormApplicant(){
        textPageFormApplicant.shouldHave(exactText("Для кого самокат"));     }

    //метод получения текста ошибки для поля "Имени"
    public void checkTextErrorMessageInputName(){
        errorMessageInputName.shouldHave(exactText("Введите корректное имя"));
    }

    //метод получения текста ошибки для поля "Фамилия"
    public void checkTextErrorMessageInputSurname(){
        errorMessageInputSurname.shouldHave(exactText("Введите корректную фамилию"));     }

    //метод получения текста ошибки для поля "Адрес"
    public void checkTextErrorMessageInputAddress(){
        errorMessageInputAddress.shouldHave(exactText("Введите корректный адрес"));     }

    //метод получения текста ошибки для поля "Станция метро"
    public void checkTextErrorMessageInputSubwayStation(){
        errorMessageInputSubwayStation.shouldHave(exactText("Выберите станцию"));     }

    //метод получения текста ошибки для поля "Номер телефона"
    public void checkTextErrorMessageInputPhoneNumber(){
        errorMessageInputPhoneNumber.shouldHave(exactText("Введите корректный номер"));     }

    //метод ввода данные в поле Имя
    public void fillPlaceHolderInputName(String applicantName){
        placeHolderInputName.setValue(applicantName);      }

    //метод ввода данные в поле Фамилия
    public void fillPlaceHolderInputSurname(String applicantSurname) {
        placeHolderInputSurname.setValue(applicantSurname);     }

    //метод ввода данные в поле Адрес
    public void fillPlaceHolderInputAddress(String applicantAddress) {
        placeHolderInputAddress.setValue(applicantAddress);     }

    //метод выбора станции из списка
   public void clickDropdownPlaceSubwayStation (String applicantSubwayStation) {
  placeHolderInputSubwayStation.click();
   placeHolderInputSubwayStation.setValue(applicantSubwayStation);
  $$(byClassName("select-search__select")).findBy(text(applicantSubwayStation)).click();    }

    //метод ввода в поле номер телефона
    public void fillPlaceHolderInputPhoneNumber(String applicantPhoneNumber) {
        placeHolderInputPhoneNumber.setValue(applicantPhoneNumber);    }

    //метод клика по кнопке Далее на странице Заказа
    public void clickNextOrderButton() {
        nextOrderButton.click();    }

    //метод ввода данных в форму "Для кого самокат"
    public void fillFormApplicant(String applicantName, String applicantSurname, String applicantAddress,String applicantSubwayStation, String applicantPhoneNumber) {
        fillPlaceHolderInputName(applicantName);
        fillPlaceHolderInputSurname(applicantSurname);
        fillPlaceHolderInputAddress(applicantAddress);
        clickDropdownPlaceSubwayStation(applicantSubwayStation);
        fillPlaceHolderInputPhoneNumber(applicantPhoneNumber);
    }

}
