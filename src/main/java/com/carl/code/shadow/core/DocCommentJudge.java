package com.carl.code.shadow.core;

import com.carl.code.shadow.common.StringUtils;
import com.carl.code.shadow.conf.CommentJudge;
import com.carl.code.shadow.conf.CommentType;

/**
 * <p>Title: com.carl.code.shadow.core DocCommentJudge</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author carl
 * @date 2018/9/2 12:26
 * @Version 1.0
 */
public class DocCommentJudge extends AbstractCommentJudge implements CommentJudge {

    public DocCommentJudge(String line) {
        super(line);
    }

    public CommentType getCommentType() {
        return CommentType.JAVA_DOC;
    }
}
