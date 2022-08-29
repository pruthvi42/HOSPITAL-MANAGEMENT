package com.example.doctor;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.doctor.entity.Doctor;
import com.example.doctor.repository.DoctorRepository;
import com.example.doctor.service.DoctorService;
@RunWith(SpringRunner.class)
@SpringBootTest
class DoctorApplicationTests {
	
	    @Autowired
		private DoctorService service;

		@MockBean
		private DoctorRepository doctorRepo;
		
		@Test
		public void getDoctorTest() {
			when(doctorRepo.findAll()).thenReturn(Stream
					.of(new Doctor(1, "pruthvi", "Male", "skin", 28), new Doctor(1,"srinivas","Male","dentist",34)).collect(Collectors.toList()));
			assertEquals(2,service.getAllDoctors().size());
		   
			
		}
		
	
		
		}
		
