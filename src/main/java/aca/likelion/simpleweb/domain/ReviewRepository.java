package aca.likelion.simpleweb.domain;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository {

    Optional<Review> findById(Long id);
    List<Review> findAll();
    Review save(Review review);
    void deleteById(Long id);
}
