package br.dev.certificacao.chapter4_core_apis;

public class Creating_And_Manipulating_Strings {

        public static void main(String[] asrgs) {

                Creating_And_Manipulating_Strings c = new Creating_And_Manipulating_Strings();
                c.concatenation();
                c.important_String_Methods();
                c.understanding_equality();
        }

        public void concatenation() {
                System.out.println("Concatenation");
                System.out.println("=============================================================");
                System.out.println("The + operator is used to concatenate String");
                System.out.println("Take a look the code below:");

                System.out.print("First rules both operands,1 + 2, are numbers, so we use normal addition. 1+2 = ");
                System.out.println(1 + 2);

                System.out.println(
                                "Second rule the simple String concatenation. The quotes for String are only used in code; They don't get out put ");
                System.out.println("a" + "b");

                System.out.println(
                                "Third rule since we start on the left, java figure out what \"a\" + \" b \" evoluates to You already know tha one: its \"ab\". Now we have \"ab\" + 3. The String wins again, so we get \"ab3\" ");
                System.out.println("a" + "b" + 3);

                System.out.println(
                                "The fourth rule We start the third rule, wich tells us sto consider 1+2. Both operands are numeric. ");
                System.out.println(1 + 3 + "c");

                System.out.println(
                                "The fifth rule that's a combination of the third rule and the second rule. ");
                System.out.println("c" + 1 + 2);

                System.out.println(
                                "The sixth rule how null is represented a a string when concateneted os printed giving us cnull");
                System.out.println("c" + null);

                System.out.println(
                                "More examples:");

                int three = 3;
                String four = "4";
                System.out.println(1 + 2 + three + four);

                var s = "1";
                s += "2";
                s += 3;
                System.out.println(s);

                // pegadinha
                /*
                 * var s = 1;
                 * s += 2;
                 * s += "3";
                 * System.out.println(s);
                 * 
                 */

                // intern method
                System.out.println("Using intern method");
                System.out.println("===============================================================");

                System.out.println("Intern Méthod" + " Hello".intern());
        }

        public void important_String_Methods() {

                determining_the_lenght();
                getting_a_Single_Character();
                find_in_index();
                getting_a_substring();
                adjusting_Case();
                checking_for_equality();
                searching_for_substring();
                replacing_values();
                removing_white_spaces();
                work_with_identation();
                translating_escapes();
                checking_for_empty_or_blank_strings();
                formatting_values();
                method_chaining();

        }

        private void determining_the_lenght() {

                var name = "Waldemir Santos Silva Paixão";
                System.out.println("O meu nme completo tem " + name.length() + " caracters.");

        }

        private void getting_a_Single_Character() {

                var name = "Waldemir Santos Silva Paixão";
                System.out.println("Primeiro caracter:" + name.charAt(0));
                System.out.println("Ultimo caracter:" + name.charAt(name.length() - 1));

        }

        private void find_in_index() {
                var name = "Waldemir Santos Silva Paixão";
                System.out.println("Index of W:" + name.indexOf('W'));
                System.out.println("Index of al:" + name.indexOf("al"));
                System.out.println(
                                "Index of a: It brings us the index of char that occur first starting from index provided:"
                                                + name.indexOf('a', 9));
                System.out.println(
                                "Index of ão: It brings us the index of substring that occur first from index provided:"
                                                + name.indexOf("ão", 0));

        }

        private void getting_a_substring() {

                var name = "Waldemir Santos Silva Paixão";

                System.out.println("Substring from 9 to the end: " + name.substring(9));
                System.out.println("Substring from 7 to the 20: " + name.substring(7, 20));
                // System.out.println("Substring from 7 to the 20: " + name.substring(7, 6));//
                // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin
                // 76 end 6, length 28
                // System.out.println("Substring from 7 to the 20: " + name.substring(7,
                // 29));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
                // begin 7, end 29, length 28
                var valor = name.substring(5);
                System.out.println(valor);

        }

        private void adjusting_Case() {

                var name = "animal";
                var alfaNumerico = "AbC123";

                System.out.println(name.toUpperCase());
                System.out.println(alfaNumerico.toLowerCase());
                System.out.println("AbC".toLowerCase());
                System.out.println("Wademir".toUpperCase());

        }

        private void checking_for_equality() {

                var name = "Waldemir";
                var comparadorName = "waldemir";
                var anotherName = name;
                System.out.println(name + " é igual a " + comparadorName + "? " + "waldemir".equals("Waldemir"));
                System.out.println(name + " é igual a " + anotherName + "? " + name.equals(anotherName));
                System.out.println(name + " é igual a " + comparadorName + " ignorando case? "
                                + name.equalsIgnoreCase(anotherName));

        }

        private void searching_for_substring() {

                var name = "Waldemir Santos Silva Paixão";
                var startWithLetter = "W";
                var endWithLetter = "ão";

                System.out.println("Searchig for substring that start with some letter "
                                + name.startsWith(startWithLetter));
                System.out.println("Searchig for substring that end with some letter " + name.endsWith(endWithLetter));

                System.out.println(
                                "Searching substring that start from the somewhere point int the string. You need to set the point that start the string"
                                                + name.startsWith("a", 1));

                System.out.println(
                                "Searching substring along the string if contain the word:" + name.contains("Paixão"));

        }

        private void replacing_values() {

                System.out.println("Replacing the string value from Abc to AbC: " + "Abc".replace("c", "C"));
                System.out.println("Replacing the char value from abc to Abc: " + "abc".replace('a', 'A'));
        }

        private void removing_white_spaces() {

                String text = " abc \t";

                System.out.println(
                                "The strip() methood does the everything that trim() does, but with the little diference"
                                                +
                                                "strip() suport Unicode. Lets show that how many characters are there in this word with space "
                                                + " abc ".length() + " characters with spaces");

                System.out.println("Without space " + " abc ".strip().length() + " characters without spaces");
                System.out.println("\t a b c \n".strip());

                // --------------------------------

                System.out.println(text.trim().length());
                System.out.println(text.strip().length());
                System.out.println(text.stripLeading().length());
                System.out.println(text.stripTrailing().length());

        }

        private void work_with_identation() {

                System.out.println("Working with text block and identation");

                var textBlock = """
                                a
                                 b
                                c""";

                var concat = " a\n"
                                + "  b\n"
                                + " c";

                System.out.println("The size of Character in the text block, consider count whitespace: "
                                + textBlock.length());
                System.out.println(
                                "The size of Character in the concat, consider count whitespace: " + concat.length());
                System.out.println("Adding n space in the begining at the text block " + textBlock.indent(1).length());
                System.out.println(textBlock.indent(1));
                System.out.println("The size of Character at the concat, consider count whitespace:  "
                                + concat.indent(-1).length());
                System.out.println(concat.indent(-1));
                System.out.println("The size of Character at the concat, consider count whitespace:  "
                                + concat.indent(-4).length());
                System.out.println(concat.indent(-4));
                System.out.println(
                                "Removing all the leading incidental whitespace at the concat, consider count whitespace:  "
                                                + concat.stripIndent().length());
                System.out.println(concat.stripIndent());

        }

        private void translating_escapes() {

                System.out.println("=========================================================");
                System.out.println("Tanslating scape");

                var str = "1\\t2";
                System.out.println("Without using translate scape " + str);
                System.out.println("With using translate scape " + str.translateEscapes());
        }

        private void checking_for_empty_or_blank_strings() {

                System.out.println("=========================================================");
                System.out.println("Checking for empty or blank strings");

                System.out.println("Without space " + "".isEmpty());
                System.out.println("With space " + " ".isEmpty());
                System.out.println("Without Blank space " + "".isBlank());
                System.out.println("With Blank space " + " ".isBlank());

        }

        private void formatting_values() {

                System.out.println("=========================================================");
                System.out.println("Formatting values");
                var name = "Waldemir";

                var orderId = 5;
                System.out.println("Without using format method");
                System.out.println("Hello " + name + ", order " + orderId + " is ready!");
                System.out.println("With using format method");
                System.out.println(String.format("Hello %s, order %d is ready!", name, orderId));

                System.out.println("With using formatted method");
                System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

                var nome = "James";
                var score = 90.25;
                var total = 100;

                System.out.println("%s:%n    Score: %.1f out of %d".formatted(nome, score, total));

                // mistakes
                // System.out.println("%s:%n Score: %d out of %d".formatted(nome, score,
                // total));//java.util.IllegalFormatConversionException: f != d

                var pi = 3.14159265358979323846;
                System.out.format("[%f]", pi);
                System.out.format("[%12.8f]", pi);
                System.out.format("[%012f]", pi);
                System.out.format("[%12.2f]", pi);
                System.out.format("[%.2f]", pi);

        }

        private void method_chaining() {

                System.out.println("=========================================================");
                System.out.println("Method chaining");

                var start = "AniMaL";
                var trimmed = start.trim();
                var lowercased = trimmed.toLowerCase();
                var result = lowercased.replace("a", "A");
                System.out.println(result);

                String result2 = "AniMaL".trim().toLowerCase().replace("a", "A");
                System.out.println(result2);

                String a = "abc";
                String b = a.toUpperCase();
                b = b.replace("B", "2").replace('C', '3');
                System.out.println("a=" + a);
                System.out.println("b=" + b);

        }// este método não tem sub categorias

        public void understanding_equality() {

                comparing_equals_and_same();

        }

        private void comparing_equals_and_same() {

                System.out.println("=========================================================");
                System.out.println("Comparing equals and same");
                System.out.println("Take a look the code below:");
                System.out.println("""
                                var one = new StringBuilder();
                var two = new StringBuilder();
                var three = one.append("a");

                System.out.println(one == two);//false
                System.out.println(one == three);//true
                                """);
                var one = new StringBuilder();
                var two = new StringBuilder();
                var three = one.append("a");

                System.out.println(one == two);//false
                System.out.println(one == three);//true

                System.out.println("=========================================================");
                System.out.println("Comparing String with equals and == ");
                System.out.println("Take a look the code below:");
                System.out.println("Equals method compare the value of the string");
                System.out.println("""
                                var x  = "Hello World";
                var z = " Hello World".trim();
                System.out.println(x.equals(z));""");

                System.out.println("Take a look the code below:");
                System.out.println("""
                                var name ="a";
                var builder = new StringBuilder("a");
                System.out.println(name == builder.toString());// false

                var name ="a";
                var builder = new StringBuilder("a");
                System.out.println(name == builder);//doesn't compile because are incompatible types;
                                """);

                var name ="a";
                var builder = new StringBuilder("a");
                System.out.println(name == builder.toString());// false

                /*var name ="a";
                var builder = new StringBuilder("a");
                System.out.println(name == builder);//doesn't compile because are incompatible types;*/

                                
                          

               

        }

}
