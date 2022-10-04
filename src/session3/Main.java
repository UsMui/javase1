package session3;

import assignment2.Account;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        d.eat();
        BullDog bd= new BullDog();
        bd.eat();
        bd.run();
    }
    public static void main2(String[] args) {
        int[] intarrays = new int[5];
        //ArrayList Không giới hạn kiểu dữ liệu, không giới hạn kích thước
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Hello Word");
        arrayList.add(new Account());
//        arrayList.remove(10);
        //Giới hạn kiểu dữ liệu chỉ làm việc với kiểu dữ liệu đối tượng
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Hello");
        stringArray.add("world");

        for(String s: stringArray){
            System.out.println(s);
        }

        for(int i=0;i<stringArray.size();i++){
            System.out.println(stringArray.get(i));
        }

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(11);
        ArrayList<Double> doubleArr = new ArrayList<>();
        doubleArr.add(10.5);


    }
}
