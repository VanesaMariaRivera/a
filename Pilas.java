//ELABORADO POR
//VANESA MARIA RIVERA PEMBERTY
import java.util.Scanner;
import java.util.Stack;

public class pilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pilaaux = new Stack<>();

        int a = (int) (Math.random() * 10 + 1);
        int b = (int) (Math.random() * 10 + 1);
        pila.push(a);
        pila.push(b);

        System.out.println("Nuestros vlores iniciales aleatorios son: " + a + ", " + b);

        for (int i = 2; i < 5; i++) {
            int siguiente = a + b;
            pila.push(siguiente);
            a = b;
            b = siguiente;
        }
        System.out.println("Serie de Fibonacci : " + pila);

        System.out.println("serie de fibonacci orden inverso:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("Digite numero a buscar");
        int buscar = sc.nextInt();

        int dimesion = pila.size();
        boolean encontro = false;

        for (int i = 0; i < dimesion; i++) {
            // Esto debería ser pop() para obtener y eliminar el valor
            if (pila.peek().equals(buscar)) {
                encontro = true;
                break;
            } else {
                pilaaux.push(pila.pop());
            }
        }

        if (encontro) {
            System.out.println("numero encontrado");
        } else {
            System.out.println("numero no encontrado");
        }

        System.out.println(pila);
        System.out.println(pilaaux);

        int dimAux = pilaaux.size();
        for (int i = 0; i < dimAux; i++) {
            pila.push(pilaaux.pop());
        }

        System.out.println(pila);
        System.out.println(pilaaux);
    }
}