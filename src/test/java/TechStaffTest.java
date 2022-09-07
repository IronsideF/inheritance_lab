import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TechStaffTest {

    private Developer myDev;
    private DatabaseAdmin myAdmin;

    @Before
    public void before(){
        myDev = new Developer("Mar", "450007", 25000.00);
        myAdmin = new DatabaseAdmin("James", "6567", 23000.00);
    }

    @Test
    public void hasProperties(){
        assertEquals("Mar", myDev.getName());
        assertEquals("James", myAdmin.getName());
        assertEquals("450007", myDev.getNiNumber());
        assertEquals("6567", myAdmin.getNiNumber());
        assertEquals(25000.0, myDev.getSalary(), 0.0);
        assertEquals(23000.0, myAdmin.getSalary(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        myDev.raiseSalary(100.0);
        myAdmin.raiseSalary(100.0);
        assertEquals(25100.0, myDev.getSalary(),0.0);
        assertEquals(23100.0, myAdmin.getSalary(),0);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(250.0, myDev.payBonus(), 0.0);
        assertEquals(230.0, myAdmin.payBonus(), 0.0);
    }
}
