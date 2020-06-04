package projeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
			Scanner sc = new Scanner(System.in);
			List <Produto> list = new ArrayList<Produto>();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Quantos Produtos :");
			int n = sc.nextInt();
			for (int i = 1; i<=n; i++) {
				System.out.println("Produto #" + i + " :");
				System.out.print("Produto comum,usado ou importado (c/u/i)? ");
				char b = sc.next().charAt(0);
				System.out.print("Nome: ");
				String nome = sc.next();
				sc.nextLine();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				if(b =='c') {
					list.add(new Produto(nome, preco));
				}
				else if(b =='i') {
					System.out.print("Valor da taxa alfândegaria: ");
					Double taxaAl = sc.nextDouble();
					list.add(new ProdutoImportado(nome, preco, taxaAl));
				}
				else {
					System.out.print("Data de fabricação (DD/MM/YYYY): ");
					sc.nextLine();
					Date dataFabricacao = sdf.parse(sc.next());
					list.add(new ProdutoUsado(nome, preco, dataFabricacao));
				}
			}
			System.out.println("");
			System.out.println("Etiqueta de Preço:");
			for(Produto obj : list) {
				System.out.println(obj.etPreco());
			}
			
			sc.close();
		}

	}


