package com.gv.csc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LastLogin")
@Getter @Setter @NoArgsConstructor
public class LastLoginTime {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
