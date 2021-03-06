package com.natevaughan.kchat.rest

import com.natevaughan.kchat.api.Message
import com.natevaughan.kchat.api.User
import com.natevaughan.kchat.framework.NotFoundException
import com.natevaughan.kchat.framework.OK
import com.natevaughan.kchat.service.MessageService
import javax.inject.Inject
import javax.inject.Singleton
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.PUT
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.SecurityContext

/**
 * Created by nate on 11/22/17
 */
@Singleton
@Path("message")
class MessageCtrl @Inject constructor(private val messageService: MessageService) {

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun message(@PathParam("id") id: String, @Context sc: SecurityContext): Message {
        val msg = messageService.findById(id)
        if (msg != null) {
            return msg
        }
        throw NotFoundException("MessageEntity not found: $id")
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun updateMessage(@PathParam("id") id: String, message: MessageRequest, @Context sc: SecurityContext): Message {
        val user =  sc.userPrincipal as User
        return messageService.update(message.text, id, user)
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun deleteMessage(@PathParam("id") id: String, @Context sc: SecurityContext): Response {
        messageService.delete(id, sc.userPrincipal as User)
        return OK
    }
}
