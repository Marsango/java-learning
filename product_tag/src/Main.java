import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.*;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de produtos: ");
        int n = sc.nextInt();
        Product[] produtos = new Product[n];
        String name;
        double price, customFee;
        Date manufactureDate;
        char type;
        for (int i = 0; i < n; i ++){
            System.out.println("Product #"+i+" data:");
            System.out.println("Comum, usado ou importado (c/u/i)?");
            type = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Price: ");
            price = sc.nextDouble();
            if (type == 'i'){
                System.out.println("Digite o valor da taxa: ");
                customFee = sc.nextDouble();
                produtos[i] = new ImportedProduct(name, price, customFee);
            }
            else if (type == 'u'){
                try {
                    System.out.println("Digite a data de fabricacao:");
                    sc.nextLine();
                    String auxDate = sc.nextLine();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    manufactureDate = formatter.parse(auxDate);
                    produtos[i] = new UsedProduct(name, price, manufactureDate);
                } catch (Exception e) {
                    System.out.println("Erro ao converter a data. Certifique-se de digitar no formato correto (dd/MM/yyyy).");
                    // Você pode fazer algo mais aqui, como imprimir informações sobre a exceção, se necessário.
                }
            }
            else{
                produtos[i] = new Product(name, price);
            }
        }
        System.out.println("Price tags:");
        for(Product produto : produtos){
            System.out.println(produto.priceTag());
        }
        sc.close();
    }
}