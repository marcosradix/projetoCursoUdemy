package projetoCursoUdemy.interfac.crud;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {

	// salvar dados
	void save(T obj) throws Exception;

	void persist(T obj) throws Exception;

	// salva ou atualiza
	void saveORUpdate(T obj) throws Exception;

	// atualizar dados
	void update(T obj) throws Exception;

	// deletar dados
	void delete(T obj) throws Exception;

	// salva e retorna a chave primaria do banco
	T merge(T obj) throws Exception;

	// carrega uma lista de dados uma classe recebida em T
	List<T> findList(Class<T> objs) throws Exception;

	Object findByIdObject(Class<T> entidade, Long id) throws Exception;

	T findById(Class<T> entidade, Long id) throws Exception;

	List<T> findListByQueryDinamic(String s) throws Exception;

	// passar hql do hibernate
	void executeUpdateDinamicQuery(String s) throws Exception;

	// passar sql puro
	void executeUpdateDinamicSQL(String s) throws Exception;

	// limpar a sessão do hibernate
	void clearSession() throws Exception;

	// remove o objeto da sessão
	void evict(Object object) throws Exception;

	Session getSession() throws Exception;

	List<?> getListSQLDinamic(String sql) throws Exception;

	JdbcTemplate getJdbcTemplate() throws Exception;

	SimpleJdbcTemplate getSimpleJdbcTemplate() throws Exception;

	SimpleJdbcInsert getSimpleJdbcInsert() throws Exception;

	Long totalRegistrosTabela(String table) throws Exception;

	Query objectQuery(String query) throws Exception;

	List<T> findListByDinamicQuery(String query, int inicio, int maximo) throws Exception;
}
