import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lexer {
    static final int ERROR = -1;
    static final int ACEPTAR = 0;

    // Método para leer un caracter del teclado
    char obtenerCaracter() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return (char) br.read();
    }

    int estado_0() throws IOException {
        System.out.print("Por favor, ingresa una cadena de caracteres: ");
        char c = obtenerCaracter();
        switch (c) {
            case 'a':
                return estado_1();
            case 'b':
                return estado_4();
            default:
                return ERROR;
        }
    }

    int estado_1() throws IOException {
        System.out.print("Continúa ingresando caracteres: ");
        char c = obtenerCaracter();
        switch (c) {
            case 'a':
                return estado_1();
            case 'b':
                return estado_2();
            default:
                return ERROR;
        }
    }

    int estado_2() throws IOException {
        System.out.print("Continúa ingresando caracteres: ");
        char c = obtenerCaracter();
        switch (c) {
            case 'a':
                return estado_1();
            case 'b':
                return estado_3();
            default:
                return ERROR;
        }
    }

    int estado_3() {
        return ACEPTAR;
    }

    int estado_4() throws IOException {
        System.out.print("Continúa ingresando caracteres: ");
        char c = obtenerCaracter();
        switch (c) {
            case 'a':
                return estado_1();
            case 'b':
                return estado_4();
            default:
                return ERROR;
        }
    }

    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        try {
            System.out.println("Resultado: " + lexer.estado_0());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
