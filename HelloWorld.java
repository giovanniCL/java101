
public class HelloWorld {
    public static void main(String[] args){

        //unicode character (16 bits)
        char c = 'a';

        //signed integers
        byte b = 127;// 1 byte
        short s = 32767;// 2 bytes
        int integer = 2147483647;// 4 bytes
        long l = 9223372036854775807L;// 8 bytes

        //floating points
        float f = (float) 2.5;
        double d = Math.PI;

        //boolean
        boolean bool = true;
        boolean not_bool = false;

        System.out.println("Primitve Data types: ");
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(integer);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(not_bool);
        System.out.println();


        //operators
        int n = 5;
        int n_plus_ten = n + 10;
        int n_minus_ten = n - 10;
        int n_times_two = n * 2;
        int n_over_two = n/2;//rounds_down
        double real_n_over_two = ((double)n)/2;
        int n_modulo_two =n % 2;
       
        System.out.println("Operators: ");
        System.out.println(n);
        System.out.println(n_plus_ten);
        System.out.println(n_minus_ten);
        System.out.println(n_times_two);
        System.out.println(n_over_two);// rounds down
        System.out.println(real_n_over_two);
        System.out.println(n_modulo_two);

        System.out.println();
        System.out.println("Assignment Operators:");
        n++;
        System.out.println(n);
        n--;
        System.out.println(n);
        n += 10;
        System.out.println(n);
        n -= 10;
        System.out.println(n);
        n *= 10;
        System.out.println(n);

        System.out.println();
        System.out.println("Relational operators:");
        System.out.println(n == 50);
        System.out.println(n != 50);
        System.out.println(n > 0);
        System.out.println(n < 50);
        System.out.println(n <= 50);
        System.out.println(n >= 50);

        System.out.println();
        System.out.println("Boolean operators");
        boolean x = true;
        boolean y = false;
        boolean not_x = !x;
        boolean x_and_y = x && y;
        boolean x_or_y = x || y;
        
        System.out.println(not_x);
        System.out.println(x_and_y);
        System.out.println(x_or_y);


        //Reference Data Types
        //strings
        System.out.println();
        System.out.println("Strings: ");
        String hello = "Hello";
        System.out.println(hello);
        String world = "World!";
        System.out.println(hello + " " + world);
        String hello2 =  "Hello";
        System.out.println(hello == hello2);//puede ser true pero no generalmente
        System.out.println(hello.equals(hello2));// siempre true




        //arrays
        String[] fruits = {"apple", "banana", "orange", "watermelon"};
        int[] numbers = new int[10];

        //for-loop
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

        System.out.println();
        System.out.println("Arrays: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //while-loop
        int count = 0;
        String favorite_fruit = fruits[count];
        while(!favorite_fruit.equals("watermelon")){
            count++;
            favorite_fruit = fruits[count];
        }

        //if-else
        if(favorite_fruit.equals("watermelon")){
            System.out.println("You found my favorite fruit.");
        }else{
            System.out.println("You did not find my favorite fruit.");
        }
        
    }

}
