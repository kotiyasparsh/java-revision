import java.util.Scanner;
class Book{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        // String 
        System.out.print("Enter the book title: ");
        int title = sc.nextInt();
        System.out.print("Enter the book author: ");
        String author = sc.nextLine();
        // System.out.print("Enter the book price: ");    
        // Double Price = sc.nextDouble();
        System.out.println("************************OUTPUT*******************");
        System.out.println(title);
        System.out.println(author);
        // System.out.println(Price);

         
        


    }
}