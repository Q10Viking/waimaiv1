package org.hzz;

import org.hzz.dao.BaseRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// 自定义的实现BaseRepositoryFactoryBean,能够在BaseRepository里面实现自己定义的方法，不用jpa识别
@EnableJpaRepositories(basePackages = "org.hzz.dao",repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@EntityScan(basePackages = "org.hzz.bean.entity")
@EnableJpaAuditing
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class);
    }
}
