package com.example.blogplatformapi.service;

import com.example.blogplatformapi.model.BlogPost;
import com.example.blogplatformapi.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {
    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost getBlogPostById(Long id) {
        Optional<BlogPost> optionalBlogPost = blogPostRepository.findById(id);
        return optionalBlogPost.orElse(null);
    }

    public BlogPost updateBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
