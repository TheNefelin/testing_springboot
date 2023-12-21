package com.francisco.prueba.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.francisco.prueba.configuration.SecurityConfiguration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sale")
@Getter
@Setter
// @EntityListeners(SecurityConfiguration.class)
public class Sale {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column(nullable = false)
  public String prod_id;

  @Column(nullable = false, length = 50)
  public String prod_name;

  @Column(nullable = false)
  public Integer prod_count;

  @CreatedDate
  public Date date_new;
}
