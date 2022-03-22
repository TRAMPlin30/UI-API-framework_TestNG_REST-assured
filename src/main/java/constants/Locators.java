package constants;

public class Locators {

    public interface RegistrationPage {
        String REGISTRATION_FORM = "//h3[text()='Sign up to WHAT']",
                FIRST_NAME_FIELD = "firstName",
                LAST_NAME_FIELD = "lastName",
                EMAIL_ADDRESS_FIELD = "email",
                PASSWORD_FIELD = "password",
                CONFIRM_PASSWORD_FIELD = "confirm-password",
                BUTTON_SIGN_UP = "//button[text()='Sign up']",
                BUTTON_BACK = "//button[text()='Back']";
    }

    public interface LoginPage {
        String LOGIN_FORM = "//h3[text()='Sign in to WHAT']",
                EMAIL_FIELD = "email",
                PASSWORD_FIELD = "password",
                BUTTON_SIGN_IN = "//button[text()='Sign in']",
                REGISTRATION_LINK = "//a[@href='/registration']";
    }
    public interface SideBarItems {
        String  SIDEBAR_LIST = "//div[@class='sidebar__sidebar__links___GkXK-']",
                SIDEBAR_ITEM_STUDENTS = "//a[@href='/students']",
                SIDEBAR_ITEM_MENTORS = "//a[@href='/mentors']",
                SIDEBAR_ITEM_SECRETARIES = "//a[@href='/secretaries']",
                SIDEBAR_ITEM_LESSONS = "//a[@href='/lessons']",
                SIDEBAR_ITEM_GROUPS = "//a[@href='/groups']",
                SIDEBAR_ITEM_COURSES = "//a[@href='/courses']",
                SIDEBAR_ITEM_SCHEDULES = "//a[@href='/schedules']",
                SIDEBAR_ITEM_UNASSIGNED = "//a[@href='/unassigned']",
                SIDEBAR_ITEM_HOMEWORK = "//a[@href='/homework']";
    }
    public interface PaginationItems {
        String  DROPDOWN_ROWS = "//select[@class='form-control']",
                DROPDOWN_ROWS_ITEM_9 = "//select[@class='form-control']/option[text()='9']",
                DROPDOWN_ROWS_ITEM_27 = "//select[@class='form-control']/option[text()='27']",
                DROPDOWN_ROWS_ITEM_45 = "//select[@class='form-control']/option[text()='45']",
                DROPDOWN_ROWS_ITEM_72 = "//select[@class='form-control']/option[text()='72']",
                DROPDOWN_ROWS_ITEM_99 = "//select[@class='form-control']/option[text()='99']",
                BUTTON_PREVIOUS_PAGE = "//button[text()='<']",
                BUTTON_NEXT_PAGE = "//button[text()='>']";
    }

    public interface MyProfileItems {
        String  MY_PROFILE_ICON = "//*[@href='/my-profile']",
                MY_PROFILE_FULL_NAME = "//span[@class='header__header__account-user--fullname___2kSON']",
                MY_PROFILE_DROPDOWN_ITEMS_LIST = "//span[@class='header__header__dropdown-icon-active___1asoM']",
                MY_PROFILE_DROPDOWN_ITEM_MY_PROFILE = "//a[contains(text(),'My profile')]",
                MY_PROFILE_DROPDOWN_ITEM_CHANGE_PASSWORD = "//a[contains(text(),'Change password')]",
                MY_PROFILE_DROPDOWN_ITEM_LOG_OUT = "//a[contains(text(),'Log Out')]";
    }

    public interface MyProfilePage {
        String MY_PROFILE_HEADER = "//h3[text()='My Profile']",
                FIRST_NAME_FIELD = "//div[text()='First Name:']",
                LAST_NAME_FIELD = "//div[text()='Last Name:']",
                EMAIL_FIELD = "//div[text()='Email address:']",
                USER_DATA = "//div[@class='col-sm-8']",
                CHANGE_PASSWORD_BUTTON = "//button[text()='Change password']";
    }

    public interface ChangePasswordPage {
        String CHANGE_PASSWORD_HEADER = "//h3[text()='Change Password']",
                EMAIL_ADDRESS_FIELD = "//label[text()='Email address:']",
                CURRENT_PASSWORD_FIELD = "//label[text()='Current password:']",
                NEW_PASSWORD_FIELD = "//label[text()='New password:']",
                CONFIRM_PASSWORD_FIELD = "//label[text()='Confirm password:']",
                EMAIL_DATA = "//input[@id='email']",
                CURRENT_PASSWORD_INPUT_FIELD = "//input[@id='currentPassword']",
                NEW_PASSWORD_INPUT_FIELD = "//input[@id='newPassword']",
                CONFIRM_PASSWORD_INPUT_FIELD = "//input[@id='confirmNewPassword']",
                CURRENT_PASSWORD_ERROR = "//input[@id='currentPassword']/following-sibling::div",
                NEW_PASSWORD_ERROR = "//input[@id='newPassword']/following-sibling::div",
                CONFIRM_PASSWORD_ERROR = "//input[@id='confirmNewPassword']/following-sibling::div",
                SAVE_BUTTON = "//button[@type='submit']",
                CANCEL_BUTTON = "//button[text()='Cancel']";
    }

    public interface UnassignedUsersPage {
        String UNASSIGNED_USERS_HEADER = "//h2[text()='Unassigned Users']",
                SEARCH_ICON = "//use[@href='/assets/svg/Search.svg#Search']",
                TABLE_HEAD_NAME = "//span[contains(text(),'Name')]",
                TABLE_HEAD_SURNAME = "//span[contains(text(),'Surname')]",
                TABLE_HEAD_EMAIL = "//span[contains(text(),'Email')]",
                TABLE_HEAD_CHOOSE_ROLE = "//th[text()='Choose role']",
                ADD_ROLE_BUTTON = "//button[text()='Add role']",
                ROWS_FIELD = "//span[contains(text(),'Rows')]";
    }

    public interface StudentsPage {
        String  STUDENT_NAME_INPUT = "//input[@class='search__searchInput___34nMl']",
                TABLE_HEADLINES = "//thead//th",
                TABLE_CONTENT = "//tbody//tr",
                ROW_ON_DETAILS_PAGE = "//*[contains(@class,'row') and contains(@class,'mb-4')]",
                EDIT_BUTTON = "//button[@type='']",
                ADD_STUDENT = "//button[@class='btn button__default___3hOmG button__button___24ZfP']",
                UPLOAD_STUDENT = "//button[@class='btn button__default___3hOmG button__button___24ZfP btn btn-warning  list-of-students__left-add-btn___3SDcH']",
                DETAILS = "//button[@class='btn button__default___3hOmG button__button___24ZfP blocks__btnDetails___2XJNp']",
                SWITCH_DISABLED_STUDENT = "//input[@class='custom-control-input list-of-students__custom-control-input___3BkC4']";
    }

    public interface StudentsDetailsTab {
        String STUDENT_DETAILS_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                EDIT_STUDENT_DETAILS_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                FIRST_NAME = "//div[@class='col-12 col-md-6 font-weight-bolder']",
                GROUP = "//a[@class='text-decoration-none text-white']",
                LESSON = "//div[@class='col-12 col-md-6 d-flex flex-wrap lead']";
    }

    public interface EditStudentDetailsTab {
        String EDIT_STUDENT_DETAILS_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                FIRST_NAME_FIELD = "//input[@id='firstName']",
                LAST_NAME_FIELD = "//input[@id='lastName']",
                EMAIL_FIELD = "//input[@id='email']",
                GROUP_FIELD = "//input[@id='groupsInput']",
                LECTURERS = "//li[@class='edit-students-details__list-element___3Ny4s d-flex bg-light border border-outline-secondary rounded']",
                EXCLUDE_BUTTON = "//button[@class='btn button__default___3hOmG button__button___24ZfP edit-students-details__exclude-btn___1Bizc w-100']",
                RESET_BUTTON = "//button[@class='w-100 btn btn-secondary edit-students-details__button___WOMG6']",
                SAVE_BUTTON = "//button[@class='w-100 btn btn-info edit-students-details__button___WOMG6']";
    }


    public interface SecretariesPage {
        String  EDIT_SECRETARY = "//td[@class='text-center']",
                SWITCH_DISABLED_SECRETARY = "//label[@class = 'custom-control-label list-of-secretaries__custom-control-label___3l-9N')]",
                SEARCH_FIELD_SECRETARY = "//input[@class ='search__searchInput___34nMl']",
                VIEW_SWITCH_LIST_SECRETERY = "//button[@class='btn btn-secondary']", //?
                VIEW_SWITCH_CARD_SECRETERY = "//button[@class='btn btn-secondary']",
                LIST_NAME_SECRETARY = "//span[contains(text(),'Name')]",
                LIST_SURNAME_SECRETARY = "//span[contains(text(),'Surname')]",
                LIST_EMAIL_SECRETARY = "//span[contains(text(),'Email')]",
                INFO_SECRETARY = "//td[not(contains(@class,'text-center'))]",
                DROPDOWN_ROWS_SECRETARY = "//div[@class='row justify-content-between align-items-center mb-3 list-of-secretaries__paginate___264GU']",
                ADD_SECRETARY = "//span[contains(text(),'Add a secretary')]";
    }

    public interface EditSecretaryDetailsTab {
        String SECRETARY_DETAILS_ARROW_BUTTON = "//*[@class ='bi bi-arrow-left']",
                EDIT_SECRETARY_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                SECRETARIES_FIRST_NAME_WINDOW = "//input[@name='firstName']",
                SECRETARIES_LAST_NAME_WINDOW = "//input[@name='lastName']",
                SECRETARIES_EMAIL_WINDOW = "//input[@name='email']",
                SECRETARIES_LAY_OFF_BUTTON = "//button[text()='Lay off']",
                SECRETARIES_SAVE_BUTTON = "//button[text()='Save']",
                SECRETARIES_DETAILS_TITLE = "//a[@class='nav-item nav-link tab__tab___1xEn9']",
                SECRETARIES_DETAILS_FIRST_NAME = "//input[@name = 'firstName']",
                SECRETARIES_DETAILS_LAST_NAME = "//input[@name = 'lastName']",
                SECRETARIES_DETAILS_EMAIL = "//input[@name = 'email']",
                RESET_SECRETARY_BUTTON = "//button[text()='Reset']";
    }

    public interface ListOfCourses{
        String COURSE_CONTENT_SIDEBAR_XPATH = "//a[@data-id='5']",
                ADD_A_COURSE_BUTTON_XPATH = "//span[@data-testid='addCourseBtnText']",
                EDIT_COURSE_ICON_XPATH = "",
                DISABLED_COURSE_SWITCH_XPATH = "",
                COURSES_TITTLE_SEARCH_FIELD_XPATH = "//input[@type='text']",
                ROW_SWITCH_XPATH = "//*[@href='/assets/svg/List.svg#List']",
                CARD_SWITCH_XPATH = "//*[@href='/assets/svg/Card.svg#Card']";
    }

    public interface CourseDetails{
        String TITTLE_BUTTON_XPATH = "//td[contains(text(),'Soft Skills for Lecturers')]",
                ARROW_LEFT_BUTTON_XPATH = "//*[@class='bi bi-arrow-left']",
                COURSE_DETAILS_SWITCH_XPATH = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']";
    }

    public interface EditCourseDetails{
        String EDIT_COURSE_DETAILS_SWITCH_XPATH = "//a[@class='nav-item nav-link tab__tab___1xEn9']",
                COURSE_NAME_FIELD_XPATH = "//input[@name='name']",
                SAVE_BUTTON_XPATH = "//button[@type='submit']",
                RESET_BUTTON_XPATH = "//button[@type='reset']",
                DISABLE_BUTTON_XPATH = "//span[text()='Disable']";
    }

    public interface MentorsTablePage {
        String  EDIT_MENTORS_DETAIL_ICON = "//*[@href='/assets/svg/Edit.svg#Edit']",
                SWITCH_DISABLED_MENTORS = "//label[@for='switchDisabled']",
                SEARCH_FIELD_MENTORS = "//input[@class ='search__searchInput___34nMl']",
                VIEW_SWITCH_LIST_MENTORS = "//*[@href='/assets/svg/List.svg#List']",
                VIEW_SWITCH_CARD_MENTORS = "//*[@href='/assets/svg/Card.svg#Card']",
                MENTORS_DETAIL_ICON_CARD = "//span[contains(text(),'Detail')]",
                LIST_NAME_MENTORS = "//span[contains(text(),'Name')]",
                LIST_SURNAME_MENTORS = "//span[contains(text(),'Surname')]",
                LIST_EMAIL_MENTORS = "//span[contains(text(),'Email')]",
                INFO_MENTORS = "//td[not(contains(@class,'text-center'))]",
                DROPDOWN_ROWS_MENTORS = "//select[@class='form-control']",
                ADD_MENTORS = "//span[contains(text(),'Add a secretary')]";
    }
}