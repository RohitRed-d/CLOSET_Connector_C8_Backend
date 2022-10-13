package com.gv.csc.dao;

import com.gv.csc.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StyleDAO extends JpaRepository<Style,Long> {
}
