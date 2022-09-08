package com.ericmatelyan.andcut.Repository;

import com.ericmatelyan.andcut.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
