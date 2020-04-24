package com.eadmundo.natty;

import com.joestelmach.natty.*;
import java.util.List;
import java.util.Date;

public class NattyParser {

    public static List<DateGroup> parseDateIntoGroups(String nlpDateString) {
        Parser parser = new Parser();
        List<DateGroup> groups = parser.parse(nlpDateString);
        return groups;
    }

}
