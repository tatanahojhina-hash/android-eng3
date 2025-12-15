import java.util.Scanner;

public class main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Введите цену товара (в руб.):"); 
        Int price = scanner.nextInt();
  
        System.out.print("Введите вес товара (в кг):"); 
        int weight = scanner.nextInt();

        Int duty = calculateCustoms(price, weight); 
        System.out.println("Размер пошлины (в руб.) составит: " + duty); 
    }
}