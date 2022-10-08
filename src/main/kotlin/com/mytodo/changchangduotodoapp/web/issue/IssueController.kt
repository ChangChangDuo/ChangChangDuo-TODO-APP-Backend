package com.mytodo.changchangduotodoapp.web.issue

import com.mytodo.changchangduotodoapp.service.IssueService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class IssueController(
    private val issueService: IssueService
) {

    @PutMapping("/issue")
    fun putIssue(@RequestBody dto: IssueDto): ResponseEntity<UInt> {
        issueService.putIssue(dto)
        return ResponseEntity.ok().build()
    }
}