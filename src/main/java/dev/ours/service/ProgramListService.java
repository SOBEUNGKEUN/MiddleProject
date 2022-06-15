package dev.ours.service;

import dev.ours.model.Accommodation;
import dev.ours.model.ProgramList;

import java.util.List;

public interface ProgramListService {
    /**
     * ProgramList
     */
    List<ProgramList> findAll();
    ProgramList save(ProgramList programList);

    List<ProgramList> update(ProgramList todo);

    List<ProgramList> delete(Long id);

    List<ProgramList> findByAddressStartingWith(String address);

    List<ProgramList> findByExperienceNameStartingWith(String experienceName);



}