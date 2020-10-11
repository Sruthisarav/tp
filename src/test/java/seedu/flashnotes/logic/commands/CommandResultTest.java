package seedu.flashnotes.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CommandResultTest {
    @Test
    public void equals() {
        CommandResult commandResult = new CommandResult("feedback");

        // same values -> returns true
        assertTrue(commandResult.equals(new CommandResult("feedback")));
<<<<<<< HEAD
        assertTrue(commandResult.equals(new CommandResult("feedback", false, false, false, false, 0)));
=======
        assertTrue(commandResult.equals(new CommandResult("feedback", false, false, false)));
>>>>>>> upstream/init-review-mode-branch

        // same object -> returns true
        assertTrue(commandResult.equals(commandResult));

        // null -> returns false
        assertFalse(commandResult.equals(null));

        // different types -> returns false
        assertFalse(commandResult.equals(0.5f));

        // different feedbackToUser value -> returns false
        assertFalse(commandResult.equals(new CommandResult("different")));

        // different showHelp value -> returns false
<<<<<<< HEAD
        assertFalse(commandResult.equals(new CommandResult("feedback", true, false, false, false, 0)));

        // different exit value -> returns false
        assertFalse(commandResult.equals(new CommandResult("feedback", false, true, false, false, 0)));
=======
        assertFalse(commandResult.equals(new CommandResult("feedback", true, false, false)));

        // different exit value -> returns false
        assertFalse(commandResult.equals(new CommandResult("feedback", false, true, false)));
>>>>>>> upstream/init-review-mode-branch
    }

    @Test
    public void hashcode() {
        CommandResult commandResult = new CommandResult("feedback");

        // same values -> returns same hashcode
        assertEquals(commandResult.hashCode(), new CommandResult("feedback").hashCode());

        // different feedbackToUser value -> returns different hashcode
        assertNotEquals(commandResult.hashCode(), new CommandResult("different").hashCode());

        // different showHelp value -> returns different hashcode
<<<<<<< HEAD
        assertNotEquals(commandResult.hashCode(), new CommandResult("feedback", true,
                false, false, false, 0).hashCode());

        // different exit value -> returns different hashcode
        assertNotEquals(commandResult.hashCode(), new CommandResult("feedback", false,
                true, false, false, 0).hashCode());
=======
        assertNotEquals(commandResult.hashCode(), new CommandResult("feedback", true, false, false).hashCode());

        // different exit value -> returns different hashcode
        assertNotEquals(commandResult.hashCode(), new CommandResult("feedback", false, true, false).hashCode());
>>>>>>> upstream/init-review-mode-branch
    }
}
