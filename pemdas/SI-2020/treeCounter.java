import java.util.*;

public class treeCounter {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        int baris = braws.nextInt();
        int kolom = braws.nextInt();
        int move_right = braws.nextInt();
        int move_down = braws.nextInt();
        braws.nextLine();
        String maps [] = new String[baris];

        for (int i = 0; i < baris; i++){
            maps [i] = braws.nextLine();
        }

        int pohon = hitungpohon(baris, kolom, move_right, move_down, maps);
        System.out.println(pohon);
        braws.close();
    }

    private static int hitungpohon(int m, int n, int r, int b, String maps[]){
        int posisiX = 0;
        int posisiY = 0;
        int treecounter = 0;

        while (posisiY<m){
            if (maps[posisiY].charAt(posisiX%n)=='#'){
                treecounter++;
            }
            posisiX += r;
            posisiY += b;
        }
        return treecounter;
    }
}
