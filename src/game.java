public class game {
    public static void main(String[] args)
    throws java.io.IOException{

        char ch;
        char answer = 't';
        System.out.println("Введите букву и нажмите Enter:");
        ch = (char) System.in.read();
        while (ch!=answer){
            ch = (char) System.in.read();
            System.out.println("Вы не угадали");
        }
        if (ch==answer) System.out.println("Вы угадали!");


    }
}
