package com.carl.code.shadow.core;

import com.carl.code.shadow.common.StringUtils;
import com.carl.code.shadow.conf.CommentJudge;
import com.carl.code.shadow.conf.CommentType;

/**
 * <p>Title: com.carl.code.shadow.core AbstractCommentJudge</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author carl
 * @date 2018/9/2 12:46
 * @Version 1.0
 */
public abstract class AbstractCommentJudge implements CommentJudge {

    protected final String line;

    protected AbstractCommentJudge(String line) {
        this.line = line;
    }

    public boolean isCommentStart() {
        if (!StringUtils.hasLength(line)) {
            return false;
        }

        if (line.contains(this.getCommentType().getStartType())) {
            return true;
        }

        return false;
    }

    public long indexOfCommentStart() {
        if (!isCommentStart()) {
            return -1;
        }

        String startType = this.getCommentType().getStartType();

        if (line.trim().startsWith(startType)) {
            return 0;
        }

        return line.indexOf(startType);
    }

    public abstract CommentType getCommentType();

    public boolean isCommentEnd() {
        if (StringUtils.hasLength(line)) {
            return false;
        }

        String endType = this.getCommentType().getEndType();

        //当前是否已经包含了注释结尾标志
        if (line.contains(endType)) {
            return true;
        }

        return false;
    }

    public long indexOfCommentEnd() {
        if (!this.isCommentEnd()) {
            return -1;
        }

        String endType = this.getCommentType().getEndType();

        if (line.trim().endsWith(endType)) {
            return 0;
        }

        return line.indexOf(endType);
    }
}
