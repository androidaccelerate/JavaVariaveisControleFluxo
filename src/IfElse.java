public class IfElse {
    public static void main(String[] args) {
        int idade = 15;
        // Operadores de comparação: <>,=, <=, >=, !, !=
        if (idade >= 18) {
            System.out.println("Pode entrar na festa.");
        } else {
            System.out.println("Não pode entrar na festa.");
        }

        boolean festaDoMeuAmigo = true;
        if (idade >= 18 || festaDoMeuAmigo) {
            System.out.println("Pode entrar na festa.");
        } else if (idade >= 15) {
            System.out.println("Pode entrar acompanhado com adulto.");
        } else {
            System.out.println("Não pode entrar na festa.");
        }
    }
}
