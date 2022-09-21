public class Lab03_100pt
{
    public static void main(String args[]) {

        System.out.println("Lab03,  100 Point Version");
        int mil = 10000123;

        System.out.println("");
        System.out.println("Starting milli-seconds: " + mil);

        int hr = mil/3600000;
        mil %=3600000;
        int min = mil/ 60000;
        mil %= 60000;
        int sec = mil/1000;
        mil %= 1000;


        System.out.println("Hours:                  " + hr);
        System.out.println("Minutes:                " + min);
        System.out.println("Seconds:                " + sec);
        System.out.println("Milli Seconds:          " + mil);
        System.out.print("");
        System.out.print("");
    }







}
