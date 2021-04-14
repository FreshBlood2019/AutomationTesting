public class ChooseBrowser {

    String companyOwner;
    double marketShareWorldwide;
    int yearOfOrigin;

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    public double getMarketShareWorldwide() {
        return marketShareWorldwide;
    }

    public void setMarketShareWorldwide(double marketShareWorldwide) {
        this.marketShareWorldwide = marketShareWorldwide;
    }

    public int getYearOfOrigin() {
        return yearOfOrigin;
    }

    public void setYearOfOrigin(int yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }

    //Constructor
    ChooseBrowser(String companyOwner, double marketShareWorldwide, int yearOfOrigin){
        this.companyOwner = companyOwner;
        this.marketShareWorldwide = marketShareWorldwide;
        this.yearOfOrigin = yearOfOrigin;
    }

    public void browserInfo() {
        System.out.println("The company owner is: " + companyOwner);
        System.out.println("Market share worldwide is: " + marketShareWorldwide);
        System.out.println("The year of origin is: " + yearOfOrigin);
    }
}
