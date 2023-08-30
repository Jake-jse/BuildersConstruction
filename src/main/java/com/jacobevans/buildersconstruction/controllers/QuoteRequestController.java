package com.jacobevans.buildersconstruction.controllers;

import com.jacobevans.buildersconstruction.models.QuoteRequest;
import com.jacobevans.buildersconstruction.services.QuoteRequestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuoteRequestController {
    private final QuoteRequestService quoteRequestService;

    @Autowired
    public QuoteRequestController(QuoteRequestService quoteRequestService) {
        this.quoteRequestService = quoteRequestService;
    }

    @GetMapping("/contact")
    public String showContactPage(Model model) {
        QuoteRequest quoteRequest = new QuoteRequest();
        model.addAttribute("quoteRequest", quoteRequest);
        return "contact";
    }

    @PostMapping("/contact")
    public String saveQuote(@Valid @ModelAttribute("quoteRequest") QuoteRequest quoteRequest,
                            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "contact";
        }
        quoteRequestService.saveQuoteRequest(quoteRequest);
        return "redirect:/contact-success";
    }

    @GetMapping("/contact-success")
    public String showContactSuccessPage() {
        return "contact-success";
    }

}
