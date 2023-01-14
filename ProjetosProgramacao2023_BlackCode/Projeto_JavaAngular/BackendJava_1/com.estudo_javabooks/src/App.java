import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.Locale;
public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.println(" Enter the number of taxpayers:  ");

        int N = sc.nextInt();

        for( int i = 1; i <= N; i++ ){
            System.out.println(" Taxpayer #  "+i+" data: ");

            // Instanciando cada entrada do usuário
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if( type == 'i' ){
                System.out.println( "Health expenditures: " );
                Double healthExpenditures = sc.nextDouble();
                // pegando as 3 entradas do usuário
                list.add( new Company( name, anualIncome, healthExpenditures ) ) ;
            } else {
                System.out.print("Number of employees: ");
                
                Double numberOfEmployees = sc.nextDouble();
                list.add(new Company( name, anualIncome, numberOfEmployees ));
            }
        }

        // Pegando os valores da variável list
        System.out.println();
		System.out.println("TAXES PAID:");
        for ( TaxPayer tp: list ) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for( TaxPayer tp: list ){
            sum += tp.tax();
        }
        System.out.println(" TOTAL TAXES: " + String.format("%.2f", sum));

    }

}
