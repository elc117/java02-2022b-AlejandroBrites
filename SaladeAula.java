class SaladeAula  {

  private int computadores;
  
  private int numalunospresentes;

  private boolean todospcsusados;

  public SaladeAula() {

    computadores = 26;
    numalunospresentes = 0;
    todospcsusados = false;

  }

  public void TodosPcsUsados()  {

    if (numalunospresentes >= computadores) 
      todospcsusados = true;
      
    else todospcsusados = false;
    
  }

  public void getVerificaPcsUsados () {

    TodosPcsUsados();

    if (todospcsusados == true) 

      System.out.println ("Todos os Pcs estão sendo usados.");
      
    else 
      
      System.out.println ("Ainda há Pcs livres para uso.");
    
  }

  public void setAlunos(int alunos) {

    this.numalunospresentes = alunos;
    
  }

  public void setPcs(int pcs) {

    this.computadores = pcs;
    
  }

}
