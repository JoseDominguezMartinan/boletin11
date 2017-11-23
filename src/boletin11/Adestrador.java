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
public class Adestrador extends Seleccion
{
    private final  String idFederacion;

    public Adestrador(String idFederacion,int id,String nome,String apelido,int edade)
    {
        super(id,nome,apelido,edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion()
    {
        return idFederacion;
    }

    @Override
    public String toString()
    {
        return  super.toString()+"\n idFederacion "+idFederacion;
    }
    @Override
    public void viaxar()
    {
        System.out.println("viaxa o adestrador");
    }
    public void dirixirPartido()
    {
        
    }
    public void dirixirAdestramento()
    {
        
    }
    
}
