<%@ page import="model.persistence.Projeto" %>
<%@ page import="model.DAO.ProjetoDAO" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Projeto</title>
    </head>
    <body>
        <%
            // Verificar se o parâmetro "id" foi fornecido na URL
            String idParam = request.getParameter("id");
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
                    out.println("<h1>Projeto não encontrado!</h1>");
                } else {
                    // Tentar excluir o projeto
                    boolean excluido = projetoDAO.excluirProjeto(projeto);

                    if (excluido) {
                        // Exibição de mensagem de sucesso
                        out.println("<h1>Projeto excluído com sucesso!</h1>");
        %>
                        <script>
                            alert("Projeto excluído com sucesso!");
                            // Redirecionar para salvarProjeto.jsp após exibir o alerta
                            window.location.href = "salvarProjeto.jsp";
                        </script>
        <%
                    } else {
                        // Exibição de mensagem de erro
                        out.println("<h1>Erro ao excluir o projeto.</h1>");
                    }
                }
            }
        %>
    </body>
</html>
