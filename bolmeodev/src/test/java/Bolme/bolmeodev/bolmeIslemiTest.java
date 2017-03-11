package Bolme.bolmeodev;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class bolmeIslemiTest {
	@Test
    public void shouldChamberInputs() {

        final bolmeIslemi bolmeIslemi = new bolmeIslemi();

        float response = bolmeIslemi.bolmeIslemi(2,4);
        assertTrue(response == 0.5);

    }


    @Test
    public void shouldChamberInputsWithParams() {

        final bolmeIslemi bolmeIslemi = new bolmeIslemi();

        float response = bolmeIslemi.bolmeIslemi(10, 5);
        assertTrue(response == 2);

    }

}
