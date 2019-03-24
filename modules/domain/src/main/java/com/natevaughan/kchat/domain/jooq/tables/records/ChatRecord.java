/*
 * This file is generated by jOOQ.
 */
package com.natevaughan.kchat.domain.jooq.tables.records;


import com.natevaughan.kchat.domain.jooq.tables.Chat;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ChatRecord extends UpdatableRecordImpl<ChatRecord> implements Record9<byte[], String, Timestamp, String, Integer, byte[], String, byte[], String> {

    private static final long serialVersionUID = 1987040860;

    /**
     * Setter for <code>kchat.chat.id</code>.
     */
    public void setId(byte... value) {
        set(0, value);
    }

    /**
     * Getter for <code>kchat.chat.id</code>.
     */
    public byte[] getId() {
        return (byte[]) get(0);
    }

    /**
     * Setter for <code>kchat.chat.id_text</code>.
     */
    public void setIdText(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kchat.chat.id_text</code>.
     */
    public String getIdText() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kchat.chat.date_created</code>.
     */
    public void setDateCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>kchat.chat.date_created</code>.
     */
    public Timestamp getDateCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>kchat.chat.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kchat.chat.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kchat.chat.type</code>.
     */
    public void setType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>kchat.chat.type</code>.
     */
    public Integer getType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>kchat.chat.space_id</code>.
     */
    public void setSpaceId(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>kchat.chat.space_id</code>.
     */
    public byte[] getSpaceId() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>kchat.chat.space_id_text</code>.
     */
    public void setSpaceIdText(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>kchat.chat.space_id_text</code>.
     */
    public String getSpaceIdText() {
        return (String) get(6);
    }

    /**
     * Setter for <code>kchat.chat.creator_id</code>.
     */
    public void setCreatorId(byte... value) {
        set(7, value);
    }

    /**
     * Getter for <code>kchat.chat.creator_id</code>.
     */
    public byte[] getCreatorId() {
        return (byte[]) get(7);
    }

    /**
     * Setter for <code>kchat.chat.creator_id_text</code>.
     */
    public void setCreatorIdText(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>kchat.chat.creator_id_text</code>.
     */
    public String getCreatorIdText() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<byte[]> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<byte[], String, Timestamp, String, Integer, byte[], String, byte[], String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<byte[], String, Timestamp, String, Integer, byte[], String, byte[], String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field1() {
        return Chat.CHAT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Chat.CHAT.ID_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Chat.CHAT.DATE_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Chat.CHAT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Chat.CHAT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return Chat.CHAT.SPACE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Chat.CHAT.SPACE_ID_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field8() {
        return Chat.CHAT.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Chat.CHAT.CREATOR_ID_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getSpaceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSpaceIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component8() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCreatorIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getSpaceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSpaceIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value8() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCreatorIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value1(byte... value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value2(String value) {
        setIdText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value3(Timestamp value) {
        setDateCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value5(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value6(byte... value) {
        setSpaceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value7(String value) {
        setSpaceIdText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value8(byte... value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value9(String value) {
        setCreatorIdText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord values(byte[] value1, String value2, Timestamp value3, String value4, Integer value5, byte[] value6, String value7, byte[] value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChatRecord
     */
    public ChatRecord() {
        super(Chat.CHAT);
    }

    /**
     * Create a detached, initialised ChatRecord
     */
    public ChatRecord(byte[] id, String idText, Timestamp dateCreated, String name, Integer type, byte[] spaceId, String spaceIdText, byte[] creatorId, String creatorIdText) {
        super(Chat.CHAT);

        set(0, id);
        set(1, idText);
        set(2, dateCreated);
        set(3, name);
        set(4, type);
        set(5, spaceId);
        set(6, spaceIdText);
        set(7, creatorId);
        set(8, creatorIdText);
    }
}
