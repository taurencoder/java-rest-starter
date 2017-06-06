package com.os.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by dqin on 6/6/2017.
 */
@Entity
@Table(name = "`user`")
@Data
public class User extends BaseEntity {
    private String username;
}
