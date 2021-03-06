/*
 * This file is generated by jOOQ.
 */
package com.natevaughan.kchat.domain.jooq.tables;


import com.natevaughan.kchat.domain.jooq.Indexes;
import com.natevaughan.kchat.domain.jooq.Kchat;
import com.natevaughan.kchat.domain.jooq.Keys;
import com.natevaughan.kchat.domain.jooq.tables.records.ChatUserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChatUser extends TableImpl<ChatUserRecord> {

    private static final long serialVersionUID = -498246113;

    /**
     * The reference instance of <code>kchat.chat_user</code>
     */
    public static final ChatUser CHAT_USER = new ChatUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChatUserRecord> getRecordType() {
        return ChatUserRecord.class;
    }

    /**
     * The column <code>kchat.chat_user.chat_id</code>.
     */
    public final TableField<ChatUserRecord, byte[]> CHAT_ID = createField("chat_id", org.jooq.impl.SQLDataType.BINARY(16).nullable(false), this, "");

    /**
     * The column <code>kchat.chat_user.chat_id_text</code>.
     */
    public final TableField<ChatUserRecord, String> CHAT_ID_TEXT = createField("chat_id_text", org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>kchat.chat_user.user_id</code>.
     */
    public final TableField<ChatUserRecord, byte[]> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BINARY(16).nullable(false), this, "");

    /**
     * The column <code>kchat.chat_user.user_id_text</code>.
     */
    public final TableField<ChatUserRecord, String> USER_ID_TEXT = createField("user_id_text", org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>kchat.chat_user.contextual_privilege</code>.
     */
    public final TableField<ChatUserRecord, Integer> CONTEXTUAL_PRIVILEGE = createField("contextual_privilege", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("10", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>kchat.chat_user</code> table reference
     */
    public ChatUser() {
        this(DSL.name("chat_user"), null);
    }

    /**
     * Create an aliased <code>kchat.chat_user</code> table reference
     */
    public ChatUser(String alias) {
        this(DSL.name(alias), CHAT_USER);
    }

    /**
     * Create an aliased <code>kchat.chat_user</code> table reference
     */
    public ChatUser(Name alias) {
        this(alias, CHAT_USER);
    }

    private ChatUser(Name alias, Table<ChatUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChatUser(Name alias, Table<ChatUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChatUser(Table<O> child, ForeignKey<O, ChatUserRecord> key) {
        super(child, key, CHAT_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kchat.KCHAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CHAT_USER_FK_NOLJBCORVGUUN0P, Indexes.CHAT_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChatUserRecord> getPrimaryKey() {
        return Keys.KEY_CHAT_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChatUserRecord>> getKeys() {
        return Arrays.<UniqueKey<ChatUserRecord>>asList(Keys.KEY_CHAT_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ChatUserRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ChatUserRecord, ?>>asList(Keys.FK_NOLJBCORVGUUN0P, Keys.FK_IA7RMNDE3JP9CHS);
    }

    public Chat chat() {
        return new Chat(this, Keys.FK_NOLJBCORVGUUN0P);
    }

    public User user() {
        return new User(this, Keys.FK_IA7RMNDE3JP9CHS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatUser as(String alias) {
        return new ChatUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatUser as(Name alias) {
        return new ChatUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChatUser rename(String name) {
        return new ChatUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChatUser rename(Name name) {
        return new ChatUser(name, null);
    }
}
