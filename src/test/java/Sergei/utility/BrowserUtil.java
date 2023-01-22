package Sergei.utility;

public class BrowserUtil {

    public static void sleep(int sec) {

        try {
            Thread.sleep(sec * 1000);


        } catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happen in sleep method!");

        }
    }

    public static String titleVerification(){
      return Driver.getDriver().getTitle();


    }



}
