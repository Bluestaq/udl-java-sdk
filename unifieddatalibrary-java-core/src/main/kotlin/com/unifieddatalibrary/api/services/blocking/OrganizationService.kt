// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.unifieddatalibrary.api.models.organization.OrganizationListPage
import com.unifieddatalibrary.api.models.organization.OrganizationListParams
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpParams
import com.unifieddatalibrary.api.models.organization.OrganizationQueryhelpResponse
import com.unifieddatalibrary.api.models.organization.OrganizationTupleParams
import com.unifieddatalibrary.api.models.organization.OrganizationUpdateParams
import com.unifieddatalibrary.api.services.blocking.OrganizationService
import java.util.function.Consumer

interface OrganizationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationService

    /** Service operation to take a single Organization as a POST body and ingest into the database. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: OrganizationCreateParams) =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OrganizationCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to update an Organization. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: OrganizationUpdateParams) =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: OrganizationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()) =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: OrganizationUpdateParams) =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): OrganizationListPage = list(OrganizationListParams.none())

    /** @see list */
    fun list(params: OrganizationListParams = OrganizationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OrganizationListPage

    /** @see list */
    fun list(params: OrganizationListParams = OrganizationListParams.none()): OrganizationListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OrganizationListPage =
        list(
          OrganizationListParams.none(), requestOptions
        )

    /** Service operation to delete an Organization specified by the passed ID path parameter. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String) =
        delete(
          id, OrganizationDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: OrganizationDeleteParams = OrganizationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()) =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: OrganizationDeleteParams = OrganizationDeleteParams.none()) =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: OrganizationDeleteParams) =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(
          id,
          OrganizationDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): String = count(OrganizationCountParams.none())

    /** @see count */
    fun count(params: OrganizationCountParams = OrganizationCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): String

    /** @see count */
    fun count(params: OrganizationCountParams = OrganizationCountParams.none()): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): String =
        count(
          OrganizationCountParams.none(), requestOptions
        )

    /** Service operation to get a single Organization by its unique ID passed as a path parameter. */
    fun get(id: String): OrganizationFull =
        get(
          id, OrganizationGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: OrganizationGetParams = OrganizationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OrganizationFull =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: OrganizationGetParams = OrganizationGetParams.none()): OrganizationFull =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: OrganizationGetParams, requestOptions: RequestOptions = RequestOptions.none()): OrganizationFull

    /** @see get */
    fun get(params: OrganizationGetParams): OrganizationFull =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): OrganizationFull =
        get(
          id,
          OrganizationGetParams.none(),
          requestOptions,
        )

    /** Retrieves all distinct organization categories. */
    fun getOrganizationCategories(): List<String> = getOrganizationCategories(OrganizationGetOrganizationCategoriesParams.none())

    /** @see getOrganizationCategories */
    fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams = OrganizationGetOrganizationCategoriesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<String>

    /** @see getOrganizationCategories */
    fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams = OrganizationGetOrganizationCategoriesParams.none()): List<String> =
        getOrganizationCategories(
          params, RequestOptions.none()
        )

    /** @see getOrganizationCategories */
    fun getOrganizationCategories(requestOptions: RequestOptions): List<String> =
        getOrganizationCategories(
          OrganizationGetOrganizationCategoriesParams.none(), requestOptions
        )

    /** Retrieves all distinct organization types. */
    fun getOrganizationTypes(): List<String> = getOrganizationTypes(OrganizationGetOrganizationTypesParams.none())

    /** @see getOrganizationTypes */
    fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams = OrganizationGetOrganizationTypesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): List<String>

    /** @see getOrganizationTypes */
    fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams = OrganizationGetOrganizationTypesParams.none()): List<String> =
        getOrganizationTypes(
          params, RequestOptions.none()
        )

    /** @see getOrganizationTypes */
    fun getOrganizationTypes(requestOptions: RequestOptions): List<String> =
        getOrganizationTypes(
          OrganizationGetOrganizationTypesParams.none(), requestOptions
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): OrganizationQueryhelpResponse = queryhelp(OrganizationQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OrganizationQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none()): OrganizationQueryhelpResponse =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): OrganizationQueryhelpResponse =
        queryhelp(
          OrganizationQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: OrganizationTupleParams): List<OrganizationFull> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: OrganizationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<OrganizationFull>

    /** A view of [OrganizationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationService.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/organization`, but is otherwise the same as [OrganizationService.create]. */
        @MustBeClosed
        fun create(params: OrganizationCreateParams): HttpResponse =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OrganizationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `put /udl/organization/{id}`, but is otherwise the same as [OrganizationService.update]. */
        @MustBeClosed
        fun update(pathId: String, params: OrganizationUpdateParams): HttpResponse =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(pathId: String, params: OrganizationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OrganizationUpdateParams): HttpResponse =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        @MustBeClosed
        fun update(params: OrganizationUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** Returns a raw HTTP response for `get /udl/organization`, but is otherwise the same as [OrganizationService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OrganizationListPage> = list(OrganizationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OrganizationListParams = OrganizationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OrganizationListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OrganizationListParams = OrganizationListParams.none()): HttpResponseFor<OrganizationListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrganizationListPage> =
            list(
              OrganizationListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/organization/{id}`, but is otherwise the same as [OrganizationService.delete]. */
        @MustBeClosed
        fun delete(id: String): HttpResponse =
            delete(
              id, OrganizationDeleteParams.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OrganizationDeleteParams = OrganizationDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: OrganizationDeleteParams = OrganizationDeleteParams.none()): HttpResponse =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: OrganizationDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OrganizationDeleteParams): HttpResponse =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(
              id,
              OrganizationDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/organization/count`, but is otherwise the same as [OrganizationService.count]. */
        @MustBeClosed
        fun count(): HttpResponseFor<String> = count(OrganizationCountParams.none())

        /** @see count */
        @MustBeClosed
        fun count(params: OrganizationCountParams = OrganizationCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** @see count */
        @MustBeClosed
        fun count(params: OrganizationCountParams = OrganizationCountParams.none()): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(requestOptions: RequestOptions): HttpResponseFor<String> =
            count(
              OrganizationCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/organization/{id}`, but is otherwise the same as [OrganizationService.get]. */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<OrganizationFull> =
            get(
              id, OrganizationGetParams.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OrganizationGetParams = OrganizationGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OrganizationFull> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, params: OrganizationGetParams = OrganizationGetParams.none()): HttpResponseFor<OrganizationFull> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        @MustBeClosed
        fun get(params: OrganizationGetParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OrganizationFull>

        /** @see get */
        @MustBeClosed
        fun get(params: OrganizationGetParams): HttpResponseFor<OrganizationFull> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<OrganizationFull> =
            get(
              id,
              OrganizationGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/organization/getOrganizationCategories`, but is otherwise the same as [OrganizationService.getOrganizationCategories]. */
        @MustBeClosed
        fun getOrganizationCategories(): HttpResponseFor<List<String>> = getOrganizationCategories(OrganizationGetOrganizationCategoriesParams.none())

        /** @see getOrganizationCategories */
        @MustBeClosed
        fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams = OrganizationGetOrganizationCategoriesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<String>>

        /** @see getOrganizationCategories */
        @MustBeClosed
        fun getOrganizationCategories(params: OrganizationGetOrganizationCategoriesParams = OrganizationGetOrganizationCategoriesParams.none()): HttpResponseFor<List<String>> =
            getOrganizationCategories(
              params, RequestOptions.none()
            )

        /** @see getOrganizationCategories */
        @MustBeClosed
        fun getOrganizationCategories(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            getOrganizationCategories(
              OrganizationGetOrganizationCategoriesParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/organization/getOrganizationTypes`, but is otherwise the same as [OrganizationService.getOrganizationTypes]. */
        @MustBeClosed
        fun getOrganizationTypes(): HttpResponseFor<List<String>> = getOrganizationTypes(OrganizationGetOrganizationTypesParams.none())

        /** @see getOrganizationTypes */
        @MustBeClosed
        fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams = OrganizationGetOrganizationTypesParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<String>>

        /** @see getOrganizationTypes */
        @MustBeClosed
        fun getOrganizationTypes(params: OrganizationGetOrganizationTypesParams = OrganizationGetOrganizationTypesParams.none()): HttpResponseFor<List<String>> =
            getOrganizationTypes(
              params, RequestOptions.none()
            )

        /** @see getOrganizationTypes */
        @MustBeClosed
        fun getOrganizationTypes(requestOptions: RequestOptions): HttpResponseFor<List<String>> =
            getOrganizationTypes(
              OrganizationGetOrganizationTypesParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/organization/queryhelp`, but is otherwise the same as [OrganizationService.queryhelp]. */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<OrganizationQueryhelpResponse> = queryhelp(OrganizationQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OrganizationQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(params: OrganizationQueryhelpParams = OrganizationQueryhelpParams.none()): HttpResponseFor<OrganizationQueryhelpResponse> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(requestOptions: RequestOptions): HttpResponseFor<OrganizationQueryhelpResponse> =
            queryhelp(
              OrganizationQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/organization/tuple`, but is otherwise the same as [OrganizationService.tuple]. */
        @MustBeClosed
        fun tuple(params: OrganizationTupleParams): HttpResponseFor<List<OrganizationFull>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: OrganizationTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<OrganizationFull>>
    }
}
