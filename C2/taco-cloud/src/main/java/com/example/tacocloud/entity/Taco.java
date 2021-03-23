package com.example.tacocloud.entity;

import java.util.List;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Taco {
  private String name;
  private List<String> ingredients;
}
