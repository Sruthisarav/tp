package seedu.flashnotes.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.flashnotes.testutil.TypicalFlashcards.getTypicalFlashNotes;

import org.junit.jupiter.api.Test;

import seedu.flashnotes.model.Model;
import seedu.flashnotes.model.ModelManager;
import seedu.flashnotes.model.UserPrefs;

public class CorrectCommandTest {
    private Model model;
    private Model expectedModel;
    @Test
    public void execute_correct_command_success() {
        model = new ModelManager(getTypicalFlashNotes(), new UserPrefs());
        expectedModel = new ModelManager(model.getFlashNotes(), new UserPrefs());
        CommandResult expectedCommandResult = new CommandResult(CorrectCommand.MESSAGE_CORRECT_ACKNOWLEDGEMENT,
                false, false, false, false, 2);
        CorrectCommand correctCommand = new CorrectCommand();
        assertEquals(correctCommand.execute(model), expectedCommandResult);
    }

}
