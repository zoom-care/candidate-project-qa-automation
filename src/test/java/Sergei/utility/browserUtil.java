package Sergei.utility;

public class browserUtil {

    //couple examples of static methods for UI testing

    public static void sleep(int sec) {

        try {
            Thread.sleep(sec * 1000);


        } catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happen in sleep method!");

        }
    }

    public static String titleVerification(){
      return driver.getDriver().getTitle();


    }

}
