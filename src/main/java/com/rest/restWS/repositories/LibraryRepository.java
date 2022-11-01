
package com.rest.restWS.repositories;

import org.springframework.data.repository.CrudRepository;
import com.rest.restWS.entities.Library;

//Para mudar o endPoint
//@RepositoryRestResource(collectionResourceRel = "libraries", path = "libraries")
public interface LibraryRepository extends CrudRepository<Library, Long> {}