package org.hzz.service.system;

import org.hzz.bean.entity.system.User;
import org.hzz.dao.system.UserRepository;
import org.hzz.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,Long, UserRepository> {
}
