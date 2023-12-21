package org.hzz.service;

public interface CrudService<T,ID> extends
        InsertService<T,ID>,
        DeleteService<ID>,
        UpdateService<T,ID>,
        SelectService<T,ID> {
}
