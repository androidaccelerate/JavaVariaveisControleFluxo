public class While {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 20) {
            System.out.println("Contador: " + contador);
            contador = contador + 1;
        }

        int contadorInverso = 100;
        while (contadorInverso > 20) {
            System.out.println("Contador Inverso: " + contadorInverso);
            contadorInverso = contadorInverso - 1;
        }
    }
}
