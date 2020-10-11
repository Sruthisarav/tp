package seedu.flashnotes.logic.commands;

import static seedu.flashnotes.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.flashnotes.logic.commands.ExitCommand.MESSAGE_EXIT_ACKNOWLEDGEMENT;

import org.junit.jupiter.api.Test;

import seedu.flashnotes.model.Model;
import seedu.flashnotes.model.ModelManager;

public class ExitCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute_exit_success() {
<<<<<<< HEAD
        CommandResult expectedCommandResult = new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false,
                true, false, false, 0);
=======
        CommandResult expectedCommandResult = new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true, false);
>>>>>>> upstream/init-review-mode-branch
        assertCommandSuccess(new ExitCommand(), model, expectedCommandResult, expectedModel);
    }
}
