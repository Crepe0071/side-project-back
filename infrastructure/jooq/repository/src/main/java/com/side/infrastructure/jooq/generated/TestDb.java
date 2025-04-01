/*
 * This file is generated by jOOQ.
 */
package com.side.infrastructure.jooq.generated;


import com.side.infrastructure.jooq.generated.tables.Comment;
import com.side.infrastructure.jooq.generated.tables.Notice;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class TestDb extends SchemaImpl {

    /**
     * The reference instance of <code>test_db</code>
     */
    public static final TestDb TEST_DB = new TestDb();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>test_db.comment</code>.
     */
    public final Comment COMMENT = Comment.COMMENT;

    /**
     * The table <code>test_db.notice</code>.
     */
    public final Notice NOTICE = Notice.NOTICE;

    /**
     * No further instances allowed
     */
    private TestDb() {
        super("test_db", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
                Comment.COMMENT,
                Notice.NOTICE
        );
    }
}
