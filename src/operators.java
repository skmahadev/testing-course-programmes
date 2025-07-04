package src;

public class operators {
    public static void main(String[] args) {
        //Unary operators
        int a =10;
        int a1 =20;
        a += 40; // compound operator
        System.out.println(a);
        System.out.println(a1);
        String name = "Sunil";
        System.out.println(name+a);
        System.out.println(a+name);
        System.out.println(name+a+a1);//here it is concatination bcoz of string + integer(Any other)
        System.out.println(a+a1+name);//first we have 2 integers so it is not concatination L--> R
    }
}
