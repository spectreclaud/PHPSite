package PhpTravelsFlightBooking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebPhpSite extends BaseTests {

    private String firstNameTab = "Andrzej";
    private String lastNameTab = "Bak";
    private String mobilePho = "123456789";
    private String dateTour = "22/11/2020";
    private String passportNumber = "0987654321";
    private String secondPassportNumber = "8765674531";
    private String age = "34";
    private String adressTab = "Porzeczkowa 1";
    private String cityTab = "Zaswiaty";
    private String password = "pryszczyk";
    private String secondAdress = "Sektor X";
    private String state = "KrainaCudow";
    private String zip = "00-666";
    private String localization = "United Arab Emirates, Dubai";
    private By loginButtonLocator = By.cssSelector(".dropdown.dropdown-login.dropdown-tab");
    private By firstNameLocator = By.xpath("//*[@name='firstname']");
    private By lastNameLocator = By.xpath("//*[@name='lastname']");
    private By phoneNumberLocator = By.xpath("//*[@name='phone']");
    private By emailLocator = By.xpath("//*[@name='email']");
    private By passwordLocator = By.xpath("//*[@name='password']");
    private By confirmPasswordLocator = By.xpath("//*[@name='confirmpassword']");
    private By yelowButtonLocator = By.xpath("//button[@role='button']");
    private By submitButtonLocator = By.xpath("//button[@type='submit']");
    private By firstAdressLocator = By.xpath("//*[@name='address1']");
    private By secondAdressLocator = By.xpath("//*[@name='address2']");
    private By cityLocator = By.xpath("//*[@name='city']");
    private By stateLocator = By.xpath("//*[@name='state']");
    private By zipCodeLocator = By.xpath("//*[@name='zip']");
    private By chosenCountryLocator = By.xpath("//*[@class='chosen-search-input']");
    private By submitProfileLocator = By.xpath("//*[@type='submit']");
    private By localizationLocator = By.xpath("/html/body/div[6]/div/input");
    private By dateLocator = By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/input");
    private By adultLocator = By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]");
    private By changeDateLocator = By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/div/div/div/div[1]/input");
    private By firstGuestLocator = By.xpath("//*[@name='passport[1][name]']");
    private By secondGuestLocator = By.xpath("//*[@name='passport[2][name]']");
    private By passportNumLocator = By.xpath("//*[@name='passport[1][passportnumber]']");
    private By secondPassportNumLocator = By.xpath("//*[@name='passport[2][passportnumber]']");
    private By ageLocator = By.xpath("//*[@name='passport[1][age]']");
    private By secondAgeLocator = By.xpath("//*[@name='passport[2][age]']");


    @Test
    public void travelTest() {

        driver.findElement(loginButtonLocator).click();
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[2]"))).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'First Name')]"))).click();

        WebElement firstNameElement = driver.findElement(firstNameLocator);
        firstNameElement.sendKeys(firstNameTab);

        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Last Name')]"))).click();
        WebElement lastNameElement = driver.findElement(lastNameLocator);
        lastNameElement.sendKeys(lastNameTab);

        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Mobile Number')]"))).click();
        WebElement phoneNumberElement = driver.findElement(phoneNumberLocator);
        phoneNumberElement.sendKeys(mobilePho);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Email')]"))).click();
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys(firstNameTab + "." + lastNameTab + "@gmail.com");

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Password')]"))).click();
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys(password);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Confirm Password')]"))).click();
        WebElement confirmPassElement = driver.findElement(confirmPasswordLocator);
        confirmPassElement.sendKeys(password);

        WebElement yelowButtonElement = driver.findElement(yelowButtonLocator);
        yelowButtonElement.click();
        WebElement submitButtonElement = driver.findElement(submitButtonLocator);
        submitButtonElement.click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'My Profile')]"))).click();
        WebElement firstAdressElement = driver.findElement(firstAdressLocator);
        firstAdressElement.sendKeys(adressTab);

        WebElement secondAdressElement = driver.findElement(secondAdressLocator);
        secondAdressElement.sendKeys(secondAdress);

        WebElement cityElement = driver.findElement(cityLocator);
        cityElement.sendKeys(cityTab);

        WebElement stateElement = driver.findElement(stateLocator);
        stateElement.sendKeys(state);

        WebElement zipElement = driver.findElement(zipCodeLocator);
        zipElement.sendKeys(zip);

        driver.findElement(By.xpath("//span[contains(text(),'Select Country')]")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='chosen-search-input']"))).click();
        WebElement chosenElement = driver.findElement(chosenCountryLocator);
        chosenElement.sendKeys("au");
        chosenElement.sendKeys(Keys.ENTER);

        WebElement submitButProfileEleme = driver.findElement(submitProfileLocator);
        submitButProfileEleme.click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/footer/div[1]/div[1]/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/a"))).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]"))).click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Tours')]"))).click();
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.id("s2id_autogen22"))).click();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/input"))).clear();
        WebElement localizationTourElement = driver.findElement(localizationLocator);
        localizationTourElement.sendKeys(localization);
        driver.findElement(By.xpath("//span[contains(text(),'United Arab Emirates, Dubai')]")).click();
        String typeTourElement = driver.findElement(By.xpath("//div[@id='tourtype_chosen']")).getText();

        WebElement dateTourElement = driver.findElement(dateLocator);
        dateTourElement.clear();
        dateTourElement.sendKeys(dateTour);

        WebElement adultsElement = driver.findElement(adultLocator);
        adultsElement.click();

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[4]/button")).click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'dubai')]")));
        String tripPoint = driver.findElement(By.xpath("//span[contains(text(),'dubai')]")).getText();

        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/a"))).click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/div/div/div/div[1]/input"))).click();
        WebElement changeDateElement = driver.findElement(changeDateLocator);
        changeDateElement.clear();
        changeDateElement.sendKeys(dateTour);
        changeDateElement.sendKeys(Keys.ENTER);

        new WebDriverWait(driver, 5).until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/div/div/div/div[1]/input"), dateTour));
        String sendDateTour = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/div/div/div/div[1]/input")).getAttribute("value");

        Select drpAdults = new Select(driver.findElement(By.id("selectedAdults")));
        drpAdults.selectByValue("2");

        Select drpChild = new Select(driver.findElement(By.id("selectedChild")));
        drpChild.selectByValue("1");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button")).click();


        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div[1]/div[2]/form/div[2]/div/table/tbody/tr[3]/td[4]/label/span[1]"))).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div[1]/div[2]/form/div[2]/div/table/tbody/tr[4]/td[4]/label/span[1]"))).click();

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Guest 1 Name')]"))).click();
        WebElement firstGuestElement = driver.findElement(firstGuestLocator);
        firstGuestElement.sendKeys(firstNameTab);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Guest 1 Passport No.')]"))).click();
        WebElement passportNumElement = driver.findElement(passportNumLocator);
        passportNumElement.sendKeys(passportNumber);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Age')]"))).click();
        WebElement ageElement = driver.findElement(ageLocator);
        ageElement.sendKeys(age);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Guest 2 Name')]"))).click();
        WebElement secondGuestElement = driver.findElement(secondGuestLocator);
        secondGuestElement.sendKeys(firstNameTab);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Guest 2 Passport No.')]"))).click();
        WebElement secondPassportNumElement = driver.findElement(secondPassportNumLocator);
        secondPassportNumElement.sendKeys(secondPassportNumber);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/div/div[1]/div[2]/form/div[7]/div/div/div/div[2]/div[3]/label"))).click();
        WebElement secondAgeElement = driver.findElement(secondAgeLocator);
        secondAgeElement.sendKeys(age);

        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'CONFIRM THIS BOOKING')]"))).click();
        new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/center/button[1]"))).click();
        driver.switchTo().alert().accept();

        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]")));
        String confirmationMessage = driver.findElement(By.xpath("//h4[contains(text(),'Your booking status is Reserved')]")).getText();
        System.out.println(confirmationMessage);

        assertAll(
                ()->{ System.out.println("Asercja 1");
                    assertEquals("Select", typeTourElement);},
                ()->{ System.out.println("Asercja 2");
                    assertEquals("Dubai", tripPoint);},
                ()->{ System.out.println("Asercja 3");
                    assertEquals("22/11/2020" ,sendDateTour);},
                ()->{ System.out.println("Asercja 4");
                    assertEquals("Your booking status is Reserved", confirmationMessage);}
        );
    }

}
