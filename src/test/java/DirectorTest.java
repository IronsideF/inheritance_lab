import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director myDirector;

    @Before
    public void before(){
        myDirector = new Director("Andrew", "PH4712C", 600.00, "Global", 45000.0);
    }
    @Test
    public void hasProperties(){
        assertEquals("Andrew", myDirector.getName());
        assertEquals("PH4712C", myDirector.getNiNumber());
        assertEquals(600.0, myDirector.getSalary(), 0.0);
        assertEquals("Global", myDirector.getDeptName());
        assertEquals(45000.0, myDirector.getBudget(),0.0);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(12.0, myDirector.payBonus(), 0.0);
    }
}
