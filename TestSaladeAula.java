class TesteSaladeAula {  

  public static void main(String args[]) { 
    
    SaladeAula S1, S2;

    System.out.println ("Sala 01");

    S1 = new SaladeAula();
    S1.VerificaPcsUsados();
    S1.EncheTurma();
    S1.VerificaPcsUsados();

    System.out.println ("\nSala 02");  
    
    S2 = new SaladeAula();
    S2.VerificaPcsUsados();
    S2.EncheTurma();
    S2.VerificaPcsUsados();
    S2.EsvaziaTurma();
    S2.VerificaPcsUsados();
  
  } 
  
}
