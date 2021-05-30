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
public class ImpressoraMultifuncional extends IImpressoraMultifuncional {

    @Override
    public void Imprimir(String mensagem) {
        System.out.println("Imprimir: " + mensagem);
    }

    @Override
    public void Digitalizar(String mensagem) {
        System.out.println("Digitalizar: " + mensagem);
    }

    @Override
    public void ImprimirDuplex(String mensagem) {
        System.out.println("Imprimir frente-e-verso: " + mensagem);
    }

    @Override
    public void EnviarFax(String mensagem) {
        System.out.println("Fax para enviar: " + mensagem);
    }
}
