package com.crud.javacrud.repo;

import com.crud.javacrud.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
