import org.testng.annotations.Test;

public class FirstClass {
    @Test
    public void testMyFirstTest() {
        System.out.println("Hello, Natalie!");
    }

    @Test
    public void testNumbers() {
        int myNumber;
        myNumber = 5;

        System.out.println(myNumber);
    }

    @Test
    public void testConcatenation() {
        String s1 = "Dogs are !";
        String s2 = "Who who who who!";

        String s3 = s1 + s2;

        System.out.println(s3);
    }

    @Test
    public void testConcatenation02() {
        String messagePrefix = "Dogs are !";
        String messageSuffix = " Who who who who!";
        int numberForMessage = 3;

        String s3 = messagePrefix + numberForMessage + messageSuffix;

        System.out.println(s3);
    }

    @Test
    public void testClicks() {
        String messagePrefix = "I clicked ";
        int numberOfClicks = 5;

        String messageSuffix = " times and ";

        System.out.println(messagePrefix + numberOfClicks + messageSuffix);
    }

    @Test
    public void testMethods() {
        String messagePrefix = "I tapped on the screen ";
        int numberOfClicks = 10;
        String messageSuffix = " times ";

        combineStringsAndNumber(messagePrefix, messageSuffix, numberOfClicks);
    }

    public void combineStringsAndNumber(String prefix, String suffix, int numberOfTimes) {
        System.out.println(prefix + numberOfTimes + suffix);
    }


    @Test
    public void testBoolean() {
        boolean b = true;
        boolean toBe = false;

        b = toBe || !toBe;

        if (toBe || !toBe) {
            System.out.println(toBe);
        }
    }

    @Test
    public void testIfStatements() {
        boolean isElementVisible = false;
        if(isElementVisible){
            System.out.println("Click on the Element");
        } else {
            System.out.println("Wait until it will be visible");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfIntegers = {1, 2, 3, 4};

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            System.out.println(arrayOfIntegers[i]);
        }
    }

    @Test
    public void testArrays02() {
        int[] arrayOfIntegers = {34, 23434, 34343, 443434};
        printValuesOfArray(arrayOfIntegers);
    }

    public void printValuesOfArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
