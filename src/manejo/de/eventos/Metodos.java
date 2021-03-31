/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.eventos;

/**
 *
 * @author User
 */
public class Metodos {

    public Metodos() {
    }
    
    public String suma(int uno, int dos){
        return uno+dos+"";
    }
    
    public String resta(int uno, int dos){
        return uno-dos+"";
    }
    
    public String multiplica(int uno, int dos){
        return uno*dos+"";
    }
    
    public String divide(int uno, int dos){
        return (double)uno/(double)dos+"";
    }
    
    public String raiz(String num){
        return Math.sqrt(Double.parseDouble(num))+"";
    }
    
    public String mayor(int uno, int dos){
        return (uno > dos)? uno+"" : dos+"";
    }
}
