/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DAO.AlunoDAO;
import DAO.FunDAO;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius
 */
public class Testes {

    public static void main(String[] args) {
        AlunoDAO alunDAO = new AlunoDAO();
        ArrayList<Aluno> listaAlunos = new ArrayList();
        
        //Verificar se a imagem do aluno é caregadda
        
        /*//Teste para verificar se o método 'getAlunoMatricula' funciona
        alunDAO.getAlunoMatricula("201511440260");*/
        
        
        
        //Inserindo a Foto do Aluno
        File img = new File("C:\\Users\\Vinicius\\Pictures\\teste3x4.jpg");
        FileInputStream fileInput;
        try {
            fileInput = new FileInputStream(img);
            alunDAO.setFotoAluno(fileInput, alunDAO.getAlunoMatricula("201511440260"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
        /*//Teste para verificar se o método 'getListaAlunosNome' funciona
        listaAlunos = alunDAO.getListaAlunosNome("Vinícius");
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println("getListaAlunosNome('Vinícius'): "+listaAlunos.get(i).toString());
        }*/
        
        /*//Teste para verificar se o método 'getListaAlunosTurma' funciona
        listaAlunos = alunDAO.getListaAlunosTurma("IINF31B");
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println("getListaAlunosTurma('IINF31B', 2017): "+listaAlunos.get(i).toString());
        }*/
        
        /*//Teste para verificar se o método 'getListaAlunosCurso' funciona
        listaAlunos = alunDAO.getListaAlunosCurso("1");
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println("getListaAlunosCurso('1', 2017): "+listaAlunos.get(i).toString());
        }*/
        
        /*//Teste para verificar se o método 'rmAlunoMatricula' funciona
        if (alunDAO.rmAlunoMatricula("201511440260")){
            System.out.println("201511440260 excluido com sucesso.");
        }*/
        
        
        Funcionario fun;
        FunDAO funDAO = new FunDAO();
        /*//Teste para verificar se o método 'getFuncionarioMatricula' funciona
        fun = funDAO.getFuncionarioMatricula("123456789");
        System.out.println(fun.toString());*/
        
        /*//Teste para verificar se o método 'getListaFuncionarioNome' funciona
        ArrayList<Funcionario> lista = funDAO.getListaFuncionarioNome("J");
        System.out.println("\ngetListaFuncionarioNome:");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
            
        }*/
        
        
        
        //Teste para verificar se o método 'getFuncionarioMatricula' funciona
        
    }
}
