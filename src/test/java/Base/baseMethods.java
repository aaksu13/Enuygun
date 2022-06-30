package Base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class baseMethods extends base {

    public WebElement findElementByWaiting(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void clickElement(By by) {
        findElementByWaiting(by).click();
    }


}
