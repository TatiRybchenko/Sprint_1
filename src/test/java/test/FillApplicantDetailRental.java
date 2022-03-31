package test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import page.PageHome;
import page.PageOrder;
import page.PageOrderRental;
import page.PageOrderModalWindowForm;



public class FillApplicantDetailRental {
/* Я знаю, что тесты автоматически запускаются в хром)) Эту аннотация используется перед каждым тестом, для запуска браузера edge
    @Before
    public void setBrowser() {
        Configuration.browser = "edge"; }
*/
    @Test
    /// Проверяет, что при валидных значениях в полях форм "Для кого самокат", "Про аренду",
    /// появлется модальное окно "Заказ оформлен". Вход через верхнюю кнопку "Заказать" с главной страницы.
    public void clickOrderUpfillFormApplicant() {

        final String trueApplicantName = "Таня";
        final String trueApplicantSurname = "Рыбченко";
        final String trueApplicantAddress = "ул.Анны Ахматовой, д.13, кв.14";
        final String trueApplicantSubwayStation = "Спортивная";
        final String trueApplicantSubwayPhoneNumber = "89817536405";
        final String trueDateCalendar = "17.02.2022";
        final Integer trueDropDownNumberOfDays = 4;
        final String trueInputValueComment ="За час до приезда позвонить";

        PageHome pageHeader = open(PageHome.URL, PageHome.class);
        pageHeader.clickOrderUpButton();

        PageOrder pageOrder = page(PageOrder.class);
        pageOrder.checkTextPageFormApplicant();
        pageOrder.fillFormApplicant(trueApplicantName, trueApplicantSurname,trueApplicantAddress,trueApplicantSubwayStation, trueApplicantSubwayPhoneNumber);
        pageOrder.clickNextOrderButton();

        PageOrderRental pageOrderRental = page(page.PageOrderRental.class);
        pageOrderRental.checkTextPageFormRental();
        pageOrderRental.fillFormApplicantRental(trueDateCalendar,trueDropDownNumberOfDays,trueInputValueComment);
        pageOrderRental.clickCheckboxLabelBlackColorScooter();
        pageOrderRental.clickOrderButtonFormRental();

        PageOrderModalWindowForm pageOrderWindowModalHeader = page(PageOrderModalWindowForm.class);

       assertTrue("Модальное окно -Хотите оформить заказ- не показано, заказ не оформлен", pageOrderWindowModalHeader.isCheckOutWindowDisplayed());
       pageOrderWindowModalHeader.clickYesOrderWindowCheckOutButton();
       assertTrue("Модальное окно -Заказ оформлен- не показано, заказ не подтвержден", pageOrderWindowModalHeader.isWindowOrderIsProcessedDisplayed());
    }

    @Test
    /// Проверяет, что при валидных значениях в полях форм "Для кого самокат", "Про аренду",
    /// появлется модальное окно "Заказ оформлен". Вход через нижнюю кнопку "Заказать" с главной страницы.
    public void clickOrderDownfillFormApplicant() {

        final String trueApplicantName = "ВладиславаМария";
        final String trueApplicantSurname = "Иванов";
        final String trueApplicantAddress = "ул.Орбели, д.10, корпус 14, квартира 40";
        final String trueApplicantSubwayStation = "Фрунзенская";
        final String trueApplicantSubwayPhoneNumber = "+79817536405";
        final String trueDateCalendar = "01.01.2000";
        final Integer trueDropDownNumberOfDays = 0;
        final String trueInputValueComment ="";

        PageHome pageHeader = open(PageHome.URL, PageHome.class);
        pageHeader.clickOrderDownButton();

        PageOrder pageOrder = page(PageOrder.class);
        pageOrder.checkTextPageFormApplicant();
        pageOrder.fillFormApplicant(trueApplicantName, trueApplicantSurname,trueApplicantAddress,trueApplicantSubwayStation, trueApplicantSubwayPhoneNumber);
        pageOrder.clickNextOrderButton();

        PageOrderRental pageOrderRental = page(PageOrderRental.class);
        pageOrderRental.checkTextPageFormRental();
        pageOrderRental.fillFormApplicantRental(trueDateCalendar,trueDropDownNumberOfDays,trueInputValueComment);
        pageOrderRental.clickCheckboxLabelBlackColorScooter();
        pageOrderRental.clickCheckboxLabelGreyColorScooter();
        pageOrderRental.clickOrderButtonFormRental();

        PageOrderModalWindowForm pageOrderWindowModalHeader = page(PageOrderModalWindowForm.class);
        assertTrue("Модальное окно -Хотите оформить заказ- не показано, заказ не оформлен", pageOrderWindowModalHeader.isCheckOutWindowDisplayed());
        pageOrderWindowModalHeader.clickYesOrderWindowCheckOutButton();
        assertTrue("Модальное окно -Заказ оформлен- не показано, заказ не подтвержден", pageOrderWindowModalHeader.isWindowOrderIsProcessedDisplayed());
    }
}


