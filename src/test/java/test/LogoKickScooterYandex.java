package test;

import static com.codeborne.selenide.Selenide.open;
import org.junit.Test;
import page.PageHome;


public class LogoKickScooterYandex {
/*  Я знаю, что тесты автоматически запускаются в хром)) Эту аннотация используется перед каждым тестом, для запуска браузера edge
    @Before
    public void setBrowser() {
    Configuration.browser = "ya"; }

 */
    @Test
    /// Проверяет, что  клик по логотипу самокат отображает URL самоката
    public void logoKickScooter() {

        PageHome pageHeader = open (PageHome.URL, PageHome.class);
        pageHeader.clickLogoScooter();
    }
    @Test
    /// Проверяет, что  клик по логотипу яндекс отображает URL яндекса в новой вкладке
    public void logoKickYandex() {

        PageHome pageHeader = open (PageHome.URL, PageHome.class);
        pageHeader.clickLogoYandex();
    }
}
