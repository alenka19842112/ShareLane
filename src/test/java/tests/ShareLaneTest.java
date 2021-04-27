package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    @Test
    public void fillZipcodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); //путь к драйверу хром
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py\n"); // открытие хром

        driver.findElement(By.name("zip_code")).sendKeys("222222");// посылаем значение в поле zip
        driver.findElement(By.xpath("//*[@value='Continue']")).click(); //кнопка Continue
         driver.quit(); //закрытие хрома

    }

    @Test
    public void fillSignUpFieldCheckInTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); //путь к драйверу хром
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222"); // открытие страницы регистрации

        driver.findElement(By.name("first_name")).sendKeys("Ivanov");// посылаем значение в поле first_name
        driver.findElement(By.name("last_name")).sendKeys("Ivan");// посылаем значение в поле last_name
        driver.findElement(By.name("email")).sendKeys("asdf@gmail.com");// посылаем значение в поле email
        driver.findElement(By.name("password1")).sendKeys("1111");// посылаем значение в поле password1
        driver.findElement(By.name("password2")).sendKeys("1111");// посылаем значение в поле password2

        driver.findElement(By.xpath("//*[@value='Register']")).click(); //кнопка Register

        driver.quit(); //закрытие хрома

    }

    @Test
    public void fillSignUpFieldCheckInEmptyFieldsTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); //путь к драйверу хром
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222"); // открытие страницы регистрации

        driver.findElement(By.name("first_name")).sendKeys("");// пустое поле first_name
        driver.findElement(By.name("last_name")).sendKeys("");// пустое поле last_name
        driver.findElement(By.name("email")).sendKeys("");// пустое поле email
        driver.findElement(By.name("password1")).sendKeys("");// пустое поле password1
        driver.findElement(By.name("password2")).sendKeys("");// пустое поле password2

        driver.findElement(By.xpath("//*[@value='Register']")).click(); //кнопка Register

        driver.quit(); //закрытие хрома
        driver.quit(); //закрытие хрома
    }

}
