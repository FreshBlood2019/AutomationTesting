import org.testng.annotations.Test;

public class HouseTest {

    @Test
    public void testHouseClass() {
        House myFirstHouse = new House(100000, 3);
        House mySecondHouse = new House(200000, 4);

        myFirstHouse.buy();
        mySecondHouse.printAllInfo();
        myFirstHouse.printAllInfo();
        System.out.println("myFirstHouse.getYear() =" +myFirstHouse.getYear());
        myFirstHouse.setYear("1975");
        String firstHouseYear = myFirstHouse.getYear();
        System.out.println("firstHouseYear =" + firstHouseYear);

        boolean isEqualTo = false;
        if(firstHouseYear != null){
            String year = myFirstHouse.getYear();
            isEqualTo = year.equalsIgnoreCase("1975");
        }

        System.out.println("isEqualTo =" + isEqualTo);
    }
}
