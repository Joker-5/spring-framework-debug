package com.joe.aop.service.impl;

import com.joe.aop.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created by joker on 2022/11/28.
 */

@Repository
@Slf4j
public class CassandraDataService implements DataService {
	Logger logger = LoggerFactory.getLogger(CassandraDataService.class);

	@Override
	public void deleteStudent(int id) {
		logger.error("delete student info maintained by cassandra");
	}
}
