public class Nme {

    public void myname(){
        String a = "Barkha";
        System.out.println(a);

    }

    public static void main(String[] args) {
        Nme ab = new Nme();
        ab.myname();
    }
}

//Here i am creating a string with a void return type, then in the main method
// i am creating a refernce object with new keyword.
// refernce object is created with the class name and java itself creates a default constructor.
//then with the help of refernce variable we can call the method name and print the string.
