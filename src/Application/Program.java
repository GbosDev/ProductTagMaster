package Application;

import Entities.Produto;
import Entities.ProdutoImportado;
import Entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] Args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Produto> lista = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do produto #%d: \n", i + 1);

            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            Double preco = sc.nextDouble();

            if (ch == 'c') {
                lista.add(new Produto(nome, preco));

            } else if (ch == 'i') {
                System.out.print("Taxa alfandegária: ");
                double taxa = sc.nextDouble();

                lista.add(new ProdutoImportado(nome, preco, taxa));

            } else {
                System.out.print("Data de manufatura (DD/MM/YYYY): ");
                String data = sc.next();
                Date dataManufatura = sdf.parse(data);

                lista.add(new ProdutoUsado(nome, preco, dataManufatura));

            }
        }

        System.out.println("ETIQUETAS: ");
        for (Produto produto : lista) {
            System.out.println(produto.etiqueta());
        }

    }
}
