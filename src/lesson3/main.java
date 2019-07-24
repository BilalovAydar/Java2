package lesson3;

public class main {
    public static void main(String[] args) {
        String[] strArr = {"яблоко","груша","апельсин","мандарин","вишня","черешня","яблоко","вишня","малина","арбуз","арбуз","черника","крыжовник","смородина","земляника","грейпфрут"};
        returnWithout(strArr);
        //Window window = new Window();
        View view = new View();

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
