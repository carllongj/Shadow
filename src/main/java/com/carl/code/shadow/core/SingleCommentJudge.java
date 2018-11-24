package com.carl.code.shadow.core;

import com.carl.code.shadow.conf.CommentJudge;
import com.carl.code.shadow.conf.CommentType;

/**
 * <p>Title: com.carl.code.shadow.core SingleCommentJudge</p>
 * <p>Description: 单行注释判定</p>
 * <p>Company: </p>
 *
 * @author carl
 * @date 2018/9/2 12:12
 * @Version 1.0
 */
public class SingleCommentJudge extends AbstractCommentJudge implements CommentJudge {

    public SingleCommentJudge(String line) {
        super(line);
    }

    public CommentType getCommentType() {
        return CommentType.SINGLE_LINE;
    }

    @Override
    public boolean isCommentEnd() {
        return true;
    }

    /**
     * 单行注释的结尾肯定是属于0位置的
     *
     * @return 返回结尾的索引位置
     */
    @Override
    public long indexOfCommentEnd() {
        return 0;
    }

    @Override
    public boolean isLineEnd() {
        return true;
    }
}
