package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.DataString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DataStringRepository extends JpaRepository<DataString,Long> {
}
