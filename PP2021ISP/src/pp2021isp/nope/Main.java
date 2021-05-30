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
public class Main {

    public static void main(String[] args) throws NaoPermiteDigitalizarException, NaoPermiteImprimirDuplexException, NaoPermiteEnviarFaxException {

        ImpressoraSimples impressao = new ImpressoraSimples();

        impressao.Imprimir("Hello, world.");
        impressao.Digitalizar("Nota fiscal.");
        impressao.ImprimirDuplex("Frente e verso.");
        impressao.EnviarFax("Currículo por fax.");
    }
}
