/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ProjetoController;
import java.sql.Date;

/**
 *
 * @author Erick
 */
public class FormProjeto {
    public String id;
    public String nome;
    public double orcamento;
    public String prioridade;
    public String categoria;
    public Date dataInicio;
    public Date dataFinal;
    public String descricao;
    public String nomeTarefa;
    public boolean concluidaTarefa;
    
    public boolean btnSalvar() {
        ProjetoController projectCtrl = new ProjetoController();
        return projectCtrl.cadastrar(this);
    }
}
