<%-- 
    Document   : index.jsp
    Created on : 01/07/2023, 18:20:08
    Author     : Erick
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="ConnectionJDBC.ConnectionJDBC"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                width: 120px;
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
        <!--        <%
            Connection con = new ConnectionJDBC().getConnection();

            try {

                Statement statement = con.createStatement();
                ResultSet resultset = statement.executeQuery("SHOW TABLES FROM projeto_final");
                out.print("Sucesso");

            } catch (SQLException e) {
                e.printStackTrace();
                e.getMessage();
                out.print("Erro de conexão");
            }
        %> -->
        <div class="wrapper">
            <div class="form">
                <h1 class="title">Criar Projeto</h1>

                <form name="DadosProjeto" action="salvarProjeto.jsp" method="get" class="myform">
                    <div class="control-from">
                        <label for="firstname">Nome Projeto *</label>
                        <input name="nome" type="text" id="nome" value="" required>
                    </div>

                    <div class="control-from">
                        <label for="lastname">Orçamento (R$) *</label>
                        <input name="orcamento" type="number" id="orcamento" value="" required>
                    </div>

                    <div class="control-from">
                        <label for="emailaddress">Prioridade *</label>
                        <input name="prioridade" type="text" id="prioridade" value="" required>
                    </div>

                    <div class="control-from">
                        <label for="phonenumber">Categoria *</label>
                        <input name="categoria" type="text" id="categoria" value="" required>
                    </div>

                    <div class="control-from">
                        <label for="phonenumber">Data Inicio *</label>
                        <input name="data_inicio" type="date" id="data_inicio" value="" required>
                    </div>

                    <div class="control-from">
                        <label for="phonenumber">Data Final *</label>
                        <input name="data_final" type="date" id="data_final" value="" required>
                    </div>

                    <div class="full-width">
                        <label for="companyname">Descrição do Projeto</label>
                        <input name="descricao" type="text" id="descricao" value="" required>
                    </div>

                    <div class="button">
                        <button type="submit" onclick="submit()" id="register">Cadastrar</button>
                    </div>

                </form>
            </div>
        </div>
    </body>
</html>
