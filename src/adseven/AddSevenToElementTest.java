package adseven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddSevenToElementTest {
    @Test
    public void nothing(){}

    @Test
    public void givenEmptyArray(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {});
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    public void givenCArray(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"C"});
        assertArrayEquals(new String[]{"C7"}, result);
    }


    @Test
    public void givenC7Array(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"C7"});
        assertArrayEquals(new String[]{"C7"}, result);
    }
    @Test
    public void givenCharanArray(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"Charan"});
        assertArrayEquals(new String[]{"Charan7"}, result);
    }

    @Test
    public void givenChANdSuArray(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"Ch", "Su"});
        assertArrayEquals(new String[]{"Ch7", "Su7"}, result);
    }

    @Test
    public void givenCh7ANdSuArray(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"Ch7", "Su"});
        assertArrayEquals(new String[]{"Ch7", "Su7"}, result);
    }

    @Test
    public void givenCh7ANdSu7Array(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"Ch7", "Su7"});
        assertArrayEquals(new String[]{"Ch7", "Su7"}, result);
    }

    @Test
    public void givenCh7ANdSu7SdArray(){
        AddSevenToElement addSevenToElement = new AddSevenToElement();
        String[] result = addSevenToElement.addSeven(new String[] {"Ch7", "Su7", "Sd", "Te"});
        assertArrayEquals(new String[]{"Ch7", "Su7", "Sd7", "Te7"}, result);
    }
}
