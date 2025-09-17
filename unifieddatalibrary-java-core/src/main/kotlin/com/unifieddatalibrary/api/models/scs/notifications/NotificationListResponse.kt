// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.notifications

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** SCS Event Notification */
class NotificationListResponse
private constructor(
    private val actions: JsonField<List<Action>>,
    private val classificationMarking: JsonField<String>,
    private val crossDomainTo: JsonField<String>,
    private val expires: JsonField<String>,
    private val overwrite: JsonField<Boolean>,
    private val path: JsonField<String>,
    private val timestamp: JsonField<String>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("crossDomainTo")
        @ExcludeMissing
        crossDomainTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires") @ExcludeMissing expires: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overwrite") @ExcludeMissing overwrite: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        actions,
        classificationMarking,
        crossDomainTo,
        expires,
        overwrite,
        path,
        timestamp,
        user,
        mutableMapOf(),
    )

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun actions(): Optional<List<Action>> = actions.getOptional("actions")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classificationMarking(): Optional<String> =
        classificationMarking.getOptional("classificationMarking")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun crossDomainTo(): Optional<String> = crossDomainTo.getOptional("crossDomainTo")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun expires(): Optional<String> = expires.getOptional("expires")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun overwrite(): Optional<Boolean> = overwrite.getOptional("overwrite")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun timestamp(): Optional<String> = timestamp.getOptional("timestamp")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [crossDomainTo].
     *
     * Unlike [crossDomainTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("crossDomainTo")
    @ExcludeMissing
    fun _crossDomainTo(): JsonField<String> = crossDomainTo

    /**
     * Returns the raw JSON value of [expires].
     *
     * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<String> = expires

    /**
     * Returns the raw JSON value of [overwrite].
     *
     * Unlike [overwrite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overwrite") @ExcludeMissing fun _overwrite(): JsonField<Boolean> = overwrite

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [NotificationListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationListResponse]. */
    class Builder internal constructor() {

        private var actions: JsonField<MutableList<Action>>? = null
        private var classificationMarking: JsonField<String> = JsonMissing.of()
        private var crossDomainTo: JsonField<String> = JsonMissing.of()
        private var expires: JsonField<String> = JsonMissing.of()
        private var overwrite: JsonField<Boolean> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var timestamp: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationListResponse: NotificationListResponse) = apply {
            actions = notificationListResponse.actions.map { it.toMutableList() }
            classificationMarking = notificationListResponse.classificationMarking
            crossDomainTo = notificationListResponse.crossDomainTo
            expires = notificationListResponse.expires
            overwrite = notificationListResponse.overwrite
            path = notificationListResponse.path
            timestamp = notificationListResponse.timestamp
            user = notificationListResponse.user
            additionalProperties = notificationListResponse.additionalProperties.toMutableMap()
        }

        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        fun classificationMarking(classificationMarking: String) =
            classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) = apply {
            this.classificationMarking = classificationMarking
        }

        fun crossDomainTo(crossDomainTo: String) = crossDomainTo(JsonField.of(crossDomainTo))

        /**
         * Sets [Builder.crossDomainTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crossDomainTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun crossDomainTo(crossDomainTo: JsonField<String>) = apply {
            this.crossDomainTo = crossDomainTo
        }

        fun expires(expires: String) = expires(JsonField.of(expires))

        /**
         * Sets [Builder.expires] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expires] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expires(expires: JsonField<String>) = apply { this.expires = expires }

        fun overwrite(overwrite: Boolean) = overwrite(JsonField.of(overwrite))

        /**
         * Sets [Builder.overwrite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overwrite] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overwrite(overwrite: JsonField<Boolean>) = apply { this.overwrite = overwrite }

        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [NotificationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationListResponse =
            NotificationListResponse(
                (actions ?: JsonMissing.of()).map { it.toImmutable() },
                classificationMarking,
                crossDomainTo,
                expires,
                overwrite,
                path,
                timestamp,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationListResponse = apply {
        if (validated) {
            return@apply
        }

        actions().ifPresent { it.forEach { it.validate() } }
        classificationMarking()
        crossDomainTo()
        expires()
        overwrite()
        path()
        timestamp()
        user()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: UnifieddatalibraryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (if (crossDomainTo.asKnown().isPresent) 1 else 0) +
            (if (expires.asKnown().isPresent) 1 else 0) +
            (if (overwrite.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ROOT_WRITE = of("ROOT_WRITE")

            @JvmField val UPLOAD_FILE = of("UPLOAD_FILE")

            @JvmField val CREATE_FOLDER = of("CREATE_FOLDER")

            @JvmField val DOWNLOAD_FILE = of("DOWNLOAD_FILE")

            @JvmField val DOWNLOAD_FOLDER = of("DOWNLOAD_FOLDER")

            @JvmField val MOVE_RENAME_FILE = of("MOVE_RENAME_FILE")

            @JvmField val MOVE_RENAME_FOLDER = of("MOVE_RENAME_FOLDER")

            @JvmField val COPY_FILE = of("COPY_FILE")

            @JvmField val COPY_FOLDER = of("COPY_FOLDER")

            @JvmField val UPDATE_FILE = of("UPDATE_FILE")

            @JvmField val UPDATE_FOLDER = of("UPDATE_FOLDER")

            @JvmField val DELETE_FILE = of("DELETE_FILE")

            @JvmField val DELETE_FOLDER = of("DELETE_FOLDER")

            @JvmField val DELETE_EMPTY_FOLDER = of("DELETE_EMPTY_FOLDER")

            @JvmField val CROSS_DOMAIN = of("CROSS_DOMAIN")

            @JvmField val SEND_NOTIFICATION = of("SEND_NOTIFICATION")

            @JvmField val DELETE_READ_ACL = of("DELETE_READ_ACL")

            @JvmField val DELETE_WRITE_ACL = of("DELETE_WRITE_ACL")

            @JvmField val DELETE_FILE_TAGS = of("DELETE_FILE_TAGS")

            @JvmField val DELETE_FOLDER_TAGS = of("DELETE_FOLDER_TAGS")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            ROOT_WRITE,
            UPLOAD_FILE,
            CREATE_FOLDER,
            DOWNLOAD_FILE,
            DOWNLOAD_FOLDER,
            MOVE_RENAME_FILE,
            MOVE_RENAME_FOLDER,
            COPY_FILE,
            COPY_FOLDER,
            UPDATE_FILE,
            UPDATE_FOLDER,
            DELETE_FILE,
            DELETE_FOLDER,
            DELETE_EMPTY_FOLDER,
            CROSS_DOMAIN,
            SEND_NOTIFICATION,
            DELETE_READ_ACL,
            DELETE_WRITE_ACL,
            DELETE_FILE_TAGS,
            DELETE_FOLDER_TAGS,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROOT_WRITE,
            UPLOAD_FILE,
            CREATE_FOLDER,
            DOWNLOAD_FILE,
            DOWNLOAD_FOLDER,
            MOVE_RENAME_FILE,
            MOVE_RENAME_FOLDER,
            COPY_FILE,
            COPY_FOLDER,
            UPDATE_FILE,
            UPDATE_FOLDER,
            DELETE_FILE,
            DELETE_FOLDER,
            DELETE_EMPTY_FOLDER,
            CROSS_DOMAIN,
            SEND_NOTIFICATION,
            DELETE_READ_ACL,
            DELETE_WRITE_ACL,
            DELETE_FILE_TAGS,
            DELETE_FOLDER_TAGS,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ROOT_WRITE -> Value.ROOT_WRITE
                UPLOAD_FILE -> Value.UPLOAD_FILE
                CREATE_FOLDER -> Value.CREATE_FOLDER
                DOWNLOAD_FILE -> Value.DOWNLOAD_FILE
                DOWNLOAD_FOLDER -> Value.DOWNLOAD_FOLDER
                MOVE_RENAME_FILE -> Value.MOVE_RENAME_FILE
                MOVE_RENAME_FOLDER -> Value.MOVE_RENAME_FOLDER
                COPY_FILE -> Value.COPY_FILE
                COPY_FOLDER -> Value.COPY_FOLDER
                UPDATE_FILE -> Value.UPDATE_FILE
                UPDATE_FOLDER -> Value.UPDATE_FOLDER
                DELETE_FILE -> Value.DELETE_FILE
                DELETE_FOLDER -> Value.DELETE_FOLDER
                DELETE_EMPTY_FOLDER -> Value.DELETE_EMPTY_FOLDER
                CROSS_DOMAIN -> Value.CROSS_DOMAIN
                SEND_NOTIFICATION -> Value.SEND_NOTIFICATION
                DELETE_READ_ACL -> Value.DELETE_READ_ACL
                DELETE_WRITE_ACL -> Value.DELETE_WRITE_ACL
                DELETE_FILE_TAGS -> Value.DELETE_FILE_TAGS
                DELETE_FOLDER_TAGS -> Value.DELETE_FOLDER_TAGS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ROOT_WRITE -> Known.ROOT_WRITE
                UPLOAD_FILE -> Known.UPLOAD_FILE
                CREATE_FOLDER -> Known.CREATE_FOLDER
                DOWNLOAD_FILE -> Known.DOWNLOAD_FILE
                DOWNLOAD_FOLDER -> Known.DOWNLOAD_FOLDER
                MOVE_RENAME_FILE -> Known.MOVE_RENAME_FILE
                MOVE_RENAME_FOLDER -> Known.MOVE_RENAME_FOLDER
                COPY_FILE -> Known.COPY_FILE
                COPY_FOLDER -> Known.COPY_FOLDER
                UPDATE_FILE -> Known.UPDATE_FILE
                UPDATE_FOLDER -> Known.UPDATE_FOLDER
                DELETE_FILE -> Known.DELETE_FILE
                DELETE_FOLDER -> Known.DELETE_FOLDER
                DELETE_EMPTY_FOLDER -> Known.DELETE_EMPTY_FOLDER
                CROSS_DOMAIN -> Known.CROSS_DOMAIN
                SEND_NOTIFICATION -> Known.SEND_NOTIFICATION
                DELETE_READ_ACL -> Known.DELETE_READ_ACL
                DELETE_WRITE_ACL -> Known.DELETE_WRITE_ACL
                DELETE_FILE_TAGS -> Known.DELETE_FILE_TAGS
                DELETE_FOLDER_TAGS -> Known.DELETE_FOLDER_TAGS
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Action: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationListResponse &&
            actions == other.actions &&
            classificationMarking == other.classificationMarking &&
            crossDomainTo == other.crossDomainTo &&
            expires == other.expires &&
            overwrite == other.overwrite &&
            path == other.path &&
            timestamp == other.timestamp &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actions,
            classificationMarking,
            crossDomainTo,
            expires,
            overwrite,
            path,
            timestamp,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationListResponse{actions=$actions, classificationMarking=$classificationMarking, crossDomainTo=$crossDomainTo, expires=$expires, overwrite=$overwrite, path=$path, timestamp=$timestamp, user=$user, additionalProperties=$additionalProperties}"
}
