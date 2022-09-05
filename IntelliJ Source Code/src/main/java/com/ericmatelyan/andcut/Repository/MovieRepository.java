package com.ericmatelyan.andcut.Repository;

import com.ericmatelyan.andcut.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
