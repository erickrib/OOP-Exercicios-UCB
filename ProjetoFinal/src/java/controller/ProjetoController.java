/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.DAO.ProjetoDAO;
import model.persistence.Projeto;
import view.FormProjeto;

/**
 *
 * @author Erick
 */
public class ProjetoController {
     private final ProjetoDAO projetoDAO;

    public ProjetoController() {
        projetoDAO = new ProjetoDAO();
    }

    public boolean cadastrar(FormProjeto formProjeto) {
        Projeto projeto = new Projeto();
        projeto.setNome(formProjeto.nome);
        projeto.setOrcamento(formProjeto.orcamento);
        projeto.setPrioridade(formProjeto.prioridade);
        projeto.setCategoria(formProjeto.categoria);
        projeto.setDataInicio(formProjeto.dataInicio);
        projeto.setDataFinal(formProjeto.dataFinal);
        projeto.setDescricao(formProjeto.descricao);

        // Você pode adicionar a lógica de validação dos dados do projeto aqui

        // Chamada para o método de persistência no ProjetoDAO
        return projetoDAO.cadastrarProjeto(projeto);
    }
}
