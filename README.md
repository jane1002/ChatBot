# ChatBot

Conversation simulation

# Working flow

# Supporting input & corresponding output

    | User Possible Inputs (case insensitive)           | Your Program Action                                                                             |
    |---------------------------------------------------|-------------------------------------------------------------------------------------------------|
    | (no input)First start                             | “Welcome to conversation simulation!”     Please enter phone number, id, name for new record 1. |
    | Help; Question: H; Q                              | Help Guide*                                                                                     |
    | New; Next; More                                   | Please enter phone number, id, name for new record + Record.id                                  |
    | Done; Complete                                    | List all records, including empty record which have no fields. *                                |
    | Start over; Cancel                                | “Welcome to conversation simulation!”     Please enter phone number, id, name for new record 1. |
    | any 10-digit numeric entry                        | Record + Record.id: phone number: XXXXXXXXXX                                                    |
    | any string with two words other than ‘Start over’ | Record + Record.id: name: SSSS SSSSS                                                            |
    | any 2-digit numeric entry                         | Record + Recird.id: id: XX                                                                      |
    | others                                            | Help Guide                                                                                      |
    |---------------------------------------------------|-------------------------------------------------------------------------------------------------|

    * Help Guide: Please enter phone number (10-Digits), id (2-Digits) and name (2 Words) for each record. Type 'New' for new recordentry.
     Type 'Done' when complete.


# Usage
    Basically, this simple application is used to simulate a user is talking to a robot. Based what the user say,
    it will automatically answer you question.

    Examples:

# Environment
    1. Maven
    2. java 8
    3. Start project by running ChatBot\src\main\java\walmart\chatbot\core\ChatbotMain

# Third part dependency
    1. org.reflections version-0.9.10. Reference: https://github.com/ronmamo/reflections

Record 1: phone number: 1234567890