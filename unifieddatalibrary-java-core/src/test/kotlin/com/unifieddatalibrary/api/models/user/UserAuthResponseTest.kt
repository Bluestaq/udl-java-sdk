// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.user

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAuthResponseTest {

    @Test
    fun create() {
        val userAuthResponse =
            UserAuthResponse.builder().auth(true).addRole("string").sub("sub").build()

        assertThat(userAuthResponse.auth()).isEqualTo(true)
        assertThat(userAuthResponse.roles()).containsExactly("string")
        assertThat(userAuthResponse.sub()).isEqualTo("sub")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userAuthResponse =
            UserAuthResponse.builder().auth(true).addRole("string").sub("sub").build()

        val roundtrippedUserAuthResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userAuthResponse),
                jacksonTypeRef<UserAuthResponse>(),
            )

        assertThat(roundtrippedUserAuthResponse).isEqualTo(userAuthResponse)
    }
}
