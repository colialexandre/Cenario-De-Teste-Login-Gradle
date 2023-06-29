package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignTest {
    @Test
    @DisplayName("Quando o usuário inserir o nome de usuário e a senha corretamente;")
    public void testFazerLoginNoSoucedemo() {

        WebDriver navegador = new ChromeDriver();
        String basePage = "https://saucedemo.com";

        navegador.get(basePage);

        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }

    @Test
    @DisplayName("Quando o usuário inserir o nome de usuário e a senha corretamente;")
    public void testFazerLoginNoSaucedemo2() {
        WebDriver navegador = new ChromeDriver();
        String basePage = "https://saucedemo.com";

        navegador.get(basePage);

        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("locked_out_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }

    @Test
    @DisplayName("Quando o usuário inserir o nome de usuário e a senha corretamente;")
    public void testFazerLoginNoSaucedemo3() {
        WebDriver navegador = new ChromeDriver();
        String basePage = "https://saucedemo.com";

        navegador.get(basePage);


        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("problem_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }

    @Test
    @DisplayName("Quando o usuário inserir o nome de usuário e a senha corretamente;")
    public void testFazerLoginNoSaucedemo4() {
        WebDriver navegador = new ChromeDriver();
        String basePage = "https://saucedemo.com";

        navegador.get(basePage);


        navegador.findElement(By.id("login_button_container")).findElement(By.name("user-name")).sendKeys("performance_glitch_user");
        navegador.findElement(By.id("login_button_container")).findElement(By.name("password")).sendKeys("secret_sauce");

        navegador.findElement(By.id("login-button")).click();

        String swagLabs = navegador.findElement(By.className("app_logo")).getText();

        assertEquals("Swag Labs", swagLabs);

        navegador.quit();

    }
}
