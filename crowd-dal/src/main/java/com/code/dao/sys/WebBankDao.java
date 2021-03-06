package com.code.dao.sys;

import com.code.entity.sys.WebBank;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by 高雄辉 on 2016-05-1815:26:18
 *
 * @description
 */
public interface WebBankDao extends PagingAndSortingRepository<WebBank,Long>,JpaSpecificationExecutor<WebBank> {
}