package com.example.In.Abdul.Repository;

import com.example.In.Abdul.Entity.PDF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Repo extends JpaRepository<PDF, Serializable> {
}
