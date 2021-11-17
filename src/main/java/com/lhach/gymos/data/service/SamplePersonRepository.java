package com.lhach.gymos.data.service;

import com.lhach.gymos.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}