package accounttest.mavenproject7;

public abstract class Cliente {
    TrocaEquipamento equipamento;
    TrocaAssinatura assinatura;
  
    
        public abstract void passear();

        public void getEquipamento(){
            equipamento.usarEquipamento();
        }
        
        public void setEquipamento(TrocaEquipamento equipamento){
            this.equipamento=equipamento;
        }
        
        public void getAssinatura(){
            assinatura.mostrarAssinatura();
        }
        
        public void setAssinatura(TrocaAssinatura assinatura){
            this.assinatura=assinatura;
        }
        
        
}

   
