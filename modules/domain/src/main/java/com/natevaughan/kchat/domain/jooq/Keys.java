/*
 * This file is generated by jOOQ.
 */
package com.natevaughan.kchat.domain.jooq;


import com.natevaughan.kchat.domain.jooq.tables.Chat;
import com.natevaughan.kchat.domain.jooq.tables.ChatUser;
import com.natevaughan.kchat.domain.jooq.tables.Invite;
import com.natevaughan.kchat.domain.jooq.tables.Message;
import com.natevaughan.kchat.domain.jooq.tables.Space;
import com.natevaughan.kchat.domain.jooq.tables.SpaceUser;
import com.natevaughan.kchat.domain.jooq.tables.User;
import com.natevaughan.kchat.domain.jooq.tables.records.ChatRecord;
import com.natevaughan.kchat.domain.jooq.tables.records.ChatUserRecord;
import com.natevaughan.kchat.domain.jooq.tables.records.InviteRecord;
import com.natevaughan.kchat.domain.jooq.tables.records.MessageRecord;
import com.natevaughan.kchat.domain.jooq.tables.records.SpaceRecord;
import com.natevaughan.kchat.domain.jooq.tables.records.SpaceUserRecord;
import com.natevaughan.kchat.domain.jooq.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>kchat</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ChatRecord> KEY_CHAT_PRIMARY = UniqueKeys0.KEY_CHAT_PRIMARY;
    public static final UniqueKey<ChatRecord> KEY_CHAT_UK_5NUHPU0CZV0E8SL = UniqueKeys0.KEY_CHAT_UK_5NUHPU0CZV0E8SL;
    public static final UniqueKey<ChatUserRecord> KEY_CHAT_USER_PRIMARY = UniqueKeys0.KEY_CHAT_USER_PRIMARY;
    public static final UniqueKey<InviteRecord> KEY_INVITE_PRIMARY = UniqueKeys0.KEY_INVITE_PRIMARY;
    public static final UniqueKey<MessageRecord> KEY_MESSAGE_PRIMARY = UniqueKeys0.KEY_MESSAGE_PRIMARY;
    public static final UniqueKey<SpaceRecord> KEY_SPACE_PRIMARY = UniqueKeys0.KEY_SPACE_PRIMARY;
    public static final UniqueKey<SpaceUserRecord> KEY_SPACE_USER_PRIMARY = UniqueKeys0.KEY_SPACE_USER_PRIMARY;
    public static final UniqueKey<SpaceUserRecord> KEY_SPACE_USER_UK_BSDOTH5WCKBCFZJ = UniqueKeys0.KEY_SPACE_USER_UK_BSDOTH5WCKBCFZJ;
    public static final UniqueKey<SpaceUserRecord> KEY_SPACE_USER_UK_YRF8C6FOMC9YLGZ = UniqueKeys0.KEY_SPACE_USER_UK_YRF8C6FOMC9YLGZ;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_NAME = UniqueKeys0.KEY_USER_NAME;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ChatRecord, SpaceRecord> FK_M9ZE3MECFXQ1HXK = ForeignKeys0.FK_M9ZE3MECFXQ1HXK;
    public static final ForeignKey<ChatUserRecord, ChatRecord> FK_NOLJBCORVGUUN0P = ForeignKeys0.FK_NOLJBCORVGUUN0P;
    public static final ForeignKey<ChatUserRecord, UserRecord> FK_IA7RMNDE3JP9CHS = ForeignKeys0.FK_IA7RMNDE3JP9CHS;
    public static final ForeignKey<InviteRecord, SpaceRecord> FK_ZYVUJ3M6SJV0BTP = ForeignKeys0.FK_ZYVUJ3M6SJV0BTP;
    public static final ForeignKey<InviteRecord, UserRecord> FK_5ZZ2SYBCC7BFFEC = ForeignKeys0.FK_5ZZ2SYBCC7BFFEC;
    public static final ForeignKey<MessageRecord, UserRecord> FK_BUGTZ1C9YJFJDOZ = ForeignKeys0.FK_BUGTZ1C9YJFJDOZ;
    public static final ForeignKey<MessageRecord, ChatRecord> FK_7PNYAW7PXPLN82B = ForeignKeys0.FK_7PNYAW7PXPLN82B;
    public static final ForeignKey<SpaceUserRecord, SpaceRecord> FK_VGRTIOEOCKHTBKU = ForeignKeys0.FK_VGRTIOEOCKHTBKU;
    public static final ForeignKey<SpaceUserRecord, UserRecord> FK_DHRTLCOWYFUWQB6 = ForeignKeys0.FK_DHRTLCOWYFUWQB6;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<ChatRecord> KEY_CHAT_PRIMARY = Internal.createUniqueKey(Chat.CHAT, "KEY_chat_PRIMARY", Chat.CHAT.ID);
        public static final UniqueKey<ChatRecord> KEY_CHAT_UK_5NUHPU0CZV0E8SL = Internal.createUniqueKey(Chat.CHAT, "KEY_chat_UK_5NUHPu0cZV0e8sL", Chat.CHAT.NAME, Chat.CHAT.SPACE_ID);
        public static final UniqueKey<ChatUserRecord> KEY_CHAT_USER_PRIMARY = Internal.createUniqueKey(ChatUser.CHAT_USER, "KEY_chat_user_PRIMARY", ChatUser.CHAT_USER.USER_ID, ChatUser.CHAT_USER.CHAT_ID);
        public static final UniqueKey<InviteRecord> KEY_INVITE_PRIMARY = Internal.createUniqueKey(Invite.INVITE, "KEY_invite_PRIMARY", Invite.INVITE.TOKEN);
        public static final UniqueKey<MessageRecord> KEY_MESSAGE_PRIMARY = Internal.createUniqueKey(Message.MESSAGE, "KEY_message_PRIMARY", Message.MESSAGE.ID);
        public static final UniqueKey<SpaceRecord> KEY_SPACE_PRIMARY = Internal.createUniqueKey(Space.SPACE, "KEY_space_PRIMARY", Space.SPACE.ID);
        public static final UniqueKey<SpaceUserRecord> KEY_SPACE_USER_PRIMARY = Internal.createUniqueKey(SpaceUser.SPACE_USER, "KEY_space_user_PRIMARY", SpaceUser.SPACE_USER.USER_ID, SpaceUser.SPACE_USER.SPACE_ID);
        public static final UniqueKey<SpaceUserRecord> KEY_SPACE_USER_UK_BSDOTH5WCKBCFZJ = Internal.createUniqueKey(SpaceUser.SPACE_USER, "KEY_space_user_UK_BsdoTh5WckBCFZJ", SpaceUser.SPACE_USER.USER_ALIAS, SpaceUser.SPACE_USER.SPACE_ID);
        public static final UniqueKey<SpaceUserRecord> KEY_SPACE_USER_UK_YRF8C6FOMC9YLGZ = Internal.createUniqueKey(SpaceUser.SPACE_USER, "KEY_space_user_UK_Yrf8C6fomC9YlgZ", SpaceUser.SPACE_USER.USER_ID, SpaceUser.SPACE_USER.SPACE_ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_NAME = Internal.createUniqueKey(User.USER, "KEY_user_name", User.USER.NAME);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<ChatRecord, SpaceRecord> FK_M9ZE3MECFXQ1HXK = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_SPACE_PRIMARY, Chat.CHAT, "FK_M9zE3mecFxq1hxK", Chat.CHAT.SPACE_ID);
        public static final ForeignKey<ChatUserRecord, ChatRecord> FK_NOLJBCORVGUUN0P = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_CHAT_PRIMARY, ChatUser.CHAT_USER, "FK_noljBcORVgUuN0p", ChatUser.CHAT_USER.CHAT_ID);
        public static final ForeignKey<ChatUserRecord, UserRecord> FK_IA7RMNDE3JP9CHS = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_USER_PRIMARY, ChatUser.CHAT_USER, "FK_ia7rMnDE3JP9cHs", ChatUser.CHAT_USER.USER_ID);
        public static final ForeignKey<InviteRecord, SpaceRecord> FK_ZYVUJ3M6SJV0BTP = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_SPACE_PRIMARY, Invite.INVITE, "FK_zYVuj3m6sJv0BTP", Invite.INVITE.SPACE_ID);
        public static final ForeignKey<InviteRecord, UserRecord> FK_5ZZ2SYBCC7BFFEC = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_USER_PRIMARY, Invite.INVITE, "FK_5zz2sYBCC7bffec", Invite.INVITE.CREATOR_ID);
        public static final ForeignKey<MessageRecord, UserRecord> FK_BUGTZ1C9YJFJDOZ = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_USER_PRIMARY, Message.MESSAGE, "FK_bUgtZ1c9YjFJDOZ", Message.MESSAGE.AUTHOR_ID);
        public static final ForeignKey<MessageRecord, ChatRecord> FK_7PNYAW7PXPLN82B = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_CHAT_PRIMARY, Message.MESSAGE, "FK_7PNYAW7PxplN82b", Message.MESSAGE.CHAT_ID);
        public static final ForeignKey<SpaceUserRecord, SpaceRecord> FK_VGRTIOEOCKHTBKU = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_SPACE_PRIMARY, SpaceUser.SPACE_USER, "FK_VgrTiOEockHTBKU", SpaceUser.SPACE_USER.SPACE_ID);
        public static final ForeignKey<SpaceUserRecord, UserRecord> FK_DHRTLCOWYFUWQB6 = Internal.createForeignKey(com.natevaughan.kchat.domain.jooq.Keys.KEY_USER_PRIMARY, SpaceUser.SPACE_USER, "FK_DhRtLCowyFUWqb6", SpaceUser.SPACE_USER.USER_ID);
    }
}
