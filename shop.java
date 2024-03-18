import java.util.Scanner;

public class shop {
        public static void main(String[] args) {
            String[] product = new String[3];
            product[0] = "молоко";
            product[1] = "яблоки";
            product[2] = "бананы";
            Scanner input = new Scanner(System.in);
            System.out.println("shop");
            System.out.println("выбери действие");
            System.out.println("1 - владелец \n2 - покупатель");
            int inputMain = input.nextInt();
            if (inputMain == 1) {
                System.out.println("выбери действие: ");
                System.out.println("1 - посмотреть товары \n2 - изменить товары");
                int inputOwner = input.nextInt();
                switch (inputOwner) {
                    case 1:
                        System.out.println(" товары ");
                        for (String elem : product) {
                            System.out.println(elem);
                        }
                        break;
                    case 2:
                        System.out.println("Внести изменения");
                        break;
                    default:
                        System.out.println("некорректный ввод");
                        break;
                }
            } else {
                if (inputMain == 2) {
                    System.out.println("выбери действие");
                    System.out.println("1 - посмотреть товары");
                    int inputOwner = input.nextInt();
                    switch (inputOwner) {
                        case 1:
                            System.out.println(" товары ");
                            for (String elem : product) {
                                System.out.println(elem);
                            }
                            break;
                        default:
                            System.out.println("некоректный ввод");
                            break;
                    }
                } else {
                    System.out.println("error");
                }
            }

        }
}




