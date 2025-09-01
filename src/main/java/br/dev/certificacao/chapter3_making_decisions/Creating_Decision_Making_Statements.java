package br.dev.certificacao.chapter3_making_decisions;

public class Creating_Decision_Making_Statements {

    public Creating_Decision_Making_Statements() {

        System.out.println("====================================");
        System.out.println("Let's explore how to create decision-making statements in Java.");
        System.out.println("Chapter 3 - Making Decisions");
        System.out.println("- Creating Decision Making Statements");
        System.out.println("1 - Statement and Blocks.");
        System.out.println("2 - The if statement");
        System.out.println("3 - The else statement");
        System.out.println("4 - Shortening Code with Pattern Matching");
        System.out.println("5 - Menu Anterior");
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        Creating_Decision_Making_Statements decisionMaking = new Creating_Decision_Making_Statements();
        // You can add more functionality here if needed
        decisionMaking.statementAndBlocks();
        decisionMaking.theIfStatement();
        decisionMaking.theElseStatement();
       
    }

    public void statementAndBlocks() {
        System.out.println("====================================");
        System.out.println("Statement and Blocks");
        System.out.println("Let's see the example with block and without block, both are corect");
        System.out.println("""
                //Single statement
                if(TicketsTaken > 1)
                   patrons++;

                //Statement inside a block
                 if(TicketsTaken > 1){
                   patrons++;}
                """);

    }

    public void theIfStatement() {
        System.out.println("====================================");
        System.out.println("The if statement");
        System.out.println(
                "The if statement is used to test a condition and execute a block of code if the condition is true.");
        System.out.println(
                """

                                                booleanExpression - is the operation that evaluates to true or false.
                                                for example: 1 > 2, 1 >= 2,1 < 2, 1 <= 2 !true, 5!=2, 2 == 3

                                                        if (booleanExpression) {
                                                                                 Curly braces required for block
                                                                                 of multiple statements, optional for singlr statement
                                                        }


                                                        Another example:
                                                        image a hour os day from 0 to 23, consider integer values

                                                        if(hourOfDay < 11)
                                                          System.out.println("Good morning!"); // if the value of hourOfDay is less than 11, this message will be printed.


                                                    // Let's say we also  wanted to increment some value, morningGreetingCount, every time the greeting is printed.
                                                     if(hourOfDay < 11){
                                                          System.out.println("Good morning!");
                                                          morningGreetingCount++
                                                        }

                        ===============================================================================================
                             Watch Identation and braces
                        ------------------------------------------------------morningGreetingCount-----------------------------------------

                         if(hourOfDay < 11)
                            System.out.println("Good morning!");
                            morningGreetingCount++;


                        // The above code will work normaly. Java considers identation like a whitespace,
                        so the second line is not part of the if statement because this will be executed.

                        ======================================================================================
                        """);

    }

    public void theElseStatement() {
        System.out.println("====================================");
        System.out.println("The else statement");
        System.out.println(
                "The else statement is used to execute a block of code when the if condition is false.");
        System.out.println(
                """
                                                if (booleanExpression) {
                                                    // Code to execute if the condition is true
                                                } else {
                                                    // Code to execute if the condition is false      //
                                                }



                                                  Curly braces required for block
                                                 of multiple statements, optional for singlr statement

                                                 Example whit optional Curly braces

                                                if(hourOfDay < 11){
                                                    System.out.println("Good morning!");
                                                }else System.out.println("Good afternoon!"); // if the value of hourOfDay is less than 11, this message will be printed.



                        Multiples curly braces: if not first two expressions are not true, the last one will be executed.

                                                 if(hourOfDay < 11){
                                                    System.out.println("Good morning!");
                                                }else if(hourOfDay < 15) {
                                                    System.out.println("Good afternoon!");
                                                }else{
                                                    System.out.println("Good evening!");
                                                }

                           ===============================================================================================
                            Verifying That the if Statement Evaluates to a Boolean Expression
                          ------------------------------------------------------------------------------------------------

                                                 int hourOfDay = 1
                                                 if(hourOfDay < 11){
                                                 does not compile }
                                                 //this code never compiles because the if statement must evaluate to a boolean expression.
                                                 // in java never consider 0 and 1 like a false and true, like in C or C++.
                                                  
                        ======================================================================================





                                                """);

    }

    public void shortingCodeWithPatternMatching() {

        System.err.println("VOLTAR AQUI DEPOIS QUE ENTENDER O COMPARETO()");
        System.out.println("====================================");
        System.out.println("Shortening Code with Pattern Matching");
        System.out.println(
                "Pattern matching allows you to simplify the code by checking the type of an object and casting it in a single step.");
        System.out.println(
                """
                                                // Example of pattern matching with instanceof
                                                if (obj instanceof String str) {
                                                    // str is automatically cast to String
                                                    System.out.println("String value: " + str);
                                                }

                                                // Example of pattern matching with switch
                                                switch (obj) {
                                                    case String str -> System.out.println("String value: " + str);
                                                    case Integer i -> System.out.println("Integer value: " + i);
                                                    default -> System.out.println("Unknown type");
                                                }
                        ======================================================================================
                        """);
    }

    

}
