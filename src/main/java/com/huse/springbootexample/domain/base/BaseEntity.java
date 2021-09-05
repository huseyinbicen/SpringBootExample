package com.huse.springbootexample.domain.base;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@MappedSuperclass
@Where(clause = BaseEntity.SOFT_DELETE_CLAUSE)
@Getter
@Setter
public abstract class BaseEntity {
    public static final String SOFT_DELETE_CLAUSE = "deleted = 0";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Audited
    private LocalDateTime createTime;

    @UpdateTimestamp
    @Audited
    private LocalDateTime lastUpdateTime;

    @NotNull
    @ColumnDefault("false")
    @Audited
    private Boolean deleted = false;
}