<%@ page import="model.persistence.Projeto" %>
<%@ page import="model.DAO.ProjetoDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Projeto</title>
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
                width: 700px;
                background: #FFF;
                border-radius: 10px;
                box-shadow: 0 25px 70px rgba(0, 0, 0, .05);
                overflow: hidden;
                margin: 20px;
            }

            h1.title {
                margin-left: 25px;
                font-weight: normal;
                font-size: 1.5rem;
                color: rgba(57, 50, 173, 1)
            }

            .form {
                width: 700px;
            }

            .myform {
                background: #F4F5F7;
                padding: 25px;
                display: grid;
                grid-template-columns: 1fr 1fr;
                grid-gap: 25px
            }

            .myform label {
                display: block;
                color: #6e7085;
                font-weight: bold;
                font-size: .8rem;
                margin-bottom: 10px;
            }

            .myform input {
                border: 0;
                outline: 0;
                height: 50px;
                background: #FFF;
                width: 100%;
                border-radius: 5px;
                color: #155BDA;
                font-weight: 700;
                font-size: .9rem;
                text-indent: 15px;
                border: 2px solid transparent;
                transition: border 250ms;
            }

            .full-width {
                grid-column: -1 / 1
            }

            .button {
                grid-column: -1 / 1;
                display: flex;
                justify-content: center;
            }

            .button button {
                border: 0;
                outline: 0;
                width: 170px;
                height: 50px;
                border-radius: 50px;
                color: #FFF;
                font-weight: bold;
                font-size: .9rem;
                cursor: pointer;
                background: linear-gradient(356deg, rgba(57, 50, 173, 1) 0%, rgba(87, 50, 173, 1) 100%);
            }

            .button button:hover {
                background: rgba(57, 50, 173, 1);
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <div class="form">
                <%-- Verificar se o parâmetro "id" foi fornecido na URL --%>
                <% String idParam = request.getParameter("id");
                    if (idParam == null || idParam.isEmpty()) {
                        // Redirecionar de volta para a página inicial se o ID não estiver presente
                        response.sendRedirect("index.jsp");
                    } else {
                        // Recuperar o projeto com base no ID fornecido
                        ProjetoDAO projetoDAO = new ProjetoDAO();
                        Projeto projeto = projetoDAO.getProjetoById(idParam);

                        // Verificar se o projeto existe
                        if (projeto == null) {
                            // Redirecionar de volta para a página inicial se o projeto não for encontrado
                            response.sendRedirect("index.jsp");
                        } else {
                %>
                <h1 class="title">Editar Projeto</h1>
                <form class="myform" action="atualizarProjeto.jsp?id=<%= projeto.getId()%>" method="post">
                    <div  class="control-from">
                        <label for="nome">Nome do Projeto:</label>
                        <input type="text" name="nome" value="<%= projeto.getNome()%>">
                    </div>
                    <div  class="control-from">
                        <label for="orcamento">Orçamento:</label>
                        <input type="number" name="orcamento" value="<%= projeto.getOrcamento()%>">
                    </div>
                    <div  class="control-from">
                        <label for="prioridade">Prioridade:</label>
                        <input type="text" name="prioridade" value="<%= projeto.getPrioridade()%>">
                    </div>
                    <div  class="control-from">
                        <label for="categoria">Categoria:</label>
                        <input type="text" name="categoria" value="<%= projeto.getCategoria()%>">
                    </div>
                    <div  class="control-from">
                        <label for="dataInicio">Data de Início:</label>
                        <input type="date" name="dataInicio" value="<%= projeto.getDataInicio()%>">
                    </div>
                    <div  class="control-from">
                        <label for="dataFinal">Data Final:</label>
                        <input type="date" name="dataFinal" value="<%= projeto.getDataFinal()%>">
                    </div>
                    <div class="full-width">
                        <label for="companyname">Descrição do Projeto</label>
                        <input name="descricao" type="text" id="descricao" value="<%= projeto.getDescricao()%>" required>
                    </div>
                    <div  class="button">
                        <button type="submit" onclick="submit()" id="register">Atualizar Projeto</button>
                    </div>
                </form>
                <%-- Include aqui o código para exibir mensagens de erro ou sucesso --%>
                <%-- Você também pode incluir um botão de exclusão do projeto --%>
                <%-- para redirecionar para a página de exclusão do projeto --%>
                <%-- se desejar implementar essa funcionalidade. --%>
                <%-- Lembre-se de fechar as tags de scriptlet adequadamente. --%>
                <% }
                    }%>
            </div>
        </div>
    </body>
</html>
