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
public class ImpressoraSimples extends IImpressoraMultifuncional {

    @Override
    public void Imprimir(String mensagem) {
        System.out.println("Imprimir: " + mensagem);
    }

    @Override
    public void Digitalizar(String mensagem) throws NaoPermiteDigitalizarException {
        throw new NaoPermiteDigitalizarException("Impressora simples não permite digitalizar.");
    }

    @Override
    public void ImprimirDuplex(String mensagem) throws NaoPermiteImprimirDuplexException {
        throw new NaoPermiteImprimirDuplexException("Impressora simples não permite imprimir duplex.");
    }

    @Override
    public void EnviarFax(String mensagem) throws NaoPermiteEnviarFaxException {
        throw new NaoPermiteEnviarFaxException("Impressora simples não permite enviar fax.");
    }
}
