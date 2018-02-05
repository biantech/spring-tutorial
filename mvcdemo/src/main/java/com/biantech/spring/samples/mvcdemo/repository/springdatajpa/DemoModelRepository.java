package com.biantech.spring.samples.mvcdemo.repository.springdatajpa;


import com.biantech.spring.samples.mvcdemo.model.DemoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * <code>DemoModelRepository</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-23
 */
public interface DemoModelRepository extends JpaRepository<DemoModel,Long> {

}
