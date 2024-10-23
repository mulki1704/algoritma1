package Bubblesort;

public class Bubblesort {

    public static void main(String[] args) {

        int bilangan[] = {52, 81, 28, 48, 90};
        bubblesortASCInt(bilangan);
    }

    public static void bubblesortASCInt(int[] nilai) {

        //tampilkan sebelum
        System.out.println("Data nilai acak");
        for (int nil : nilai) {
            System.out.print(nil + ", ");
        }

        //logika
        for (int a = 0; a < nilai.length; a++) {
            for (int i = 0; i < nilai.length - 1; i++) {

                if (nilai[i] > nilai[i + 1]) {
                    int tampung = nilai[i];
                    nilai[i] = nilai[i + 1];
                    nilai[i + 1] = tampung;
                }
            }
        }

        //tampilkan sesudah
        System.out.println("\n\nMengurutkan dari nilai terkecil ke terbesar");
        for (int nil : nilai) {
            System.out.print(nil + ", ");
        }
        //logika
        for (int a = 0; a < nilai.length; a++) {
            for (int i = 0; i < nilai.length - 1; i++) {

                if (nilai[i] < nilai[i + 1]) {
                    int tampung = nilai[i];
                    nilai[i] = nilai[i + 1];
                    nilai[i + 1] = tampung;
                }
            }
        }
        System.out.println("\n\nMengurutkan dari nilai terbesar keterkecil");
        for (int nil : nilai) {
            System.out.print(nil + ", ");
        }

    }
    

}// class akhir
