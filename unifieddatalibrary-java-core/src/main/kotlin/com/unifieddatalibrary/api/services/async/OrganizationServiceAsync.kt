// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.OrganizationFull
import com.unifieddatalibrary.api.models.organization.OrganizationCountParams
import com.unifieddatalibrary.api.models.organization.OrganizationCreateParams
import com.unifieddatalibrary.api.models.organization.OrganizationDeleteParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationCategoriesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationTypesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetParams
import com.unifieddatalibrary.api.models.organization.OrganizationListPageAsync
import com.unifieddatalibrary.api.models.organization.OrganizationListParams
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpParams
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpResponse
import com.unifieddatalibrary.api.models.organization.OrganizationTupleParams
import com.unifieddatalibrary.api.models.organization.OrganizationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrganizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync

    /**
     * Service operation to take a single Organization as a POST body and ingest into the database.
     * A specific role is required to perform this service operation. Please contact the UDL team
     * for assistance.
     */
    fun create(params: OrganizationCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to update an Organization. A specific role is required to perform this
     * service operation. Please contact the UDL team for assistance.
     */
    fun update(pathId: String, params: OrganizationUpdateParams): CompletableFuture<Void?> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: OrganizationUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(): CompletableFuture<OrganizationListPageAsync> = list(OrganizationListParams.none())

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationListPageAsync>

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none()
    ): CompletableFuture<OrganizationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrganizationListPageAsync> =
        list(OrganizationListParams.none(), requestOptions)

    /**
     * Service operation to delete an Organization specified by the passed ID path parameter. A
     * specific role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, OrganizationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OrganizationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, OrganizationDeleteParams.none(), requestOptions)

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(): CompletableFuture<String> = count(OrganizationCountParams.none())

    /** @see count */
    fun count(
        params: OrganizationCountParams = OrganizationCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see count */
    fun count(
        params: OrganizationCountParams = OrganizationCountParams.none()
    ): CompletableFuture<String> = count(params, RequestOptions.none())

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(OrganizationCountParams.none(), requestOptions)

    /**
     * Service operation to get a single Organization by its unique ID passed as a path parameter.
     */
    fun get(id: String): CompletableFuture<OrganizationFull> = get(id, OrganizationGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: OrganizationGetParams = OrganizationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationFull> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: OrganizationGetParams = OrganizationGetParams.none(),
    ): CompletableFuture<OrganizationFull> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: OrganizationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationFull>

    /** @see get */
    fun get(params: OrganizationGetParams): CompletableFuture<OrganizationFull> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<OrganizationFull> =
        get(id, OrganizationGetParams.none(), requestOptions)

    /** Retrieves all distinct organization categories. */
    fun getOrganizationCategories(): CompletableFuture<List<String>> =
        getOrganizationCategories(OrganizationGetOrganizationCategoriesParams.none())

    /** @see getOrganizationCategories */
    fun getOrganizationCategories(
        params: OrganizationGetOrganizationCategoriesParams =
            OrganizationGetOrganizationCategoriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see getOrganizationCategories */
    fun getOrganizationCategories(
        params: OrganizationGetOrganizationCategoriesParams =
            OrganizationGetOrganizationCategoriesParams.none()
    ): CompletableFuture<List<String>> = getOrganizationCategories(params, RequestOptions.none())

    /** @see getOrganizationCategories */
    fun getOrganizationCategories(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        getOrganizationCategories(
            OrganizationGetOrganizationCategoriesParams.none(),
            requestOptions,
        )

    /** Retrieves all distinct organization types. */
    fun getOrganizationTypes(): CompletableFuture<List<String>> =
        getOrganizationTypes(OrganizationGetOrganizationTypesParams.none())

    /** @see getOrganizationTypes */
    fun getOrganizationTypes(
        params: OrganizationGetOrganizationTypesParams =
            OrganizationGetOrganizationTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see getOrganizationTypes */
    fun getOrganizationTypes(
        params: OrganizationGetOrganizationTypesParams =
            OrganizationGetOrganizationTypesParams.none()
    ): CompletableFuture<List<String>> = getOrganizationTypes(params, RequestOptions.none())

    /** @see getOrganizationTypes */
    fun getOrganizationTypes(requestOptions: RequestOptions): CompletableFuture<List<String>> =
        getOrganizationTypes(OrganizationGetOrganizationTypesParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): CompletableFuture<OrganizationQueryhelpResponse> =
        queryhelp(OrganizationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(
        params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none()
    ): CompletableFuture<OrganizationQueryhelpResponse> = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(
        requestOptions: RequestOptions
    ): CompletableFuture<OrganizationQueryhelpResponse> =
        queryhelp(OrganizationQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: OrganizationTupleParams): CompletableFuture<List<OrganizationFull>> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: OrganizationTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationFull>>

    /**
     * A view of [OrganizationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/organization`, but is otherwise the same as
         * [OrganizationServiceAsync.create].
         */
        fun create(params: OrganizationCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /udl/organization/{id}`, but is otherwise the same
         * as [OrganizationServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: OrganizationUpdateParams,
        ): CompletableFuture<HttpResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(params: OrganizationUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /udl/organization`, but is otherwise the same as
         * [OrganizationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(OrganizationListParams.none())

        /** @see list */
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>>

        /** @see list */
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /udl/organization/{id}`, but is otherwise the
         * same as [OrganizationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, OrganizationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OrganizationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, OrganizationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/organization/count`, but is otherwise the same
         * as [OrganizationServiceAsync.count].
         */
        fun count(): CompletableFuture<HttpResponseFor<String>> =
            count(OrganizationCountParams.none())

        /** @see count */
        fun count(
            params: OrganizationCountParams = OrganizationCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(
            params: OrganizationCountParams = OrganizationCountParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = count(params, RequestOptions.none())

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(OrganizationCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/organization/{id}`, but is otherwise the same
         * as [OrganizationServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<OrganizationFull>> =
            get(id, OrganizationGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: OrganizationGetParams = OrganizationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationFull>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: OrganizationGetParams = OrganizationGetParams.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationFull>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: OrganizationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationFull>>

        /** @see get */
        fun get(
            params: OrganizationGetParams
        ): CompletableFuture<HttpResponseFor<OrganizationFull>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationFull>> =
            get(id, OrganizationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/organization/getOrganizationCategories`, but is
         * otherwise the same as [OrganizationServiceAsync.getOrganizationCategories].
         */
        fun getOrganizationCategories(): CompletableFuture<HttpResponseFor<List<String>>> =
            getOrganizationCategories(OrganizationGetOrganizationCategoriesParams.none())

        /** @see getOrganizationCategories */
        fun getOrganizationCategories(
            params: OrganizationGetOrganizationCategoriesParams =
                OrganizationGetOrganizationCategoriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see getOrganizationCategories */
        fun getOrganizationCategories(
            params: OrganizationGetOrganizationCategoriesParams =
                OrganizationGetOrganizationCategoriesParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getOrganizationCategories(params, RequestOptions.none())

        /** @see getOrganizationCategories */
        fun getOrganizationCategories(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getOrganizationCategories(
                OrganizationGetOrganizationCategoriesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /udl/organization/getOrganizationTypes`, but is
         * otherwise the same as [OrganizationServiceAsync.getOrganizationTypes].
         */
        fun getOrganizationTypes(): CompletableFuture<HttpResponseFor<List<String>>> =
            getOrganizationTypes(OrganizationGetOrganizationTypesParams.none())

        /** @see getOrganizationTypes */
        fun getOrganizationTypes(
            params: OrganizationGetOrganizationTypesParams =
                OrganizationGetOrganizationTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see getOrganizationTypes */
        fun getOrganizationTypes(
            params: OrganizationGetOrganizationTypesParams =
                OrganizationGetOrganizationTypesParams.none()
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getOrganizationTypes(params, RequestOptions.none())

        /** @see getOrganizationTypes */
        fun getOrganizationTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            getOrganizationTypes(OrganizationGetOrganizationTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/organization/queryhelp`, but is otherwise the
         * same as [OrganizationServiceAsync.queryhelp].
         */
        fun queryhelp(): CompletableFuture<HttpResponseFor<OrganizationQueryhelpResponse>> =
            queryhelp(OrganizationQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(
            params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(
            params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationQueryhelpResponse>> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        fun queryhelp(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationQueryhelpResponse>> =
            queryhelp(OrganizationQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/organization/tuple`, but is otherwise the same
         * as [OrganizationServiceAsync.tuple].
         */
        fun tuple(
            params: OrganizationTupleParams
        ): CompletableFuture<HttpResponseFor<List<OrganizationFull>>> =
            tuple(params, RequestOptions.none())

        /** @see tuple */
        fun tuple(
            params: OrganizationTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationFull>>>
    }
}
