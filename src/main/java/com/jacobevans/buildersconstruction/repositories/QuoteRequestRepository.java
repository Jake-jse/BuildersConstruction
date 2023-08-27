package com.jacobevans.buildersconstruction.repositories;

import com.jacobevans.buildersconstruction.models.QuoteRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRequestRepository extends JpaRepository<QuoteRequest, Long> {
}
