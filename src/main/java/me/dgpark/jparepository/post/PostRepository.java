package me.dgpark.jparepository.post;

import me.dgpark.jparepository.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//interface PostRepository extends JpaRepository<Post, Long>, PostCustomRepository<Post> {
@Repository
interface PostRepository extends MyRepository<Post, Long> {

}
