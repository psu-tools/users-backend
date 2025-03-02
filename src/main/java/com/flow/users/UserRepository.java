package com.flow.users;

import com.flow.users.entity.FlowUser;
import com.flow.users.entity.FlowUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<FlowUser, Long> {

    @Query(value = "SELECT * FROM flow_user WHERE name = :name", nativeQuery = true)
    List<FlowUser> findByName(@Param("name") String name);

}
