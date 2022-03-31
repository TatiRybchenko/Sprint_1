package test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import page.PageHome;
import page.PageOrderModalWindowForm;

public class StatusOrder {
/* Я знаю, что тесты автоматически запускаются в хром)) Эту аннотация используется перед каждым тестом, для запуска браузера edge
    @Before
    public void setBrowser() {
        Configuration.browser = "edge"; }
*/
    @Test
    /// Проверяет, что отображается картинка "Зака не найден", если осуществлять поиск по невалидному значению, в поле "Статус заказа"
    public void checkOrderStatusWithUnknownNumber() {

        final String invalidOrderNumber = "75";

        PageHome pageHeader = open(PageHome.URL, PageHome.class);
        pageHeader.clickOrderStatusButton();
        pageHeader.fillOrderNumberInput(invalidOrderNumber);
        pageHeader.clickSearchOrderButton();

        PageOrderModalWindowForm pageOrderWindowModalHeader = page(PageOrderModalWindowForm.class);
        assertTrue("Отсутствует изображение -Заказ не найден-", pageOrderWindowModalHeader.isOrderNotFoundImageDisplayed());
    }
}
