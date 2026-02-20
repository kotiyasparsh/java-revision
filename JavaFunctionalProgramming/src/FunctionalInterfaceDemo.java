//FunctionalInterface

@FunctionalInterface
interface BookAction{
    void perform();
}


//*   parameter -> expression body
//* () -> {}

@FunctionalInterface
interface  Operation{
    int add(int a , int b);
}

public class FunctionalInterfaceDemo {
public static void main (String [] args){

//   classic way to implement method

//    step 1
    BookAction action1=new BookAction() {
        @Override
        public void perform() {
            System.out.println("Action performance");
        }
    };



//    Using Lambda Function
//    step 2
    BookAction action2 =  () ->{
        System.out.println("Action Perform using lamda function");
    };


//   ###ONELINE Implemention of functionalInterface using lambdaFunction
//    step 3
    BookAction action3 =  () -> System.out.println("Action Perform using lamda function");

    action2.perform();


    Operation operation = (int a , int b ) -> {
        return a+b;
    };
    System.out.println(operation.add(20,30));
}

}
