package com.example.demo.domain.picture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PictureRepository extends JpaRepository<Picture, Integer> {



}