package aca.likelion.simpleweb.infrastructure;

import aca.likelion.simpleweb.domain.Review;
import aca.likelion.simpleweb.domain.ReviewRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryReviewRepository implements ReviewRepository {

    private static final Map<Long, Review> sources = new ConcurrentHashMap<>();
    private static Long seq = 0L;

    @Override
    public Optional<Review> findById(final Long id) {
        return Optional.of(sources.get(id));
    }

    @Override
    public List<Review> findAll() {
        return sources.values()
                .stream()
                .toList();
    }

    @Override
    public synchronized Review save(final Review review) {
        final Long id = ++seq;
        final Review savedReview = new Review(id, review.getName(), review.getContent());
        sources.put(id, savedReview);
        return savedReview;
    }

    @Override
    public void deleteById(final Long id) {
        sources.remove(id);
    }
}
