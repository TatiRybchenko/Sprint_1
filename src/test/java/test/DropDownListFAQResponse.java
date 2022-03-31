package test;

import static com.codeborne.selenide.Selenide.open;
import org.junit.Test;
import page.PageHome;



public class DropDownListFAQResponse {
/* Я знаю, что тесты автоматически запускаются в хром)) Эта аннотация используется перед каждым тестом, для запуска браузера edge
    @Before
    public void setBrowser() {
        Configuration.browser = "edge"; }
*/
    ///Проверяет, что выводится корректный текст ответов на вопросы (с 1 по 8 вопрос в списке)
   @Test
   public void clickElementFAQQuestion_0_Response_0() {

       PageHome pageHeader = open (PageHome.URL, PageHome.class);
       pageHeader.clickCookieButton();
       pageHeader.clickButtonQuestion_0_checkTextQuestion_0();
       pageHeader.checkTextResponse_0();
   }
   @Test
   public void clickElementFAQQuestion_1_Response_1() {

        PageHome pageHeader = open (PageHome.URL, PageHome.class);
        pageHeader.clickButtonQuestion_1_checkTextQuestion_1();
        pageHeader.checkTextResponse_1();
   }
   @Test
   public void clickElementFAQQuestion_2_Response_2() {

        PageHome pageHeader = open (PageHome.URL, PageHome.class);
        pageHeader.clickButtonQuestion_2_checkTextQuestion_2();
        pageHeader.checkTextResponse_2();
   }
   @Test
   public void clickElementFAQQuestion_3_Response_3() {

       PageHome pageHeader = open (PageHome.URL, PageHome.class);
       pageHeader.clickButtonQuestion_3_checkTextQuestion_3();
       pageHeader.checkTextResponse_3();
   }
   @Test
   public void clickElementFAQQuestion_4_Response_4() {

       PageHome pageHeader = open (PageHome.URL, PageHome.class);
       pageHeader.clickButtonQuestion_4_checkTextQuestion_4();
       pageHeader.checkTextResponse_4();
   }
   @Test
   public void clickElementFAQQuestion_5_Response_5() {

        PageHome pageHeader = open (PageHome.URL, PageHome.class);
        pageHeader.clickButtonQuestion_5_checkTextQuestion_5();
        pageHeader.checkTextResponse_5();
   }
   @Test
   public void clickElementFAQQuestion_6_Response_6() {

       PageHome pageHeader = open (PageHome.URL, PageHome.class);
       pageHeader.clickButtonQuestion_6_checkTextQuestion_6();
       pageHeader.checkTextResponse_6();
   }
   @Test
   public void clickElementFAQQuestion_7_Response_7() {

       PageHome pageHeader = open (PageHome.URL, PageHome.class);
       pageHeader.clickButtonQuestion_7_checkTextQuestion_7();
       pageHeader.checkTextResponse_7();
   }
}