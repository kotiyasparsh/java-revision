import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 20 ;
//        int result = 20/0;
//        System.out.println("done");

        try {
//            EXCEPTION GENERATATING
            int result = a/0;
        } catch ( Exception e){
//            EXCEPTION HANDLING STATMENT
            System.out.println("In Cath block");
        }

        int[] b ={1,2,3};
//        System.out.println(b[6]);

        try{
            System.out.println(b[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excessing invalid index");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } finally {
//            always run even exception is there or not Note: to close database connections and use for management

        }

//        it throws a exception due to file is not find
//        FileReader fileReader = new FileReader("abc.text");


//        Checked Exception compiler force you to handle

        System.out.println("Checked Exception");

        try{
            FileReader fileReader = new FileReader("abc.text");
        } catch (Exception e){
            System.out.println("File dose not exist");
        }


    }
}
