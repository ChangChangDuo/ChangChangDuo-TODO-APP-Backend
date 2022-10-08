package com.mytodo.changchangduotodoapp.repository

import com.mytodo.changchangduotodoapp.entity.Issue
import org.springframework.data.jpa.repository.JpaRepository

interface IssueRepository: JpaRepository<Issue, Long> {

}
