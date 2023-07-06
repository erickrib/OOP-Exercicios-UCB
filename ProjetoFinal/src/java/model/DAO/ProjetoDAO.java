/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import ConnectionJDBC.ConnectionJDBC;
import model.persistence.Projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {

    public boolean cadastrarProjeto(Projeto projeto) {
        boolean sucesso = false;
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            ConnectionJDBC connectionJDBC = new ConnectionJDBC();
            con = connectionJDBC.getConnection();

            String sql = "INSERT INTO projetos (nome, orcamento, prioridade, categoria, data_inicio, data_final, descricao) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            stmt = con.prepareStatement(sql);
            stmt.setString(1, projeto.getNome());
            stmt.setDouble(2, projeto.getOrcamento());
            stmt.setString(3, projeto.getPrioridade());
            stmt.setString(4, projeto.getCategoria());
            stmt.setDate(5, projeto.getDataInicio());
            stmt.setDate(6, projeto.getDataFinal());
            stmt.setString(7, projeto.getDescricao());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return sucesso;
    }

    public List<Projeto> getProjetos() {
        List<Projeto> projetos = new ArrayList<>();

        try {
            ConnectionJDBC connectionJDBC = new ConnectionJDBC();
            Connection con = connectionJDBC.getConnection();

            String query = "SELECT * FROM projetos";
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Projeto projeto = new Projeto();
                projeto.setId(rs.getString("id"));
                projeto.setNome(rs.getString("nome"));
                projeto.setOrcamento(rs.getDouble("orcamento"));
                projeto.setPrioridade(rs.getString("prioridade"));
                projeto.setCategoria(rs.getString("categoria"));
                projeto.setDataInicio(rs.getDate("data_inicio"));
                projeto.setDataFinal(rs.getDate("data_final"));
                projeto.setDescricao(rs.getString("descricao"));

                projetos.add(projeto);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return projetos;
    }

    public boolean atualizarProjeto(Projeto projeto) {
        boolean sucesso = false;
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            ConnectionJDBC connectionJDBC = new ConnectionJDBC();
            con = connectionJDBC.getConnection();

            String sql = "UPDATE projetos SET nome=?, orcamento=?, prioridade=?, categoria=?, data_inicio=?, data_final=?, descricao=? WHERE id=?";

            stmt = con.prepareStatement(sql);
            stmt.setString(1, projeto.getNome());
            stmt.setDouble(2, projeto.getOrcamento());
            stmt.setString(3, projeto.getPrioridade());
            stmt.setString(4, projeto.getCategoria());
            stmt.setDate(5, projeto.getDataInicio());
            stmt.setDate(6, projeto.getDataFinal());
            stmt.setString(7, projeto.getDescricao());
            stmt.setString(8, projeto.getId());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return sucesso;
    }

    public Projeto getProjetoById(String id) {
        Projeto projeto = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            ConnectionJDBC connectionJDBC = new ConnectionJDBC();
            con = connectionJDBC.getConnection();

            String sql = "SELECT * FROM projetos WHERE id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {
                projeto = new Projeto();
                projeto.setId(rs.getString("id"));
                projeto.setNome(rs.getString("nome"));
                projeto.setOrcamento(rs.getDouble("orcamento"));
                projeto.setPrioridade(rs.getString("prioridade"));
                projeto.setCategoria(rs.getString("categoria"));
                projeto.setDataInicio(rs.getDate("data_inicio"));
                projeto.setDataFinal(rs.getDate("data_final"));
                projeto.setDescricao(rs.getString("descricao"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return projeto;
    }

    public boolean excluirProjeto(Projeto projeto) {
        boolean sucesso = false;
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            ConnectionJDBC connectionJDBC = new ConnectionJDBC();
            con = connectionJDBC.getConnection();

            String sql = "DELETE FROM projetos WHERE id=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, projeto.getId());

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                sucesso = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return sucesso;
    }
}
