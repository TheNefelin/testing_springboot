package com.francisco.prueba.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column(nullable = false, length = 50)
  public String name;

  @Column(nullable = false)
  public Integer value;
  
  @Column(nullable = false)
  public Integer price;

    
  @Column(nullable = false)
  public Integer id_brand;
}
