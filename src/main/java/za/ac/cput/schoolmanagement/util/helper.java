package za.ac.cput.schoolmanagement.util;

import org.apache.commons.lang3.StringUtils;
public class helper {

    public static boolean isEmptyOrNull(String str) {
        return StringUtils.isEmpty(str);
    }
    public static String EmptyIfNull(String str) {
        if (isEmptyOrNull(str))
            return "";
        return str;
    }

    public static void checkStringPara(String paraName, String paraValue) {
        if (isEmptyOrNull(paraValue))
            throw new IllegalArgumentException("Invalid Value for " + paraValue);

    }

    public static boolean isValidString(String firstName) {
        if(!firstName.isEmpty())
            return true;
        else
            return false;
    }

}