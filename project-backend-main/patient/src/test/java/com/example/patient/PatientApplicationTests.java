package com.example.patient;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.patient.repository.PatientRepository;
import com.example.patient.service.PatientService;
@RunWith(SpringRunner.class)
@SpringBootTest
class PatientApplicationTests {

	@Autowired
	private PatientService service;

	@MockBean
	private PatientRepository patientRepo;

}
