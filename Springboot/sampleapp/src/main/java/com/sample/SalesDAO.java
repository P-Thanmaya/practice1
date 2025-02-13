package com.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesDAO extends JpaRepository<Sales,Integer> 
{

}