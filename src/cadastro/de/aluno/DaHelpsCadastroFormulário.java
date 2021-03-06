/*
 * IU To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.de.aluno;

import java.util.ArrayList;

/**
 *
 * @author Fabricio Junior
 */
public class DaHelpsCadastroFormulário {

    private final ArrayList<Aluno> alunos = new ArrayList<>();
    private int index = 0;

    /**
     * Métdo Excluir
     * @return remove da lista um aluno previamente cadastrado
     */
    public boolean deleteAluno() {
        try {
            if (alunos.size() > 0) {
                alunos.remove(index);
                return true;
            }
        } catch (Exception ex) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    
    /**
     *
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     *Método Proximo
     * @return 
     */
    public String AlunoProximo() {
        if (alunos.size() > 0) {
            index++;
            if (index > alunos.size() - 1) {
                index = 0;
            }
            String addPosi = "Pos: " + (index + 1) + "\n" + alunos.get(index).toString();
            return addPosi;
        }
        return null;
    }

    /**
     *Método
     * @return
     */
    public String getUltimoAlunoInformações() {
        try {
            int tamanho = alunos.size();
            index = tamanho - 1;
            String addPosi = "Pos: " + (tamanho) + "\n" + alunos.get(index).toString();
            return addPosi;
        } catch (Exception Ex) {
            return null;
        }
    }

    /**
     *Métdo Anterior
     * @return 
     */
    public String AlunoAnterior() {
        if (alunos.size() > 0) {
            index--;
            if (index < 0) {
            index = alunos.size() - 1;
            }
            String addPosi = "Pos: " + (index + 1) + "\n" + alunos.get(index).toString();
            return addPosi;
        }
        return null;
    }

    /**
     *
     * @param digitado
     * @return substituição de "," (digitado eventualmente pelo usuário) por "."
     */
    public String filtro(String digitado) {
        char[] palavra = digitado.toCharArray();
        int qtd = palavra.length;
        for (int x = 0; x < palavra.length; x++) {
            if (palavra[x] == ',') {
                palavra[x] = '.';
            }
        }
        return String.valueOf(palavra);
    }
}
