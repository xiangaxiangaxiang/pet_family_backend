package com.petfamily.service;

import com.petfamily.common.ServerResponse;
import com.petfamily.pojo.Category;

import java.util.List;

/**
 * Created by chen on 2019/3/19.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
