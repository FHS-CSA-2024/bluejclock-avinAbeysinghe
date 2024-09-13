
public class ClockDriver
{
    public static String regTime(int hours, int mins){
        String readInital;
        ClockDisplay clock = new ClockDisplay(hours, mins);
        readInital = clock.getTime();
        clock.timeTick();
        return readInital + " -> " + clock.getTime();
    }
    public static String secTime(int hours, int mins, int sec){
        String readInital;
        ClockDisplaySeconds clock = new ClockDisplaySeconds(hours, mins, sec);
        readInital = clock.getTime();
        clock.timeTick();
        return readInital + " -> " + clock.getTime();
    }
    public static String halfRegTime(int hours, int mins){
        String readInital;
        ClockDisplay12Hour clock = new ClockDisplay12Hour(hours, mins);
        readInital = clock.getTime();
        clock.timeTick();
        return readInital + " -> " + clock.getTime();
    }

    public static void main(String[] args){

        //Default constructor arguments
        ClockDisplay displayEmpty = new ClockDisplay();
        ClockDisplaySeconds secondsEmpty = new ClockDisplaySeconds();
        ClockDisplay12Hour hour12Empty = new ClockDisplay12Hour();


        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00

        System.out.println("======ClockDisplay===========");
        System.out.println(displayEmpty.getTime());
        System.out.println(regTime(3, 32));
        System.out.println(regTime(3, 9));
        System.out.println(regTime(1, 59));
        System.out.println(regTime(9, 59));
        System.out.println(regTime(23, 59));



        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00

        System.out.println("======ClockDisplaySeconds===========");
        System.out.println(secondsEmpty.getTime());
        System.out.println(secTime(3, 32, 59));
        System.out.println(secTime(1, 00, 59));
        System.out.println(secTime(1, 59, 59));
        System.out.println(secTime(23, 59, 59));

        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        System.out.println("======ClockDisplay12Hour===========");
        System.out.println(hour12Empty.getTime());
        System.out.println(halfRegTime(15, 32)); 
        System.out.println(halfRegTime(23, 59));
        System.out.println(halfRegTime(11, 59));
        System.out.println(halfRegTime(12, 59));
    }
}
