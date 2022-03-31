package test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import page.PageHome;
import page.PageOrder;
import page.PageOrderRental;
import page.PageOrderModalWindowForm;

public class ErrorForAllFormOrder {
  /* Я знаю, что тесты автоматически запускаются в хром)) Эта аннотация используется перед каждым тестом, для запуска браузера edge
    @Before
    public void setBrowser() {
        Configuration.browser = "edge"; }
*/
   @Test
    ///Проверяем, что есть блокирующее сообщения на все *обязательные поля,
   ///если *обязательные поля, на форме "Для кого самокат", не заполнены
   public void errorForFormApplicantOrderUP() {

       final String invalidApplicantName = " ";
       final String invalidApplicantSurname = " ";
       final String invalidApplicantAddress = " ";
       final String invalidApplicantSubwayStation = "";
       final String invalidApplicantSubwayPhoneNumber = " ";

       PageHome pageHeader = open(PageHome.URL, PageHome.class);
       pageHeader.clickOrderUpButton();

       PageOrder pageOrder = page(PageOrder.class);
       pageOrder.checkTextPageFormApplicant();
       pageOrder.fillFormApplicant(invalidApplicantName, invalidApplicantSurname, invalidApplicantAddress, invalidApplicantSubwayStation, invalidApplicantSubwayPhoneNumber);
       pageOrder.clickNextOrderButton();
       pageOrder.checkTextErrorMessageInputName();
       pageOrder.checkTextErrorMessageInputSurname();
       pageOrder.checkTextErrorMessageInputAddress();
       pageOrder.checkTextErrorMessageInputSubwayStation();
       pageOrder.checkTextErrorMessageInputPhoneNumber();
   }

    @Test
    ///Проверяем, что модальное окно "Заказ оформлен" не открывается по кнопке "Заказать" с формы "Про аренду",
    ///если *обязательные поля на форме "Аренда самоката" не заполнены
    public void errorForFormDetailFormOrderUP() {

       final String trueApplicantName = "Владислав";
       final String trueApplicantSurname = "Смирнов";
       final String trueApplicantAddress = "ул.Менделеева, д.197, литер А 14";
       final String trueApplicantSubwayStation = "Фрунзенская";
       final String trueApplicantSubwayPhoneNumber = "+79817536405";

       PageHome pageHeader = open(PageHome.URL, PageHome.class);
       pageHeader.clickOrderDownButton();

       PageOrder pageOrder = page(PageOrder.class);
       pageOrder.checkTextPageFormApplicant();
       pageOrder.fillFormApplicant(trueApplicantName, trueApplicantSurname,trueApplicantAddress,trueApplicantSubwayStation, trueApplicantSubwayPhoneNumber);
       pageOrder.clickNextOrderButton();

       PageOrderRental pageOrderRental = page(PageOrderRental.class);
       pageOrderRental.checkTextPageFormRental();
       pageOrderRental.clickCheckboxLabelGreyColorScooter();
       pageOrderRental.clickOrderButtonFormRental();

       PageOrderModalWindowForm pageOrderWindowModalHeader = page(PageOrderModalWindowForm.class);
       assertTrue("Модальное окно -Хотите оформить заказ- не показано, заказ не оформлен", pageOrderWindowModalHeader.isCheckOutWindowDisplayed());
       pageOrderWindowModalHeader.clickYesOrderWindowCheckOutButton();
    }
}
