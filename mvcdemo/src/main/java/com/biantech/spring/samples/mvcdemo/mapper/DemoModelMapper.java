package com.biantech.spring.samples.mvcdemo.mapper;

import org.apache.ibatis.session.RowBounds;
import com.biantech.spring.samples.mvcdemo.model.DemoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <code>DemoModelMapper</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2014-11-22
 */
@Repository
public interface DemoModelMapper {

    int deleteByPrimaryKey(Long id);

    DemoModel selectByPrimaryKey(Long id);

    List<DemoModel> findAll();

    List<DemoModel> findAll(RowBounds rowBounds);

    int insert(DemoModel record);

    int updateByPrimaryKey(DemoModel record);
}
