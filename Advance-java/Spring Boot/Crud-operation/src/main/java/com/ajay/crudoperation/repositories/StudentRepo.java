package com.ajay.crudoperation.repositories;

import com.ajay.crudoperation.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students ,Integer> {

}
