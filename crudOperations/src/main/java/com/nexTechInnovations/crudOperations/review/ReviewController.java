package com.nexTechInnovations.crudOperations.review;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company/{companyId}")
public class ReviewController {

   private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId){
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> addReviews(@PathVariable Long companyId, @RequestBody Review review){

        boolean isReviewSaved = reviewService.addReview(companyId,review);

        if(isReviewSaved){
            return new ResponseEntity<>("review add successfully...!", HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>("comapny not found...",HttpStatus.NOT_FOUND);
        }

    }

}
