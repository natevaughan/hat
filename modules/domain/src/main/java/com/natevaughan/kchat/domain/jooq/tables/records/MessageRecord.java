/*
 * This file is generated by jOOQ.
 */
package com.natevaughan.kchat.domain.jooq.tables.records;


import com.natevaughan.kchat.domain.jooq.tables.Message;

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
public class MessageRecord extends UpdatableRecordImpl<MessageRecord> implements Record9<byte[], String, Timestamp, Timestamp, String, byte[], String, byte[], String> {

    private static final long serialVersionUID = -1320703186;

    /**
     * Setter for <code>kchat.message.id</code>.
     */
    public void setId(byte... value) {
        set(0, value);
    }

    /**
     * Getter for <code>kchat.message.id</code>.
     */
    public byte[] getId() {
        return (byte[]) get(0);
    }

    /**
     * Setter for <code>kchat.message.id_text</code>.
     */
    public void setIdText(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kchat.message.id_text</code>.
     */
    public String getIdText() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kchat.message.date_created</code>.
     */
    public void setDateCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>kchat.message.date_created</code>.
     */
    public Timestamp getDateCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>kchat.message.last_edited</code>.
     */
    public void setLastEdited(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>kchat.message.last_edited</code>.
     */
    public Timestamp getLastEdited() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>kchat.message.text</code>.
     */
    public void setText(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>kchat.message.text</code>.
     */
    public String getText() {
        return (String) get(4);
    }

    /**
     * Setter for <code>kchat.message.author_id</code>.
     */
    public void setAuthorId(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>kchat.message.author_id</code>.
     */
    public byte[] getAuthorId() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>kchat.message.author_id_text</code>.
     */
    public void setAuthorIdText(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>kchat.message.author_id_text</code>.
     */
    public String getAuthorIdText() {
        return (String) get(6);
    }

    /**
     * Setter for <code>kchat.message.chat_id</code>.
     */
    public void setChatId(byte... value) {
        set(7, value);
    }

    /**
     * Getter for <code>kchat.message.chat_id</code>.
     */
    public byte[] getChatId() {
        return (byte[]) get(7);
    }

    /**
     * Setter for <code>kchat.message.chat_id_text</code>.
     */
    public void setChatIdText(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>kchat.message.chat_id_text</code>.
     */
    public String getChatIdText() {
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
    public Row9<byte[], String, Timestamp, Timestamp, String, byte[], String, byte[], String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<byte[], String, Timestamp, Timestamp, String, byte[], String, byte[], String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field1() {
        return Message.MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Message.MESSAGE.ID_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Message.MESSAGE.DATE_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Message.MESSAGE.LAST_EDITED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Message.MESSAGE.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return Message.MESSAGE.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Message.MESSAGE.AUTHOR_ID_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field8() {
        return Message.MESSAGE.CHAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Message.MESSAGE.CHAT_ID_TEXT;
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
    public Timestamp component4() {
        return getLastEdited();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAuthorIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component8() {
        return getChatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getChatIdText();
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
    public Timestamp value4() {
        return getLastEdited();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAuthorIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value8() {
        return getChatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getChatIdText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value1(byte... value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value2(String value) {
        setIdText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value3(Timestamp value) {
        setDateCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value4(Timestamp value) {
        setLastEdited(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value5(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value6(byte... value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value7(String value) {
        setAuthorIdText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value8(byte... value) {
        setChatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value9(String value) {
        setChatIdText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord values(byte[] value1, String value2, Timestamp value3, Timestamp value4, String value5, byte[] value6, String value7, byte[] value8, String value9) {
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
     * Create a detached MessageRecord
     */
    public MessageRecord() {
        super(Message.MESSAGE);
    }

    /**
     * Create a detached, initialised MessageRecord
     */
    public MessageRecord(byte[] id, String idText, Timestamp dateCreated, Timestamp lastEdited, String text, byte[] authorId, String authorIdText, byte[] chatId, String chatIdText) {
        super(Message.MESSAGE);

        set(0, id);
        set(1, idText);
        set(2, dateCreated);
        set(3, lastEdited);
        set(4, text);
        set(5, authorId);
        set(6, authorIdText);
        set(7, chatId);
        set(8, chatIdText);
    }
}
