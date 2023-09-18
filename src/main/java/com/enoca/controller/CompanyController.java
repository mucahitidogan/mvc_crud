package com.enoca.controller;

import com.enoca.dto.request.CompanySaveRequestDto;
import com.enoca.dto.request.CompanyUpdateRequestDto;
import com.enoca.entity.Company;
import com.enoca.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.enoca.constants.APIUrl.*;

@Controller
@RequiredArgsConstructor
@RequestMapping(COMPANY)
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping(FIND_ALL)
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Company> companyList = companyService.findAll();
        try{
            modelAndView.addObject("companyList",companyList);
            modelAndView.setViewName("companyList");
        }catch (Exception e){
            modelAndView.addObject("error",e.getMessage());
            modelAndView.setViewName("findAll");
        }
        return modelAndView;
    }

    @PutMapping(UPDATE)
    public ModelAndView update(CompanyUpdateRequestDto dto){
        ModelAndView modelAndView = new ModelAndView();
        try {
            companyService.update(dto);
            modelAndView.addObject("companyName",dto.getCompanyName());
            modelAndView.addObject("sector",dto.getSector());
            modelAndView.addObject("taxNumber",dto.getTaxNumber());
        }catch (Exception e){
            modelAndView.addObject("error",e.getMessage());
            modelAndView.setViewName("update");
        }
        return modelAndView;
    }

    @PostMapping(SAVE)
    public ModelAndView save(CompanySaveRequestDto dto){
        ModelAndView modelAndView = new ModelAndView();
        try {
            companyService.save(dto);
            modelAndView.addObject("companyName", dto.getCompanyName());
            modelAndView.addObject("sector", dto.getSector());
            modelAndView.addObject("taxNumber", dto.getTaxNumber());
        }catch (Exception e){
            modelAndView.addObject("error", e.getMessage());
            modelAndView.setViewName("update");
        }
        return modelAndView;
    }

    @DeleteMapping(DELETE)
    public ModelAndView delete(Long companyId){
        companyService.deleteById(companyId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("delete");
        return modelAndView;
    }




}
