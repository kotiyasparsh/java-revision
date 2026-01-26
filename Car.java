public class Car {
    String  model;
    int  year;
    void  showinfo(String model,int year){

        System.out.print("model");
        System.out.print("year");
    }

    public static void main(String[] args ){
        showinfo c1=new showinfo();
        c1.showinfo();
    }
}
