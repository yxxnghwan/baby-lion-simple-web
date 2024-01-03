package aca.likelion.simpleweb.controller;

import aca.likelion.simpleweb.controller.dto.ReviewCreateRequest;
import aca.likelion.simpleweb.controller.dto.ReviewResponse;
import aca.likelion.simpleweb.domain.Review;
import aca.likelion.simpleweb.domain.ReviewRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewRepository reviewRepository;

    public ReviewController(final ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @PostMapping
    public ReviewResponse saveReview(@RequestBody ReviewCreateRequest request) {
        final Review review = new Review(request.getName(), request.getContent());
        final Review savedReview = reviewRepository.save(review);
        return new ReviewResponse(
                savedReview.getId(),
                savedReview.getName(),
                savedReview.getContent()
        );
    }

    @DeleteMapping("/{id}")
    public List<ReviewResponse> deleteReview(
            @PathVariable Long id
    ) {
        reviewRepository.deleteById(id);
        final List<Review> reviews = reviewRepository.findAll();
        return reviews.stream()
                .map(it -> new ReviewResponse(it.getId(), it.getName(), it.getContent()))
                .toList();
    }
}
