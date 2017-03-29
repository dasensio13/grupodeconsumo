package dasensio.java.grupodeconsumo.dao.group.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.group.Family;

public interface IFamilyDao {

	Family findOne(long id);

	List<Family> findAll();

	String findAllQuery();

	void create(Family entity);

	Family update(Family entity);

	void delete(Family entity);

	void deleteById(long entityId);
}
