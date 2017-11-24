package com.natevaughan.kchat

import jersey.repackaged.com.google.common.collect.ImmutableMap
import org.hibernate.jpa.HibernatePersistenceProvider
import org.hibernate.cfg.AvailableSettings.*
import org.hibernate.dialect.MySQL57Dialect
import org.hibernate.tool.schema.Action
import java.io.IOException
import java.io.UncheckedIOException
import java.net.URL
import java.util.*
import javax.persistence.EntityManagerFactory
import javax.persistence.SharedCacheMode
import javax.persistence.ValidationMode
import javax.persistence.spi.ClassTransformer
import javax.persistence.spi.PersistenceUnitInfo
import javax.persistence.spi.PersistenceUnitTransactionType
import javax.sql.DataSource

/**
 * Created by nate on 11/23/17
 */
class DataSourceBuilder {

    var jdbcDriver: String? = null
    var jdbcUrl: String? = null
    var jdbcUser: String? = null
    var jdbcPass: String? = null

    fun entityManagerFactory(): EntityManagerFactory {
        return HibernatePersistenceProvider().createContainerEntityManagerFactory(
            ArchiverPersistenceUnitInfo(),
            ImmutableMap.Builder<String, Any>()
                    .put(JPA_JDBC_DRIVER, jdbcDriver)
                    .put(JPA_JDBC_URL, jdbcUrl)
                    .put(JPA_JDBC_USER, jdbcUser)
                    .put(JPA_JDBC_PASSWORD, jdbcPass)
                    .put(DIALECT, MySQL57Dialect::class.java)
                    .put(HBM2DDL_AUTO, Action.UPDATE)
                    .put(SHOW_SQL, false)
                    .put(QUERY_STARTUP_CHECKING, true)
                    .put(GENERATE_STATISTICS, false)
                    .put(USE_REFLECTION_OPTIMIZER, false)
                    .put(USE_SECOND_LEVEL_CACHE, false)
                    .put(USE_QUERY_CACHE, false)
                    .put(USE_STRUCTURED_CACHE, false)
                    .put(STATEMENT_BATCH_SIZE, 20)
                    .build())
    }
}

class ArchiverPersistenceUnitInfo: PersistenceUnitInfo {

    override fun getPersistenceUnitName(): String {
        return "ApplicationPersistenceUnit"
    }

    override fun getPersistenceProviderClassName(): String {
        return "org.hibernate.jpa.HibernatePersistenceProvider"
    }

    override fun getTransactionType(): PersistenceUnitTransactionType {
        return PersistenceUnitTransactionType.RESOURCE_LOCAL
    }

    override fun getJtaDataSource(): DataSource? {
        return null
    }

    override fun getNonJtaDataSource(): DataSource? {
        return null
    }

    override fun getMappingFileNames(): List<String> {
        return emptyList()
    }

    override fun getJarFileUrls(): List<URL> {
        try {
            return this::class.java.classLoader.getResources("").toList()
        } catch (e: IOException) {
            throw UncheckedIOException(e)
        }
    }

    override fun getPersistenceUnitRootUrl(): URL? {
        return null
    }

    override fun getManagedClassNames(): List<String> {
        return emptyList()
    }

    override fun excludeUnlistedClasses(): Boolean {
        return false
    }

    override fun getSharedCacheMode(): SharedCacheMode? {
        return null
    }

    override fun getValidationMode(): ValidationMode? {
        return null
    }

    override fun getProperties(): Properties {
        return Properties()
    }

    override fun getPersistenceXMLSchemaVersion(): String? {
        return null
    }

    override fun getClassLoader(): ClassLoader? {
        return null
    }

    override fun addTransformer(transformer: ClassTransformer) {

    }

    override fun getNewTempClassLoader(): ClassLoader? {
        return null
    }
}