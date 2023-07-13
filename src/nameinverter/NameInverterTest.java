package nameinverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmpty_returnEmpty(){
        NameInverter nameInverter = new NameInverter();
        String inverterName =  nameInverter.inverterName("");
        assertEquals("", inverterName);
    }

    @Test
    public void givenSingleName_returnSingleWord(){
        NameInverter nameInverter = new NameInverter();
        String inverterName =  nameInverter.inverterName("Name");
        assertEquals("Name", inverterName);
    }

    @Test
    public void givenSingleNameWithSpace_returnSingleWord(){
        NameInverter nameInverter = new NameInverter();
        String inverterName =  nameInverter.inverterName("    Name    ");
        assertEquals("Name", inverterName);
    }

    @Test
    public void givenFirstLast_returnLastFirst(){
        NameInverter nameInverter = new NameInverter();
        String inverterName =  nameInverter.inverterName("First Last");
        assertEquals("Last, First", inverterName);
    }

    @Test
    public void givenHonorifics_returnLastFirst(){
        NameInverter nameInverter = new NameInverter();
        String inverterName =  nameInverter.inverterName("Mrs. First Last");
        assertEquals("Last, First", inverterName);
    }

    @Test
    public void givenPostNominal_returnPostNominal(){
        NameInverter nameInverter = new NameInverter();
        String inverterName =  nameInverter.inverterName("Mrs. First Last MSc. PHd.");
        assertEquals("Last, First MSc. PHd.", inverterName);
    }
}