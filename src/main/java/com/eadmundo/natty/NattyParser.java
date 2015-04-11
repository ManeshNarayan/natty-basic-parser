package com.eadmundo.natty;

import com.joestelmach.natty.*;
import java.util.List;
import java.util.Date;

public class NattyParser {

    public static String parseDate(String nlpDateString) {
        Parser parser = new Parser();
        List<DateGroup> groups = parser.parse(nlpDateString);
        if (groups.isEmpty()) {
            return "false";
        } else {
            DateGroup group = groups.get(0);
            Date date = group.getDates().get(0);
            return date.toString();
        }
    }

}
