public class Dipendente {
    private String matricola;
    private double stipendio;
    private double straordinario;
        public Dipendente(String matricola1, double stipendio1, double straordinario1){
        matricola = matricola1;
        stipendio = stipendio1;
        straordinario = straordinario1;
    }
    public double getStipendio(){
            return stipendio;
    }
    public double paga(int ore){
            double pagaTotale;
            pagaTotale = stipendio + ore * straordinario;
            return pagaTotale;
    }
    public String getMatricola(){
        return matricola;
    }
    public double getStraordinario(){
        return straordinario;
    }
    public void stampa(){
            System.out.println("matricola:"+matricola);
            System.out.println("stipendio:"+stipendio);
            System.out.println("straordinario:"+straordinario);
    }
}
