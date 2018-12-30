package com.devglan.Userportal;

import org.apache.catalina.LifecycleState;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {


    @Query("select c from User c where c.fistName like :x")
    Page<User> charcherByMotcle(@Param("x") String mc, Pageable pageable);




}
