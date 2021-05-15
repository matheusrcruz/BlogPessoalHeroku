package generation.org.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.org.blogPessoal.model.ComentarioPostagem;

@Repository
public interface ComentarioPostagemRepository extends JpaRepository<ComentarioPostagem, Long> {	
	public List<ComentarioPostagem> findAllByComentarioContainingIgnoreCase (String comentario); 
}
