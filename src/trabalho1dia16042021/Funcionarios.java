package trabalho1dia16042021;

public class Funcionarios {
    
    public Funcionarios(String nome, String departamento, double salario, String dataEntrada, String rg) {
        
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
                
    }
    
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

public void Aumento(){

double aumento = 200;
double SalarioNovo = salario + aumento;
    System.out.println(SalarioNovo);

}

public void GanhoAnual(){
    
double ganhoAtual = salario * 12;
    System.out.println(ganhoAtual);

}
}