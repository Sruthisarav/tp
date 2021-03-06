package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a flashcard's answer.
 * Guarantees: immutable; is valid as declared in {@link #isValidAnswer(String)}
 */
public class Answer {


    public static final String MESSAGE_CONSTRAINTS =
            "Answers should be at least 2 characters long";
    public final String value;

    /**
     * Constructs a {@code Phone}.
     *
     * @param answer A valid answer number.
     */
    public Answer(String answer) {
        requireNonNull(answer);
        checkArgument(isValidAnswer(answer), MESSAGE_CONSTRAINTS);
        value = answer;
    }

    /**
     * Returns true if a given string is a valid phone number.
     */
    public static boolean isValidAnswer(String test) {

        return test.length() >= 2;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Answer // instanceof handles nulls
                && value.equals(((Answer) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
