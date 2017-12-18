package projetoCursoUdemy.implementa.crud;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import projetoCursoUdemy.hibernate.session.HibernateUtil;
import projetoCursoUdemy.interfac.crud.InterfaceCrud;
@Component
@Transactional
public class ImplementaCrud<T> implements InterfaceCrud<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1854701076355191743L;
	private static SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
	@Autowired
	private JdbcTemplateImpl jdbcTemplate;
	@Autowired
	private SimpleJdbcTempleteImpl simpleJdbcTemplete;
	@Autowired
	private SimpleJdbcInsertImpl simpleJdbcInsert;
	@Autowired
	private SimpleJdbcTemplateImpl simpleJdbcTemplateImpl;
	
	
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public SimpleJdbcTempleteImpl getSimpleJdbcTemplete() {
		return simpleJdbcTemplete;
	}

	public SimpleJdbcTemplateImpl getSimpleJdbcTemplateImpl() {
		return simpleJdbcTemplateImpl;
	}

	@Override
	public void save(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persist(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveORUpdate(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T merge(T obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findList(Class<T> objs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByIdObject(Class<T> entidade, Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(Class<T> entidade, Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findListByQueryDinamic(String s) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeUpdateDinamicQuery(String s) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdateDinamicSQL(String s) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearSession() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evict(Object object) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getSession() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getListSQLDinamic(String sql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JdbcTemplate getJdbcTemplate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleJdbcTemplate getSimpleJdbcTemplate() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleJdbcInsert getSimpleJdbcInsert() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long totalRegistrosTabela(String table) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query objectQuery(String query) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findListByDinamicQuery(String query, int inicio, int maximo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
