---
layout: page
title: User Guide
---
## Introduction
Welcome to the FlashNotes User Guide.

FlashNotes is a **desktop app for flashcards**, built for students who wish to utilise flashcards for studying. FlashNotes is also optimized for use via a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI). If you can type fast, FlashNotes will be faster than traditional GUI apps.

Flashcards are one of the oldest forms of studying methods, but it is also remarkably difficult to keep track of the vast amount of content to study for. However, with FlashNotes, you can now keep track of your flashcards and their content with ease.
FlashNotes allows you to organise your flashcards by topics or subjects using Decks. 

FlashNotes utilises a studying technique known as [Active Recall](https://en.wikipedia.org/wiki/Active_recall), allowing you to test yourself using flashcards to check if you have mastered your content.
Furthermore, FlashNotes will also keep track of your progress and show you an overview of how well you have mastered your content using flashcards.

This User Guide is for students who have no prior knowledge on how to create and review flashcards. We will teach you how create and manage your flashcards more efficiently, and how to review your flashcards for studying using FlashNotes. 
We will provide you with all the various features and commands of FlashNotes, and its details. 

To get started, head over to the [Quick Start](#quick-start) section.

To see the summary of all our commands, go to the [Command Summary](#command-summary) section.

Here's the Table of Contents for a brief overview of our User Guide, or for you to quickly access other sections of our User Guide.

--------------------------------------------------------------------------------------------------------------------

<details markdown="block">
<summary>Table of Contents</summary>
{:toc}
</details>

--------------------------------------------------------------------------------------------------------------------

## Glossary

* Flashcard: A flashcard shows a question and the answer to the question.
* Decks: A deck will contain flashcards.
* Index: The number at the start of each deck or flashcard.
* Review: A mode where only the question of the flashcard is shown; the answer will be hidden from you.
* Prefix: A reserved word that needs to be placed before your inputs to indicate the start of your input.
* :information_source:: Additional info
* :warning:: Warning

## Understanding the 3 different modes:
FlashNotes has 3 different modes, the main mode, card mode and review mode. Each mode has its own set of valid commands.  
You will always start in the Main Mode when you open FlashNotes.

### Mode 1: Main Mode
Contains a list of decks of flashcards. <br>

Users can: 
* View a list of decks
* Create, edit and delete decks
* Open a deck to view flashcards in it (Enters card mode)
* List all flashcards from all decks
* Clear all decks
* Set maximum number of cards to review
* View help
* Exit the program

![Main Mode GUI Breakdown](images/MainMode_GUIBreakdown.png)<br>

### Mode 2: Card Mode
Contains a list of flashcards.
<br><br>
Users can:
* Create, edit and delete flashcards
* Find flashcards by question
* Set maximum number of cards to review
* Start a review session
* Return to main mode
* View User Guide
* Exit the program

![Card Mode GUI Breakdown](images/CardMode_GUIBreakdown.png)<br>

### Mode 3: Review Mode
Displays flashcards one at a time for users to review.
<br><br>
Users can:
* Flip the flashcard to view the answer
* Mark a flashcard as correct or wrong to review the next card
* View statistics at the end of the review session

![Review Mode GUI Breakdown](images/ReviewMode_GUIBreakdown.png)
<br>
--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

1. Download the latest version of `flashnotes.jar` from [here](https://github.com/AY2021S1-T15-2/tp/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your FlashNotes.

1. Double-click the file to start the app. A view similar to the one below should appear in a few seconds.<br>
   ![Figure 1: Initial View with GUI Details](images/UG_GUIDetails.png)<br>
   _Figure 2A: Initial View of FlashNotes with GUI component labels._
   
   * **Command Box**: Where you input commands for FlashNotes.
   
   * **Result Box**: Where FlashNotes displays the resulting message to your last input in the Command Box.
   
   * **List of Decks**: Displayed list of decks currently in FlashNotes.

1. Type a command in the **Command Box** and press Enter to execute it. Some example commands you can try are:

   * **`addDeck`**`n/Languages `: Creates a new (empty) Deck named 'Languages'.

   * **`list`** : Lists all available flashcards in FlashNotes.

   * **`clear`** : Deletes all cards.

   * **`help`** : Opens the Help window.

   * **`enterDeck`**`Singapore `: Lists all cards inside the deck 'Singapore'.

   * **`exit`** : Exits the app.

1. After executing each command, a success or failure message will be displayed in the **Result Box**. This will let you know if you have successfully executed the relevant commands or not. Given that you have provided the correct command prefixes, it can even provide additional information on why your command has failed.  <br>


1. Refer to the [Features](#Main Mode Features) below for the details of each command.

<div markdown="block" class="alert alert-info">
   
   **:information_source: About the sample data:**<br>
   
   Initial launch of FlashNotes will result in the application loading in with our provided sample data. This is to accommodate first-time users wishing to familiarize themselves with FlashNotes before using it in-depth.
    
   Our provided sample data is not accurate nor necessary to the application. As such, you can easily delete the sample data in the following way:
   
   * Usage of the `clear` command.<br>
     Clears all flashcard and deck data currently in FlashNotes. Refer under [Main Mode Features](#Main Mode Features) for further details about the command.
     
</div>


--------------------------------------------------------------------------------------------------------------------

## Explanation of Command Formats used in features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the inputs to be supplied by you.<br>
  e.g. in `addCard q/QUESTION`, `QUESTION` is an input which can be used as `add q/What is the question?`.

* Inputs can be in any order.<br>
  e.g. if the command specifies `q/QUESTION a/ANSWER`, `a/ANSWER q/QUESTION` is also acceptable.
</div>

--------------------------------------------------------------------------------------------------------------------

## Main Mode Features
<div markdown="block" class="alert alert-info">

**:information_source: Quick Summary of Main Mode:**<br>

* Main Mode primarily allows management of flashcard decks.
* In order to manage flashcards directly, you will need to enter card mode using the `enterDeck` Command.
</div>

### Entering a specified deck: `enterDeck`

Enters card mode and shows your flashcards within your chosen deck.

Format: `enterDeck DECKNAME`

Examples:
* `enterDeck Economics` return cards stored in the deck `Economics`

Outcome expected:

1. Enter the Enter Deck command into the command bar.
![EnterDeckCommand](images/enterDeck_init.png)

1. You will see the list of cards stored in the deck named Economics. The result display will also show the number of cards in the list.
![EnterDeck](images/enterDeck_success.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* The search is **case-sensitive**. e.g. `GET1025` will not match `get1025`
* only **full words will** be matched e.g. `GE` will not match `GET1025`

</div>


### Create a new Deck : `addDeck`

Creates a new empty deck and adds to the list of decks displayed.

Format: `addDeck n/DECKNAME`

Examples:
* `addDeck Singapore History` creates an empty deck called `Singapore History`.

Outcome expected:
1. Enter the Add Deck Command into the command bar as per the example.
![AddDeckCommand](images/addDeck_init.png)

1. You should see the newly rendered list of decks. If there are more decks than the screen can fit, scroll down to find your newly created deck. It will be the last one in the list.
![AddDeck](images/addDeck_success.png)

1. After scrolling down, you will be able to see your newly created deck. It is empty though, waiting for you to fill it up with meaningful flashcards!
![AddDeck](images/addDeck_successScrolled.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* The deck name is case-sensitive. e.g. future search queries of `GET1025` will not match `get1025`
* If there is a deck that has the same existing case-sensitive name, the deck will not be created because it would be considered a duplicate deck by the system.
* There is a 40 character limit for DECKNAME.
* Reserved names (such as `list`) can't be used as DECKNAME.

</div>


### Rename a new Deck : `editDeckName`

Edit a deck name and the tags of all corresponding cards in the deck.

Format: `editDeckName INDEX n/NEWDECKNAME`

Example:
* `editDeckName 1 n/History` will change the name of the deck at index `1` to `History`.

Outcome Expected:

1\. Enter the editDeckName command (`editDeckName 1 n/History`) into the command bar as shown in the example. The name of the deck at index 1 will be edited.
![EditDeckNameBefore](images/EditDeckNameBefore.png)


2\. When successful, you will see that the name of the deck at index 1 has been changed to History.
![EditDeckNameAfter](images/EditDeckNameAfter.png)


<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Edits the deck at the specified `INDEX`
* The index refers to the index number shown in the currently displayed list of flashcards
* The index **must be a positive integer** 1, 2, 3, …​
* The `NEWDECKNAME` is case-sensitive
* The `NEWDECKNAME` should not be a name that already exists as a deck.

</div>



### Delete a new Deck : `deleteDeck`

Deletes the deck and all the associated cards in your specified deck.


Format: `deleteDeck INDEX`

Example:
* `deleteDeck 3` will delete the deck at index 3 and all its corresponding cards.

Outcome Expected:

1\. Enter the deleteDeck command (`deleteDeck 3`) into the command box as shown in the example. The deck at the index 3 will be deleted.
![DeleteDeckBefore](images/DeleteDeckBefore.png)


2\. The deck at index 3 has been deleted and you will be shown the remaining set of decks (if any).
![DeleteDeckAfter](images/DeleteDeckAfter.png)


<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Deletes the deck at the specified `INDEX`
* The index refers to the index number shown in the currently displayed list of flashcards
* The index **must be a positive integer** 1, 2, 3, …​

</div>

### List all flashcards : `list`

Shows a list of all flashcards, and enters card mode.

Format: `list`

Outcome Expected:
1. Enter the List Command into the command bar as per the example.
![ListCommand](images/list_init.png)

1. You should see the newly rendered list of flashcards. The list contains all flashcards currently stored in FlashNotes irrespective of the deck.
![List](images/list_success.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Any cards added while in the list mode will be added to the `Default` deck.
* No additional inputs should be added behind the list command.
* Note that starting a review in this screen will not attribute the review results to any deck. It will not be stored at the end of the review session.

</div>

### Set card limit for review session : `setReviewLimit`

Sets the maximum number of cards that can be reviewed in a single review session.

Format: `setReviewLimit REVIEW_LIMIT`

Examples:
* `setReviewLimit 20` sets a limit of 20 cards per review session.
* `setReviewLimit all` removes the card limit and lets you review all cards in the deck.


Outcome Expected:
1. Enter the `setReviewLimit` command with the `REVIEW_LIMIT` you want into the command box as shown. 
![Set Review Limit Before Main](images/SetReviewLimitBefore_Main.png)

1. When successful, the following success message will be displayed.
![Set Review Limit After Main](images/SetReviewLimitAfter_Main.png)

1. When an invalid `REVIEW_LIMIT` is entered, the following error message will be displayed.
![Set Review Limit Error Main](images/SetReviewLimitError_Main.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* `REVIEW_LIMIT` can be an integer greater than 0
* `REVIEW_LIMIT` can be the string `all`. (case insensitive)
* This review card limit applies to all decks once it is set. 
* This review card limit is remembered by the program. (You do not have to set the card limit 
again after he/she closes and reopens the application)

</div>


### Check card limit for review session : `checkReviewLimit`

Checks the maximum number of cards that can be reviewed in a single review session.

Format: `checkReviewLimit`

Examples:
* `checkReviewLimit` 

Outcome Expected:
1. Enter the `checkReviewLimit` command into the command box as shown below. 
![Check Review Limit Before Main](images/CheckReviewLimitBefore_Main.png)

1. When successful, the following success message will be displayed.
![Check Review Limit After Main](images/CheckReviewLimitAfter_Main.png)


<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* This review card limit applies to all decks. 
* This review card limit is remembered by the program. (You do not have to set the card limit 
again after he/she closes and reopens the application)

</div>

### Viewing help : `help`

Shows a message explaining how to access the help page.

Format: `help`

Outcome Expected:
1. The help window will show you the link to our user guide.
![help message](images/helpMessage.png)

### Clear all cards and decks : `clear`

Clears all decks and flashcards from the program.

Format: `clear`

Outcome Expected:
1. Enter the Clear Command into the command bar as per the example.
![ClearCommand](images/clear_init.png)

1. You should now see that FlashNotes is empty.
![Clear](images/clear_success.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* All cards and decks will be cleared, including any revision history.
* No additional inputs should be added behind the clear command.
* There is no undo command available in the system presently. Hence, the clear command is irreversible.
</div>


### Exiting the program : `exit`

Exits FlashNotes.

Format: `exit`

Outcome Expected:
1. User enters `exit` command in **Home Mode**. <br>
![Exiting FlashNotes](images/UG_ExitCommand.png)

1. FlashNotes closes and saves all current data.

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* `exit` can be activated from **Home Mode** and **Card Mode**, but not **Review Mode**.
* No additional inputs should be added behind the `exit` command.

</div>

### Saving the data

FlashNotes saves its data into hard disk automatically after every command,  so there is no need to save its data manually.

The data of FlashNotes is contained in the `flashnotes.json` file. This save file can be found in the `data` folder contained inside of the _home folder_ that you installed FlashNotes into.

For further details on how to transfer FlashNotes data, please refer to the [FAQ](#FAQ) section.


--------------------------------------------------------------------------------------------------------------------

## Card Mode Features
<div markdown="block" class="alert alert-info">

**:information_source: Quick Summary of Card Mode:**<br>

* Card Mode primarily allows management of flashcards.
* In order to manage decks directly, need to return to main mode via home command.
</div>

### Viewing help : `help`

Shows a message explaining how to access the help page.

Format: `help`

Outcome Expected:

1\. The help window will show you the link to our user guide.
![help message](images/helpMessage.png)



### Adding a flashcard : `addCard`

Adds a card to the currently stored notes.

Format: `addCard q/QUESTION a/ANSWER`

Example:
* `addCard q/Who was Singapore's First President? a/Yusok Ishak`

Outcome Expected:

1\. Enter the addCard Command into the command box as shown. The question will precede after the prefix `q/` and the answer will precede after the prefix `a/`. 
![Add Card Before](images/AddCardBefore.png)


2\. When successful, you will see the newly added flashcard at the bottom of the list.
![Add Card After](images/AddCardAfter.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* There is a 140 character limit for QUESTION and ANSWER.

</div>

### Editing a flashcard : `editCard`

Edits an existing flashcard in the flashcard deck.

Format: `editCard INDEX [q/QUESTION] [a/ANSWER]`

Examples:
*  `editCard 2 a/Lee Kuan Yew` Edits the answer of the 2nd flashcard to be `Lee Kuan Yew`

Outcome Expected:
1. Initial view of card mode. <br>
![Initial View](images/editCardCommandStep1.png)

1. Type `editCard INDEX [q/QUESTION] [a/ANSWER]` into the command box and enter. <br>
![Enter Edit Card Command](images/editCardCommandStep2.png)

1. The result of executing the editCard command. The question and answer of the selected flashcard would have 
changed. <br>
![Result of Edit Card Command](images/editCardCommandStep3.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Edits the flashcard at the specified `INDEX`. The index refers to the index number shown in the displayed desk list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.

</div>

### Finding flashcards : `find`

Finds flashcards which contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

Examples:
* `find history` returns `History of WWII` and `History of Cuban war of Independence`
* `find Business` returns `Business Management`
* `find conflict resolution` returns `Handling Conflict` and `Resolution`

Outcome Expected:
1. Enter the find Command into the command box as shown. 
![Find Before](images/FindCommandBefore.png)

1. When successful, the flashcard(s) matching the keywords will be displayed.
![Find After](images/FindCommandAfter.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* The search is **case-insensitive**. e.g `test` will match `Test`
* **Only full words will** be matched e.g. `Art` will not match `Artifact`
* Flashcards matching at least one keyword will be returned. (e.g. `Conflict Resolution` will return `Handling Conflict`, `Resolution`)

</div>

### Deleting a flashcard : `deleteCard`

Deletes the specified flashcard from the flashcard deck.

Format: `deleteCard INDEX`

Examples:
* `list` followed by `deleteCard 2` deletes the 2nd flashcard from the flashcard deck.
* `find English` followed by `deleteCard 1` deletes the 1st flashcard shown in the results of the `find` command.

Outcome Expected:
1. Enter the `deleteCard` Command with the `INDEX` of the flashcard to delete into the command box as shown. 
![Delete Card Before](images/DeleteCardCommandBefore.png)

1. When successful, the flashcard(s) matching the `INDEX` specified will be deleted.
![Delete Card After](images/DeleteCardCommandAfter.png)

1. If an invalid `INDEX` is specified, the following error message will be displayed.
![Delete Card Error](images/DeleteCardCommandError.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Deletes the flashcard at the specified `INDEX`.
* The index refers to the index number shown in the currently displayed list of flashcards
* The index **must be a positive integer** 1, 2, 3, …

</div>

### Set card limit for review session : `setReviewLimit`

Sets the maximum number of cards that can be reviewed in a single review session.

Format: `setReviewLimit REVIEW_LIMIT`

Examples:
* `setReviewLimit 20` sets a limit of 20 cards per review session.
* `setReviewLimit all` removes the card limit and lets you review all cards in the deck.


Outcome Expected:
1. Enter the `setReviewLimit` command with the `REVIEW_LIMIT` you want into the command box as shown. 
![Set Review Limit Before Card](images/SetReviewLimitBefore_Card.png)

1. When successful, the following success message will be displayed.
![Set Review Limit After Card](images/SetReviewLimitAfter_Card.png)

1. When an invalid `REVIEW_LIMIT` is entered, the following error message will be displayed.
![Set Review Limit Error Card](images/SetReviewLimitError_Card.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* `REVIEW_LIMIT` can be an integer greater than 0
* `REVIEW_LIMIT` can be the string `all`. (case insensitive)
* This review card limit applies to all decks once it is set. 
* This review card limit is remembered by the program. (You do not have to set the card limit 
again after he/she closes and reopens the application)

</div>


### Check card limit for review session : `checkReviewLimit`

Checks the maximum number of cards that can be reviewed in a single review session.

Format: `checkReviewLimit`

Examples:
* `checkReviewLimit` 

Outcome Expected:
1. Enter the `checkReviewLimit` command into the command box as shown below. 
![Check Review Limit Before Main](images/CheckReviewLimitBefore_Card.png)

1. When successful, the following success message will be displayed.
![Check Review Limit After Main](images/CheckReviewLimitAfter_Card.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* This review card limit applies to all decks. 
* This review card limit is remembered by the program. (You do not have to set the card limit 
again after he/she closes and reopens the application)

</div>

### Return to Main Mode : `home`

Return to Main mode with list of decks.

Format: `home`

Outcome Expected:
1. Enter the Home Command into the command bar as per the example.
![Home Mode](images/home_init.png)

1. You should now see the list of orange decks in the home screen.
![Home Mode](images/home_success.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* It can only be activated from the card screen to navigate back to home.
* No additional inputs should be added behind the home command.

</div>

### Opens the review mode: `review`

Opens the review mode to display cards one by one so that you can review them.

Format: `review`

Outcome Expected:
1. Enter the `review` command.
![Review Before](images/ReviewCommandBefore.png)

1. When successful, a new review window will pop up and the command box of the main window will be disabled until the
review window is closed.
![Review After](images/ReviewCommandAfter.png)

1. When the `review` command is called in an empty deck, the following error message will be shown.
![Review Error](images/ReviewCommandError.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* This command is only valid in the **Card** mode.

</div>


### Exiting the program : `exit`

Exits FlashNotes.

Format: `exit`

Outcome Expected:
1. User enters `exit` command in **Home Mode**. <br>
![Exiting FlashNotes](images/UG_ExitCommand.png)

1. FlashNotes closes and saves all current data.

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* `exit` can be activated from **Home Mode** and **Card Mode**, but not **Review Mode**.
* No additional inputs should be added behind the `exit` command.

</div>

--------------------------------------------------------------------------------------------------------------------

## Review Mode Features
<div markdown="block" class="alert alert-info">

**:information_source: Quick Summary of Review Mode:**<br>

* Review Mode primarily allows active flashcards to be used for revision.
* It also provides relevant statistics upon completion of review session.
* Enter Review mode by calling `review` command in card mode.
</div>


### Flip a flashcard: `f`

Flips the flashcard which is being reviewed so that you can view the answer to the question.

Format: `f`

Examples:
* `f` returns `The sea is blue because water absorbs colors in the red part of the light spectrum` 
 which is the answer to the question `Why is the sea blue?`.

Outcome Expected:
1. Initial view of flashcard. <br>
![Intitial View](images/flipCommandStep1.png)

1. Type `f` into the command box and enter. <br>
![Type Flip Command](images/flipCommandStep2.png)

1. The result after flip command has been executed. The Answer to the question can now be seen. <br>
![Result of Flip Command](images/flipCommandStep3.png)

1. Type `f` into the command box again and enter to flip the card again. <br>
![Type Flip Command](images/flipCommandStep4.png)

1. The result after flip command has been executed. The Question is now visible instead of the answer. <br>
![Result of Flip Command](images/flipCommandStep5.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Flashcard can be flipped as many times as the user wants, to alternate between the question and the answer.
 
 </div>

### Mark a flashcard as correct: `c`

Marks the flashcard that is being reviewed as correct and proceeds to show the next flashcard.

Format: `c`

Examples:
* `c` returns next card in deck if any.

Outcome Expected:
1. Initial view of flashcard that has been flipped. <br>
![Intitial View](images/correctCommandStep1.png)

1. Type `c` into the command box and enter to mark the flashcard as correct. <br>
![Type Correct Command](images/correctCommandStep2.png)

1. The result after the correct command has been executed. The next flashcard will be shown and the progress bar will 
show an increase in progress. <br>
![Result of Correct Command](images/correctCommandStep3.png)

Possible Error users might encounter:
1. Typing `c` into the command box when flashcard has not been flipped. <br>
![Type Correct Command](images/correctCommandStep4.png)

1. Error message telling users to flip the card first before marking the card, is shown in the result display. <br>
![Error Message](images/correctCommandStep5.png)

1. Type `f` into the command box and enter. <br>
![Type Flip Command](images/correctCommandStep6.png)

1. The result after flip command has been executed. The Answer to the question can now be seen. <br>
![Result of Flip Command](images/correctCommandStep7.png)

1. Type `c` into the command box and enter to mark the flashcard as correct. <br>
![Type Correct Command](images/correctCommandStep8.png)

1. The result after the correct command has been executed. The next flashcard will be shown and the progress bar will 
   show an increase in progress. <br>
![Result of Correct Command](images/correctCommandStep9.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Flashcard can only be marked as correct after the card has been flipped to show the answer.
* Flipping the flashcard even number of times will result in the question to be shown, and hence the flashcard cannot
 be marked in this case.
 
 </div>

### Mark a flashcard as wrong: `w`

Marks the flashcard that is being reviewed as wrong and proceeds to show the next flashcard.

Format: `w`

* Marks flashcard as wrong before moving on to show the question of the next flashcard.

Examples:
* `w` returns next card in deck if any.

Outcome Expected: <br>
1. Initial view of flashcard that has been flipped. <br>
![Intitial View](images/wrongCommandStep1.png)

1. Type `w` into the command box and enter to mark the flashcard as wrong. <br>
![Type Wrong Command](images/wrongCommandStep2.png)

1. The result after the wrong command has been executed. The next flashcard will be shown. <br>
![Result of Wrong Command](images/wrongCommandStep3.png)

Possible Error users might encounter:
1. Typing `w` into the command box when flashcard has not been flipped. <br>
![Type Wrong Command](images/wrongCommandStep4.png)

1. Error message telling users to flip the card first before marking the card, is shown in the result display. <br>
![Error Message](images/wrongCommandStep5.png)

1. Type `f` into the command box and enter. <br>
![Type Flip Command](images/wrongCommandStep6.png)

1. The result after flip command has been executed. The Answer to the question can now be seen. <br>
![Result of Flip Command](images/wrongCommandStep7.png)

1. Type `w` into the command box and enter to mark the flashcard as wrong. <br>
![Type Wrong Command](images/wrongCommandStep8.png)

1. The result after the wrong command has been executed. The next flashcard will be shown. <br>
![Result of Wrong Command](images/wrongCommandStep9.png) 

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* Flashcard can only be marked as wrong after the card has been flipped to show the answer.
* Flipping the flashcard even number of times will result in the question to be shown, and hence the flashcard cannot
 be marked in this case.
 
 </div>

### End current review session: `endReview`

Ends the current review session and returns you to the **Card Mode** that the review session started from.

Format: `endReview`

Outcome Expected: <br>
1. User has reached the end of the review session and entered the `endReview` command. <br>
![End of Review Window](images/UG_EndOfReview.png)

1. Review Window closes, and you are returned to the **Card Mode** you started the review session from. <br>
![Return to Main Window](images/UG_ReturnToCardMode.png)

<div markdown="block" class="alert alert-warning">

:warning: Things to note:

* `endReview` can only be activated from the Review Window to return to the **Card Mode** you started the review session from.
* No additional inputs should be added behind the `endReview` command.

</div>

--------------------------------------------------------------------------------------------------------------------

## FAQ

<details>
<summary>How do I transfer my data to another Computer?</summary>
<br>
Install the app in the other computer and overwrite the empty data file it creates with the file that contains the 
data of your previous FlashNotes home folder.
<br>
</details>
<br>

<details>
<summary>What should I do if I have problems launching the application?</summary>
<br>
Ensure that Java 11 has been installed on your computer, and that you have the most recent version of the application.
<br>
</details>
<br>

<details>
<summary>When I exit the program, will all my new flashcards and updates be saved?</summary>
<br>
Yes! Whatever changes that have been made while the application was running will be saved in the data folder. To 
ensure none of your data is lost, do not delete the data folder.
<br>
</details>
<br>

<details>
<summary>Is it possible to restore a deck that I just deleted?</summary>
<br>
Sorry but no. There is no such functionality at this point in time.
<br>
</details>

--------------------------------------------------------------------------------------------------------------------

## Command summary

### Main Mode

Action | Format, Examples
--------|------------------
**Add Deck** | `Format: addDeck n/DECKNAME`<br> e.g., `addDeck Default`
**Open Deck** | `Format: enterDeck DECKNAME` <br> e.g., `enterDeck Default`
**Delete Deck** | `Format: deleteDeck INDEX`<br> e.g., `deleteDeck 1`
**Edit Deck Name** | `Format: editDeckName INDEX n/NEWDECKNAME`<br> e.g., `editDeckName 1 n/History`
**List** | `list`
**Help** | `help`
**Clear** | `clear`
**Set Review Limit** | `setReviewLimit LIMIT` <br> e.g., `setReviewLimit 30`, `setReviewLimit all`
**Check Review Limit** | `checkReviewLimit`
**Exit** | `exit`

### Card Mode

Action | Format, Examples
--------|------------------
**Add Card** | `Format: addCard q/QUESTION a/ANSWER `
**Delete Card** | `deleteCard INDEX`<br> e.g., `deleteCard 3`
**Edit Card** | `editCard INDEX q/QUESTION a/ANSWER`<br> e.g.,`editCard 2 q/What is the real question? a/This is a real question.`
**Find** | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find James Jake`
**Help** | `help`
**Home** | `home`
**Start Review** | `review`
**Set Review Limit** | `setReviewLimit LIMIT` <br> e.g., `setReviewLimit 30`, `setReviewLimit all`
**Check Review Limit** | `checkReviewLimit`
**Exit** | `exit`

### Review Mode

Action | Format
--------|------------------
**Flip** | `f`
**Correct** | `c`
**Wrong** | `w`
**End Review** | `endReview`
