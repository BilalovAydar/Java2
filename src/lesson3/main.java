package lesson3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        String[] strArr = {"яблоко","груша","апельсин","мандарин","вишня","черешня","яблоко","вишня","малина","арбуз","арбуз","черника","крыжовник","смородина","земляника","грейпфрут"};
        returnWithout(strArr);
        System.out.println();
        System.out.println("2 задание");
        System.out.println();
        //Window window = new Window();
        //View view = new View();
        TelList telList = new TelList();
        telList.add("Ivanov", "+79333333333");
        telList.add("Pupkin", "+79332222222");
        telList.add("Vasilyev", "+79331111111");
        telList.add("Ivanov", "+79333334444");
        displayArr(telList.get("Ivanov"));
        displayArr(telList.get("Pupkin"));
        displayArr(telList.get("Panin"));
    }

    private static void displayArr(ArrayList<Record> rec) {
        if (!rec.isEmpty()) {
            for (int i = 0; i < rec.size(); i++) {
                System.out.println("surname: " + rec.get(i).getSurname() + " tel: " + rec.get(i).getTel());
            }
        }else System.out.println("Список пуст");
    }

    private static void returnWithout(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if ((strArr[i] == strArr[j]) && (j > i || j < i)) {
                    break;}
                else if (strArr[i] == strArr[j])
                    System.out.println(strArr[i]);
            }
        }
    }
}
