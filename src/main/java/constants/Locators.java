package constants;

public class Locators {

    public interface RegistrationPage {
        String REGISTRATION_FORM = "//h3[text()='Sign up to WHAT']",
                REGISTRATION_TITLE = "//h3[text()='Sign up to WHAT']",
                FIRST_NAME_FIELD = "firstName",
                LAST_NAME_FIELD = "lastName",
                EMAIL_ADDRESS_FIELD = "email",
                PASSWORD_FIELD = "password",
                CONFIRM_PASSWORD_FIELD = "confirm-password",
                BUTTON_SIGN_UP = "//button[text()='Sign up']",
                LOGIN_LINK = "//a[@href='/auth']",
                BUTTON_BACK = "//button[text()='Back']",
                MESSAGE_REGISTRATION_DONE = "//div[@class='modal-header']/h4",
                MESSAGE_REGISTRATION_DONE_TEXT = "//div[@class='modal-window__modal-body___3v1gd modal-body']",
                MESSAGE_ALERT_FIRST_NAME_FIELD = "//p[@class='text-danger mb-0'][1]",
                MESSAGE_ALERT_LAST_NAME_FIELD = "//div[2]/p[@class='text-danger mb-0']",
                MESSAGE_ALERT_EMAIL_FIELD = "//p[@class='text-danger']",
                MESSAGE_ALERT_PASSWORD_FIELD = "//div[@class='form-group'][4]/p[@class='text-danger mb-0']",
                MESSAGE_ALERT_CONFIRM_PASSWORD_FIELD = "//div[@class='form-group'][5]/p[@class='text-danger mb-0']",
                MESSAGE_ACCOUNT_EXISTS = "//p[@class='text-danger text-center mt-2']";
    }

    public interface AuthPage {
        String LOGIN_FORM = "//h3[text()='Sign in to WHAT']",
                EMAIL_FIELD = "email",
                PASSWORD_FIELD = "password",
                BUTTON_SIGN_IN = "//button[text()='Sign in']",
                REGISTRATION_LINK = "//a[@href='/registration']",
                FORGOT_PASSWORD_LINK = "//a[@href='/forgot-password']",
                MESSAGE_ALERT_EMAIL_FIELD = "//p[@class='text-center text-danger mt-2']",
                MESSAGE_ALERT_REQUIRED_EMAIL = "//div[@class='form-group'][1]/p[@class='text-danger']",
                MESSAGE_ALERT_REQUIRED_PASSWORD = "//div[@class='form-group'][2]/p[@class='text-danger']",
                MESSAGE_ALERT_INVALID_DATA_AFTER_CLICK = "//p[@class='text-center text-danger mt-2']";
    }

    public interface ForgotPasswordPage {
        String FORGOT_PASSWORD_FORM = "//div[@class='forgot-password__form___8bk7S card, shadow']",
                EMAIL_ADDRESS_FIELD = "email",
                BUTTON_SEND = "//button[text()='Send']",
                BUTTON_BACK = "//button[text()='Back']",
                MESSAGE_FORGOT_PASSWORD_SEND = "//div[@class='modal-header']/h4",
                MESSAGE_FORGOT_PASSWORD_SEND_TEXT = "//div[@class='modal-window__modal-body___3v1gd modal-body']";
    }

    public interface SideBarItems {
        String SIDEBAR_LIST = "//div[@class='sidebar__sidebar__links___GkXK-']",
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
        String DROPDOWN_ROWS = "//select[@class='form-control']",
                DROPDOWN_ROWS_ITEM_9 = "//select[@class='form-control']/option[text()='9']",
                DROPDOWN_ROWS_ITEM_27 = "//select[@class='form-control']/option[text()='27']",
                DROPDOWN_ROWS_ITEM_45 = "//select[@class='form-control']/option[text()='45']",
                DROPDOWN_ROWS_ITEM_72 = "//select[@class='form-control']/option[text()='72']",
                DROPDOWN_ROWS_ITEM_99 = "//select[@class='form-control']/option[text()='99']",
                BUTTON_PREVIOUS_PAGE = "//button[text()='<']",
                BUTTON_NEXT_PAGE = "//button[text()='>']",
                BUTTON_CURRENT_PAGE = "//button[@class='page-link pagination__link___2AEaH pagination__active___3Zjzn']";
    }

    public interface MyProfileItems {
        String MY_PROFILE_ICON = "//div[@class='header__header__account-user___2Pe1D']/a[@href='/my-profile']",
                MY_PROFILE_FULL_NAME = "//span[@class='header__header__account-user--fullname___2kSON']",
                MY_PROFILE_DROPDOWN_ITEM = "//span[@class='header__header__dropdown-icon___1CTJ8']",
                MY_PROFILE_DROPDOWN_LOG_OUT = "//a[contains(text(),'Log Out')]";
    }

    public interface MyProfilePage {
        String EMAIL_ADDRESS = "//div[@class='row mt-3'][3]/div[@class='col-sm-8']",
                USER_DATA = "//div[@class='col-sm-8']",
                CHANGE_PASSWORD_BUTTON = "//button";
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
                CONFIRM_BUTTON = "//button[text()='Confirm']",
                CANCEL_BUTTON = "//button[text()='Cancel']",
                CANCEL_ITEM = "//span[contains(text(),'×')]",
                ERROR_MESSAGES = "//div[@class='text-danger mt-3']",
                NEW_PASS_NOT_VALID_DATA = "//div[text()='Password must contain at least 8 characters']",
                CONFIRM_NEW_PASS_NOT_VALID_DATA = "//div[text()='You should confirm your password']";
    }

    public interface UnassignedUsersPage {
        String UNASSIGNED_USERS_HEADER = "//h2[text()='Unassigned Users']",
                SEARCH_ICON = "//use[@href='/assets/svg/Search.svg#Search']",
                TABLE_HEAD_NAME = "//span[contains(text(),'Name')]",
                TABLE_HEAD_SURNAME = "//span[contains(text(),'Surname')]",
                TABLE_HEAD_EMAIL = "//span[contains(text(),'Email')]",
                TABLE_HEAD_CHOOSE_ROLE = "//th[text()='Choose role']",
                ADD_ROLE_BUTTON = "//button[text()='Add role']",
                ROWS_FIELD = "//span[contains(text(),'Rows')]",
                ROWS_TABLE = "//tbody[@class='table__table-body___bYZbU']",
                SUCCESS_MESSAGE = "//div[@class='fade alert alert-success alert-dismissible show']";

    }

    public interface StudentsPage {
        String STUDENTS_PAGE_HEADER = "//h2[text()='Students']",
                SIDE_BAR_INPUT = "//button[@class='nav-item nav-link d-flex justify-content-left\']",
                STUDENT_NAME_INPUT = "//input[@class='search__searchInput___34nMl']",
                TABLE_HEADLINES = "//thead//th",
                TABLE_CONTENT = "//tbody//tr",
                ROW_ON_DETAILS_PAGE = "//*[contains(@class,'row') and contains(@class,'mb-4')]",
                EDIT_BUTTON = "//button[@type='']",
                ADD_STUDENT = "//button[@class='btn button__default___3hOmG button__button___24ZfP']",
                STUDENTS_ROW = "//td[not(contains(@class,'text-center'))]",
                UPLOAD_STUDENT = "//button[@class='btn button__default___3hOmG button__button___24ZfP btn btn-warning  list-of-students__left-add-btn___3SDcH']",
                DETAILS = "//button[@class='btn button__default___3hOmG button__button___24ZfP blocks__btnDetails___2XJNp']",
                SWITCH_DISABLED_STUDENT = "//input[@class='custom-control-input list-of-students__custom-control-input___3BkC4']",
                NEXT_PAGE = "//a[@class='page-link pagination__link___2AEaH pagination__active___3Zjzn']",
                STUDENTS_TABLE_BODY = "//tbody[@class='table__table-body___bYZbU']//tr",
                STUDENTS_TABLE_ROWS = "//tbody[@class='table__table-body___bYZbU']//tr/td",
                STUDENTS_DETAILS_BUTTON = "//button[@class='btn button__default___3hOmG button__button___24ZfP blocks__btnDetails___2XJNp']",
                BUTTON_CARD_VIEW = "//div[@class=\"btn-group\"]//button[2]",
                BUTTON_STUDENTS_TABLE = "//*[@href='/assets/svg/Card.svg#Card']";
    }

    public interface StudentsDetailsTab {
        String STUDENT_DETAILS_HEADER = "//a[@class='nav-item nav-link tab__tab___1xEn9']",
                FIRST_NAME_FIELD = "//*[text()='First name: ']//following::span[1]",
                LAST_NAME_FIELD = "//*[text()='Last name: ']//following::span[1]",
                EMAIL_FIELD = "//*[text()='Email: ']//following::span[1]",
                LIST_OF_GROUPS = "//*[text()='Group(s): ']//following::div[1]//child::span//a",
                LIST_OF_LESSON = "//*[text()='Lesson(s): ']//following::div[1]//child::span//a",
                STUDENTS_DETAILS_ARROW_BUTTON = "//*[@class ='bi bi-arrow-left']";
    }

    public interface EditStudentDetailsTab {
        String EDIT_STUDENT_DETAILS_HEADER = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                FIRST_NAME_FIELD = "//input[@id='firstName']",
                LAST_NAME_FIELD = "//input[@id='lastName']",
                EMAIL_FIELD = "//input[@id='email']",
                GROUP_FIELD = "//input[@id='groupsInput']",
                GROUPS_PLUS_BUTTON = "//button[text()= '+']",
                LECTURERS = "//li[@class='edit-students-details__list-element___3Ny4s d-flex bg-light border border-outline-secondary rounded']",
                EXCLUDE_BUTTON = "//button[@class='btn button__default___3hOmG button__button___24ZfP edit-students-details__exclude-btn___1Bizc w-100']",
                RESET_BUTTON = "//button[@class='w-100 btn btn-secondary edit-students-details__button___WOMG6']",
                SAVE_BUTTON = "//button[@class='w-100 btn btn-info edit-students-details__button___WOMG6']";
    }

    public interface SecretariesPage {
        String HEADER_SECRETARIES = "//h2[@class='col-6']",
                PROFILE_INFO = "//span[@class='header__header__dropdown-icon___1CTJ8']",
                PROFILE_LOG_OUT = "//a[contains(text(),'Log Out')]",
                VIEW_SWITCH_LIST_SECRETARY = "//button[@class='btn btn-secondary']",
                VIEW_SWITCH_CARD_SECRETARY = "//button[@class='btn btn-secondary']",
                BODY_CARD_SECRETARY = "//div[@class='card-body d-flex justify-content-between']",
                SEARCH_FIELD_SECRETARY = "//input[@class ='search__searchInput___34nMl']",
                SWITCH_DISABLED_SECRETARY = "//label[@class = 'custom-control-label list-of-secretaries__custom-control-label___3l-9N')]",
                ADD_SECRETARY = "//span[contains(text(),'Add a secretary')]",
                DROPDOWN_ROW = "//select[@class='form-control']",
                DROPDOWN_LIST_ROW = "//select[@class='form-control']/option[text()='9']",
                HEAD_NAME_SECRETARY = "//tbody/tr/td[1]",
                HEAD_SURNAME_SECRETARY = "//tbody/tr/td[2]",
                HEAD_EMAIL_SECRETARY = "//tbody/tr/td[3]",
                SORT_ASCENDING = "//span[@data-sorted-by-ascending]",
                EDIT_SECRETARY = "//td[@class='text-center']",
                LINE_LIST_SECRETARIES = "//tbody/tr[1]";
    }

    public interface EditSecretary {
        String SECRETARY_DETAILS_ARROW_BUTTON = "//*[@class ='bi bi-arrow-left']",
                EDIT_SECRETARY_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                SECRETARY_FIRST_NAME = "//input[@name='firstName']",
                SECRETARY_LAST_NAME = "//input[@name='lastName']",
                SECRETARY_EMAIL = "//input[@name='email']",
                SECRETARY_LAY_OFF_BUTTON = "//button[@class='btn btn-dark button__button___24ZfP w-100']",
                SECRETARY_SAVE_BUTTON = "//button[text()='Save']",
                SECRETARY_DETAILS_TITLE = "//a[@class='nav-item nav-link tab__tab___1xEn9']",
                RESET_SECRETARY_BUTTON = "//button[text()='Reset']",
                CONFIRM_ACTION = "//div[@class='modal-window__modal-body___3v1gd modal-body']",
                CANCEL_BUTTON = "//button[@class='btn btn-secondary modal-window__modal-btn___bRf5m']",
                LAY_OFF_BUTTON = "//button[@class='btn btn-danger modal-window__modal-btn___bRf5m']",
                MESSAGE_DONE_EDIT_SECRETARIES_TEXT = "//button[text()='The secretary has been successfully edited']";
    }

    public interface SecretaryDetails {
        String SECRETARY_DETAILS_ARROW_BUTTON = "//*[@class ='bi bi-arrow-left']",
                SECRETARY_DETAILS_TAB = "//h3",
                SECRETARY_DETAILS_TITLE = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                SECRETARY_DETAILS_FIRST_NAME = "//div[text()='Robert']",
                SECRETARY_DETAILS_LAST_NAME = "//div[@class = 'col-12 col-md-6']",
                SECRETARY_DETAILS_EMAIL = "//div[@class = 'col-12 col-md-6']",
                SECRETARY_NAME_LIST = "//tbody/tr[1]/td[1]",
                SECRETARY_SURNAME = "//tbody/tr[1]/td[2]",
                SECRETARY_EMAIL = "//tbody/tr[1]/td[2]";
    }

    public interface ListOfCourses {
        String COURSE_SIDEBAR = "//a[@data-id='5']",
                ADD_COURSE_BUTTON = "//span[@data-testid='addCourseBtnText']",
                EDIT_COURSE_ICON = "//*[@class='rows__scale___3-XzJ']",
                DISABLED_COURSE_SWITCH = "//*[@for='switchDisabled']",
                COURSES_SEARCH_FIELD = "//input[@type='text']",
                ROW_ICON_BUTTON = "//*[@href='/assets/svg/List.svg#List']",
                CARD_ICON_BUTTON = "//*[@data-testid='showCardBlocks']",
                COURSE_NAME_TITLE = "//h2[@class='col-6']",
                COURSES_TEXT_PAGE = "//h2[text() = 'Courses']",
                NUMBER_OF_COURSES = "//span[@class='col-2 text-right']",
                COURSE_ROW_NAME = "//tbody/tr",
                PAGINATION_LIST_BUTTON = "//*[@class='form-control']",
                PAGINATION_LIST = "//label/select/option",
                TITLE_SORT = "//*[@class='table__rotate___1dA7g']";
    }

    public interface CourseDetails {
        String ARROW_LEFT_BUTTON = "//*[@class='bi bi-arrow-left']",
                COURSE_DETAILS_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                CARD_DETAILS_BUTTON = "//*[@class='btn button__default___3hOmG button__button___24ZfP blocks__btnDetails___2XJNp']",
                CARD_TEXT = "//*[text()='Soft Skills for Lecturers']",
                COURSE_NAME_TEXT_DETAILS = "//span[text()='Soft Skills for Lecturers']",
                ARROW_DOWN_ICON_EXIT = "//*[@class='header__header__dropdown-icon___1CTJ8']",
                LOGOUT_BUTTON = "//*[text()='Log Out']";
    }

    public interface EditCourseDetails {
        String EDIT_COURSE_DETAILS_TAB = "//a[@class='nav-item nav-link tab__tab___1xEn9 tab__active___3e65x']",
                COURSE_NAME_FIELD = "//input[@name='name']",
                SAVE_BUTTON = "//button[@type='submit']",
                RESET_BUTTON = "//button[@type='reset']",
                DISABLE_BUTTON = "//span[text()='Disable']",
                INVALID_MESSAGE = "//*[text()='Invalid course name']",
                SHORT_MESSAGE = "//*[text()='Too short']",
                NEW_COURSE_NAME_TITLE = "//*[text()='Test Course 1']",
                COURSE_TEST_ROW_TEXT = "//*[text()='Test Course']",
                EDIT_COURSE_TEST_ICON = "//tbody/tr[7]/td//*[@class='rows__scale___3-XzJ']";
    }

    public interface MentorsTablePage {
        String EDIT_MENTORS_DETAIL_ICON = "//*[@href='/assets/svg/Edit.svg#Edit']",
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