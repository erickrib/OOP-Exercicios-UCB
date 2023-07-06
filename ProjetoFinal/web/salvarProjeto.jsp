<%@page import="java.util.List"%>
<%@page import="model.DAO.ProjetoDAO"%>
<%@page import="model.persistence.Projeto"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="view.FormProjeto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <style>
            html,
            body {
                margin: 0;
                padding: 0;
            }


            body {
                width: 100vw;
                height: 100vh;
                font-family: 'Open sans';
                box-sizing: border-box;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                background: rgba(57, 50, 173, 1)
            }

            body>* {
                margin: 0;
                padding: 0;
                box-sizing: inherit;
            }

            .wrapper {
                width: 900px;
                background: #FFF;
                border-radius: 10px;
                box-shadow: 0 25px 70px rgba(0, 0, 0, .05);
                overflow: hidden;
                margin: 20px;
            }

            h2{
                text-align: center;
                font-size: 18px;
                text-transform: uppercase;
                letter-spacing: 1px;
                color: white;
                padding: 30px 0;
            }

            /* Table Styles */

            .table-wrapper{
                margin: 10px 70px 70px;
                box-shadow: 0px 35px 50px rgba( 0, 0, 0, 0.2 );
            }

            .fl-table {
                border-radius: 5px;
                font-size: 12px;
                font-weight: normal;
                border: none;
                border-collapse: collapse;
                width: 100%;
                max-width: 100%;
                white-space: nowrap;
                background-color: white;
            }

            .fl-table td, .fl-table th {
                text-align: center;
                padding: 8px;
            }

            .fl-table td {
                border-right: 1px solid #f8f8f8;
                font-size: 12px;
            }

            .fl-table thead th {
                color: #ffffff;
                background: #4FC3A1;
            }


            .fl-table thead th:nth-child(odd) {
                color: #ffffff;
                background: #324960;
            }

            .fl-table tr:nth-child(even) {
                background: #F8F8F8;
            }

            /* Responsive */

            @media (max-width: 767px) {
                .fl-table {
                    display: block;
                    width: 100%;
                }
                .table-wrapper:before{
                    content: "Scroll horizontally >";
                    display: block;
                    text-align: right;
                    font-size: 11px;
                    color: white;
                    padding: 0 0 10px;
                }
                .fl-table thead, .fl-table tbody, .fl-table thead th {
                    display: block;
                }
                .fl-table thead th:last-child{
                    border-bottom: none;
                }
                .fl-table thead {
                    float: left;
                }
                .fl-table tbody {
                    width: auto;
                    position: relative;
                    overflow-x: auto;
                }
                .fl-table td, .fl-table th {
                    padding: 20px .625em .625em .625em;
                    height: 60px;
                    vertical-align: middle;
                    box-sizing: border-box;
                    overflow-x: hidden;
                    overflow-y: auto;
                    width: 120px;
                    font-size: 13px;
                    text-overflow: ellipsis;
                }
                .fl-table thead th {
                    text-align: left;
                    border-bottom: 1px solid #f7f7f9;
                }
                .fl-table tbody tr {
                    display: table-cell;
                }
                .fl-table tbody tr:nth-child(odd) {
                    background: none;
                }
                .fl-table tr:nth-child(even) {
                    background: transparent;
                }
                .fl-table tr td:nth-child(odd) {
                    background: #F8F8F8;
                    border-right: 1px solid #E6E4E4;
                }
                .fl-table tr td:nth-child(even) {
                    border-right: 1px solid #E6E4E4;
                }
                .fl-table tbody td {
                    display: block;
                    text-align: center;
                }
            }

            .tooltip {
                position: relative;
                display: inline-block;
                margin: 0 5px;
                font-size: 1rem;
            }

            .tooltip .tooltiptext {
                visibility: hidden;
                width: 80px;
                background-color: #000;
                color: #fff;
                text-align: center;
                border-radius: 6px;
                padding: 5px;
                position: absolute;
                z-index: 1;
                bottom: 125%;
                left: 50%;
                margin-left: -60px;
                opacity: 0;
                transition: opacity 0.3s;
            }

            .tooltip:hover .tooltiptext {
                visibility: visible;
                opacity: 1;
            }
            .btn-cadastrar {
                background-color: #000;
                color: #fff;
                padding: 10px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                display: block;
                margin-left: auto;
                width: 100px;
                text-decoration: none;
            }

            .btn-cadastrar i {
                margin-right: 5px;
            }
        </style>
    </head>
    <body>
        <%
            String idParam = request.getParameter("nome");

            if (idParam != null && !idParam.isEmpty()) {
                FormProjeto projeto = new FormProjeto();
                projeto.nome = request.getParameter("nome");
                projeto.categoria = request.getParameter("categoria");
                projeto.orcamento = Double.parseDouble(request.getParameter("orcamento"));

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date dataInicioUtil = dateFormat.parse(request.getParameter("data_inicio"));
                java.sql.Date dataInicioSql = new java.sql.Date(dataInicioUtil.getTime());

                java.util.Date dataFinalUtil = dateFormat.parse(request.getParameter("data_inicio"));
                java.sql.Date dataFinalSql = new java.sql.Date(dataFinalUtil.getTime());

                projeto.dataInicio = dataInicioSql;
                projeto.dataFinal = dataFinalSql;
                projeto.prioridade = request.getParameter("prioridade");
                projeto.descricao = request.getParameter("descricao");

                if (projeto.btnSalvar()) {
        %>
        <script>
            alert("Projeto salvo com sucesso!");
        </script>
        <%
        } else {
        %>
        <script>
            alert("Erro ao salvar o projeto.");
        </script>
        <%
                }
            }

            // Exibir a tabela normalmente
            ProjetoDAO projetoDAO = new ProjetoDAO();
            List<Projeto> projetos = projetoDAO.getProjetos();

            // Verificar se há projetos para exibir
            if (!projetos.isEmpty()) {
        %>
        <h2>Lista de Projetos</h2>
        <div style="width:  900px;">
            <a href="index.jsp" class="btn-cadastrar">
                <i class="fas fa-plus"></i>
                Cadastrar
            </a>
        </div>
        <div class="wrapper">
            <table class="fl-table">
                <thead>
                <th>Nome</th>
                <th>Orçamento (R$)</th>
                <th>Prioridade</th>
                <th>Categoria</th>
                <th>Data de Início</th>
                <th>Data Final</th>
                <th>Descrição</th>
                <th>Ações</th>
                </thead>
                <%     // Iterar sobre os projetos e exibi-los na tabela
                    for (Projeto proj : projetos) {
                        // Obtenha a data do projeto
                        Date dataInicio = proj.getDataInicio();
                        Date dataFinal = proj.getDataFinal();

                        // Defina o formato desejado
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                        // Formate as datas para uma representação de texto personalizada
                        String dataInicioFormatada = dateFormat.format(dataInicio);
                        String dataFinalFormatada = dateFormat.format(dataFinal);
                %>
                <tr>
                    <td><%= proj.getNome()%></td>
                    <td><%= proj.getOrcamento()%></td>
                    <td><%= proj.getPrioridade()%></td>
                    <td><%= proj.getCategoria()%></td>
                    <td><%= dataInicioFormatada%></td>
                    <td><%= dataFinalFormatada%></td>
                    <td><%= proj.getDescricao()%></td>
                    <td>
                        <div class="tooltip">
                            <a href="editarProjeto.jsp?id=<%= proj.getId()%>"><i style="color: blue" class="fas fa-edit"></i></a>
                            <span class="tooltiptext">Editar</span>
                        </div>

                        <div class="tooltip">
                            <a href="excluirProjeto.jsp?id=<%= proj.getId()%>"><i style="color: red" class="fas fa-trash"></i></a>
                            <span class="tooltiptext">Excluir</span>
                        </div>
                    </td>
                </tr>
                <%     }
                %>
            </table>
        </div>
        <% } else {
        %>
        <p>Nenhum projeto encontrado.</p>
        <% }
        %>
    </body>
</html>
