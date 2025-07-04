package src;

public class lab002 {
    public static void main(String[] args) {
        byte age = 20;
        System.out.println(age); //Byte Range = -128 to 127 ,
        age = 127;// it will not accept 128 here with byte data type
        System.out.println(age+1); // it will give output 128
    }
}
