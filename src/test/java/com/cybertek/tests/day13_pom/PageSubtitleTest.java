package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /**
     * Test case:
     *      Open a browser
     *      Login as a Driver
     *      Verify that page subtitle is Quick Lanchpad
     *      Go to Activities -> Calender Events
     *      Verify that page subtitle is Calender Events

     */

    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        String expectedSubtitle = "Quick Launchpad";
        DashboardPage dashboardPage = new DashboardPage();
        String actualSubtitle = dashboardPage.getPageSubTitle();
        Assert.assertEquals(actualSubtitle,expectedSubtitle,"Verify it bro");

        dashboardPage.navigateToModule("Activities","Calender Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        BrowserUtils.waitFor(3);
        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events", "Verify subtitle Calender Events");

    }


}
