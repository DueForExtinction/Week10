/**
 * 
 */
package week10.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import week10.beans.InventoryItem;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 24, 2023
 */
@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {

}
