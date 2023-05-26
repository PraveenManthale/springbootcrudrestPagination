package com.PraveenM.springbootcrudrestPagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PraveenM.springbootcrudrestPagination.entity.Students;

public interface Studentrepo extends JpaRepository<Students,Long> {
}