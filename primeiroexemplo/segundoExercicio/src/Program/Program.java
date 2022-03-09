package Program;

import entitie.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        String path = "C:\\Users\\leoli\\OneDrive\\Área de Trabalho\\JAVA\\secao19-generics,set,map\\generics\\primeiroexemplo\\segundoExercicio\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(productList);
            System.out.println("Max:");
            System.out.println(x);

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
