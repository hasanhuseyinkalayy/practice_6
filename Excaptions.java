package practice_6;

import java.util.Scanner;

public class Excaptions {
    public Excaptions(String string) {
    }

    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        var nuumber = x.nextInt();
        if (nuumber > 100)
            throw new MyExcaption(nuumber);
    }
}
