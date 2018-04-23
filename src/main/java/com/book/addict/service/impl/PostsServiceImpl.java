package com.book.addict.service.impl;


import com.book.addict.dao.PostsDAO;
import com.book.addict.dto.PostsDTO;
import com.book.addict.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsDAO postsDAO;


    @Override
    public List<PostsDTO> getAllPostsByUserName(String userName) {
        return null;
    }

    @Override
    public Boolean registerPost(PostsDTO postsDTO) {
        return null;
    }

}
