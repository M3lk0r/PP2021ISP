/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice;

/**
 *
 * @author eduar
 */
public class ImpressoraSimples extends IImpressoraSimples {

    @Override
    public void Imprimir(String mensagem) {
        System.out.println("Imprimir (impressora simples): " + mensagem);
    }
}
