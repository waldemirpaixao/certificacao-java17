package br.dev.certificacao.challenges;

public class Challenges {

    // challenges Copilot

    public static void main(String[] args) {

        new Challenges().reverse();
        new Challenges().reverseCopilot();
    }

    private void reverse() {

        String texto = "java is fun";
        String[] arrayString = texto.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = arrayString.length-1; i >= 0; i--) {
          

            if (i != 0) {

                builder.append(arrayString[i] + " ");

            } else {
                builder.append(arrayString[i]);
            }

        }

        System.out.println(builder.toString());

    }

    //Resposta do copilot

    private void reverseCopilot() {
    String texto = "java is fun";
    String[] arrayString = texto.split(" ");
    java.util.List<String> list = java.util.Arrays.asList(arrayString);
    java.util.Collections.reverse(list);
    String resultado = String.join(" ", list);
    System.out.println(resultado);
}

}
