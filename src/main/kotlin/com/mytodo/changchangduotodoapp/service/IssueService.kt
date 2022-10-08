package com.mytodo.changchangduotodoapp.service

import com.mytodo.changchangduotodoapp.repository.IssueRepository
import com.mytodo.changchangduotodoapp.web.issue.IssueDto
import org.springframework.stereotype.Service

@Service
class IssueService(
    private val issueRepository: IssueRepository
) {

    fun putIssue(dto: IssueDto) {
        val entity = dto.toEntity()
        issueRepository.save(entity)
    }
}