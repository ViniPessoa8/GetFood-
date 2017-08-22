/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DAO.AlunoDAO;

/**
 *
 * @author vinicius
 */
public class Testes {
    public static void main(String[] args) {
        //Teste para verificar se o método 'getAlunoMatricula' funciona
        AlunoDAO alunDAO = new AlunoDAO();
        alunDAO.getAlunoMatricula("201511440260");
    }
}
