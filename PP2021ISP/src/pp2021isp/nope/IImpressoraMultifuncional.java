/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021isp.nope;

/**
 *
 * @author eduar
 */
public abstract class IImpressoraMultifuncional {

    public abstract void Imprimir(String mensagem);

    public abstract void Digitalizar(String mensagem) throws Exception;

    public abstract void ImprimirDuplex(String mensagem) throws Exception;

    public abstract void EnviarFax(String mensagem) throws Exception;
}
