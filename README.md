# ChatBot

Conversation simulation

# Working flow

# Supporting input & corresponding output

    | User Possible Inputs (case insensitive)	     | Your Program Action
    |------------------------------------------------|-------------------------------------------------------|
    | (no input)First start                          | “Welcome to conversation simulation!”                 |
    |                                                | Please enter phone number, id, name for new record 1. |
    |------------------------------------------------|-------------------------------------------------------|
    |Hi; Hey; Hello	                                 | (Randomly) pick from “Hello”, “How are you”, “Hey”.   |
    |Help; Question: H; Q	If any of the inputs entered, your program should show the actual quick guide to user
    |New; Next; More	If any of the inputs entered, your program creates a new record and ready for the field entries.
    |Done; Complete	If any of the inputs entered, your program should show all records on screen and exit.
    (any 10-digit numeric entry)	Indicate current record phone number is…
    (any string with two words other than ‘Start over’)	Indicate current record name is…
    (any 2-digit numeric entry)	Indicate current record id is…
    (anything else)	Treat it as invalid entry and show your help guide
    Start over; Cancel	Whenever user enters this input, your program should start over, and shows “Welcome to conversation simulation!” and is ready to accept the first record field entries again.
    
    | Tables   |      Are      |  Cool |
    |----------|:-------------:|------:|
    | col 1 is |  left-aligned | $1600 |
    | col 2 is |    centered   |   $12 |
    | col 3 is | right-aligned |    $1 |


# Usage
    Basically, this simple application is used to simulate a user is talking to a robot. Based what the user say,
    it will automatically answer you question.

# Environment
    1. maven
    2. java 8
    3. Start project by running ChatBot\src\main\java\walmart\chatbot\core\ChatbotMain

# Third part dependency
    1. org.reflections version-0.9.10. Reference: https://github.com/ronmamo/reflections

