
package aulas2024_01.fev16;


public class Data {
    private int ano;
    private byte mes;
    private byte dia;
    
    public int getAno(){ 
    return ano;
            }
    
    public void setAno(int a){
    if (a > 0){
    ano = a;
    } else 
            System.out.println("Ano invalido !!!!");
    }
    
    public byte getDia(){
    return dia;
    }
    
    public void setDia(byte d){
    if (d > 0 && d <= 31){
    dia = d;}
    else
    System.out.println("Dia Invalido !!!!");
    }
    
    public byte gerMes(){
    return mes;
    }
    
    public void ajustarMes (byte m){
    if (m >0 && m <= 12){
    mes = m;
    }
    else 
            System.out.println("Mes Invalido !!!!");
    }
    
    public boolean isAnoBissexto(){
        if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0))
            return true;
        else 
            return false;
    }
    
    
}
