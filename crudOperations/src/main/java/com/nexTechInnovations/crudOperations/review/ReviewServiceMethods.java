package com.nexTechInnovations.crudOperations.review;

import java.util.List;

public interface ReviewServiceMethods {

    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId, Review review);
}
