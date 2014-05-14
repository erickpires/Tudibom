package tudibom;

/**
 * Created by erick on 5/14/14.
 */
public class Util {
    static final boolean isIntegerNumber(String s){
        return s.matches("[0-9]+");
    }

    static final boolean isFloatNumber(String s){
        return s.matches("[0-9]+(.[0-9]+)?");
    }

    static final boolean isMoneyNumber(String s){
        return s.matches("[0-9]+(.[0-9]{0,2})?");
    }

    static final boolean isDateFormat(String s){
        return s.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4,4}");
    }
}
