package io.pivotal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by pivotal on 3/20/17.
 */

@RepositoryRestResource
public interface WishlistItemRepo extends CrudRepository<WishlistItem, Long> {

}