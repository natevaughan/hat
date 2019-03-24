/*
 * This file is generated by jOOQ.
 */
package com.natevaughan.kchat.domain.jooq.tables;


import com.natevaughan.kchat.domain.jooq.Indexes;
import com.natevaughan.kchat.domain.jooq.Kchat;
import com.natevaughan.kchat.domain.jooq.Keys;
import com.natevaughan.kchat.domain.jooq.tables.records.SpaceRecord;

import java.sql.Timestamp;
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
public class Space extends TableImpl<SpaceRecord> {

    private static final long serialVersionUID = 820277285;

    /**
     * The reference instance of <code>kchat.space</code>
     */
    public static final Space SPACE = new Space();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpaceRecord> getRecordType() {
        return SpaceRecord.class;
    }

    /**
     * The column <code>kchat.space.id</code>.
     */
    public final TableField<SpaceRecord, byte[]> ID = createField("id", org.jooq.impl.SQLDataType.BINARY(16).nullable(false), this, "");

    /**
     * The column <code>kchat.space.id_text</code>.
     */
    public final TableField<SpaceRecord, String> ID_TEXT = createField("id_text", org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * The column <code>kchat.space.name</code>.
     */
    public final TableField<SpaceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kchat.space.date_created</code>.
     */
    public final TableField<SpaceRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kchat.space</code> table reference
     */
    public Space() {
        this(DSL.name("space"), null);
    }

    /**
     * Create an aliased <code>kchat.space</code> table reference
     */
    public Space(String alias) {
        this(DSL.name(alias), SPACE);
    }

    /**
     * Create an aliased <code>kchat.space</code> table reference
     */
    public Space(Name alias) {
        this(alias, SPACE);
    }

    private Space(Name alias, Table<SpaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Space(Name alias, Table<SpaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Space(Table<O> child, ForeignKey<O, SpaceRecord> key) {
        super(child, key, SPACE);
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
        return Arrays.<Index>asList(Indexes.SPACE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpaceRecord> getPrimaryKey() {
        return Keys.KEY_SPACE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpaceRecord>> getKeys() {
        return Arrays.<UniqueKey<SpaceRecord>>asList(Keys.KEY_SPACE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Space as(String alias) {
        return new Space(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Space as(Name alias) {
        return new Space(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Space rename(String name) {
        return new Space(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Space rename(Name name) {
        return new Space(name, null);
    }
}