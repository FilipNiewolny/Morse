package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class MorseUtilTest {

    @Test
    public void encodeMorseTest() {
        //Given
        String textToEncode = "Litwo ojczyzno moja";
        String expectedResult = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        //When
        String result = MorseUtil.encodeMorse(textToEncode);
        //Then
        Assert.assertEquals(expectedResult.toUpperCase(), result);
    }

    @Test
    public void decodeMorseTest() {
        //Given
        String textToDecode = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        String expectedResult = "Litwo ojczyzno moja";
        //When
        String result = MorseUtil.decodeMorse(textToDecode);
        //Then
        Assert.assertEquals(expectedResult.toUpperCase(), result);
    }
}