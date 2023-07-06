<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.sql.Date" %>
<%@ page import="model.persistence.Projeto" %>
<%@ page import="model.DAO.ProjetoDAO" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Projeto</title>
        <style>
            .container {
                width: 500px;
                margin: 0 auto;
                padding-top: 50px;
            }

            .container h1 {
                text-align: center;
            }

            .container form {
                margin-top: 30px;
            }

            .container label {
                display: block;
                margin-bottom: 10px;
            }

            .container input[type="text"],
            .container input[type="number"],
            .container input[type="date"] {
                width: 100%;
                height: 30px;
                padding: 5px;
                margin-bottom: 10px;
            }

            .container input[type="submit"] {
                width: 100%;
                height: 40px;
                background-color: #4CAF50;
                color: white;
                border: none;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <% 
                if (request.getMethod().equalsIgnoreCase("POST")) {
                    String idParam = request.getParameter("id");
                    String nome = request.getParameter("nome");
                    String orcamentoParam = request.getParameter("orcamento");
                    String prioridade = request.getParameter("prioridade");
                    String categoria = request.getParameter("categoria");
                    String dataInicio = request.getParameter("dataInicio");
                    String dataFinal = request.getParameter("dataFinal");
                    String descricao = request.getParameter("descricao");

                    int id = Integer.parseInt(idParam);
                    double orcamento = Double.parseDouble(orcamentoParam);

                    Projeto projeto = new Projeto();
                    projeto.setId(Integer.toString(id));
                    projeto.setNome(nome);
                    projeto.setOrcamento(orcamento);
                    projeto.setPrioridade(prioridade);
                    projeto.setCategoria(categoria);
                    projeto.setDescricao(descricao);

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    Date dataInicioSQL = new Date(dateFormat.parse(dataInicio).getTime());
                    Date dataFinalSQL = new Date(dateFormat.parse(dataFinal).getTime());

                    projeto.setDataInicio(dataInicioSQL);
                    projeto.setDataFinal(dataFinalSQL);

                    ProjetoDAO projetoDAO = new ProjetoDAO();
                    boolean sucesso = projetoDAO.atualizarProjeto(projeto);

                    if (sucesso) {
            %>
                        <script>
                            alert("Projeto atualizado com sucesso!");
                            // Redirecionar para salvarProjeto.jsp após exibir o alerta
                            window.location.href = "salvarProjeto.jsp";
                        </script>
            <%
                    } else {
                        out.println("<h1>Erro ao atualizar o projeto</h1>");
                    }
                } else {
                    response.sendRedirect("salvarProjeto.jsp");
                }
            %>
        </div>
    </body>
</html>
