

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AppointmentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AppointmentTest
{
    /**
     * Default constructor for test class AppointmentTest
     */
    public AppointmentTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void testAppointmentFieldUponCreation()
    {
        Appointment testApp = new Appointment("dentist", 1);
        if(testApp.getDescription() != null &&
            testApp.getDuration() != 0){
            System.out.println("test succes: correctly created");
        }
        else{
            System.out.println("test failure: Error detected");
        }
    
}
}
