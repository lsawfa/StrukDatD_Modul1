import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int menu;

        System.out.println("=== HITUNG LUAS SEGITIGA ===");
        System.out.println("\nMau menampilkan hasil luas dalam bentuk : ");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.print("Masukkan pilihan 1 / 2 : ");
        menu = inputUser.nextInt();

        System.out.println("Masukkan nilai alas dan tinggi secara berurutan: ");
        if(menu == 1){
            try{
                Segitiga<Integer> luasTipeInt = new Segitiga<>(inputUser.nextInt(),inputUser.nextInt());
                System.out.println("Luas segitiga dalam Integer : "+luasTipeInt.getResultAsInt());
            }catch (InputMismatchException e){
                System.out.println("Error : "+e);
            }
        } else if (menu == 2) {
            try {
                Segitiga<Double> luasTipeDouble = new Segitiga<>(inputUser.nextDouble(),inputUser.nextDouble());
                System.out.println("Luas segitiga dalam double : "+luasTipeDouble.getResultAsDouble());
            }catch (InputMismatchException e){
                System.out.println("Error : "+e);
            }
        }
    }
}