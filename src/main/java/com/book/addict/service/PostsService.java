package com.book.addict.service;

import com.book.addict.dto.PostsDTO;

import java.util.List;

public interface PostsService {
    public List<PostsDTO> getAllPostsByUserName(String userName);
    public Boolean registerPost(PostsDTO post);

}
