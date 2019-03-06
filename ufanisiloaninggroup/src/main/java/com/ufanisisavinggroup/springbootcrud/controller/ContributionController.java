package com.ufanisisavinggroup.springbootcrud.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ufanisisavinggroup.springbootcrud.domain.Contribution;
import com.ufanisisavinggroup.springbootcrud.service.ContributionService;

@Controller
@RequestMapping("/contributions")
public class ContributionController {
    private ContributionService contributionService;

    @Autowired
    public void setContributionService(ContributionService contributionService) {
        this.contributionService = contributionService;
    }
    
    @RequestMapping(value = { "", "/" })
    public String index(Model model) {
        model.addAttribute("activePage", "contributions");
        model.addAttribute("contributions", this.contributionService.getAllContribution());
        return "contributions/index";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addContributionForm(Contribution contribution, Model model) {
        model.addAttribute("activePage", "contributions");
        return "contributions/add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContribution(@Valid Contribution contribution, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("activePage", "contributions");
            return "contributions/add";
        }
        
        this.contributionService.saveContribution(contribution);
        return "redirect:/contributions";
    }
    
    @RequestMapping(value = "/view/{id}")
    public String viewContribution(@PathVariable Integer id, Model model) {
        model.addAttribute("contribution", this.contributionService.getContributiontById(id));
        model.addAttribute("activePage", "contributions");
        return "contributions/view";
    }
    
    @RequestMapping(value = "/edit/{id}")
    public String editContribution(@PathVariable Integer id, Model model) {
        model.addAttribute("contribution", this.contributionService.getContributiontById(id));
        model.addAttribute("activePage", "contributions");
        return "contributions/edit";
    } 
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateContribution(Contribution contribution) {
        System.out.println("Contribution ID: " + contribution.getId());
        this.contributionService.saveContribution(contribution);
        return "redirect:/contributions/view/" + contribution.getId();
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteContribution(@PathVariable Integer id) {
        this.contributionService.deleteContribution(id);
        return "redirect:/contributions";
    }
    
}
