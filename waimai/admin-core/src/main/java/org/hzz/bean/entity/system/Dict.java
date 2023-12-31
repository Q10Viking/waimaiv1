package org.hzz.bean.entity.system;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.hzz.bean.entity.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity(name="t_sys_dict")
@Table(appliesTo = "t_sys_dict",comment = "字典")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Dict extends BaseEntity {
    @Column
    private String num;
    @Column
    private Long pid;
    @Column
    private String name;
    @Column
    private String tips;

}