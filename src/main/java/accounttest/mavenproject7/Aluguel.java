package accounttest.mavenproject7;

public class Aluguel extends Cliente{
    
    public Aluguel(){
        equipamento = new Skate();
        assinatura = new ClienteAssSemanal();
    }
    
    public void passear(){
        System.out.println("Estou passeando!");
    }
    
    
    
}
