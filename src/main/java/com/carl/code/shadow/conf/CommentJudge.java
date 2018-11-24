package com.carl.code.shadow.conf;

/**
 * <p>Title: com.carl.code.shadow.conf</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author carl
 * @date 2018/9/2 12:08
 * @Version 1.0
 */
public interface CommentJudge {

    /**
     * 单行注释的开头
     */
    String SINGLE_LINE_COMMENT = "//";

    /**
     * 多行注释的开头
     */
    String MULTI_LINE_COMMENT = "/*";

    /**
     * JAVA DOC注释的开头
     */
    String JAVA_DOC_COMMENT = "/**";

    /**
     * 多行注释和JAVA DOC注释的结束
     */
    String COMMENT_END = "*/";

    /**
     * 判断是否为注释的开头
     *
     * @return 返回是否是注释的开头
     */
    boolean isCommentStart();

    /**
     * 获取当前注释开头的位置,用以判断当前行是否存在多种注释
     * 如果当前行不是注释行,则返回-1.
     * 返回的索引位置是注释字符的第一个字符的索引位置,若为行开头的,则返回0
     * 若不是一行开头,则返回真实的索引位置
     *
     * @return 返回在一行中的索引位置
     */
    long indexOfCommentStart();

    /**
     * 获取当前行的注释类型,可能为单行注释,多行注释,文档注释
     *
     * @return 返回当前的注释类型
     */
    CommentType getCommentType();

    /**
     * 获取当前的注释是否结束
     *
     * @return 返回注释是否已经结束
     */
    boolean isCommentEnd();

    /**
     * 获取当前注释结尾的位置,用以判断当前行是否存在多种注释
     * 如果当前行不是注释行,则返回-1.
     * 返回的索引位置是注释字符的第一个字符的索引位置,若为行开头的,则返回0
     *
     * @return 返回当前注释的结束的索引位置
     */
    long indexOfCommentEnd();

    /**
     * 是否为行的结束
     *
     * @return 返回当前行是否已经完结
     */
    boolean isLineEnd();
}
