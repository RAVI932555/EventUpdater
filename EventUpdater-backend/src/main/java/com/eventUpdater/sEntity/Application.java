package com.eventUpdater.sEntity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Application")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Application {
	@Id
	@SequenceGenerator(name="seq1",sequenceName="id",initialValue=1,allocationSize=1)
	@GeneratedValue(generator="seq1",strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@Column
	private String Status;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
