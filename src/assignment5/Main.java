package assignment5;

public class Main {
//    public static void main(String[] args) {
//        News n = new News(1,"AA","BB","CC","DD");
//        n.RateList[0]=5;
//        n.RateList[1]=6;
//        n.RateList[2]=7;
//        n.Calculate().display();
//    }

    public static void main(String[] args) {
       try {
           int x=10;
           int y=0;
           System.out.println(x+":"+y+" = ");
           if(y==0){
               throw new NullPointerException();
           }
           int z=x/y;
           System.out.println(z);
           System.out.println("aaaaaa");
       }
       catch (NullPointerException n){
           //Lỗi chưa cấp ô nhớ cho biến
           System.out.println("NULL...");
       }
       catch(ArithmeticException ae){
           //Lỗi ngoại lệ toán học
           //catch hoạt động giống else-if
           System.out.println("Tính toán sai rồi tính lại đi");
       }
       catch (Exception e){
           System.out.println("Lỗi rồi xem lại đi");
       }finally {
           //lúc nào cũng chạy qua đây
       }
    }
}
