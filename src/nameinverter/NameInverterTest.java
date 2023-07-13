package nameinverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    private NameInverter nameInverter;

    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty(){
        String inverterName =  nameInverter.inverterName("");
        assertEquals("", inverterName);
    }

    @Test
    public void givenSingleName_returnSingleWord(){
        String inverterName =  nameInverter.inverterName("Name");
        assertEquals("Name", inverterName);
    }

    @Test
    public void givenSingleNameWithSpace_returnSingleWord(){
        String inverterName =  nameInverter.inverterName("    Name    ");
        assertEquals("Name", inverterName);
    }

    @Test
    public void givenFirstLast_returnLastFirst(){
        String inverterName =  nameInverter.inverterName("First Last");
        assertEquals("Last, First", inverterName);
    }

    @Test
    public void givenHonorifics_returnLastFirst(){
        String inverterName =  nameInverter.inverterName("Mrs. First Last");
        assertEquals("Last, First", inverterName);
    }

    @Test
    public void givenPostNominal_returnPostNominal(){
        String inverterName =  nameInverter.inverterName("Mrs. First Last MSc. PHd.");
        assertEquals("Last, First MSc. PHd.", inverterName);
    }
}