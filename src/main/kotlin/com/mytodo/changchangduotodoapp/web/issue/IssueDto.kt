package com.mytodo.changchangduotodoapp.web.issue

import com.mytodo.changchangduotodoapp.entity.Issue
import javax.validation.constraints.NotBlank

data class IssueDto (
    @NotBlank
    val author: String,
    @NotBlank
    val issueContext: String,
    val category: String
) {
    fun toEntity() = Issue(
        issue = issueContext,
        category = category,
        author = author
    )
}