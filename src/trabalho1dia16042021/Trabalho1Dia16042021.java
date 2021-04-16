package trabalho1dia16042021;

public class Trabalho1Dia16042021 {

    public static void main(String[] args) {
        
        Funcionarios f1 = new Funcionarios("Pavan", "RH", 1000, "16/04/2021", "37.763.938-2");
        
        System.out.println(f1.nome);
        System.out.println("Salario atual é de: " + f1.salario);
        System.out.println("");
        System.out.print("Salario atual com o aumento vai ser de: ");
        f1.Aumento();
        System.out.println("");
        System.out.print("Salario atual até o fim de ano vai ser de: ");
        f1.GanhoAnual();
        System.out.println("");
        
        Funcionarios f2 = new Funcionarios("Marinaldo", "RH", 2500, "16/04/2021", "19.579.837-5");
        
        System.out.println(f2.nome);
        System.out.println("Salario atual é de: " + f2.salario);
        System.out.println("");
        System.out.print("Salario atual com o aumento vai ser de: ");
        f2.Aumento();
        System.out.println("");
        System.out.print("Salario atual até o fim de ano vai ser de: ");
        f2.GanhoAnual();
        System.out.println("");
        
        Funcionarios f3 = new Funcionarios("Guthie", "RH", 500, "16/04/2021", "23.925.956-7");
        
        System.out.println(f3.nome);
        System.out.println("Salario atual é de: " + f3.salario);
        System.out.println("");
        System.out.print("Salario atual com o aumento vai ser de: ");
        f3.Aumento();
        System.out.println("");
        System.out.print("Salario atual até o fim de ano vai ser de: ");
        f3.GanhoAnual();
        System.out.println("");
    }
    
}
