package com.nguyenminh.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
@Entity
@Table(name = "pumptable")
	public class Moisture{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "entry_id")
		private int entryId ;
		
		
		
		@Column(name = "field1")
		private String field1;
		
		public Moisture() {
			
		}
		public Moisture( String field1) {
			
		
			this.field1 = field1;
		}
		
		public int getEntryId() {
			return entryId;
		}

		public void setEntryId(int entryId) {
			this.entryId = entryId;
		}

		

		public String getField1() {
			return field1;
		}

		public void setField1(String field1) {
			this.field1 = field1;
		}
		
		
	}

