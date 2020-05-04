import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.appclac.calcprocess;

public class Testcalcprocess {
	
	calcprocess test=new calcprocess();
	
    
	
   
    @Test
    public void testadd() throws Exception {
        double output=test.add(123,232);
        assertEquals(355,output,0);
    }

    @Test
    public void testsubtract() throws Exception {
    	double output=test.sub(123,232);
        assertEquals(-109,output,0);
    }

    @Test
    public void testmultiplication() throws Exception {
    	double output=test.mul(-100,23);
        assertEquals(-2300,output,0);
    }

    @Test
    public void testdivision() throws Exception {
    	double output=test.div(-100,23);
        assertEquals(-4.3478260869565215,output,0);
    }

    @Test
    public void testdividezeroby() throws Exception {
    	double output=test.div(0,23);
        assertEquals(0.0,output,0);
    }

}
