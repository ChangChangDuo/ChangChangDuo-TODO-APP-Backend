package com.mytodo.changchangduotodoapp.entity

import com.mytodo.changchangduotodoapp.util.TokenUtils
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tbl_issue")
class Issue (
    val issue: String,
    val category: String,
    val author: String,
): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    val issueToken: String = TokenUtils.generateTokenWithPrefix("ISSUE")
}