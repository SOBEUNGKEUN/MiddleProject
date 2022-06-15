package dev.ours.controller;

import dev.ours.model.ProgramList;
import dev.ours.service.ProgramListService;
import org.springframework.beans.factory.annotation.Autowired;
import dev.ours.service.AccommodationService;
import dev.ours.service.MarketService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("program_list")
public class ProgramListController {
    @Autowired
    private ProgramListService programListService;
    private MarketService marketService;
    private AccommodationService accommodationService;


    @GetMapping
    public List<ProgramList> findAll(){
        return programListService.findAll();
    }
    @PostMapping
    public ProgramList save(@RequestBody ProgramList programList) {
        return programListService.save(programList);
    }
    @PutMapping
    public List<ProgramList> update(@RequestBody ProgramList programList) {
        return programListService.update(programList);
    }

    @DeleteMapping("/{id}")
    public List<ProgramList> delete(@PathVariable("program_list_id") Long id) {
        return programListService.delete(id);
    }


    @GetMapping("/address/{address}")
	@Query("SELECT * FROM program_list where address like ? %")
	public List<ProgramList> findByAddressStartingWith(@PathVariable("address") String address){
		return programListService.findByAddressStartingWith(address);
	}

    @GetMapping("/experience/{experience_name}")
    @Query("SELECT * FROM program_list where experience_name like ? %")
    public List<ProgramList> findByExperienceNameStartingWith(@PathVariable("experience_name") String experienceName){
        return programListService.findByExperienceNameStartingWith(experienceName);
    }

    @GetMapping("/id/{program_list_id}")
    @Query("SELECT * FROM program_list where program_list_id like ? ")
    public List<ProgramList> findByProgramListId(@PathVariable("program_list_id") Long programListId){
        return programListService.findByProgramListId(programListId);
    }

}
