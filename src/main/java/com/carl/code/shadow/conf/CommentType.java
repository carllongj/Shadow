package com.carl.code.shadow.conf;

import static com.carl.code.shadow.conf.CommentJudge.*;

/**
 * <p>Title: com.carl.code.shadow.conf</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author carl
 * @date 2018/9/2 12:04
 * @Version 1.0
 */
public enum CommentType {

    /**
     * 单行注释
     */
    SINGLE_LINE(SINGLE_LINE_COMMENT, null),

    /**
     * 多行注释
     */
    MULTI_LINE(MULTI_LINE_COMMENT, COMMENT_END),

    /**
     * Java的文档注释
     */
    JAVA_DOC(JAVA_DOC_COMMENT, COMMENT_END);

    /**
     * 当前的注释开头文本
     */
    private String startType;

    /**
     * 当前注释的结束文本
     */
    private String endType;

    CommentType(String startType, String endType) {
        this.startType = startType;
        this.endType = endType;
    }

    public String getStartType() {
        return this.startType;
    }

    public String getEndType() {
        return this.endType;
    }
}

