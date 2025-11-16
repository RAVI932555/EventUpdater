package com.eventUpdater.sEntity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Event")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	@Id
	@SequenceGenerator(name="seq1",sequenceName="id",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="seq1",strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="EventName")
	private String title;
	
	@Column
	private String description;
	
	 @Column(name = "EventDate")
	 @JsonProperty("date") 
	private LocalDate date;
	 
	@Column(name="Location")
	private String location;
	
	@Column(name="Eligibility")
	@JsonProperty("eligibilityCriteria")
	private String eligibilityCriteria;
	
}
