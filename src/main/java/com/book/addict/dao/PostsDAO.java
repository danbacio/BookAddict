package com.book.addict.dao;

import com.book.addict.dto.PostsDTO;

import java.util.List;

public interface PostsDAO {

    List<PostsDTO> getAllPosts();

    List<PostsDTO> getAllPostsByUserID(int userID);

    void registerPost(PostsDTO post);

}
