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
public class Boletin11
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Adestrador zidane=new Adestrador("FFF",1,"Zinadine","Zidane",45);
        Xogador ronaldo=new Xogador(7,"DL",100,"Ronaldo","Dos Santos",32);
        Masaxista pepe=new Masaxista("Fisioterapeuta",10,1000,"Pepe","da silva",39);
        Seleccion ramos=new Xogador(4,"DC",500,"Sergio","Ramos",38);
        zidane.concentrarse();
        ronaldo.concentrarse();
        pepe.concentrarse();
        ramos.concentrarse(); /* como non sobreescribimos o metodo concentrarse
                                  * en todos nos sale o mesmo mensaxe */
        zidane.viaxar(); // visualizase viaxa o adestrador
        ronaldo.viaxar(); // visualizase viaxan os xogadores
        pepe.viaxar(); // visualizase viaxan os masaxistas porque esta sobreescrito igual que o anterior
        ramos.viaxar(); // visualizase viaxan os xogadores 
        
        /* si se pode invocar un metodo da superclase cun obxeto da subclase, o metodo concentrarse esta
        * so na superclase, porque ainda que aparece que esta nas subclases ao herdar non vin necesario 
        * volver ao escribilo nas subclases, invoqueino antes e funciona correctamente
        */
       // ramos.dirixirAdestramento(); da fallo, non podo chamar con este obxeto, de clase seleccion un metodo doutra subclase
       // ramos.xogarPartido(); tampouco funciona, ainda que ramos e un xogador como o instanciamos de tipo seleccion non funciona
    }
    
}
