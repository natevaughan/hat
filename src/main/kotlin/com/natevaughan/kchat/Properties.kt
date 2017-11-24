package com.natevaughan.kchat

import com.natpryce.konfig.PropertyGroup
import com.natpryce.konfig.getValue
import com.natpryce.konfig.intType
import com.natpryce.konfig.stringType
/**
 * Created by nate on 11/24/17
 */
object server : PropertyGroup() {
    val host by stringType
    val port by intType
}
object jdbc: PropertyGroup() {
    val driver by stringType
    val url by stringType
    val user by stringType
    val pass by stringType
}