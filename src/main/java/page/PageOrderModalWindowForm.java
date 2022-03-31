package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageOrderModalWindowForm {

    //локатор окна "Хотите оформить заказ"
    @FindBy(how = How.XPATH, using = ".//div[text()='Хотите оформить заказ?']")
    private SelenideElement windowCheckOut;

    //локатор кнопки "да" в окне "Хотите оформить заказ"
    @FindBy(how = How.XPATH, using = ".//button[text()='Да']")
    private SelenideElement yesOrderWindowCheckOutButton;

    //локатор кнопки "Нeт" в окне "Хотите оформить заказ"
    @FindBy(how = How.XPATH, using = ".//button[text()='Нет']")
    private SelenideElement noOrderWindowCheckOutButton;

    //локатор окна "Заказ оформлен"
    @FindBy(how = How.XPATH, using = ".//div[text()='Заказ оформлен']")
    private SelenideElement windowOrderIsProcessed;

    //локатор картинки "Такого заказа нет"
    @FindBy(how = How.CLASS_NAME, using = "Track_NotFound__6oaoY")
    private SelenideElement orderNotFoundImage;

    //метод проверки отображения окна на дисплее "Хотите оформить заказ?"
    public boolean isCheckOutWindowDisplayed (){
        return windowCheckOut.isDisplayed();     }

    //метод проверки отображения окна на дисплее "Заказ оформлен"
    public boolean isWindowOrderIsProcessedDisplayed (){
        return windowOrderIsProcessed.isDisplayed();     }

    //метод проверки отображения картинки на дисплее "Такого заказа нет"
    public boolean isOrderNotFoundImageDisplayed(){
        return orderNotFoundImage.isDisplayed();    }

    //метод клика по кнопки "да" в окне Хотите оформить заказ
    public void clickYesOrderWindowCheckOutButton (){
        windowCheckOut.click();
        yesOrderWindowCheckOutButton.click();     }

}
