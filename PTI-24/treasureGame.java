import java.util.Scanner;

public class treasureGame {
    public static void main(String[] args) {
        Scanner braws = new Scanner(System.in);
        int baris = 3;
        int kolom = 3;
        int [][] maps = new int [baris][kolom];
        for (int i = 0; i < maps.length ; i++){
            for (int j = 0; j < maps[i].length; j++){
                maps [i][j] = braws.nextInt();
            }
        }
        int langkah = braws.nextInt();
        int steps = 0;
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < langkah; i++){
            steps = braws.nextInt();
            if (steps == 1) {
                startX--;
                if (startX<0) {
                    startX=0;
                }
            } else if (steps ==2){
                startX++;
                if (startX>2) {
                    startX=2;
                }
            } else if (steps == 3){
                startY--;
                if (startY<0) {
                    startX=0;
                }
            } else if (steps == 4){
                startY++;
                if (startY>2) {
                    startY=2;
                }
            }
        }
        if (maps[startX][startY] == 1) {
            System.out.println("Harta Karun ditemukan!");
        } else {
            System.out.println("Yah tidak ketemu");
        }
        braws.close();
    }
}
