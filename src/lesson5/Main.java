package lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    public static void main(String[] args) {
        method();
        method2();
    }

    private static void method2() {
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Main m = new Main();
        long a = System.currentTimeMillis();
        System.out.println("method2 currentTime for arr[i] = 1: " + System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.out.println("method2 currentTime for arr[i] = 1: " + System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - a);
        a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(() -> m.method2a(a1)).start();
        new Thread(() -> m.method2a(a2)).start();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("method2 currentTime for arrays: " + System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - a);
        System.exit(1);
    }
    public synchronized float[] method2a(float[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arr;
    }
    public synchronized float[] method2b(float[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arr;
    }

    private static void method() {

        float[] arr = new float[size];
        long a = System.currentTimeMillis();
        System.out.println("method currentTime for arr[i] = 1: " + System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.out.println("method currentTime for arr[i] = 1: " + System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - a);
        a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("method currentTime for arr[i] = formula" + System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - a);
    }
}
