package jdbc;

import java.sql.Connection;

public class TesteBanco {

	public static void main(String[] args) {
		try {
			Connection banco = ConnectionFactory.getConnection();
			System.out.println("Conexão OK!");
		}
		catch(Exception e){
			System.out.println("Erro ao se conectar ao banco.");
			System.out.println(e);
			
		}
	}

}
