package projetoCursoUdemy.hibernate.session;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import javax.faces.bean.ApplicationScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.SessionFactoryImplementor;

import projetoCursoUdemy.VariavelConexaoUtil;
@ApplicationScoped
public class HibernateUtil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8465194533655871745L;
	public static String JAVA_COMP_ENV_JDBC_DATA_SOURCE = "java:/comp/env/jdbc/datasource";
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			if(sessionFactory == null) {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}
			
			return sessionFactory;
		}catch(Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("Erro ao criar uma conex�o!");
		}
		
		
	}
	
	public static Connection getConnectionProvider() throws SQLException{
		
		return ((SessionFactoryImplementor) sessionFactory).getConnectionProvider().getConnection();
	}
	
	
	public static SessionFactory getSessionFactory() {
	
		return sessionFactory;
	}
	
	public static Connection getConnection() throws SQLException, NamingException {
		InitialContext context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup(JAVA_COMP_ENV_JDBC_DATA_SOURCE);
		return dataSource.getConnection();
		
	}
	
	public static Session getCurrentSession() {
		
		return getSessionFactory().getCurrentSession();
	}
	
	public DataSource getDataSourceJndi()  throws NamingException{
		InitialContext context = new InitialContext();
		return (DataSource) context.lookup(VariavelConexaoUtil.JAVA_COMP_ENV_JDBC_DATA_SOURCE);
		
	}
	
	public static Session openSession() {
		if(sessionFactory == null) {
			buildSessionFactory();
		}
		return sessionFactory.openSession();
	}
	
}













