package com.nexTechInnovations.crudOperations.review;

import com.nexTechInnovations.crudOperations.Company.Company;
import com.nexTechInnovations.crudOperations.Company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements ReviewServiceMethods{

    private final ReviewRepository reviewRepository;
    private final CompanyService companyService;

    public ReviewService(ReviewRepository reviewRepository, CompanyService companyService ) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }

    @Override
    public boolean addReview(Long companyId, Review review) {
        Company company = companyService.getCompanyById(companyId);

        if(company != null){
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        }
        else {
            return false;
        }
    }
}
