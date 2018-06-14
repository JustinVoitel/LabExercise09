

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class DayTest.
 *
 * @author  Daan Lockhorst
 * @version 12.06.2018
 */
public class DayTest
{
    /**
    * This method testst if the findSpace returns when there is one
    * appointment made at nine.
    * 
    */
  
    @Test
    public void testFindSpaceWithFirstSlotFilled()
    {
    Day aDay = new Day(0);
    Appointment firstAppointment = new Appointment("something", 1);
    Appointment secondAppointment = new Appointment("dokter", 1);
    aDay.makeAppointment(9, firstAppointment);
    int testResult = aDay.findSpace(secondAppointment);
    if(testResult == 10){
        System.out.println("test succes: the number is 10");
    }
    else{
        System.out.println("test failure: the number is not 10 it's "
            + testResult);
            }
}
    /**
    * This method testst if the findSpace returns -1 when the whole 
    * day is booked full
    * 
    */
    @Test
    public void testFindSpaceWithAllSlotsFilled()
    {
        System.out.println();
        System.out.println("#___________test results_____________#");
        Day anotherDay = new Day(1);
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        for(int i = 9; i < 18; i ++)
        {
            appointments.add(new Appointment(Integer.toString(i), 1));
            anotherDay.makeAppointment(i, appointments.get(i - 9));
        }
        if(anotherDay.findSpace(appointments.get(0)) == -1)
        {
            System.out.println("test succes: returned -1");
        } else{
            System.out.println("test failed");
        }
    }
    @Test 
    public void testThatBreaks()
    {
        Day theWrongDayForVeganFood = new Day(6);
        Appointment ap1 = new Appointment(
        "eat unlimited bratwurst in one hour", 1);
        Appointment ap2 = new Appointment("eat vegan stuff and do yoga", 2);
        
        theWrongDayForVeganFood.makeAppointment(9, ap1);
        System.out.println("test failure: returns " +
        theWrongDayForVeganFood.makeAppointment(9, ap2));
}
}