public class Itproger {

    public static void main(String[] args) {
//        for(int i = 9; i <= 10; i++ ) {
//            System.out.println("Element: " + i);

//        int i = 1;
//        while (i < 11) {
//            System.out.println("Element: " + i);
//            i++;
        for(int i=5; i < 25; i += 2) {
            if (i % 3 == 0)
                continue;

            if(i >= 17)
                break;
            System.out.println("Element: " + i);
        }
    }
}






