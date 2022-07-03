package com.study.datajpa.repository;

import com.study.datajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
