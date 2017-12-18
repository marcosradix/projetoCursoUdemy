package projetoCursoUdemy.implementa.crud;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class SimpleJdbcTempleteImpl extends SimpleJdbcTemplate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3586792217622989642L;

	public SimpleJdbcTempleteImpl(DataSource dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}

}
