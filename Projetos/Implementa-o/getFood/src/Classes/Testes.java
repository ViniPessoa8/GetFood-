/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DAO.AlunoDAO;
import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class Testes {

    public static void main(String[] args) {
        AlunoDAO alunDAO = new AlunoDAO();
        ArrayList<Aluno> listaAlunos = new ArrayList();
        //Teste para verificar se o método 'getAlunoMatricula' funciona
        alunDAO.getAlunoMatricula("201511440260");

        //Teste para verificar se o método 'getListaAlunosNome' funciona
        listaAlunos = alunDAO.getListaAlunosNome("Vinícius");
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println(listaAlunos.get(i).toString());
        }
    }
}
