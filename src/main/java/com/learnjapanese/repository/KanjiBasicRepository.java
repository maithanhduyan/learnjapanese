package com.learnjapanese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnjapanese.entity.KanjiBasic;

@Repository
public interface KanjiBasicRepository extends JpaRepository<KanjiBasic, Long> {

}
