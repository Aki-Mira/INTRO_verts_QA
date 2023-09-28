import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest {
    @Test
    public void eightComponents() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        String title = driver.getTitle();
        Assert.assertEquals("DEMOQA", title);

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));

        textBox.sendKeys("Oleg");
        submitButton.click();

        WebElement message = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        String value = message.getText();
        Assert.assertEquals("Name:Oleg", value);

        driver.quit();
    }
}
