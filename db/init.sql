### CREATE tbl_issue
CREATE TABLE tbl_issue (
    id BIGINT AUTO_INCREMENT,
    issue_token VARCHAR(255) NOT NULL UNIQUE,
    author VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL ,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,

    CONSTRAINT PK_ID PRIMARY KEY (id),
    CONSTRAINT UK_ISSUE_TOKEN UNIQUE (issue_token)
)