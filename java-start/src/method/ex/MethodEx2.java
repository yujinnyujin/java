package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";
        PrintMessage(message, 3);
        PrintMessage(message, 5);
        PrintMessage(message, 7);
    }

    public static void PrintMessage(String message, int times){
        for(int i=0; i<times; i++){
            System.out.println(message);
        }
    }
}
