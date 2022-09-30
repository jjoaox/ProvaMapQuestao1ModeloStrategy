package accounttest.mavenproject7;

public class Mavenproject7 {

    public static void main(String[] args) {
       Cliente cli = new Cliente();
       cli.passear();
       cli.getEquipamento();
       cli.setEquipamento(new BicicletaParaUm());
       cli.getEquipamento();
       PranchaDeSurf prancha = new PranchaDeSurf();
       cli.setEquipamento(prancha);
       cli.getEquipamento();
       cli.getAssinatura();
       cli.setAssinatura(new ClienteAssAnual());
       cli.getAssinatura();
       
    }
}
