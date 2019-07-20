package lesson2;

public class main {
    public static void main(String[] args) {
        String str="1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
        int[][] arr = new int[4][4];

        try {
            arr = methodStrToArr(str);
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("1");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("2");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] methodStrToArr(String str) {
        int l = 1, n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') l++;
            else if (!((str.charAt(i)>='0' && str.charAt(i)<='9') || str.charAt(i) == ' ')){
                throw new NumberFormatException("Odin");
            }
        }
        if (l > 4) throw new IndexOutOfBoundsException("Dva");
        System.out.println(l);
        System.out.println(str);
        String[][] strArr = new String[l][l];
        System.out.println();
        l = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') {n++; l = 0;
                System.out.println();}
            else if(str.charAt(i) == ' '){continue;}
            else{
                strArr[n][l] = String.valueOf(str.charAt(i));
                System.out.print(str.charAt(i) + " ");
                l++;
            }
        }
        int[][] arr = new int[strArr.length][strArr[0].length];
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                arr[i][j] = Integer.parseInt(strArr[i][j]);
            }
        }
        return arr;
    }
}
