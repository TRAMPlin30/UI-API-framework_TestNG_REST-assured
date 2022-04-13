package steps.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.secretaries.SecretariesPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretariesHelper extends SecretariesPage {

    public SecretariesHelper(WebDriver driver) {
        super(driver);
    }

    public void fillField(WebElement field, String value) {
        if (field.getAttribute("disabled") == null
                || field.getAttribute("readOnly") == null) {
            field.click();
            field.clear();
            field.sendKeys(value);
        } else {
            System.out.println("Field: " + field + " is not active!!!");
        }
    }

    public static List<String> parseTableRowSorted(List<WebElement> list) {
        String object;
        List<String> listOfObjects = new ArrayList<>();
        for (WebElement element : list) {
            object = element.getText();
            listOfObjects.add(object);
        }
        Collections.sort(listOfObjects);
        System.out.println(listOfObjects);
        System.out.println(listOfObjects.size());
        return listOfObjects;
    }

    public static List<String> parseTableRowSearch(List<WebElement> list) {
        String object;
        List<String> listOfObjects = new ArrayList<>();
        if (!(list.size() == 0)) {
            for (WebElement element : list) {
                object = element.getText();
                listOfObjects.add(object);
            }
            return listOfObjects;
        } else {
            return null;
        }
    }
}

