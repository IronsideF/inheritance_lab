import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager myManager;

    @Before
    public void before(){
        myManager = new Manager("Keith", "27002J", 30000.00, "Software");
    }
    @Test
    public void hasProperties(){
        assertEquals("Keith", myManager.getName());
        assertEquals("27002J", myManager.getNiNumber());
        assertEquals(30000.00, myManager.getSalary(), 0.0);
        assertEquals("Software", myManager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        myManager.raiseSalary(600.00);
        assertEquals(30600.00, myManager.getSalary(), 0.0);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(300.00, myManager.payBonus(),0.0);
    }
    @Test
    public void canPreventNullName(){
        myManager.setName(null);
        assertEquals("Keith", myManager.getName());
        myManager.setName(" ");
        assertEquals("Keith", myManager.getName());
    }
}
