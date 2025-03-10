package com.blog.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.demo.domain.BoardLike;

public interface LikeRepository extends JpaRepository<BoardLike, Long> {

}
