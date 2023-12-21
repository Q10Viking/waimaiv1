package org.hzz.service;

import org.hzz.dao.BaseRepository;

import java.io.Serializable;

public abstract class BaseService<T,ID extends Serializable,R extends BaseRepository<T,ID>> {
}
