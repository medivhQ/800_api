package com.code.dao.user;

import com.code.entity.user.WebUserCash;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 高雄辉 on 2016-05-1815:24:33
 *
 * @description
 */
public interface WebUserCashDao extends PagingAndSortingRepository<WebUserCash,Long>,JpaSpecificationExecutor<WebUserCash> {
}