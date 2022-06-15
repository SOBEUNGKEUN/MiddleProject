package dev.ours.repository;

import dev.ours.model.ProgramList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramListRepository extends JpaRepository<ProgramList,Long> {

    List<ProgramList> findByAddressStartingWith(String address);

    List<ProgramList> findByExperienceNameStartingWith(String experienceName);

    List<ProgramList> findByProgramListId(Long programListId);
}
