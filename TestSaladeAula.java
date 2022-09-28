public class TesteSaladeAula {  

  public static void main(String args[]) { 
    
    SaladeAula S1, S2;

    System.out.println ("Sala 01");

    S1 = new SaladeAula();
    S1.setPcs(26);
    S1.setAlunos(26);
    S1.getVerificaPcsUsados();

    System.out.println ("\nSala 02");  
    
    S2 = new SaladeAula();
    S2.setPcs(25);
    S2.setAlunos(10);
    S2.getVerificaPcsUsados();
    S2.setAlunos(26);
    S2.getVerificaPcsUsados();
    S2.setAlunos(5);
    S2.getVerificaPcsUsados();
  
  } 
  
}
