// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.AiService
import com.unifieddatalibrary.api.services.blocking.AirEventService
import com.unifieddatalibrary.api.services.blocking.AirOperationService
import com.unifieddatalibrary.api.services.blocking.AirTransportMissionService
import com.unifieddatalibrary.api.services.blocking.AircraftService
import com.unifieddatalibrary.api.services.blocking.AircraftSortyService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusService
import com.unifieddatalibrary.api.services.blocking.AirfieldService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotService
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusService
import com.unifieddatalibrary.api.services.blocking.AirloadPlanService
import com.unifieddatalibrary.api.services.blocking.AirspaceControlOrderService
import com.unifieddatalibrary.api.services.blocking.AisObjectService
import com.unifieddatalibrary.api.services.blocking.AnalyticImageryService
import com.unifieddatalibrary.api.services.blocking.AntennaService
import com.unifieddatalibrary.api.services.blocking.AttitudeDataService
import com.unifieddatalibrary.api.services.blocking.AttitudeSetService
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementService
import com.unifieddatalibrary.api.services.blocking.BatteryService
import com.unifieddatalibrary.api.services.blocking.BatterydetailService
import com.unifieddatalibrary.api.services.blocking.BeamContourService
import com.unifieddatalibrary.api.services.blocking.BeamService
import com.unifieddatalibrary.api.services.blocking.BusService
import com.unifieddatalibrary.api.services.blocking.ChannelService
import com.unifieddatalibrary.api.services.blocking.CloselyspacedobjectService
import com.unifieddatalibrary.api.services.blocking.CollectRequestService
import com.unifieddatalibrary.api.services.blocking.CollectResponseService
import com.unifieddatalibrary.api.services.blocking.CommService
import com.unifieddatalibrary.api.services.blocking.ConjunctionService
import com.unifieddatalibrary.api.services.blocking.CotService
import com.unifieddatalibrary.api.services.blocking.CountryService
import com.unifieddatalibrary.api.services.blocking.CrewService
import com.unifieddatalibrary.api.services.blocking.DeconflictsetService
import com.unifieddatalibrary.api.services.blocking.DiffOfArrivalService
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.DriftHistoryService
import com.unifieddatalibrary.api.services.blocking.DropzoneService
import com.unifieddatalibrary.api.services.blocking.EcpedrService
import com.unifieddatalibrary.api.services.blocking.EffectRequestService
import com.unifieddatalibrary.api.services.blocking.EffectResponseService
import com.unifieddatalibrary.api.services.blocking.ElsetService
import com.unifieddatalibrary.api.services.blocking.EmireportService
import com.unifieddatalibrary.api.services.blocking.EmitterGeolocationService
import com.unifieddatalibrary.api.services.blocking.EngineDetailService
import com.unifieddatalibrary.api.services.blocking.EngineService
import com.unifieddatalibrary.api.services.blocking.EntityService
import com.unifieddatalibrary.api.services.blocking.EopService
import com.unifieddatalibrary.api.services.blocking.EphemerisService
import com.unifieddatalibrary.api.services.blocking.EphemerisSetService
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkService
import com.unifieddatalibrary.api.services.blocking.EquipmentService
import com.unifieddatalibrary.api.services.blocking.EvacService
import com.unifieddatalibrary.api.services.blocking.EventEvolutionService
import com.unifieddatalibrary.api.services.blocking.FeatureAssessmentService
import com.unifieddatalibrary.api.services.blocking.FlightplanService
import com.unifieddatalibrary.api.services.blocking.GeoStatusService
import com.unifieddatalibrary.api.services.blocking.GlobalAtmosphericModelService
import com.unifieddatalibrary.api.services.blocking.GnssObservationService
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetService
import com.unifieddatalibrary.api.services.blocking.GnssRawIfService
import com.unifieddatalibrary.api.services.blocking.GroundImageryService
import com.unifieddatalibrary.api.services.blocking.H3GeoHexCellService
import com.unifieddatalibrary.api.services.blocking.H3GeoService
import com.unifieddatalibrary.api.services.blocking.HazardService
import com.unifieddatalibrary.api.services.blocking.IonoObservationService
import com.unifieddatalibrary.api.services.blocking.IrService
import com.unifieddatalibrary.api.services.blocking.IsrCollectionService
import com.unifieddatalibrary.api.services.blocking.ItemService
import com.unifieddatalibrary.api.services.blocking.ItemTrackingService
import com.unifieddatalibrary.api.services.blocking.LaserdeconflictrequestService
import com.unifieddatalibrary.api.services.blocking.LaseremitterService
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionService
import com.unifieddatalibrary.api.services.blocking.LaunchEventService
import com.unifieddatalibrary.api.services.blocking.LaunchSiteDetailService
import com.unifieddatalibrary.api.services.blocking.LaunchSiteService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleDetailService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleService
import com.unifieddatalibrary.api.services.blocking.LinkStatusService
import com.unifieddatalibrary.api.services.blocking.LinkstatusService
import com.unifieddatalibrary.api.services.blocking.LocationService
import com.unifieddatalibrary.api.services.blocking.LogisticsSupportService
import com.unifieddatalibrary.api.services.blocking.ManeuverService
import com.unifieddatalibrary.api.services.blocking.ManifoldService
import com.unifieddatalibrary.api.services.blocking.ManifoldelsetService
import com.unifieddatalibrary.api.services.blocking.MissileTrackService
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentService
import com.unifieddatalibrary.api.services.blocking.MtiService
import com.unifieddatalibrary.api.services.blocking.NavigationService
import com.unifieddatalibrary.api.services.blocking.NavigationalObstructionService
import com.unifieddatalibrary.api.services.blocking.NotificationService
import com.unifieddatalibrary.api.services.blocking.ObjectOfInterestService
import com.unifieddatalibrary.api.services.blocking.ObservationService
import com.unifieddatalibrary.api.services.blocking.OnboardnavigationService
import com.unifieddatalibrary.api.services.blocking.OnorbitService
import com.unifieddatalibrary.api.services.blocking.OnorbitantennaService
import com.unifieddatalibrary.api.services.blocking.OnorbitassessmentService
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryService
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailService
import com.unifieddatalibrary.api.services.blocking.OnorbiteventService
import com.unifieddatalibrary.api.services.blocking.OnorbitlistService
import com.unifieddatalibrary.api.services.blocking.OnorbitsolararrayService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusService
import com.unifieddatalibrary.api.services.blocking.OperatingunitService
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkService
import com.unifieddatalibrary.api.services.blocking.OrbitdeterminationService
import com.unifieddatalibrary.api.services.blocking.OrbittrackService
import com.unifieddatalibrary.api.services.blocking.OrganizationService
import com.unifieddatalibrary.api.services.blocking.OrganizationdetailService
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryService
import com.unifieddatalibrary.api.services.blocking.PoiService
import com.unifieddatalibrary.api.services.blocking.PortService
import com.unifieddatalibrary.api.services.blocking.ReportAndActivityService
import com.unifieddatalibrary.api.services.blocking.RfBandService
import com.unifieddatalibrary.api.services.blocking.RfBandTypeService
import com.unifieddatalibrary.api.services.blocking.RfEmitterService
import com.unifieddatalibrary.api.services.blocking.RouteStatService
import com.unifieddatalibrary.api.services.blocking.SarObservationService
import com.unifieddatalibrary.api.services.blocking.ScService
import com.unifieddatalibrary.api.services.blocking.ScientificService
import com.unifieddatalibrary.api.services.blocking.SecureMessagingService
import com.unifieddatalibrary.api.services.blocking.SensorMaintenanceService
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeService
import com.unifieddatalibrary.api.services.blocking.SensorPlanService
import com.unifieddatalibrary.api.services.blocking.SensorService
import com.unifieddatalibrary.api.services.blocking.SensorStatingService
import com.unifieddatalibrary.api.services.blocking.SensorTypeService
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailService
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningService
import com.unifieddatalibrary.api.services.blocking.SeraDataNavigationService
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataRadarPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataSigintPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailService
import com.unifieddatalibrary.api.services.blocking.SgiService
import com.unifieddatalibrary.api.services.blocking.SigactService
import com.unifieddatalibrary.api.services.blocking.SiteRemarkService
import com.unifieddatalibrary.api.services.blocking.SiteService
import com.unifieddatalibrary.api.services.blocking.SiteStatusService
import com.unifieddatalibrary.api.services.blocking.SkyImageryService
import com.unifieddatalibrary.api.services.blocking.SoiObservationSetService
import com.unifieddatalibrary.api.services.blocking.SolarArrayDetailService
import com.unifieddatalibrary.api.services.blocking.SolarArrayService
import com.unifieddatalibrary.api.services.blocking.SortiePprService
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationService
import com.unifieddatalibrary.api.services.blocking.StageService
import com.unifieddatalibrary.api.services.blocking.StarCatalogService
import com.unifieddatalibrary.api.services.blocking.StateVectorService
import com.unifieddatalibrary.api.services.blocking.StatusService
import com.unifieddatalibrary.api.services.blocking.SubstatusService
import com.unifieddatalibrary.api.services.blocking.SupportingDataService
import com.unifieddatalibrary.api.services.blocking.SurfaceObstructionService
import com.unifieddatalibrary.api.services.blocking.SurfaceService
import com.unifieddatalibrary.api.services.blocking.SwirService
import com.unifieddatalibrary.api.services.blocking.TaiUtcService
import com.unifieddatalibrary.api.services.blocking.TdoaFdoaService
import com.unifieddatalibrary.api.services.blocking.TrackDetailService
import com.unifieddatalibrary.api.services.blocking.TrackRouteService
import com.unifieddatalibrary.api.services.blocking.TrackService
import com.unifieddatalibrary.api.services.blocking.TransponderService
import com.unifieddatalibrary.api.services.blocking.UserService
import com.unifieddatalibrary.api.services.blocking.VesselService
import com.unifieddatalibrary.api.services.blocking.VideoService
import com.unifieddatalibrary.api.services.blocking.WeatherDataService
import com.unifieddatalibrary.api.services.blocking.WeatherReportService
import java.util.function.Consumer

/**
 * A client for interacting with the Unifieddatalibrary REST API synchronously. You can also switch
 * to asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface UnifieddatalibraryClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): UnifieddatalibraryClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClient

    fun airEvents(): AirEventService

    fun airOperations(): AirOperationService

    fun airTransportMissions(): AirTransportMissionService

    fun aircraft(): AircraftService

    fun aircraftSorties(): AircraftSortyService

    fun aircraftStatusRemarks(): AircraftStatusRemarkService

    fun aircraftStatuses(): AircraftStatusService

    fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService

    fun airfieldSlots(): AirfieldSlotService

    fun airfieldStatus(): AirfieldStatusService

    fun airfields(): AirfieldService

    fun airloadPlans(): AirloadPlanService

    fun airspaceControlOrders(): AirspaceControlOrderService

    fun ais(): AiService

    fun aisObjects(): AisObjectService

    fun analyticImagery(): AnalyticImageryService

    fun antennas(): AntennaService

    fun attitudeData(): AttitudeDataService

    fun attitudeSets(): AttitudeSetService

    fun aviationRiskManagement(): AviationRiskManagementService

    fun batteries(): BatteryService

    fun batterydetails(): BatterydetailService

    fun beam(): BeamService

    fun beamContours(): BeamContourService

    fun buses(): BusService

    fun channels(): ChannelService

    fun closelyspacedobjects(): CloselyspacedobjectService

    fun collectRequests(): CollectRequestService

    fun collectResponses(): CollectResponseService

    fun comm(): CommService

    fun conjunctions(): ConjunctionService

    fun cots(): CotService

    fun countries(): CountryService

    fun crew(): CrewService

    fun deconflictset(): DeconflictsetService

    fun diffOfArrival(): DiffOfArrivalService

    fun diplomaticClearance(): DiplomaticClearanceService

    fun driftHistory(): DriftHistoryService

    fun dropzone(): DropzoneService

    fun ecpedr(): EcpedrService

    fun effectRequests(): EffectRequestService

    fun effectResponses(): EffectResponseService

    fun elsets(): ElsetService

    fun emireport(): EmireportService

    fun emitterGeolocation(): EmitterGeolocationService

    fun engineDetails(): EngineDetailService

    fun engines(): EngineService

    fun entities(): EntityService

    fun eop(): EopService

    fun ephemeris(): EphemerisService

    fun ephemerisSets(): EphemerisSetService

    fun equipment(): EquipmentService

    fun equipmentRemarks(): EquipmentRemarkService

    fun evac(): EvacService

    fun eventEvolution(): EventEvolutionService

    fun featureAssessment(): FeatureAssessmentService

    fun flightplan(): FlightplanService

    fun geoStatus(): GeoStatusService

    fun globalAtmosphericModel(): GlobalAtmosphericModelService

    fun gnssObservations(): GnssObservationService

    fun gnssObservationset(): GnssObservationsetService

    fun gnssRawIf(): GnssRawIfService

    fun groundImagery(): GroundImageryService

    fun h3Geo(): H3GeoService

    fun h3GeoHexCell(): H3GeoHexCellService

    fun hazard(): HazardService

    fun ionoObservations(): IonoObservationService

    fun ir(): IrService

    fun isrCollections(): IsrCollectionService

    fun item(): ItemService

    fun itemTrackings(): ItemTrackingService

    fun laserdeconflictrequest(): LaserdeconflictrequestService

    fun laseremitter(): LaseremitterService

    fun launchDetection(): LaunchDetectionService

    fun launchEvent(): LaunchEventService

    fun launchSite(): LaunchSiteService

    fun launchSiteDetails(): LaunchSiteDetailService

    fun launchVehicle(): LaunchVehicleService

    fun launchVehicleDetails(): LaunchVehicleDetailService

    fun linkStatus(): LinkStatusService

    fun linkstatus(): LinkstatusService

    fun location(): LocationService

    fun logisticsSupport(): LogisticsSupportService

    fun maneuvers(): ManeuverService

    fun manifold(): ManifoldService

    fun manifoldelset(): ManifoldelsetService

    fun missileTracks(): MissileTrackService

    fun missionAssignment(): MissionAssignmentService

    fun mti(): MtiService

    fun navigation(): NavigationService

    fun navigationalObstruction(): NavigationalObstructionService

    fun notification(): NotificationService

    fun objectOfInterest(): ObjectOfInterestService

    fun observations(): ObservationService

    fun onboardnavigation(): OnboardnavigationService

    fun onorbit(): OnorbitService

    fun onorbitantenna(): OnorbitantennaService

    fun onorbitbattery(): OnorbitbatteryService

    fun onorbitdetails(): OnorbitdetailService

    fun onorbitevent(): OnorbiteventService

    fun onorbitlist(): OnorbitlistService

    fun onorbitsolararray(): OnorbitsolararrayService

    fun onorbitthruster(): OnorbitthrusterService

    fun onorbitthrusterstatus(): OnorbitthrusterstatusService

    fun onorbitassessment(): OnorbitassessmentService

    fun operatingunit(): OperatingunitService

    fun operatingunitremark(): OperatingunitremarkService

    fun orbitdetermination(): OrbitdeterminationService

    fun orbittrack(): OrbittrackService

    fun organization(): OrganizationService

    fun organizationdetails(): OrganizationdetailService

    fun personnelrecovery(): PersonnelrecoveryService

    fun poi(): PoiService

    fun port(): PortService

    fun reportAndActivities(): ReportAndActivityService

    fun rfBand(): RfBandService

    fun rfBandType(): RfBandTypeService

    fun rfEmitter(): RfEmitterService

    fun routeStats(): RouteStatService

    fun sarObservation(): SarObservationService

    fun scientific(): ScientificService

    fun scs(): ScService

    fun secureMessaging(): SecureMessagingService

    fun sensor(): SensorService

    fun sensorStating(): SensorStatingService

    fun sensorMaintenance(): SensorMaintenanceService

    fun sensorObservationType(): SensorObservationTypeService

    fun sensorPlan(): SensorPlanService

    fun sensorType(): SensorTypeService

    fun seraDataCommDetails(): SeraDataCommDetailService

    fun seraDataEarlyWarning(): SeraDataEarlyWarningService

    fun seraDataNavigation(): SeraDataNavigationService

    fun seradataOpticalPayload(): SeradataOpticalPayloadService

    fun seradataRadarPayload(): SeradataRadarPayloadService

    fun seradataSigintPayload(): SeradataSigintPayloadService

    fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService

    fun sgi(): SgiService

    fun sigact(): SigactService

    fun site(): SiteService

    fun siteRemark(): SiteRemarkService

    fun siteStatus(): SiteStatusService

    fun skyImagery(): SkyImageryService

    fun soiObservationSet(): SoiObservationSetService

    fun solarArray(): SolarArrayService

    fun solarArrayDetails(): SolarArrayDetailService

    fun sortiePpr(): SortiePprService

    fun spaceEnvObservation(): SpaceEnvObservationService

    fun stage(): StageService

    fun starCatalog(): StarCatalogService

    fun stateVector(): StateVectorService

    fun status(): StatusService

    fun substatus(): SubstatusService

    fun supportingData(): SupportingDataService

    fun surface(): SurfaceService

    fun surfaceObstruction(): SurfaceObstructionService

    fun swir(): SwirService

    fun taiUtc(): TaiUtcService

    fun tdoaFdoa(): TdoaFdoaService

    fun track(): TrackService

    fun trackDetails(): TrackDetailService

    fun trackRoute(): TrackRouteService

    fun transponder(): TransponderService

    fun user(): UserService

    fun vessel(): VesselService

    fun video(): VideoService

    fun weatherData(): WeatherDataService

    fun weatherReport(): WeatherReportService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [UnifieddatalibraryClient] that provides access to raw HTTP responses for each
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
        ): UnifieddatalibraryClient.WithRawResponse

        fun airEvents(): AirEventService.WithRawResponse

        fun airOperations(): AirOperationService.WithRawResponse

        fun airTransportMissions(): AirTransportMissionService.WithRawResponse

        fun aircraft(): AircraftService.WithRawResponse

        fun aircraftSorties(): AircraftSortyService.WithRawResponse

        fun aircraftStatusRemarks(): AircraftStatusRemarkService.WithRawResponse

        fun aircraftStatuses(): AircraftStatusService.WithRawResponse

        fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService.WithRawResponse

        fun airfieldSlots(): AirfieldSlotService.WithRawResponse

        fun airfieldStatus(): AirfieldStatusService.WithRawResponse

        fun airfields(): AirfieldService.WithRawResponse

        fun airloadPlans(): AirloadPlanService.WithRawResponse

        fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse

        fun ais(): AiService.WithRawResponse

        fun aisObjects(): AisObjectService.WithRawResponse

        fun analyticImagery(): AnalyticImageryService.WithRawResponse

        fun antennas(): AntennaService.WithRawResponse

        fun attitudeData(): AttitudeDataService.WithRawResponse

        fun attitudeSets(): AttitudeSetService.WithRawResponse

        fun aviationRiskManagement(): AviationRiskManagementService.WithRawResponse

        fun batteries(): BatteryService.WithRawResponse

        fun batterydetails(): BatterydetailService.WithRawResponse

        fun beam(): BeamService.WithRawResponse

        fun beamContours(): BeamContourService.WithRawResponse

        fun buses(): BusService.WithRawResponse

        fun channels(): ChannelService.WithRawResponse

        fun closelyspacedobjects(): CloselyspacedobjectService.WithRawResponse

        fun collectRequests(): CollectRequestService.WithRawResponse

        fun collectResponses(): CollectResponseService.WithRawResponse

        fun comm(): CommService.WithRawResponse

        fun conjunctions(): ConjunctionService.WithRawResponse

        fun cots(): CotService.WithRawResponse

        fun countries(): CountryService.WithRawResponse

        fun crew(): CrewService.WithRawResponse

        fun deconflictset(): DeconflictsetService.WithRawResponse

        fun diffOfArrival(): DiffOfArrivalService.WithRawResponse

        fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse

        fun driftHistory(): DriftHistoryService.WithRawResponse

        fun dropzone(): DropzoneService.WithRawResponse

        fun ecpedr(): EcpedrService.WithRawResponse

        fun effectRequests(): EffectRequestService.WithRawResponse

        fun effectResponses(): EffectResponseService.WithRawResponse

        fun elsets(): ElsetService.WithRawResponse

        fun emireport(): EmireportService.WithRawResponse

        fun emitterGeolocation(): EmitterGeolocationService.WithRawResponse

        fun engineDetails(): EngineDetailService.WithRawResponse

        fun engines(): EngineService.WithRawResponse

        fun entities(): EntityService.WithRawResponse

        fun eop(): EopService.WithRawResponse

        fun ephemeris(): EphemerisService.WithRawResponse

        fun ephemerisSets(): EphemerisSetService.WithRawResponse

        fun equipment(): EquipmentService.WithRawResponse

        fun equipmentRemarks(): EquipmentRemarkService.WithRawResponse

        fun evac(): EvacService.WithRawResponse

        fun eventEvolution(): EventEvolutionService.WithRawResponse

        fun featureAssessment(): FeatureAssessmentService.WithRawResponse

        fun flightplan(): FlightplanService.WithRawResponse

        fun geoStatus(): GeoStatusService.WithRawResponse

        fun globalAtmosphericModel(): GlobalAtmosphericModelService.WithRawResponse

        fun gnssObservations(): GnssObservationService.WithRawResponse

        fun gnssObservationset(): GnssObservationsetService.WithRawResponse

        fun gnssRawIf(): GnssRawIfService.WithRawResponse

        fun groundImagery(): GroundImageryService.WithRawResponse

        fun h3Geo(): H3GeoService.WithRawResponse

        fun h3GeoHexCell(): H3GeoHexCellService.WithRawResponse

        fun hazard(): HazardService.WithRawResponse

        fun ionoObservations(): IonoObservationService.WithRawResponse

        fun ir(): IrService.WithRawResponse

        fun isrCollections(): IsrCollectionService.WithRawResponse

        fun item(): ItemService.WithRawResponse

        fun itemTrackings(): ItemTrackingService.WithRawResponse

        fun laserdeconflictrequest(): LaserdeconflictrequestService.WithRawResponse

        fun laseremitter(): LaseremitterService.WithRawResponse

        fun launchDetection(): LaunchDetectionService.WithRawResponse

        fun launchEvent(): LaunchEventService.WithRawResponse

        fun launchSite(): LaunchSiteService.WithRawResponse

        fun launchSiteDetails(): LaunchSiteDetailService.WithRawResponse

        fun launchVehicle(): LaunchVehicleService.WithRawResponse

        fun launchVehicleDetails(): LaunchVehicleDetailService.WithRawResponse

        fun linkStatus(): LinkStatusService.WithRawResponse

        fun linkstatus(): LinkstatusService.WithRawResponse

        fun location(): LocationService.WithRawResponse

        fun logisticsSupport(): LogisticsSupportService.WithRawResponse

        fun maneuvers(): ManeuverService.WithRawResponse

        fun manifold(): ManifoldService.WithRawResponse

        fun manifoldelset(): ManifoldelsetService.WithRawResponse

        fun missileTracks(): MissileTrackService.WithRawResponse

        fun missionAssignment(): MissionAssignmentService.WithRawResponse

        fun mti(): MtiService.WithRawResponse

        fun navigation(): NavigationService.WithRawResponse

        fun navigationalObstruction(): NavigationalObstructionService.WithRawResponse

        fun notification(): NotificationService.WithRawResponse

        fun objectOfInterest(): ObjectOfInterestService.WithRawResponse

        fun observations(): ObservationService.WithRawResponse

        fun onboardnavigation(): OnboardnavigationService.WithRawResponse

        fun onorbit(): OnorbitService.WithRawResponse

        fun onorbitantenna(): OnorbitantennaService.WithRawResponse

        fun onorbitbattery(): OnorbitbatteryService.WithRawResponse

        fun onorbitdetails(): OnorbitdetailService.WithRawResponse

        fun onorbitevent(): OnorbiteventService.WithRawResponse

        fun onorbitlist(): OnorbitlistService.WithRawResponse

        fun onorbitsolararray(): OnorbitsolararrayService.WithRawResponse

        fun onorbitthruster(): OnorbitthrusterService.WithRawResponse

        fun onorbitthrusterstatus(): OnorbitthrusterstatusService.WithRawResponse

        fun onorbitassessment(): OnorbitassessmentService.WithRawResponse

        fun operatingunit(): OperatingunitService.WithRawResponse

        fun operatingunitremark(): OperatingunitremarkService.WithRawResponse

        fun orbitdetermination(): OrbitdeterminationService.WithRawResponse

        fun orbittrack(): OrbittrackService.WithRawResponse

        fun organization(): OrganizationService.WithRawResponse

        fun organizationdetails(): OrganizationdetailService.WithRawResponse

        fun personnelrecovery(): PersonnelrecoveryService.WithRawResponse

        fun poi(): PoiService.WithRawResponse

        fun port(): PortService.WithRawResponse

        fun reportAndActivities(): ReportAndActivityService.WithRawResponse

        fun rfBand(): RfBandService.WithRawResponse

        fun rfBandType(): RfBandTypeService.WithRawResponse

        fun rfEmitter(): RfEmitterService.WithRawResponse

        fun routeStats(): RouteStatService.WithRawResponse

        fun sarObservation(): SarObservationService.WithRawResponse

        fun scientific(): ScientificService.WithRawResponse

        fun scs(): ScService.WithRawResponse

        fun secureMessaging(): SecureMessagingService.WithRawResponse

        fun sensor(): SensorService.WithRawResponse

        fun sensorStating(): SensorStatingService.WithRawResponse

        fun sensorMaintenance(): SensorMaintenanceService.WithRawResponse

        fun sensorObservationType(): SensorObservationTypeService.WithRawResponse

        fun sensorPlan(): SensorPlanService.WithRawResponse

        fun sensorType(): SensorTypeService.WithRawResponse

        fun seraDataCommDetails(): SeraDataCommDetailService.WithRawResponse

        fun seraDataEarlyWarning(): SeraDataEarlyWarningService.WithRawResponse

        fun seraDataNavigation(): SeraDataNavigationService.WithRawResponse

        fun seradataOpticalPayload(): SeradataOpticalPayloadService.WithRawResponse

        fun seradataRadarPayload(): SeradataRadarPayloadService.WithRawResponse

        fun seradataSigintPayload(): SeradataSigintPayloadService.WithRawResponse

        fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService.WithRawResponse

        fun sgi(): SgiService.WithRawResponse

        fun sigact(): SigactService.WithRawResponse

        fun site(): SiteService.WithRawResponse

        fun siteRemark(): SiteRemarkService.WithRawResponse

        fun siteStatus(): SiteStatusService.WithRawResponse

        fun skyImagery(): SkyImageryService.WithRawResponse

        fun soiObservationSet(): SoiObservationSetService.WithRawResponse

        fun solarArray(): SolarArrayService.WithRawResponse

        fun solarArrayDetails(): SolarArrayDetailService.WithRawResponse

        fun sortiePpr(): SortiePprService.WithRawResponse

        fun spaceEnvObservation(): SpaceEnvObservationService.WithRawResponse

        fun stage(): StageService.WithRawResponse

        fun starCatalog(): StarCatalogService.WithRawResponse

        fun stateVector(): StateVectorService.WithRawResponse

        fun status(): StatusService.WithRawResponse

        fun substatus(): SubstatusService.WithRawResponse

        fun supportingData(): SupportingDataService.WithRawResponse

        fun surface(): SurfaceService.WithRawResponse

        fun surfaceObstruction(): SurfaceObstructionService.WithRawResponse

        fun swir(): SwirService.WithRawResponse

        fun taiUtc(): TaiUtcService.WithRawResponse

        fun tdoaFdoa(): TdoaFdoaService.WithRawResponse

        fun track(): TrackService.WithRawResponse

        fun trackDetails(): TrackDetailService.WithRawResponse

        fun trackRoute(): TrackRouteService.WithRawResponse

        fun transponder(): TransponderService.WithRawResponse

        fun user(): UserService.WithRawResponse

        fun vessel(): VesselService.WithRawResponse

        fun video(): VideoService.WithRawResponse

        fun weatherData(): WeatherDataService.WithRawResponse

        fun weatherReport(): WeatherReportService.WithRawResponse
    }
}
