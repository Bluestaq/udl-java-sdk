// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.user

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class UserAuthResponse
private constructor(
    private val auth: JsonField<Boolean>,
    private val roles: JsonField<List<String>>,
    private val sub: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth") @ExcludeMissing auth: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sub") @ExcludeMissing sub: JsonField<String> = JsonMissing.of(),
    ) : this(auth, roles, sub, mutableMapOf())

    /**
     * Authentication status
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun auth(): Boolean = auth.getRequired("auth")

    /**
     * List of user roles
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun roles(): List<String> = roles.getRequired("roles")

    /**
     * Subject identifier
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sub(): String = sub.getRequired("sub")

    /**
     * Returns the raw JSON value of [auth].
     *
     * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Boolean> = auth

    /**
     * Returns the raw JSON value of [roles].
     *
     * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<String>> = roles

    /**
     * Returns the raw JSON value of [sub].
     *
     * Unlike [sub], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub") @ExcludeMissing fun _sub(): JsonField<String> = sub

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

        /**
         * Returns a mutable builder for constructing an instance of [UserAuthResponse].
         *
         * The following fields are required:
         * ```java
         * .auth()
         * .roles()
         * .sub()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserAuthResponse]. */
    class Builder internal constructor() {

        private var auth: JsonField<Boolean>? = null
        private var roles: JsonField<MutableList<String>>? = null
        private var sub: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userAuthResponse: UserAuthResponse) = apply {
            auth = userAuthResponse.auth
            roles = userAuthResponse.roles.map { it.toMutableList() }
            sub = userAuthResponse.sub
            additionalProperties = userAuthResponse.additionalProperties.toMutableMap()
        }

        /** Authentication status */
        fun auth(auth: Boolean) = auth(JsonField.of(auth))

        /**
         * Sets [Builder.auth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auth] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun auth(auth: JsonField<Boolean>) = apply { this.auth = auth }

        /** List of user roles */
        fun roles(roles: List<String>) = roles(JsonField.of(roles))

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roles(roles: JsonField<List<String>>) = apply {
            this.roles = roles.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: String) = apply {
            roles =
                (roles ?: JsonField.of(mutableListOf())).also { checkKnown("roles", it).add(role) }
        }

        /** Subject identifier */
        fun sub(sub: String) = sub(JsonField.of(sub))

        /**
         * Sets [Builder.sub] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sub] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sub(sub: JsonField<String>) = apply { this.sub = sub }

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
         * Returns an immutable instance of [UserAuthResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .auth()
         * .roles()
         * .sub()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserAuthResponse =
            UserAuthResponse(
                checkRequired("auth", auth),
                checkRequired("roles", roles).map { it.toImmutable() },
                checkRequired("sub", sub),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserAuthResponse = apply {
        if (validated) {
            return@apply
        }

        auth()
        roles()
        sub()
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
        (if (auth.asKnown().isPresent) 1 else 0) +
            (roles.asKnown().getOrNull()?.size ?: 0) +
            (if (sub.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserAuthResponse &&
            auth == other.auth &&
            roles == other.roles &&
            sub == other.sub &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(auth, roles, sub, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserAuthResponse{auth=$auth, roles=$roles, sub=$sub, additionalProperties=$additionalProperties}"
}
