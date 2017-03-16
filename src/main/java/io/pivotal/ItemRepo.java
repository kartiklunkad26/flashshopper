package io.pivotal;

/**
 * Created by pivotal on 3/15/17.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ItemRepo extends CrudRepository<Item, Long> {

}