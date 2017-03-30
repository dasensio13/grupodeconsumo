package dasensio.java.grupodeconsumo.dao.producer.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.producer.Producer;

@RepositoryRestResource(collectionResourceRel = "producer", path = "producer")
public interface ProducerRepository extends JpaRepository<Producer, Long> {
	List<Producer> findByName(@Param("name") String name);
}
