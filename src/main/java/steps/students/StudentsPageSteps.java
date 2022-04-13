package steps.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.students.StudentsPage;
import steps.BasePageSteps;

import java.util.ArrayList;
import java.util.List;

import static constants.Constants.*;

public class StudentsPageSteps extends BasePageSteps {
    StudentsPage studentsPage;

    public StudentsPageSteps(WebDriver driver) {
        super(driver);
        studentsPage = new StudentsPage(driver);
    }

    public StudentsPageSteps verifyRegistrationUrlIslCorrectly(WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), STUDENTS_URL);
        return this;
    }

    public StudentsPageSteps verifyFieldStudentsNameContent(String expectedContent) {
        Assert.assertEquals(studentsPage.getStudentNameInput().getAttribute("value"), expectedContent);
        return this;
    }

    public StudentsPageSteps clickAddStudent() {
        studentsPage.clickButton(studentsPage.getAddStudent());
        return this;
    }

    public StudentsPageSteps verifyOpenStudentsPage() {
        Assert.assertEquals(studentsPage.getStudentsPageHeader().getAttribute("textContent"), "Students");
        return this;
    }

    public StudentsPageSteps fillFieldStudentsName(String content) {
        studentsPage.fillField(studentsPage.getStudentNameInput(), content);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public List getStudentsList() {
        List studentsList = new ArrayList();
        int previousPage = 0;
        int currentPage = 1;
        while (currentPage > previousPage) {
            int countStudentsOnPage = studentsPage.getStudentsTableBody().findElements(By.xpath("//tbody[@class='table__table-body___bYZbU']//tr")).size();
            List studentData;
            for (int i = 1; i <= countStudentsOnPage; i++) {
                String xpath = "//tbody[@class='table__table-body___bYZbU']//tr[" + i + "]";
                studentData = new ArrayList();
                studentData.add(studentsPage.getStudentsTableBody().findElement(By.xpath(xpath + "/td[1]")).getText());
                studentData.add(studentsPage.getStudentsTableBody().findElement(By.xpath(xpath + "/td[2]")).getText());
                studentData.add(studentsPage.getStudentsTableBody().findElement(By.xpath(xpath + "/td[3]")).getText());
                studentsList.add(studentData);
            }
            clickButton(studentsPage.getButtonNextPage());
            currentPage = Integer.parseInt(studentsPage.getButtonCurrentPage().getText());
            previousPage++;
        }
        return studentsList;
    }

    public StudentsPageSteps verifyStudentsList(String content) {
        List<List> studentsList = getStudentsList();
        for (List<String> student : studentsList) {
            boolean expectedResult = false;
            if (student.get(0).contains(content) | student.get(1).contains(content) | student.get(2).contains(content)) {
                expectedResult = true;
            }
            Assert.assertTrue(expectedResult, student.get(0) + " " + student.get(1) + " " + student.get(2) + ", doesn't contain " + content);
        }
        return this;
    }

    public StudentsPageSteps verifyDetailsButtonIsEnabled(boolean condition) {
        boolean actualResult = studentsPage.getButtonDetails().isEnabled() == condition;
        Assert.assertTrue(actualResult);
        return this;
    }

    public StudentsPageSteps clickButtonCardViewer() {
        studentsPage.getButtonCard().click();
        return this;
    }
}




