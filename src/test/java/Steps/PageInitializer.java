package Steps;


import Pages.LoginPage;
import Pages.FormCompletionPage;


public class PageInitializer {

    public static LoginPage loginPage;
    public static FormCompletionPage formCompletionPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
        formCompletionPage = new FormCompletionPage();

    }

}
