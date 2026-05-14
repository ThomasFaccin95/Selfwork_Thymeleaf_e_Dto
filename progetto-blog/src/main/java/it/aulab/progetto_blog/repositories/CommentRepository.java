package it.aulab.progetto_blog.repositories;

import it.aulab.progetto_blog.models.Comment;
import org.springframework.data.repository.ListCrudRepository;

public interface CommentRepository extends ListCrudRepository<Comment, Long> {

}




