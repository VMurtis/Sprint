package br.com.fiap.sprint.infra.dao;

import br.com.fiap.sprint.dominio.Automovel;
import br.com.fiap.sprint.infra.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;

public class AutomovelDAO {
    private Connection conexao;

    public AutomovelDAO() {
        conexao = new ConnectionFactory().getConnection();
    }



    public void adicionarAutomovel(Automovel automovel) {
        try {
            String sql = "INSERT INTO automoveis (marca, modelo, cor, placa, ano) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sql);
            comandoDeInsercao.setString(1, automovel.getMarcaCarro());
            comandoDeInsercao.setString(2, automovel.getModeloCarro());
            comandoDeInsercao.setString(3, automovel.getCorCarro());
            comandoDeInsercao.setString(4, automovel.getPlacaCarro());
            comandoDeInsercao.setInt(5, automovel.getAnoCarro());
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void atualizarAutomovel(int id, Automovel automovel) {


        try {
            String sql = "UPDATE automoveis SET marca = ?, modelo = ?, cor = ?, placa = ?, ano = ? WHERE id = ?";
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sql);

            comandoDeInsercao.setString(1, automovel.getMarcaCarro());
            comandoDeInsercao.setString(2, automovel.getModeloCarro());
            comandoDeInsercao.setString(3, automovel.getCorCarro());
            comandoDeInsercao.setString(4, automovel.getPlacaCarro());
            comandoDeInsercao.setInt(5, automovel.getAnoCarro());
            comandoDeInsercao.setInt(6, id);

            comandoDeInsercao.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Automovel buscarAutomovelPorId(int id) {

        Automovel automovel = null;

        try {
            String sql = "SELECT * FROM automoveis WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setInt(1, id);
            ResultSet rs = comando.executeQuery();

            if (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String cor = rs.getString("cor");
                String placa = rs.getString("placa");
                int ano = rs.getInt("ano");

                automovel = new Automovel(marca, modelo, cor, placa, ano);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return automovel;
    }

    public ArrayList<Automovel> listarTodosAutomoveis() throws SQLException {

        ArrayList<Automovel> automoveis = new ArrayList<>();

        try {
            String sql = "SELECT * FROM automoveis";
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet rs = comando.executeQuery();

            while (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String cor = rs.getString("cor");
                String placa = rs.getString("placa");
                int ano = rs.getInt("ano");

                Automovel automovel = new Automovel(marca, modelo, cor, placa, ano);
                automoveis.add(automovel);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return automoveis;
    }

    public void deletarAutomovel(int id) {


        try {
            String sql = "DELETE FROM automoveis WHERE id = ?";
            PreparedStatement comandoDeDeletar = conexao.prepareStatement(sql);

            comandoDeDeletar.setInt(1, id);
            comandoDeDeletar.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
