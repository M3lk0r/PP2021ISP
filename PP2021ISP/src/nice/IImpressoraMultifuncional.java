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
public abstract class IImpressoraMultifuncional extends IImpressoraSimples {

    public abstract void Digitalizar(String mensagem);

    public abstract void ImprimirDuplex(String mensagem);

    public abstract void EnviarFax(String mensagem);
}
