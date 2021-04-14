import org.testng.annotations.Test;

public class ChooseBrowserTest {

    @Test
    public void testBrowser(){
        ChooseBrowser Chrome = new ChooseBrowser("Google", 64.19, 2008);
        ChooseBrowser Safari = new ChooseBrowser("Apple", 19.03,2003 );
        ChooseBrowser FireFox = new ChooseBrowser("Mozilla", 3.68, 2004);
        ChooseBrowser Edge = new ChooseBrowser("Microsoft", 3.45, 2015);
        ChooseBrowser SamsungInternet = new ChooseBrowser("Samsung Electronics", 3.27, 2012);

        Chrome.browserInfo();
        System.out.println("----------------");
        Safari.browserInfo();
        System.out.println("----------------");
        FireFox.browserInfo();
        System.out.println("----------------");
        Edge.browserInfo();
        System.out.println("----------------");
        SamsungInternet.browserInfo();

        System.out.println("The owner of Chrome is: " + Chrome.getCompanyOwner());
    }
}
