/**
 * 
 */
package at.ande.vogella.tutorial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import at.ande.vogella.tutorial.entities.IssueReport;

/**
 * 
 * @author ande
 * @since (December 2021)
 */
public interface IssueRepository extends JpaRepository<IssueReport, Long> {

	@Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false")
	List<IssueReport> findAllButPrivate();

	List<IssueReport> findAllByEmail(String email);

}
