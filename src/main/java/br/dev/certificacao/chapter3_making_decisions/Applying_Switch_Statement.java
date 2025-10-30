package br.dev.certificacao.chapter3_making_decisions;

public class Applying_Switch_Statement {

    public Applying_Switch_Statement() {

        System.out.println("====================================");
        System.out.println("Let's explore how to apply the switch statement in Java.");
        System.out.println("Chapter 3 - Making Decisions");
        System.out.println("- Applying Switch Statement");
        System.out.println(" 1 - The switch statement");
        System.out.println(" 2 - The switch expression");
        System.out.println(" 3 - Menu Anterior");
        System.out.println("Escolha uma opção:");
        System.out.println("====================================");

    }

    public void menuComSwitchPadrao() {

        var opcao = 1;
        // switch padrão
        switch (opcao) {

            case 1:
                the_switch_statement();
                break;

            case 2:
                the_switch_expression();
                break;

            case 3:
                System.out.println("Menu Anterior: Chame aqui a classe anterior");
                break;
            default:
                System.out.println("Opção Inválida!");
        }

    }

    public void menuComSwitchPadraoAndCombining() {

        var opcao = 1;
        // switch padrão
        switch (opcao) {

            case 0, 1:
                the_switch_statement();
                break;

            case 2:
                the_switch_expression();
                break;

            case 3:
                System.out.println("Menu Anterior: Chame aqui a classe anterior");
                break;
            default:
                System.out.println("Opção Inválida!");
        }

    }

    public void menuComSwitchExpression() {

        var opcao = 1;
        // switch padrão
        switch (opcao) {

            case 1 -> the_switch_statement();
            case 2 -> the_switch_expression();
            case 3 -> System.out.println("Menu Anterior: Chame aqui a classe anterior");
            default -> System.out.println("Opção Inválida!");
        }

    }

    public void menuComSwitchExpressionAndCombining() {

        var opcao = 1;
        // switch padrão
        switch (opcao) {

            case 0, 1 -> the_switch_statement();
            case 2 -> the_switch_expression();
            case 3 -> System.out.println("Menu Anterior: Chame aqui a classe anterior");
            default -> System.out.println("Opção Inválida!");
        }
    }

    public void exiting_withstatementes() {
        int month = 1;

        switch (month) {

            case 1, 2, 3:
                System.out.println("WINTER");
            case 4, 5, 6:
                System.out.println("SPRING");
            default:
                System.out.println("unknown");
            case 7, 8, 9:
                System.out.println("SUMMER");
            case 10, 11, 12:
                System.out.println("FALL");
                // break; // Optional, but usually included to prevent fall-through
        }
    }

    public void selecting_switch_data_types() {

        System.out.println("====================================");
        System.out.println("Selecting switch data types");
        System.out.println("In java, the switch statement can be used with various data types, including:");
        System.out.println("""
                - int and Integer
                - byte and Byte
                - short and Short
                - char and Character
                - String
                - Enum types
                - var (if the type resolves to one of the preceding types)
                """);

        System.out.println(
                """
                            Note:
                            notice that boolean, float, double, and long are excluded from switch statements, and thier assossiation Boolean, Float, Double, and Long are not allowed.


                        """);

    }

    /** 
     * @return int
     */
    final int getCookies() {
        return 4;
    }

    public void determining_Acceptable_case_values() {

        System.out.println("====================================");
        System.out.println("Determining Acceptable case values");

        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals) {

            case bananas:// does compile
                // case apples: // does not compile
                // case getCookies():// does not compile
                // case cookies:// does not compile
            case 3 * 5://
        }

    }

    public void the_switch_statement() {

        System.out.println("====================================");
        System.out.println("The switch statement");
        System.out.println(
                "The switch statement is used to execute one block of code among multiple options based on the value of a variable or expression.");
        System.out.println("""
                this example below e the default structure of a switch statement:
                    switch (variable) {
                        case value1:
                            // Code to be executed if variable equals value1
                            break; // Optional, but usually included to prevent fall-through
                        case value2, value3:
                            // Code to be executed if variable equals value2
                            break; // Optional, but usually included to prevent fall-through
                        // You can have any number of case statements
                        default:
                            // Code to be executed if variable doesn't match any case
                    }
                    """);
    }

    public void the_switch_expression() {
        System.out.println("====================================");
        System.out.println("The switch expression");
        System.out.println(
                "The switch expression is a more concise way to write switch statements, introduced in Java 12 and enhanced in later versions.");
        System.out.println("""
                                            Here is a simple  example of a switch expression:
                                                int dayOfWeek = 3;
                                                String dayName = switch (dayOfWeek) {
                                                    case 1 -> "Monday";
                                                    case 2 -> "Tuesday";
                                                    case 3 -> "Wednesday";
                                                    case 4 -> "Thursday";
                                                    case 5 -> "Friday";
                                                    case 6 -> "Saturday";
                                                    case 7 -> "Sunday";
                                                    default -> "Invalid day";
                                                };
                                                System.out.println(dayName); // Outputs: Wednesday

                                                int mes = 1
                                                String seasonOfTheYear = switch(mes){

                                                case 1,2,3-> "WINTER";
                                                case 4,5,6-> "SPRING";
                                                case 7,8,9-> "SUMMER";
                                                case 10,11,12-> "FALL";
                                                default -> "Invalid month";

                                                };
                                                 System.out.println(seasonOfTheYear); // Outputs: Wednesday


                                            int mes  = 1;
                                            int mes1 = mes;
                                            String feriados = switch(mes){

                                            case 1,2, 3 -> {

                                            if(mes1 > 30){

                                            yield "Mais de 30 dias";

                                            }else{

                                            yield "Menos de 30 dias";

                                            }
                }
                            default-> "Invalid month";
                                            };

                                            System.out.println(feriados); // Outputs: Mais de 30 dias
                                            """);
    }

    int day = 1;

    /** 
     * @param day
     */
    public void pprintDayOfTheWeek(int day) {

        String dayOfWeek = switch (day) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";

        };
        System.err.println("Day of the week: " + dayOfWeek);
    }

    public void does_not_compile() {

        String animal = "dog";
        System.out.println("====================================");
        System.out.println("Does Not Compile");
        System.out.println("""
                var result = switch(animal){
                    case "dog" -> 1
                    case "cat" -> 2
                    case "bird" -> 3
                    default -> "unknown"; // does not compile
                }
                    """);

        // correção
        var result = switch (animal) {
            case "dog" -> 1;
            case "cat" -> 2;
            case "bird" -> 3;
            default -> "unknown"; // does not compile
        };

    }

    int mes = 1;

    /** 
     * @param mes
     */
    public void printSeason(int mes) {

        String seasonOfTheYear = switch (mes) {

            case 1, 2, 3 -> "WINTER";
            case 4, 5, 6 -> "SPRING";
            case 7, 8, 9 -> "SUMMER";
            case 10, 11, 12 -> "FALL";
            default -> "Invalid month";

        };
        System.out.println(seasonOfTheYear); // Outputs: Wednesday

        switch (mes) {

            case 1, 2, 3 -> System.out.println("WINTER");
            case 4, 5, 6 -> System.out.println("SPRING");
            case 7, 8, 9 -> System.out.println("SUMMER");
            case 10, 11, 12 -> System.out.println("FALL");
            default -> System.out.println("Invalid month");
        }

    }

    public void yield_in_switch() {

        int mes = 1;
        int mes1 = mes;
        String feriados = switch (mes) {

            case 1, 2, 3 -> {

                if (mes1 > 30) {

                    yield "Mais de 30 dias";

                } else {

                    yield "Menos de 30 dias";

                }
            }
            default -> "Invalid month";
        };

        System.out.println(feriados); // Outputs: Mais de 30 dias
    }

    public void returningConsistentDataTypes() {

        int measurement = 1;
        int size = switch (measurement) {

            case 5 -> 1;
            case 10 -> (short) 2;
            default -> 0;
            // case 20 -> "3"; // does not compile
            // case 40 -> 4L; // does not compile
            // case 50 -> null;// does not compile

        };

    }

    public void rule2AboutYield(){

        int fish = 5;
        int length = 12;
        var name = switch(fish){
            case 1 -> "Godfish";
            case 2 -> {yield "Treout";}
            case 3 -> {

                if(length > 10){
                    yield "Salmon";
                }else{
                    yield "Tuna";
                }
            }
            default-> "Unknown Fish Type";
        };

        System.err.println("Fish Name: " + name);


//does not compile
       /*   int fish = 5;
        int length = 12;
        var name = switch(fish){
            case 1 -> "Godfish";
            case 2 -> {}
            case 3 -> {

                if(length > 10)
                    yield "Salmon";
               
            }
            default-> "Unknown Fish Type";
        };

        System.err.println("Fish Name: " + name);
    }*/

}
}
