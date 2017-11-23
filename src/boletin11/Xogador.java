/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author jdominguezmartinan
 */
public class Xogador extends Seleccion
{
    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal,String demarcacion,int id,String nome,String apelido,int edade)
    {
        super(id,nome,apelido,edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal()
    {
        return dorsal;
    }

    public String getDemarcacion()
    {
        return demarcacion;
    }

    public void setDorsal(int dorsal)
    {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion)
    {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\n dorsal "+dorsal+"\n demarcación"+demarcacion;
    }
    @Override
    public void viaxar()
    {
        System.out.println("viaxan os xogadores");
    }
     public void xogarPartido()
    {
        
    }
    public void entrenar()
    {
        
    }
        
  
}

