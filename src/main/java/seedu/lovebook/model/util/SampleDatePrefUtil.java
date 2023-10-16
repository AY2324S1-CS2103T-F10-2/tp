package seedu.lovebook.model.util;

import seedu.lovebook.model.DatePrefs;
import seedu.lovebook.model.person.Age;
import seedu.lovebook.model.person.Gender;
import seedu.lovebook.model.person.Height;
import seedu.lovebook.model.person.Income;

public class SampleDatePrefUtil {
    public static DatePrefs getSamplePreferences() {
        Age age = new Age("20");
        Height height = new Height("180");
        Income income = new Income("10000");
        Gender gender = new Gender("F");
        return new DatePrefs(age, gender, height, income);
    }
}
