package com.petfamily.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chen on 2019/3/21.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
