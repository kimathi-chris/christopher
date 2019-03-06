package com.ufanisisavinggroup.springbootcrud.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ufanisisavinggroup.springbootcrud.domain.LoanRepayment;
import com.ufanisisavinggroup.springbootcrud.service.LoanRepaymentService;

@Controller
@RequestMapping("/loanrepayments")
public class LoanRepaymentController {
    private LoanRepaymentService loanRepaymentService;

    @Autowired
    public void setLoanApplicationService(LoanRepaymentService loanRepaymentService) {
        this.loanRepaymentService = loanRepaymentService;
    }
    
    @RequestMapping(value = { "", "/" })
    public String index(Model model) {
        model.addAttribute("activePage", "loanrepayments");
        model.addAttribute("loanrepayments", this.loanRepaymentService.getAllLoanRepayments());
        return "loanrepayments/index";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addLoanRepaymentForm(LoanRepayment loanRepayment, Model model) {
        model.addAttribute("activePage", "loanrepayments");
        return "loanrepayments/add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addLoanRepayment(@Valid LoanRepayment loanRepayment, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("activePage", "loanrepayments");
            return "loanrepayments/add";
        }
        
        this.loanRepaymentService.saveLoanRepayment(loanRepayment);
        return "redirect:/loanrepayments";
    }
    @RequestMapping(value = "/view/{id}")
    public String viewLoanRepayment(@PathVariable Integer id, Model model) {
        model.addAttribute("loanRepayment", this.loanRepaymentService.getLoanRepaymentById(id));
        model.addAttribute("activePage", "loanrepayments");
        return "loanrepayments/view";
    }
    
    @RequestMapping(value = "/edit/{id}")
    public String editLoanRepayment(@PathVariable Integer id, Model model) {
        model.addAttribute("loanRepayment", this.loanRepaymentService.getLoanRepaymentById(id));
        model.addAttribute("activePage", "loanrepayments");
        return "loanrepayments/edit";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateLoanRepayment(LoanRepayment loanRepayment) {
        System.out.println("LoanRepayment ID: " + loanRepayment.getId());
        this.loanRepaymentService.saveLoanRepayment(loanRepayment);
        return "redirect:/loanrepayments/view/" + loanRepayment.getId();
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteLoanRepayment(@PathVariable Integer id) {
        this.loanRepaymentService.deleteLoanRepayment(id);
        return "redirect:/loanrepayments";
    }
    
}
