package ex03;

public class Pattern {


        public static void main(String[] args) {
            System.out.println("Pattern a:");
            patternA();
            System.out.println("\nPattern b:");
            patternB();
            System.out.println("\nPattern c:");
            patternC();
            System.out.println("\nPattern d:");
            patternD();
        }

        public static void patternA() {
            for (int i = 8; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void patternB() {
            for (int i = 8; i >= 1; i--) {
                for (int j = 1; j <= 8 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void patternC() {
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 8 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void patternD() {
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 8 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


