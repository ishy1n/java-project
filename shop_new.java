import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shop_new {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<String, Double>();
        products.put("Яблоко", 1.99);
        products.put("Молоко", 2.49);
        products.put("Хлеб", 0.99);

        System.out.println("Выбери свою роль: \n1 - владелец магазина\n2 - покупатель в магазине");
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        if (input1 == 1) {
            while (true) {
                System.out.println("Выберите действие: \n1 - посмотреть товары\n2 - добавить товар\n3 - удалить товар");
                String inputOwner = input.next();
                switch (inputOwner) {
                    case "1":
                        for (Map.Entry<String, Double> product : products.entrySet()) {
                            System.out.println(product.getKey() + " - " + product.getValue() + " руб.");
                        }
                        break;
                    case "2":
                        System.out.println("Введите название товара: ");
                        String newProductName = input.next();
                        System.out.println("Введите цену товара: ");
                        double newProductPrice = input.nextDouble();
                        products.put(newProductName, newProductPrice);
                        System.out.println("Товар добавлен!");
                        break;
                    case "3":
                        System.out.println("Введите название товара из списка");
                        for (Map.Entry<String, Double> product : products.entrySet()) {
                            System.out.println(product.getKey() + " - " + product.getValue() + " руб.");
                        }
                        String productNameDelete = input.next();
                        products.remove(productNameDelete);
                        System.out.println("Товар удалён из магазина!");
                        break;
                    default:
                        System.out.println("Некорректный выбор.");
                        break;
                }
            }
        } else if (input1 == 2) {
            while (true) {
                System.out.println("Выберите действие: \n1 - Посмотреть товары\n2 - Купить товары");
                String inputBuyer = input.next();
                switch (inputBuyer) {
                    case "1":
                        for (Map.Entry<String, Double> product : products.entrySet()) {
                            System.out.println(product.getKey() + " - " + product.getValue() + " руб.");
                        }
                        break;
                    case "2":
                        System.out.println("Введите название товара из списка");
                        for (Map.Entry<String, Double> product : products.entrySet()) {
                            System.out.println(product.getKey() + " - " + product.getValue() + " руб.");
                        }
                        String productName = input.next();
                        if (products.containsKey(productName)) {
                            System.out.println("Выбранный товар: " + productName);
                            System.out.println("Цена товара: " + products.get(productName) + " руб.");
                            products.remove(productName);
                            System.out.println("Покупка успешно совершена.");
                        } else {
                            System.out.println("Такого товара нет в магазине.");
                        }
                        break;
                    default:
                        System.out.println("Некорректный выбор.");
                        break;
                }
            }
        }
    }
}
