package com.natevaughan.kchat.model.chat

import java.util.concurrent.atomic.AtomicLong
import javax.inject.Singleton
import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.SecurityContext


/**
 * Created by nate on 11/22/17
 */
@Singleton
class UtilityCtrl {

    val count = AtomicLong()
    val map = mutableMapOf<String, Any>()

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun base(@PathParam("id") id: Long, @Context sc: SecurityContext): String {
        return "hello, world"
    }

    @GET
    @Path("/health-check")
    @Produces(MediaType.APPLICATION_JSON)
    fun healthCheck(@PathParam("id") id: Long, @Context sc: SecurityContext): Map<String, Any> {
        map["healthyCount"] = count.incrementAndGet()
        return map
    }
}
