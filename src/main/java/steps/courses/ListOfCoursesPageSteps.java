package steps.courses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.courses.ListOfCoursesPage;
import steps.BasePageSteps;

import java.util.ArrayList;
import java.util.List;

import static constants.Constants.*;
import static constants.Messages.Courses.*;

public class ListOfCoursesPageSteps extends BasePageSteps {

    ListOfCoursesPage listOfCoursesPage;

    public ListOfCoursesPageSteps (WebDriver driver){
        super(driver);
        listOfCoursesPage = new ListOfCoursesPage(driver);
    }

    public ListOfCoursesPageSteps verifyListOfCoursesUrlIsCorrect (WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), COURSES_URL);
        return this;
    }

    public ListOfCoursesPageSteps waitCourseNameIsRendered() {
        listOfCoursesPage.waitCoursePage();
        return this;
    }

    public ListOfCoursesPageSteps verifyCourseTextPageElement() {
        Assert.assertEquals(listOfCoursesPage.getCourseTextPageElement(), "Courses", TEXT_MESSAGE);
        return this;
    }

    public ListOfCoursesPageSteps clickCourseSidebar() {
        listOfCoursesPage.clickCourseSidebar();
        return this;
    }

    public int getTextNumberOfCoursesFromElementEnabled() {
        String numberText = listOfCoursesPage.getTextNumberOfCoursesElement();
        char firstSymbol = numberText.charAt(0);
        int firstNumberEnabled = Integer.parseInt(String.valueOf(firstSymbol));
        return firstNumberEnabled;
    }

    public ListOfCoursesPageSteps compareNumberOfEnabledCoursesRows() {
        Assert.assertEquals(listOfCoursesPage.getNumberOfRows(), getTextNumberOfCoursesFromElementEnabled(), TEXT_NOT_SAME_MESSAGE);
        return this;
    }

    public ListOfCoursesPageSteps verifyDisabledCourseSwitchElement() {
        Assert.assertTrue(listOfCoursesPage.getDisabledCourseSwitchElement());
        return this;
    }

    public ListOfCoursesPageSteps verifyDisabledCourseSwitch() {
        Assert.assertTrue(listOfCoursesPage.getStatusDisabledCourseSwitch(), ENABLED_BUTTON_MESSAGE);
        return this;
    }

    public ListOfCoursesPageSteps clickDisabledCourseSwitch() {
        listOfCoursesPage.clickDisabledCourseSwitch();
        return this;
    }

    public int getTextNumberOfCoursesFromElementDisabled() {
        String numberText = listOfCoursesPage.getTextNumberOfCoursesElement();
        char firstSymbol = numberText.charAt(0);
        int firstNumberDisabled = Integer.parseInt(String.valueOf(firstSymbol));
        return firstNumberDisabled;
    }

    public ListOfCoursesPageSteps compareNumberOfDisabledCoursesRows() {
        Assert.assertEquals(listOfCoursesPage.getNumberOfRows(), getTextNumberOfCoursesFromElementDisabled(), TEXT_NOT_SAME_MESSAGE);
        return this;
    }

    public ListOfCoursesPageSteps clickPaginationListButton() {
        listOfCoursesPage.clickPaginationListButton();
        return this;
    }

    public List<Integer> makeListOfPagination() {
        List<Integer> pag = new ArrayList<>();
        pag.add(9);
        pag.add(27);
        pag.add(45);
        pag.add(72);
        pag.add(99);
        return pag;
    }

    public ListOfCoursesPageSteps comparePaginationLists() {
        Assert.assertEquals(listOfCoursesPage.getPaginationList(), makeListOfPagination(), TEXT_NOT_SAME_MESSAGE);
        return this;
    }

    public ListOfCoursesPageSteps getTitleList() {
        listOfCoursesPage.getCourseRowNameList();
        return this;
    }

    public ListOfCoursesPageSteps clickTitleSort() {
        listOfCoursesPage.clickTitleSort();
        return this;
    }

    public ListOfCoursesPageSteps compareSortedByAlphabetList() {
        Assert.assertNotEquals(listOfCoursesPage.sortCourseRowNameListByAlphabet(), getTitleList(), TEXT_SAME_MESSAGE);
        return this;
    }

    public ListOfCoursesPageSteps getTitleListByAlphabet() {
        listOfCoursesPage.sortCourseRowNameListByAlphabet();
        return this;
    }

    public ListOfCoursesPageSteps compareSortedByAlphabetListReverse() {
        Assert.assertNotEquals(listOfCoursesPage.sortCourseRowNameListByAlphabetReverse(), getTitleListByAlphabet(), TEXT_SAME_MESSAGE);
        return this;
    }
}
