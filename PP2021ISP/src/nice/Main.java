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
public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------------------- \n* Impressora multifuncional\n");

        ImpressoraMultifuncional impressao = new ImpressoraMultifuncional();

        impressao.Imprimir("Hello, world.");
        impressao.Digitalizar("Nota fiscal.");
        impressao.ImprimirDuplex("Frente e verso.");
        impressao.EnviarFax("Currículo por fax.");

        System.out.println("---------------------------------------------- \n* Impressora simples\n");

        ImpressoraSimples impressaoSimples = new ImpressoraSimples();

        impressaoSimples.Imprimir("Hello, world.");
    }
}
