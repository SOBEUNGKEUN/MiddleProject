package dev.ours.service;

import dev.ours.model.ProgramList;
import dev.ours.repository.ProgramListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramListServiceImpl implements ProgramListService{

    @Autowired
    private ProgramListRepository repository;

    @Override
    public List<ProgramList> findAll(){
        return repository.findAll();
    }

    @Override
    public ProgramList save(ProgramList programList) {
        return repository.save(programList);
    }

    @Override
    public List<ProgramList> update(ProgramList programList) {
        final Optional<ProgramList> foundProgramList = repository.findById(programList.getProgramListId());

        foundProgramList.ifPresent(newProgramList -> {// id값에 의한 엔티티가 존재하면(ifPresent)
            newProgramList.setVillageName(programList.getVillageName());
            newProgramList.setStateName(programList.getStateName());
            newProgramList.setCityName(programList.getCityName());
            newProgramList.setExperience(programList.getExperience());
            newProgramList.setExperienceName(programList.getExperienceName());
            newProgramList.setAddress(programList.getAddress());
            newProgramList.setManager(programList.getManager());
            newProgramList.setCityName(programList.getCityName());
            newProgramList.setManagerPhone(programList.getManagerPhone());
            newProgramList.setLatitude(programList.getLatitude());
            newProgramList.setLongitude(programList.getLongitude());

            repository.save(newProgramList);
        });

        return repository.findAll();
    }
    @Override
    public List<ProgramList> delete(Long id) {
        final Optional<ProgramList> foundProgramList = repository.findById(id);

        foundProgramList.ifPresent(programList -> {
            // programList : 삭제하고자 하는 엔터티
            repository.delete(programList);
        });

        return repository.findAll();
    }

    @Override
    public List<ProgramList> findByStateNameStartingWith(String stateName) {
        return repository.findByStateNameStartingWith(stateName);
    }

    @Override
    public List<ProgramList> findByExperienceNameStartingWith(String experienceName) {
        return repository.findByExperienceNameStartingWith(experienceName);
    }


}
