package com.codixlabs.di.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codixlabs.di.model.Lead;

@Repository
public interface LeadRepositiory extends JpaRepository<Lead, Integer>{

}
