package br.dev.certificacao.chapter4_core_apis;

public class Creating_The_StringBuilder_Class {

    public Creating_The_StringBuilder_Class() {

        System.out.println("Creating_The_StringBuilder_Class");
        System.out.println("----------------------------------");
        System.out.println("This is s simple example of StringBuilder class");

        System.out.println("""
                This is the example code:
                             StringBuilder alpha = new StringBuilder();

                    for (char current = 'a'; current <= 'z'; current++)
                        alpha.append(current);
                    System.out.println(alpha);
                            """);

        StringBuilder alpha = new StringBuilder();

        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);

    }

    public static void main(String[] args) {
        Creating_The_StringBuilder_Class creating_The_StringBuilder_Class = new Creating_The_StringBuilder_Class();
        creating_The_StringBuilder_Class.multability_an_chaining();
        creating_The_StringBuilder_Class.creating_a_stringBuilder();
        creating_The_StringBuilder_Class.important_stringBuilder_methods();
    }

    private void multability_an_chaining() {

        System.out.println("");

        System.out.println("Multability and Chaining");
        System.out.println("------------------------");

        System.out.println("Multability");
        System.out.println("-------------------------------------");
        System.out.println("Take a look the code below:");
        System.out.println("""

                StringBuilder sb = new StringBuilder("start");
                sb.append("+middle");
                System.out.println("Printing the sb result " + sb);

                StringBuilder same = sb.append("+end");
                System.out.println("Printing the same result " + same);

                System.out.println("Verifying is is the same object");
                System.out.println(same == sb);

                System.out.println(sb.equals(same));
                        """);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        System.out.println("Printing the sb result " + sb);

        StringBuilder same = sb.append("+end");
        System.out.println("Printing the same result " + same);

        System.out.println("Verifying is is the same object");
        System.out.println(same == sb);

        System.out.println(sb.equals(same));

        System.out.println("-------------------------------------");
        System.out.println("Chaining");
        System.out.println("-------------------------------------");

        System.out.println("Take a look the code below:");
        System.out.println("""

                StringBuilder a  =  new StringBuilder("abc");
                StringBuilder b = a.append("de");
                b = b.append("f").append("g");
                System.out.println("Verifying the value of a and b");
                System.out.println("a = " + a);
                System.out.println("b = " + b);

                        """);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("Verifying the value of a and b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    private void creating_a_stringBuilder() {

        System.out.println("");

        System.out.println("Creating a StringBuilder");
        System.out.println("------------------------");

        System.out.println("Take a look the code below:");
        System.out.println("");

        System.out.println(
                """
                        StringBuilder sb1 = new StringBuilder();-> this one creates an empty StringBuilder
                        StringBuilder sb2 = new StringBuilder("Waldemir");-> this one creates a StringBuilder with the value passed as parameter
                        Note: the first two StringBuilder above tell java to manage the implementation details
                        StringBuilder sb3 = new StringBuilder(10);-> the last one creates a StringBuilder with an initial capacity passed as parameter
                                """);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Waldemir");
        StringBuilder sb3 = new StringBuilder(10);

    }

    private void important_stringBuilder_methods() {

        using_commom_methods();
        appending_values();
        inserting_data();
        deleting_contents();
        replacing_portions();
        reversing();
    }

    private void using_commom_methods() {

        System.out.println("");

        System.out.println("Important StringBuilder Methods");
        System.out.println("-------------------------------");

        System.out.println("Take a look the code below:");
        System.out.println(
                """
                                 var sb = new StringBuilder("Waldemir");
                        System.out.println("Tamanho: " + sb.length());
                        System.out.println("SubString(0,1): " + sb.substring(0, 1));
                        System.out.println("Substring(indexOf(wa),indexOf(de): " + sb.substring(sb.indexOf("W"), sb.indexOf("de")));
                        System.out.println("CharAt(0): " + sb.charAt(0));
                                """);

        System.out.println("Take a look the result below:");

        var sb = new StringBuilder("Waldemir");
        System.out.println("Tamanho: " + sb.length());
        System.out.println("SubString(0,1): " + sb.substring(0, 1));
        System.out.println("Substring(indexOf(wa),indexOf(de): " + sb.substring(sb.indexOf("W"), sb.indexOf("de")));
        System.out.println("CharAt(0): " + sb.charAt(0));

    }

    private void appending_values() {

        System.out.println("");
        System.out.println("Appending Values");
        System.out.println("----------------");
        System.out.println("Take a look the code below:");
        System.out.println("""

                var sb = new StringBuilder().append("waldemir").append(1).append(true);
                sb.append("-").append(1);

                System.out.println(sb);""");

        var sb = new StringBuilder().append("waldemir").append(1).append(true);
        sb.append("-").append(1);

        System.out.println(sb);
    }

    private void inserting_data() {

        System.out.println("");
        System.out.println("Inserting Data");
        System.out.println("----------------");
        System.out.println("Take a look the code below:");

        var sb = new StringBuilder("Roberto Santos");
        sb.insert(0, "X").insert(7, "x");
        System.out.println(sb);
    }

    private void deleting_contents() {

        System.out.println("");
        System.out.println("Deleting Data");
        System.out.println("----------------");
        System.out.println("Take a look the code below:");
        System.out.println("""
                    var sb = new StringBuilder("Waldemir");
                System.out.println(sb.delete(1, 2));
                System.out.println(sb.deleteCharAt(2));
                System.out.println(sb.deleteCharAt(6));//StringIndexOutOfBoundsException
                        """);

        var sb = new StringBuilder("Waldemir");
        System.out.println(sb.delete(1, 2));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.delete(1, 100));
        // System.out.println(sb.deleteCharAt(6));// StringIndexOutOfBoundsException

    }

    private void replacing_portions() {

        System.out.println("");

        System.out.println("Important StringBuilder Methods");
        System.out.println("-------------------------------");

        System.out.println("Take a look the code below:");

        System.out.println("""
                var builder = new StringBuilder("Pigeon Dirty");
                System.out.println(builder.replace(3,6, "sty"));
                        """);

        var builder = new StringBuilder("Pigeon Dirty");
        System.out.println(builder.replace(3, 6, "sty"));

    }

    private void reversing() {

           System.out.println("");

        System.out.println("Reversing");
        System.out.println("-------------------------------");

        System.out.println("Take a look the code below:");
        System.out.println("""
                var sb = new StringBuilder("Waldemir");
                sb.reverse();
                System.out.println(sb);
                        """);

        var sb = new StringBuilder("Waldemir");
        sb.reverse();
        System.out.println(sb.toString());

    }

}
