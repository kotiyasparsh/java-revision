
class Library{
    int availableBooks = 3;

        public void borrowBook(int bookRequest){

            try{
                int [] books = {101,102,103};
                System.out.println("Book Requested : "+books[bookRequest]);
            } catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception occurred: Requested a wrong book");
            }catch (Exception e) {
                System.out.println("Exception occurred: Requested a wrong book");
            } finally {
//                it is use to resource managment so we can use this block without catch block
                System.out.println("finally block");
            }

        }

}



public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(4);
    }
}
