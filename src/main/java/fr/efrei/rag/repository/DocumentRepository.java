package fr.efrei.rag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import fr.efrei.rag.domain.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    
    @Override
    @NonNull
    List<Document> findAll();
    
    List<Document> findByTitleContainingIgnoreCase(String title);
    
    List<Document> findByAuthorContainingIgnoreCase(String author);
    
    @Query("SELECT d FROM Document d ORDER BY d.title ASC")
    List<Document> findAllOrderByTitleAsc();
    
    @Query("SELECT d FROM Document d ORDER BY d.author ASC") 
    List<Document> findAllOrderByAuthorAsc();
}