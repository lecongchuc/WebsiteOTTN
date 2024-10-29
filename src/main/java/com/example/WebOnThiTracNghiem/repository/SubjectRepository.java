package com.example.WebOnThiTracNghiem.repository;
import com.example.WebOnThiTracNghiem.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SubjectRepository extends JpaRepository<Subject , Long>{
    Subject findSubjectByIdSubject(Long idSubject);
}
