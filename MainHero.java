//M.S. Roeney Palessy_235150407111045_SI-C
package Hero;
import java.util.Scanner;
import Hero.Basic;

public class MainHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean LoopingHero = true;
        System.out.println("\n===================");
        System.out.println("Permainan adu hero");
        System.out.println("by M.S. Roeney Palessy");
        System.out.println("===================");

        Basic hero1 = new Basic();
        do {
            System.out.println("\n==============================================================");
            System.out.println("Player 1: Silahkan masukkan hero Anda!");
            System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
            System.out.println("==============================================================");

            try {
                System.out.print("Nama Hero           : ");
                hero1.setName(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input nama hero tidak valid");
                System.out.println("==============================");
                continue;
            }

            try {
                System.out.print("Health Point        : ");
                double health1 = scanner.nextDouble();
                scanner.nextLine();
                if (health1 >= 0 && health1 <= 500) {
                    hero1.setHealth(health1);
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input health point tidak valid");
                    System.out.println("==============================");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input health point tidak valid");
                System.out.println("==============================");
                continue;
            }

            try {
                System.out.print("Attack Power        : ");
                double power1 = scanner.nextDouble();
                scanner.nextLine();
                if (power1 >= 0 && power1 <= 500) {
                    hero1.setAttackPower(power1);
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input attack power tidak valid");
                    System.out.println("==============================");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input attack power tidak valid");
                System.out.println("==============================");
                continue;
            }

            try {
                System.out.print("Defense Point       : ");
                double defense1 = scanner.nextDouble();
                scanner.nextLine();
                if (defense1 >= 0 && defense1 <= 500) {
                    hero1.setDefensePower(defense1);
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input defense point tidak valid");
                    System.out.println("==============================");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input defense point tidak valid");
                System.out.println("==============================");
                continue;
            }
            System.out.println("==============================================================");

            LoopingHero = false;
        } while (LoopingHero);


        Basic hero2 = new Basic();
        double hero2Health = 0;

        do {
            System.out.println("\n==============================================================");
            System.out.println("Player 2: Silahkan masukkan hero Anda!");
            System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
            System.out.println("==============================================================");

            try {
                System.out.print("Nama Hero           : ");
                hero2.setName(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input nama hero tidak valid");
                System.out.println("==============================");
                continue;
            }

            try {
                System.out.print("Health Point        : ");
                double health2 = scanner.nextDouble();
                scanner.nextLine();
                if (health2 >= 0 && health2 <= 500) {
                    hero2.setHealth(health2);
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input health point tidak valid");
                    System.out.println("==============================");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input health point tidak valid");
                System.out.println("==============================");
                continue;
            }

            try {
                System.out.print("Attack Power        : ");
                double power2 = scanner.nextDouble();
                scanner.nextLine();
                if (power2 >= 0 && power2 <= 500) {
                    hero2.setAttackPower(power2);
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input attack power tidak valid");
                    System.out.println("==============================");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input attack power tidak valid");
                System.out.println("==============================");
                continue;
            }

            try {
                System.out.print("Defense Point       : ");
                double defense2 = scanner.nextDouble();
                scanner.nextLine();
                if (defense2 >= 0 && defense2 <= 500) {
                    hero2.setDefensePower(defense2);
                } else {
                    System.out.println("\n==============================");
                    System.out.println("ERROR: Input defense point tidak valid");
                    System.out.println("==============================");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("\n==============================");
                System.out.println("ERROR: Input defense point tidak valid");
                System.out.println("==============================");
                continue;
            }
            System.out.println("==============================================================");

            LoopingHero = false;
        } while (LoopingHero);

        System.out.println("\n==============================================================");
        System.out.println("Pertarungan dimulai!");
        System.out.println("==============================================================");

        double round = 1;
        double hero1Health = 0;
        while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
            System.out.println("\n====================================");
            System.out.println("Ronde " + round++);
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println(hero1.getName() + " menyerang " + hero2.getName() + "!\n");

            System.out.printf("%-30s: %f\n", hero1.getName() + " menyerang sebesar", hero1.getAttackPower());
            System.out.printf("%-30s: %f\n", hero2.getName() + " bertahan sebesar", hero2.getDefensePower());
            hero1.attack(hero2);

            hero2Health = Math.max(hero2.getHealth(), 0);
            System.out.printf("%-30s: %f\n", "Health " + hero2.getName() + " tersisa", hero2Health);

            System.out.println();
            System.out.println(hero2.getName());
            System.out.println();
            System.out.println(hero2.getName() + " menyerang " + hero1.getName() + "!\n");

            System.out.printf("%-30s: %f\n", hero2.getName() + " menyerang sebesar", hero2.getAttackPower());
            System.out.printf("%-30s: %f\n", hero1.getName() + " bertahan sebesar", hero1.getDefensePower());
            hero2.attack(hero1);

            hero1Health = Math.max(hero1.getHealth(), 0);
            System.out.printf("%-30s: %f\n", "Health " + hero1.getName() + " tersisa", hero1Health);
            System.out.println("====================================\n");

            if (hero1.getHealth() <= 0 || hero2.getHealth() <= 0) {
                break;
            }
        }

        System.out.println("\n==============================================================");
        System.out.println("Hasil pertarungan:");
        System.out.println("==============================================================");
        if (hero1.getHealth() > 0) {
            System.out.println("Pemenang: " + hero1.getName());
            System.out.println("Sisa health: " + hero1.getHealth());
        } else {
            System.out.println("Pemenang: " + hero2.getName());
            System.out.println("Sisa health: " + hero2Health);
        }
        System.out.println("==============================================================");

        scanner.close();
    }
}