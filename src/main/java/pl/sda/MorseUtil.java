package pl.sda;

public class MorseUtil {
    public static String encodeMorse(String text){
        MorseEncoder morseEncoder= new MorseEncoder();
        return morseEncoder.encode(text);

    }

    public static String decodeMorse (String text){
        MorseDecoder decoder = new MorseDecoder();
        return decoder.decode(text);
    }
}
