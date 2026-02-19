
//###########coustomException################
class BookUnavailabeException extends Exception{

    public BookUnavailabeException(String message){
        super(message);
    }

}

class InvalidMemberException extends Exception{

    public InvalidMemberException(String message){
        super(message);
    }

}




class Library{
    int availableBooks = 3;

    public void borrowBook(String memberName,int bookRequestcount) throws Exception {

        if(bookRequestcount > availableBooks)
            /*throws our own costum exception */
            throw new BookUnavailabeException ("Not enough book available");
        if(bookRequestcount < 0)
            throw new Exception("You must request at least 1 book");
        if(memberName == null || memberName.isEmpty())
            throw new InvalidMemberException("Invalid Memebership");


    }



/*
//#################Throws###########################
//handels the exception who call the method
    public void borrowBook(int bookRequestcount) throws Exception {

        if(bookRequestcount > availableBooks)
            throw new Exception ("Not enough book available");
        if(bookRequestcount < 0)
            throw new Exception("You must request at least 1 book");



    }
 */



//
////#################Throw###########################
//
//    public void borrowBook(int bookRequestcount){
//
//        try{
//            if(bookRequestcount > availableBooks){
//                throw new Exception ("Not enough book available");
//            }
//
//        } catch ( ArrayIndexOutOfBoundsException e) {
//
//            System.out.println("Exception occurred: Requested a wrong book");
//
//        }catch (Exception e) {
//
//            System.out.println("Exception occurred: Requested a wrong book");
//
//        } finally {
////                it is use to resource management so we can use this block without catch block
//            System.out.println("finally block");
//        }








//        public void borrowBook(int bookRequest){
//
//            try{
//                int [] books = {101,102,103};
//                System.out.println("Book Requested : "+books[bookRequest]);
//            } catch ( ArrayIndexOutOfBoundsException e) {
//                System.out.println("Exception occurred: Requested a wrong book");
//            }catch (Exception e) {
//                System.out.println("Exception occurred: Requested a wrong book");
//            } finally {
////                it is use to resource management so we can use this block without catch block
//                System.out.println("finally block");
//            }
//
//        }

}



public class LibraryDemo {

//    here main method is calling so exception will be handel by main method directly
    public static void main(String[] args)  {
        Library library = new Library();
        try{
            library.borrowBook("Sparsh",1);
            library.borrowBook(null,1);
        }catch(BookUnavailabeException e){
            e.printStackTrace();
        }
        catch (InvalidMemberException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Expected Occurred: "+ e.getMessage());
//            System.out.println("Expected Occurred");
        }

    }
}
