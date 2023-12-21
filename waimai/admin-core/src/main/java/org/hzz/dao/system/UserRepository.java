package org.hzz.dao.system;

import org.hzz.bean.entity.system.User;
import org.hzz.dao.BaseRepository;

public interface UserRepository extends BaseRepository<User,Long> {
    User findByAccount(String account);
    User findByAccountAndStatusNot(String account,Integer status);
}
