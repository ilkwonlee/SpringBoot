package com.ilkwon.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;
@Entity

public class Board {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		private Long bno;
		
		private String title;
		private String content;
		private String writer;
		
		@CreationTimestamp
		private Timestamp regdate;
		@UpdateTimestamp
		private Timestamp updateat;
		
		
		public Long getBno() {
			return bno;
		}
		public void setBno(Long bno) {
			this.bno = bno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public Timestamp getRegdate() {
			return regdate;
		}
		public void setRegdate(Timestamp regdate) {
			this.regdate = regdate;
		}
		public Timestamp getUpdateat() {
			return updateat;
		}
		public void setUpdateat(Timestamp updateat) {
			this.updateat = updateat;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Board [bno=");
			builder.append(bno);
			builder.append(", title=");
			builder.append(title);
			builder.append(", content=");
			builder.append(content);
			builder.append(", writer=");
			builder.append(writer);
			builder.append(", regdate=");
			builder.append(regdate);
			builder.append(", updateat=");
			builder.append(updateat);
			builder.append("]");
			return builder.toString();
		}
		
		
		
}
