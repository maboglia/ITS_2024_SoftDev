package repo;

import java.time.LocalDate;
import java.util.List;

import model.ToDo;

public interface TodoDAO2 {
	
	//proprietà public final per definizione
	String FIND_ALL = "SELECT * from todo";
	String ADD = "INSERT INTO todo (descriozne, data, done) values (?,?,?)";
	
	//metodi public e abstract per definizione
	void addTodo(String desc, LocalDate data, boolean done);
	List<ToDo> getAll();

}
