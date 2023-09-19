package com.jacobevans.buildersconstruction.services;

import com.jacobevans.buildersconstruction.models.QuoteRequest;

import java.util.List;

public interface QuoteRequestService {
  void deleteSelected(List<Long> selectedIds);

  QuoteRequest saveQuoteRequest(QuoteRequest quoteRequest);


  List<QuoteRequest> findAllQuoteRequests();
}
