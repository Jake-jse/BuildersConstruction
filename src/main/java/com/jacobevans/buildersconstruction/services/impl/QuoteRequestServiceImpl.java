package com.jacobevans.buildersconstruction.services.impl;

import com.jacobevans.buildersconstruction.models.QuoteRequest;
import com.jacobevans.buildersconstruction.repositories.QuoteRequestRepository;
import com.jacobevans.buildersconstruction.services.QuoteRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteRequestServiceImpl implements QuoteRequestService {
    private final QuoteRequestRepository quoteRequestRepository;

    @Autowired
    public QuoteRequestServiceImpl(QuoteRequestRepository quoteRequestRepository) {
        this.quoteRequestRepository = quoteRequestRepository;
    }

    @Override
    public void deleteSelected(List<Long> selectedIds) {
        if (selectedIds != null && !selectedIds.isEmpty()) {
            quoteRequestRepository.deleteAllById(selectedIds);
        }
    }

    @Override
    public QuoteRequest saveQuoteRequest(QuoteRequest quoteRequest) {
        return quoteRequestRepository.save(quoteRequest);
    }

    @Override
    public List<QuoteRequest> findAllQuoteRequests() {
        return quoteRequestRepository.findAll();
    }
}
