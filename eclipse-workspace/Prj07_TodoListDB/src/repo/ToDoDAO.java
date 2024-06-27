package repo;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

import model.ToDo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ToDoDAO implements TodoDAO2 {

	private Connessione conn = new Connessione();
	private Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public void addTodo() {
		try {
			ps = conn
					.getConn()
					.prepareStatement("insert into todo (descrizione, data) values (?, ?)");

			ps.setString(1, "test");
			ps.setDate(2, Date.valueOf(LocalDate.now()));
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addTodo(String desc, LocalDate data, boolean done) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ToDo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
