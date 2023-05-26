package com.PraveenM.springbootcrudrestPagination.repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.PraveenM.springbootcrudrestPagination.entity.Students;

public interface StudentRepository extends PagingAndSortingRepository<Students, Integer> {
}