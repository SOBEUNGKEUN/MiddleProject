package dev.ours.controller;

import dev.ours.model.ProgramList;
import dev.ours.service.AccommodationService;
import dev.ours.service.MarketService;
import dev.ours.service.ProgramListService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * ProgramList
     */
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

    /**
     * 도 입력(ex 경상도, 경상, 강원도, 제주 ...)
     */
    @GetMapping("/state/{state_name}")
	@Query("SELECT * FROM program_list where state_name like ? %")
	public List<ProgramList> findByStateNameStartingWith(@PathVariable("state_name") String stateName){
		return programListService.findByStateNameStartingWith(stateName);
	}

    /**
     * 체험명 입력(ex 갯벌, 어업체험 ...)
     */
    @GetMapping("/experience/{experience_name}")
    @Query("SELECT * FROM program_list where experience_name like ? %")
    public List<ProgramList> findByExperienceNameStartingWith(@PathVariable("experience_name") String experienceName){
        return programListService.findByExperienceNameStartingWith(experienceName);
    }

//    @Query("SELECT * FROM ")
}
