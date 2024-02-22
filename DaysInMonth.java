/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daysinmonth;

/**
 *
 * @author OcampoG4446
 */
public class DaysInMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int startingValue =1 ;
        for (int month = 0; month<= startingValue; month += 1;)
        {
        switch(month)
        {
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("31 days");
                break;
            case 2:
                if (month == 2){
                    System.out.println("28 days unless it is on leap year");
                }
                break;
        }
        }
        System.out.printf("month" + month);
    }
    
}
