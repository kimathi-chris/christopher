package com.ufanisisavinggroup.springbootcrud.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ufanisisavinggroup.springbootcrud.domain.LoanApplication;
import com.ufanisisavinggroup.springbootcrud.service.LoanApplicationService;

@Controller
@RequestMapping("/loanapplications")
public class LoanApplicationController {
    private LoanApplicationService loanApplicationService;

    @Autowired
    public void setLoanApplicationService(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }
    
    @RequestMapping(value = { "", "/" })
    public String index(Model model) {
        model.addAttribute("activePage", "loanapplications");
        model.addAttribute("loanapplications", this.loanApplicationService.getAllLoanApplications());
        return "loanapplications/index";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addLoanApplicationForm(LoanApplication loanApplication, Model model) {
        model.addAttribute("activePage", "loanapplications");
        return "loanapplications/add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addLoanApplication(@Valid LoanApplication loanApplication, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("activePage", "loanapplications");
            return "loanapplications/add";
        }
        
        this.loanApplicationService.saveLoanApplication(loanApplication);
        return "redirect:/loanapplications";
    }
    @RequestMapping(value = "/view/{id}")
    public String viewLoanApplication(@PathVariable Integer id, Model model) {
        model.addAttribute("loanApplication", this.loanApplicationService.getLoanApplicationById(id));
        model.addAttribute("activePage", "loanapplications");
        return "loanapplications/view";
    }
    
    @RequestMapping(value = "/edit/{id}")
    public String editLoanApplication(@PathVariable Integer id, Model model) {
        model.addAttribute("loanApplication", this.loanApplicationService.getLoanApplicationById(id));
        model.addAttribute("activePage", "loanapplications");
        return "loanapplications/edit";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateLoanApplication(LoanApplication loanApplication) {
        System.out.println("LoanApplication ID: " + loanApplication.getId());
        this.loanApplicationService.saveLoanApplication(loanApplication);
        return "redirect:/loanapplications/view/" + loanApplication.getId();
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteLoanApplication(@PathVariable Integer id) {
        this.loanApplicationService.deleteLoanApplication(id);
        return "redirect:/loanapplications";
    }
    
}
