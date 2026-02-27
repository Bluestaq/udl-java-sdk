// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.getPackageVersion
import com.unifieddatalibrary.api.services.async.AiServiceAsync
import com.unifieddatalibrary.api.services.async.AiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirEventServiceAsync
import com.unifieddatalibrary.api.services.async.AirEventServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsync
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsync
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftSortyServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsync
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AisObjectServiceAsync
import com.unifieddatalibrary.api.services.async.AisObjectServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsync
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AntennaServiceAsync
import com.unifieddatalibrary.api.services.async.AntennaServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsync
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BatteryServiceAsync
import com.unifieddatalibrary.api.services.async.BatteryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsync
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import com.unifieddatalibrary.api.services.async.BeamServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BusServiceAsync
import com.unifieddatalibrary.api.services.async.BusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ChannelServiceAsync
import com.unifieddatalibrary.api.services.async.ChannelServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CloselyspacedobjectServiceAsync
import com.unifieddatalibrary.api.services.async.CloselyspacedobjectServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CommServiceAsync
import com.unifieddatalibrary.api.services.async.CommServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsync
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CotServiceAsync
import com.unifieddatalibrary.api.services.async.CotServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.CountryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CrewServiceAsync
import com.unifieddatalibrary.api.services.async.CrewServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DeconflictsetServiceAsync
import com.unifieddatalibrary.api.services.async.DeconflictsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DiffOfArrivalServiceAsync
import com.unifieddatalibrary.api.services.async.DiffOfArrivalServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsync
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsync
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsync
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EcpedrServiceAsync
import com.unifieddatalibrary.api.services.async.EcpedrServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ElsetServiceAsync
import com.unifieddatalibrary.api.services.async.ElsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EmireportServiceAsync
import com.unifieddatalibrary.api.services.async.EmireportServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsync
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsync
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EngineServiceAsync
import com.unifieddatalibrary.api.services.async.EngineServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EntityServiceAsync
import com.unifieddatalibrary.api.services.async.EntityServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EopServiceAsync
import com.unifieddatalibrary.api.services.async.EopServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EvacServiceAsync
import com.unifieddatalibrary.api.services.async.EvacServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsync
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsync
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsync
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GnssObservationServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsync
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsync
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import com.unifieddatalibrary.api.services.async.HazardServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.IrServiceAsync
import com.unifieddatalibrary.api.services.async.IrServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsync
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ItemServiceAsync
import com.unifieddatalibrary.api.services.async.ItemServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsync
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaserdeconflictrequestServiceAsync
import com.unifieddatalibrary.api.services.async.LaserdeconflictrequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaseremitterServiceAsync
import com.unifieddatalibrary.api.services.async.LaseremitterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LinkstatusServiceAsync
import com.unifieddatalibrary.api.services.async.LinkstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LocationServiceAsync
import com.unifieddatalibrary.api.services.async.LocationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsync
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsync
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsync
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.MtiServiceAsync
import com.unifieddatalibrary.api.services.async.MtiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.NavigationServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.NavigationalObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationalObstructionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.NotificationServiceAsync
import com.unifieddatalibrary.api.services.async.NotificationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsync
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ObservationServiceAsync
import com.unifieddatalibrary.api.services.async.ObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsync
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitassessmentServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitassessmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsync
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsync
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.PoiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.PortServiceAsync
import com.unifieddatalibrary.api.services.async.PortServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ReportAndActivityServiceAsync
import com.unifieddatalibrary.api.services.async.ReportAndActivityServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsync
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsync
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ScServiceAsync
import com.unifieddatalibrary.api.services.async.ScServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ScientificServiceAsync
import com.unifieddatalibrary.api.services.async.ScientificServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsync
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsync
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsync
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import com.unifieddatalibrary.api.services.async.SensorServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorStatingServiceAsync
import com.unifieddatalibrary.api.services.async.SensorStatingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SgiServiceAsync
import com.unifieddatalibrary.api.services.async.SgiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SigactServiceAsync
import com.unifieddatalibrary.api.services.async.SigactServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SiteServiceAsync
import com.unifieddatalibrary.api.services.async.SiteServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsync
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsync
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsync
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsync
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StageServiceAsync
import com.unifieddatalibrary.api.services.async.StageServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsync
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsync
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StatusServiceAsync
import com.unifieddatalibrary.api.services.async.StatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsync
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsync
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.SwirServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsync
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsync
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsync
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TrackServiceAsync
import com.unifieddatalibrary.api.services.async.TrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TransponderServiceAsync
import com.unifieddatalibrary.api.services.async.TransponderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.UserServiceAsync
import com.unifieddatalibrary.api.services.async.UserServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.VesselServiceAsync
import com.unifieddatalibrary.api.services.async.VesselServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.VideoServiceAsync
import com.unifieddatalibrary.api.services.async.VideoServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsyncImpl
import java.util.function.Consumer

class UnifieddatalibraryClientAsyncImpl(private val clientOptions: ClientOptions) :
    UnifieddatalibraryClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: UnifieddatalibraryClient by lazy {
        UnifieddatalibraryClientImpl(clientOptions)
    }

    private val withRawResponse: UnifieddatalibraryClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val airEvents: AirEventServiceAsync by lazy {
        AirEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airOperations: AirOperationServiceAsync by lazy {
        AirOperationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airTransportMissions: AirTransportMissionServiceAsync by lazy {
        AirTransportMissionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraft: AircraftServiceAsync by lazy {
        AircraftServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraftSorties: AircraftSortyServiceAsync by lazy {
        AircraftSortyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraftStatusRemarks: AircraftStatusRemarkServiceAsync by lazy {
        AircraftStatusRemarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraftStatuses: AircraftStatusServiceAsync by lazy {
        AircraftStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfieldSlotConsumptions: AirfieldSlotConsumptionServiceAsync by lazy {
        AirfieldSlotConsumptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfieldSlots: AirfieldSlotServiceAsync by lazy {
        AirfieldSlotServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfieldStatus: AirfieldStatusServiceAsync by lazy {
        AirfieldStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfields: AirfieldServiceAsync by lazy {
        AirfieldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airloadPlans: AirloadPlanServiceAsync by lazy {
        AirloadPlanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airspaceControlOrders: AirspaceControlOrderServiceAsync by lazy {
        AirspaceControlOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ais: AiServiceAsync by lazy { AiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val aisObjects: AisObjectServiceAsync by lazy {
        AisObjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val analyticImagery: AnalyticImageryServiceAsync by lazy {
        AnalyticImageryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val antennas: AntennaServiceAsync by lazy {
        AntennaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val attitudeData: AttitudeDataServiceAsync by lazy {
        AttitudeDataServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val attitudeSets: AttitudeSetServiceAsync by lazy {
        AttitudeSetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aviationRiskManagement: AviationRiskManagementServiceAsync by lazy {
        AviationRiskManagementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batteries: BatteryServiceAsync by lazy {
        BatteryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batterydetails: BatterydetailServiceAsync by lazy {
        BatterydetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val beam: BeamServiceAsync by lazy { BeamServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val beamContours: BeamContourServiceAsync by lazy {
        BeamContourServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val buses: BusServiceAsync by lazy { BusServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val channels: ChannelServiceAsync by lazy {
        ChannelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val closelyspacedobjects: CloselyspacedobjectServiceAsync by lazy {
        CloselyspacedobjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val collectRequests: CollectRequestServiceAsync by lazy {
        CollectRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val collectResponses: CollectResponseServiceAsync by lazy {
        CollectResponseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val comm: CommServiceAsync by lazy { CommServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val conjunctions: ConjunctionServiceAsync by lazy {
        ConjunctionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cots: CotServiceAsync by lazy { CotServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val countries: CountryServiceAsync by lazy {
        CountryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val crew: CrewServiceAsync by lazy { CrewServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val deconflictset: DeconflictsetServiceAsync by lazy {
        DeconflictsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val diffOfArrival: DiffOfArrivalServiceAsync by lazy {
        DiffOfArrivalServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val diplomaticClearance: DiplomaticClearanceServiceAsync by lazy {
        DiplomaticClearanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val driftHistory: DriftHistoryServiceAsync by lazy {
        DriftHistoryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dropzone: DropzoneServiceAsync by lazy {
        DropzoneServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ecpedr: EcpedrServiceAsync by lazy {
        EcpedrServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val effectRequests: EffectRequestServiceAsync by lazy {
        EffectRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val effectResponses: EffectResponseServiceAsync by lazy {
        EffectResponseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val elsets: ElsetServiceAsync by lazy {
        ElsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val emireport: EmireportServiceAsync by lazy {
        EmireportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val emitterGeolocation: EmitterGeolocationServiceAsync by lazy {
        EmitterGeolocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val engineDetails: EngineDetailServiceAsync by lazy {
        EngineDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val engines: EngineServiceAsync by lazy {
        EngineServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val entities: EntityServiceAsync by lazy {
        EntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val eop: EopServiceAsync by lazy { EopServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val ephemeris: EphemerisServiceAsync by lazy {
        EphemerisServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ephemerisSets: EphemerisSetServiceAsync by lazy {
        EphemerisSetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val equipment: EquipmentServiceAsync by lazy {
        EquipmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val equipmentRemarks: EquipmentRemarkServiceAsync by lazy {
        EquipmentRemarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val evac: EvacServiceAsync by lazy { EvacServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val eventEvolution: EventEvolutionServiceAsync by lazy {
        EventEvolutionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val featureAssessment: FeatureAssessmentServiceAsync by lazy {
        FeatureAssessmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val flightplan: FlightplanServiceAsync by lazy {
        FlightplanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val geoStatus: GeoStatusServiceAsync by lazy {
        GeoStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalAtmosphericModel: GlobalAtmosphericModelServiceAsync by lazy {
        GlobalAtmosphericModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gnssObservations: GnssObservationServiceAsync by lazy {
        GnssObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gnssObservationset: GnssObservationsetServiceAsync by lazy {
        GnssObservationsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gnssRawIf: GnssRawIfServiceAsync by lazy {
        GnssRawIfServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val groundImagery: GroundImageryServiceAsync by lazy {
        GroundImageryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val h3Geo: H3GeoServiceAsync by lazy {
        H3GeoServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val h3GeoHexCell: H3GeoHexCellServiceAsync by lazy {
        H3GeoHexCellServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val hazard: HazardServiceAsync by lazy {
        HazardServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ionoObservations: IonoObservationServiceAsync by lazy {
        IonoObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ir: IrServiceAsync by lazy { IrServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val isrCollections: IsrCollectionServiceAsync by lazy {
        IsrCollectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val item: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val itemTrackings: ItemTrackingServiceAsync by lazy {
        ItemTrackingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val laserdeconflictrequest: LaserdeconflictrequestServiceAsync by lazy {
        LaserdeconflictrequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val laseremitter: LaseremitterServiceAsync by lazy {
        LaseremitterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchDetection: LaunchDetectionServiceAsync by lazy {
        LaunchDetectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchEvent: LaunchEventServiceAsync by lazy {
        LaunchEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchSite: LaunchSiteServiceAsync by lazy {
        LaunchSiteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchSiteDetails: LaunchSiteDetailServiceAsync by lazy {
        LaunchSiteDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchVehicle: LaunchVehicleServiceAsync by lazy {
        LaunchVehicleServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchVehicleDetails: LaunchVehicleDetailServiceAsync by lazy {
        LaunchVehicleDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val linkStatus: LinkStatusServiceAsync by lazy {
        LinkStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val linkstatus: LinkstatusServiceAsync by lazy {
        LinkstatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val location: LocationServiceAsync by lazy {
        LocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val logisticsSupport: LogisticsSupportServiceAsync by lazy {
        LogisticsSupportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val maneuvers: ManeuverServiceAsync by lazy {
        ManeuverServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val manifold: ManifoldServiceAsync by lazy {
        ManifoldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val manifoldelset: ManifoldelsetServiceAsync by lazy {
        ManifoldelsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val missileTracks: MissileTrackServiceAsync by lazy {
        MissileTrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val missionAssignment: MissionAssignmentServiceAsync by lazy {
        MissionAssignmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mti: MtiServiceAsync by lazy { MtiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val navigation: NavigationServiceAsync by lazy {
        NavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val navigationalObstruction: NavigationalObstructionServiceAsync by lazy {
        NavigationalObstructionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notification: NotificationServiceAsync by lazy {
        NotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val objectOfInterest: ObjectOfInterestServiceAsync by lazy {
        ObjectOfInterestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val observations: ObservationServiceAsync by lazy {
        ObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onboardnavigation: OnboardnavigationServiceAsync by lazy {
        OnboardnavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbit: OnorbitServiceAsync by lazy {
        OnorbitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitantenna: OnorbitantennaServiceAsync by lazy {
        OnorbitantennaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitbattery: OnorbitbatteryServiceAsync by lazy {
        OnorbitbatteryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitdetails: OnorbitdetailServiceAsync by lazy {
        OnorbitdetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitevent: OnorbiteventServiceAsync by lazy {
        OnorbiteventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitlist: OnorbitlistServiceAsync by lazy {
        OnorbitlistServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitsolararray: OnorbitsolararrayServiceAsync by lazy {
        OnorbitsolararrayServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitthruster: OnorbitthrusterServiceAsync by lazy {
        OnorbitthrusterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitthrusterstatus: OnorbitthrusterstatusServiceAsync by lazy {
        OnorbitthrusterstatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitassessment: OnorbitassessmentServiceAsync by lazy {
        OnorbitassessmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val operatingunit: OperatingunitServiceAsync by lazy {
        OperatingunitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val operatingunitremark: OperatingunitremarkServiceAsync by lazy {
        OperatingunitremarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orbitdetermination: OrbitdeterminationServiceAsync by lazy {
        OrbitdeterminationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orbittrack: OrbittrackServiceAsync by lazy {
        OrbittrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val organization: OrganizationServiceAsync by lazy {
        OrganizationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val organizationdetails: OrganizationdetailServiceAsync by lazy {
        OrganizationdetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val personnelrecovery: PersonnelrecoveryServiceAsync by lazy {
        PersonnelrecoveryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val poi: PoiServiceAsync by lazy { PoiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val port: PortServiceAsync by lazy { PortServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val reportAndActivities: ReportAndActivityServiceAsync by lazy {
        ReportAndActivityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rfBand: RfBandServiceAsync by lazy {
        RfBandServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rfBandType: RfBandTypeServiceAsync by lazy {
        RfBandTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rfEmitter: RfEmitterServiceAsync by lazy {
        RfEmitterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routeStats: RouteStatServiceAsync by lazy {
        RouteStatServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sarObservation: SarObservationServiceAsync by lazy {
        SarObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scientific: ScientificServiceAsync by lazy {
        ScientificServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scs: ScServiceAsync by lazy { ScServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val secureMessaging: SecureMessagingServiceAsync by lazy {
        SecureMessagingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensor: SensorServiceAsync by lazy {
        SensorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorStating: SensorStatingServiceAsync by lazy {
        SensorStatingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorMaintenance: SensorMaintenanceServiceAsync by lazy {
        SensorMaintenanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorObservationType: SensorObservationTypeServiceAsync by lazy {
        SensorObservationTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorPlan: SensorPlanServiceAsync by lazy {
        SensorPlanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorType: SensorTypeServiceAsync by lazy {
        SensorTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seraDataCommDetails: SeraDataCommDetailServiceAsync by lazy {
        SeraDataCommDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seraDataEarlyWarning: SeraDataEarlyWarningServiceAsync by lazy {
        SeraDataEarlyWarningServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seraDataNavigation: SeraDataNavigationServiceAsync by lazy {
        SeraDataNavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataOpticalPayload: SeradataOpticalPayloadServiceAsync by lazy {
        SeradataOpticalPayloadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataRadarPayload: SeradataRadarPayloadServiceAsync by lazy {
        SeradataRadarPayloadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataSigintPayload: SeradataSigintPayloadServiceAsync by lazy {
        SeradataSigintPayloadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataSpacecraftDetails: SeradataSpacecraftDetailServiceAsync by lazy {
        SeradataSpacecraftDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sgi: SgiServiceAsync by lazy { SgiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val sigact: SigactServiceAsync by lazy {
        SigactServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val site: SiteServiceAsync by lazy { SiteServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val siteRemark: SiteRemarkServiceAsync by lazy {
        SiteRemarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val siteStatus: SiteStatusServiceAsync by lazy {
        SiteStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val skyImagery: SkyImageryServiceAsync by lazy {
        SkyImageryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val soiObservationSet: SoiObservationSetServiceAsync by lazy {
        SoiObservationSetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val solarArray: SolarArrayServiceAsync by lazy {
        SolarArrayServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val solarArrayDetails: SolarArrayDetailServiceAsync by lazy {
        SolarArrayDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sortiePpr: SortiePprServiceAsync by lazy {
        SortiePprServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val spaceEnvObservation: SpaceEnvObservationServiceAsync by lazy {
        SpaceEnvObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stage: StageServiceAsync by lazy {
        StageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val starCatalog: StarCatalogServiceAsync by lazy {
        StarCatalogServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stateVector: StateVectorServiceAsync by lazy {
        StateVectorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val status: StatusServiceAsync by lazy {
        StatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val substatus: SubstatusServiceAsync by lazy {
        SubstatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val supportingData: SupportingDataServiceAsync by lazy {
        SupportingDataServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val surface: SurfaceServiceAsync by lazy {
        SurfaceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val surfaceObstruction: SurfaceObstructionServiceAsync by lazy {
        SurfaceObstructionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val swir: SwirServiceAsync by lazy { SwirServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val taiUtc: TaiUtcServiceAsync by lazy {
        TaiUtcServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tdoaFdoa: TdoaFdoaServiceAsync by lazy {
        TdoaFdoaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val track: TrackServiceAsync by lazy {
        TrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val trackDetails: TrackDetailServiceAsync by lazy {
        TrackDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val trackRoute: TrackRouteServiceAsync by lazy {
        TrackRouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transponder: TransponderServiceAsync by lazy {
        TransponderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val vessel: VesselServiceAsync by lazy {
        VesselServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val video: VideoServiceAsync by lazy {
        VideoServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val weatherData: WeatherDataServiceAsync by lazy {
        WeatherDataServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val weatherReport: WeatherReportServiceAsync by lazy {
        WeatherReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): UnifieddatalibraryClient = sync

    override fun withRawResponse(): UnifieddatalibraryClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): UnifieddatalibraryClientAsync =
        UnifieddatalibraryClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airEvents(): AirEventServiceAsync = airEvents

    override fun airOperations(): AirOperationServiceAsync = airOperations

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airTransportMissions(): AirTransportMissionServiceAsync = airTransportMissions

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    override fun aircraft(): AircraftServiceAsync = aircraft

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun aircraftSorties(): AircraftSortyServiceAsync = aircraftSorties

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    override fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync = aircraftStatusRemarks

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    override fun aircraftStatuses(): AircraftStatusServiceAsync = aircraftStatuses

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfieldSlotConsumptions(): AirfieldSlotConsumptionServiceAsync =
        airfieldSlotConsumptions

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfieldSlots(): AirfieldSlotServiceAsync = airfieldSlots

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfieldStatus(): AirfieldStatusServiceAsync = airfieldStatus

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfields(): AirfieldServiceAsync = airfields

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airloadPlans(): AirloadPlanServiceAsync = airloadPlans

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airspaceControlOrders(): AirspaceControlOrderServiceAsync = airspaceControlOrders

    /**
     * These services provide for posting and querying of self-reported information obtained from
     * the Automatic Identification System (AIS) equipment. This contains information such as unique
     * identification, status, position, course, and speed. The AIS is an automatic tracking system
     * that uses transceivers on ships and is used by vessel traffic services. Although technically
     * and operationally distinct, the AIS system is analogous to ADS-B which performs a similar
     * function for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow
     * maritime authorities to track and monitor vessel movements. AIS integrates a standardized VHF
     * transceiver with a positioning system, such as Global Positioning System receiver, with other
     * electronic navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted
     * with AIS transceivers can be tracked by AIS base stations located along coastlines or, when
     * out of range of terrestrial networks, through a growing number of satellites that are fitted
     * with special AIS receivers that are capable of deconflicting a large number of signatures.
     */
    override fun ais(): AiServiceAsync = ais

    /**
     * These services provide for posting and querying of self-reported information obtained from
     * the Automatic Identification System (AIS) equipment. This contains information such as unique
     * identification, status, position, course, and speed. The AIS is an automatic tracking system
     * that uses transceivers on ships and is used by vessel traffic services. Although technically
     * and operationally distinct, the AIS system is analogous to ADS-B which performs a similar
     * function for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow
     * maritime authorities to track and monitor vessel movements. AIS integrates a standardized VHF
     * transceiver with a positioning system, such as Global Positioning System receiver, with other
     * electronic navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted
     * with AIS transceivers can be tracked by AIS base stations located along coastlines or, when
     * out of range of terrestrial networks, through a growing number of satellites that are fitted
     * with special AIS receivers that are capable of deconflicting a large number of signatures.
     */
    override fun aisObjects(): AisObjectServiceAsync = aisObjects

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun analyticImagery(): AnalyticImageryServiceAsync = analyticImagery

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun antennas(): AntennaServiceAsync = antennas

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun attitudeData(): AttitudeDataServiceAsync = attitudeData

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun attitudeSets(): AttitudeSetServiceAsync = attitudeSets

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun aviationRiskManagement(): AviationRiskManagementServiceAsync =
        aviationRiskManagement

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun batteries(): BatteryServiceAsync = batteries

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun batterydetails(): BatterydetailServiceAsync = batterydetails

    /**
     * This collection of services provides operations for querying and manipulation of satellite
     * antenna beams, and querying of beam contours and service areas. Beam contours are the
     * geographic representation of the relative gain levels of beam power off of the maximum gain
     * boresight points. Similarly, service areas are the geographic footprints of the areas served
     * by a particular beam, and may be made up of multiple service regions. Well-Known Text (WKT)
     * and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    override fun beam(): BeamServiceAsync = beam

    /**
     * This collection of services provides operations for querying and manipulation of satellite
     * antenna beams, and querying of beam contours and service areas. Beam contours are the
     * geographic representation of the relative gain levels of beam power off of the maximum gain
     * boresight points. Similarly, service areas are the geographic footprints of the areas served
     * by a particular beam, and may be made up of multiple service regions. Well-Known Text (WKT)
     * and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    override fun beamContours(): BeamContourServiceAsync = beamContours

    /**
     * Services for querying and manipulation of satellite buses. A bus is the physical and software
     * infrastructure backbone to which on-orbit satellite payloads are attached for power, control,
     * and other support functions.
     */
    override fun buses(): BusServiceAsync = buses

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun channels(): ChannelServiceAsync = channels

    /**
     * This collection of services provides operations for manipulating and querying of closely
     * spaced objects (on orbit) operations including docking, rendezvous, proximity and reporting
     * of payload zone engagements observed and characterized over a period of time.
     */
    override fun closelyspacedobjects(): CloselyspacedobjectServiceAsync = closelyspacedobjects

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun collectRequests(): CollectRequestServiceAsync = collectRequests

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun collectResponses(): CollectResponseServiceAsync = collectResponses

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun comm(): CommServiceAsync = comm

    /** These services provide operations for manipulation and querying of conjunctions. */
    override fun conjunctions(): ConjunctionServiceAsync = conjunctions

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun cots(): CotServiceAsync = cots

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun countries(): CountryServiceAsync = countries

    /**
     * These services provide operations for posting and querying crew data. Crew data contains
     * information about its members and their assignments.
     */
    override fun crew(): CrewServiceAsync = crew

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun deconflictset(): DeconflictsetServiceAsync = deconflictset

    /**
     * These services provide operations for querying and manipulation of Signal time and frequency
     * difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor
     * phenomenologies and sensor triangulation. The J2000 coordinate frame is the preferred frame
     * for all observations, but in some cases observations may be in another frame depending on the
     * provider.
     */
    override fun diffOfArrival(): DiffOfArrivalServiceAsync = diffOfArrival

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun diplomaticClearance(): DiplomaticClearanceServiceAsync = diplomaticClearance

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun driftHistory(): DriftHistoryServiceAsync = driftHistory

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun dropzone(): DropzoneServiceAsync = dropzone

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun ecpedr(): EcpedrServiceAsync = ecpedr

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun effectRequests(): EffectRequestServiceAsync = effectRequests

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun effectResponses(): EffectResponseServiceAsync = effectResponses

    /**
     * These services provide operations for querying and manipulation of element set data
     * describing orbital characteristics of on-orbit objects. An element set is a collection of
     * parameters that are used, along with an orbit propagator, to predict the motion of a
     * satellite. The element set, or elset for short, consists of identification data, the
     * classical elements and drag parameters.
     */
    override fun elsets(): ElsetServiceAsync = elsets

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun emireport(): EmireportServiceAsync = emireport

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun emitterGeolocation(): EmitterGeolocationServiceAsync = emitterGeolocation

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun engineDetails(): EngineDetailServiceAsync = engineDetails

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun engines(): EngineServiceAsync = engines

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun entities(): EntityServiceAsync = entities

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    override fun eop(): EopServiceAsync = eop

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun ephemeris(): EphemerisServiceAsync = ephemeris

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun ephemerisSets(): EphemerisSetServiceAsync = ephemerisSets

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    override fun equipment(): EquipmentServiceAsync = equipment

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    override fun equipmentRemarks(): EquipmentRemarkServiceAsync = equipmentRemarks

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun evac(): EvacServiceAsync = evac

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun eventEvolution(): EventEvolutionServiceAsync = eventEvolution

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun featureAssessment(): FeatureAssessmentServiceAsync = featureAssessment

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun flightplan(): FlightplanServiceAsync = flightplan

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun geoStatus(): GeoStatusServiceAsync = geoStatus

    /**
     * Models and Simulations is a collection of services that allow consumers to interact with data
     * products representing independent models of various phenomenon, artificial intelligence
     * models and predictions, or of mathematical parameters meant to feed mod and sim tools to
     * produce estimates of environmental entities such as atmospheric models and heat maps.
     */
    override fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync =
        globalAtmosphericModel

    override fun gnssObservations(): GnssObservationServiceAsync = gnssObservations

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun gnssObservationset(): GnssObservationsetServiceAsync = gnssObservationset

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun gnssRawIf(): GnssRawIfServiceAsync = gnssRawIf

    /**
     * This collection of services provides operations for querying and manipulation of ground
     * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata on
     * the image (time, region, source, etc) as well as binary content (typically GeoTIFF). Binary
     * content must be downloaded individually by ID using the 'getFile' operation. Well-Known Text
     * (WKT) and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    override fun groundImagery(): GroundImageryServiceAsync = groundImagery

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun h3Geo(): H3GeoServiceAsync = h3Geo

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun h3GeoHexCell(): H3GeoHexCellServiceAsync = h3GeoHexCell

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun hazard(): HazardServiceAsync = hazard

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun ionoObservations(): IonoObservationServiceAsync = ionoObservations

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun ir(): IrServiceAsync = ir

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun isrCollections(): IsrCollectionServiceAsync = isrCollections

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun item(): ItemServiceAsync = item

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun itemTrackings(): ItemTrackingServiceAsync = itemTrackings

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    override fun laserdeconflictrequest(): LaserdeconflictrequestServiceAsync =
        laserdeconflictrequest

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    override fun laseremitter(): LaseremitterServiceAsync = laseremitter

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchDetection(): LaunchDetectionServiceAsync = launchDetection

    /**
     * These services provide operations for manipulation and querying of LaunchEvent data. Launch
     * Event data are known space launches, either future or historic records containing items such
     * as the launch site, launch epoch, and object.
     */
    override fun launchEvent(): LaunchEventServiceAsync = launchEvent

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchSite(): LaunchSiteServiceAsync = launchSite

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchSiteDetails(): LaunchSiteDetailServiceAsync = launchSiteDetails

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchVehicle(): LaunchVehicleServiceAsync = launchVehicle

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync = launchVehicleDetails

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    override fun linkStatus(): LinkStatusServiceAsync = linkStatus

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    override fun linkstatus(): LinkstatusServiceAsync = linkstatus

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun location(): LocationServiceAsync = location

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun logisticsSupport(): LogisticsSupportServiceAsync = logisticsSupport

    /**
     * This service provides operations for querying and manipulation of detected/possible/confirmed
     * on-orbit maneuvers. The J2000 coordinate frame is the preferred frame for all maneuver data,
     * but in some cases data may be in another frame depending on the provider. Check the
     * Storefront 'Data Products' section under the 'Discover' tab for maneuver data provider
     * information.
     */
    override fun maneuvers(): ManeuverServiceAsync = maneuvers

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun manifold(): ManifoldServiceAsync = manifold

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun manifoldelset(): ManifoldelsetServiceAsync = manifoldelset

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun missileTracks(): MissileTrackServiceAsync = missileTracks

    /**
     * These services provide operations for manipulation and querying of mission assignment
     * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign missions,
     * designate targets, and provide target information to non-C2 JU platforms. Provision is made
     * for the non-C2 JU platforms to acknowledge the message through receipt/compliance action.
     */
    override fun missionAssignment(): MissionAssignmentServiceAsync = missionAssignment

    /**
     * These services provide operations for posting and querying Moving Target Indicator (MTI)
     * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less detailed
     * data for applications such as situational awareness used/derived by exploitation systems.
     */
    override fun mti(): MtiServiceAsync = mti

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun navigation(): NavigationServiceAsync = navigation

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun navigationalObstruction(): NavigationalObstructionServiceAsync =
        navigationalObstruction

    /**
     * A Notification Service allowing the broadcast of generic messages to the community. Users can
     * send free-form messages, publish lists, and notify the community about events or alerts
     * across various domains. Notifications and alerts are categorized by a 'msgType' field and are
     * accessible via the UDL Secure Messaging API and REST API services.
     */
    override fun notification(): NotificationServiceAsync = notification

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun objectOfInterest(): ObjectOfInterestServiceAsync = objectOfInterest

    override fun observations(): ObservationServiceAsync = observations

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun onboardnavigation(): OnboardnavigationServiceAsync = onboardnavigation

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbit(): OnorbitServiceAsync = onorbit

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitantenna(): OnorbitantennaServiceAsync = onorbitantenna

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitbattery(): OnorbitbatteryServiceAsync = onorbitbattery

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitdetails(): OnorbitdetailServiceAsync = onorbitdetails

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitevent(): OnorbiteventServiceAsync = onorbitevent

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitlist(): OnorbitlistServiceAsync = onorbitlist

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitsolararray(): OnorbitsolararrayServiceAsync = onorbitsolararray

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitthruster(): OnorbitthrusterServiceAsync = onorbitthruster

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync = onorbitthrusterstatus

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun onorbitassessment(): OnorbitassessmentServiceAsync = onorbitassessment

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun operatingunit(): OperatingunitServiceAsync = operatingunit

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun operatingunitremark(): OperatingunitremarkServiceAsync = operatingunitremark

    /**
     * These services provide operations for manipulating and querying Orbit Determination (OD)
     * data. Orbit Determination data contains algorithm results that describe General Perturbations
     * or Special Perturbations orbital updates.
     */
    override fun orbitdetermination(): OrbitdeterminationServiceAsync = orbitdetermination

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun orbittrack(): OrbittrackServiceAsync = orbittrack

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun organization(): OrganizationServiceAsync = organization

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun organizationdetails(): OrganizationdetailServiceAsync = organizationdetails

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun personnelrecovery(): PersonnelrecoveryServiceAsync = personnelrecovery

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun poi(): PoiServiceAsync = poi

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun port(): PortServiceAsync = port

    override fun reportAndActivities(): ReportAndActivityServiceAsync = reportAndActivities

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    override fun rfBand(): RfBandServiceAsync = rfBand

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    override fun rfBandType(): RfBandTypeServiceAsync = rfBandType

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    override fun rfEmitter(): RfEmitterServiceAsync = rfEmitter

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun routeStats(): RouteStatServiceAsync = routeStats

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun sarObservation(): SarObservationServiceAsync = sarObservation

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun scientific(): ScientificServiceAsync = scientific

    override fun scs(): ScServiceAsync = scs

    /**
     * Secure Messaging is based on Apache Kafka which is an open-source stream-processing software
     * platform developed by the Apache Software Foundation, written in Scala and Java. Kafka
     * provides a unified, high-throughput, low-latency platform for handling real-time data feeds.
     * All messaging is secured; consumers will not receive messages unless authorized to do so.
     * J2000 is the preferred coordinate frame for all observations, but in some cases observations
     * may be in another frame depending on the provider. Please see the 'Discover' tab in the
     * storefront to confirm coordinate frames by data provider.
     */
    override fun secureMessaging(): SecureMessagingServiceAsync = secureMessaging

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensor(): SensorServiceAsync = sensor

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorStating(): SensorStatingServiceAsync = sensorStating

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorMaintenance(): SensorMaintenanceServiceAsync = sensorMaintenance

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorObservationType(): SensorObservationTypeServiceAsync = sensorObservationType

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun sensorPlan(): SensorPlanServiceAsync = sensorPlan

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorType(): SensorTypeServiceAsync = sensorType

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun seraDataCommDetails(): SeraDataCommDetailServiceAsync = seraDataCommDetails

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync = seraDataEarlyWarning

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun seraDataNavigation(): SeraDataNavigationServiceAsync = seraDataNavigation

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync =
        seradataOpticalPayload

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync = seradataRadarPayload

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync = seradataSigintPayload

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun seradataSpacecraftDetails(): SeradataSpacecraftDetailServiceAsync =
        seradataSpacecraftDetails

    /**
     * This service provides operations for manipulation and querying of space weather/solar,
     * geomagnetic, and radiation belt index data.
     */
    override fun sgi(): SgiServiceAsync = sgi

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun sigact(): SigactServiceAsync = sigact

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun site(): SiteServiceAsync = site

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun siteRemark(): SiteRemarkServiceAsync = siteRemark

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun siteStatus(): SiteStatusServiceAsync = siteStatus

    /**
     * This collection of services provides operations for querying and manipulation of sky imagery
     * data. Sky imagery is ground or space based telescope imagery of RSO's and includes metadata
     * on the image (time, source, etc) as well as binary image content (e.g. FITS, EOSSA, EOCHIP,
     * MP4). Binary content must be downloaded individually by ID using the 'getFile' operation.
     */
    override fun skyImagery(): SkyImageryServiceAsync = skyImagery

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun soiObservationSet(): SoiObservationSetServiceAsync = soiObservationSet

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun solarArray(): SolarArrayServiceAsync = solarArray

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun solarArrayDetails(): SolarArrayDetailServiceAsync = solarArrayDetails

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun sortiePpr(): SortiePprServiceAsync = sortiePpr

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun spaceEnvObservation(): SpaceEnvObservationServiceAsync = spaceEnvObservation

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun stage(): StageServiceAsync = stage

    /**
     * These services provide operations for posting and querying Star Catalog data. The Star
     * Catalog model is a representation of astronomical data and photometric data for stars.
     * Astronomical data includes positional information, proper motions, parallaxes and their
     * respective uncertainties. Photometric data contains optical and near-infrared magnitudes, and
     * their uncertainties across multiple bandpasses. Note: Multiple source catalogs may contribute
     * to a single record.
     */
    override fun starCatalog(): StarCatalogServiceAsync = starCatalog

    /**
     * This service provides operations for querying and manipulation of state vectors for On-orbit
     * objects. State vectors are cartesian vectors of position (r) and velocity (v) that together
     * with their time (epoch) (t) uniquely determine the trajectory of the orbiting body in space.
     * J2000 is the preferred coordinate frame for all state vector positions/velocities in UDL, but
     * in some cases data may be in another frame depending on the provider and/or datatype. Please
     * see the 'Discover' tab in the storefront to confirm coordinate frames by data provider.
     */
    override fun stateVector(): StateVectorServiceAsync = stateVector

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun status(): StatusServiceAsync = status

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun substatus(): SubstatusServiceAsync = substatus

    override fun supportingData(): SupportingDataServiceAsync = supportingData

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun surface(): SurfaceServiceAsync = surface

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun surfaceObstruction(): SurfaceObstructionServiceAsync = surfaceObstruction

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun swir(): SwirServiceAsync = swir

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    override fun taiUtc(): TaiUtcServiceAsync = taiUtc

    override fun tdoaFdoa(): TdoaFdoaServiceAsync = tdoaFdoa

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun track(): TrackServiceAsync = track

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun trackDetails(): TrackDetailServiceAsync = trackDetails

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun trackRoute(): TrackRouteServiceAsync = trackRoute

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun transponder(): TransponderServiceAsync = transponder

    override fun user(): UserServiceAsync = user

    /**
     * This service provides operations for manipulation and querying of maritime Vessel and Vessel
     * Status data. Vessel contains the static data of the specific vessel: mmsi, cruise speed, max
     * speed, etc.
     */
    override fun vessel(): VesselServiceAsync = vessel

    /** This collection of services provides operations for video streaming. */
    override fun video(): VideoServiceAsync = video

    /**
     * These services provide for posting and querying terrestrial weather conditions over a target
     * area or region and raw sensor data used to produce condition reports. Weather Reports
     * describe current weather conditions over a target point or region to include general
     * temperatures, pressures, and moisture accumulation, as well as navigational considerations
     * such as altimeter settings, visibility, wind speeds, and cloud heights etc. Weather Data
     * contains algorithmic parameters and dynamic, raw measurements collected by individual sensors
     * such as signal power, noise level, etc., which are generally processed across multiple
     * sensors to produce weather reports.
     */
    override fun weatherData(): WeatherDataServiceAsync = weatherData

    /**
     * These services provide for posting and querying terrestrial weather conditions over a target
     * area or region and raw sensor data used to produce condition reports. Weather Reports
     * describe current weather conditions over a target point or region to include general
     * temperatures, pressures, and moisture accumulation, as well as navigational considerations
     * such as altimeter settings, visibility, wind speeds, and cloud heights etc. Weather Data
     * contains algorithmic parameters and dynamic, raw measurements collected by individual sensors
     * such as signal power, noise level, etc., which are generally processed across multiple
     * sensors to produce weather reports.
     */
    override fun weatherReport(): WeatherReportServiceAsync = weatherReport

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UnifieddatalibraryClientAsync.WithRawResponse {

        private val airEvents: AirEventServiceAsync.WithRawResponse by lazy {
            AirEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airOperations: AirOperationServiceAsync.WithRawResponse by lazy {
            AirOperationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airTransportMissions: AirTransportMissionServiceAsync.WithRawResponse by lazy {
            AirTransportMissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraft: AircraftServiceAsync.WithRawResponse by lazy {
            AircraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftSorties: AircraftSortyServiceAsync.WithRawResponse by lazy {
            AircraftSortyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftStatusRemarks:
            AircraftStatusRemarkServiceAsync.WithRawResponse by lazy {
            AircraftStatusRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftStatuses: AircraftStatusServiceAsync.WithRawResponse by lazy {
            AircraftStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldSlotConsumptions:
            AirfieldSlotConsumptionServiceAsync.WithRawResponse by lazy {
            AirfieldSlotConsumptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldSlots: AirfieldSlotServiceAsync.WithRawResponse by lazy {
            AirfieldSlotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldStatus: AirfieldStatusServiceAsync.WithRawResponse by lazy {
            AirfieldStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfields: AirfieldServiceAsync.WithRawResponse by lazy {
            AirfieldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airloadPlans: AirloadPlanServiceAsync.WithRawResponse by lazy {
            AirloadPlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airspaceControlOrders:
            AirspaceControlOrderServiceAsync.WithRawResponse by lazy {
            AirspaceControlOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ais: AiServiceAsync.WithRawResponse by lazy {
            AiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aisObjects: AisObjectServiceAsync.WithRawResponse by lazy {
            AisObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val analyticImagery: AnalyticImageryServiceAsync.WithRawResponse by lazy {
            AnalyticImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val antennas: AntennaServiceAsync.WithRawResponse by lazy {
            AntennaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val attitudeData: AttitudeDataServiceAsync.WithRawResponse by lazy {
            AttitudeDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val attitudeSets: AttitudeSetServiceAsync.WithRawResponse by lazy {
            AttitudeSetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aviationRiskManagement:
            AviationRiskManagementServiceAsync.WithRawResponse by lazy {
            AviationRiskManagementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batteries: BatteryServiceAsync.WithRawResponse by lazy {
            BatteryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batterydetails: BatterydetailServiceAsync.WithRawResponse by lazy {
            BatterydetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val beam: BeamServiceAsync.WithRawResponse by lazy {
            BeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val beamContours: BeamContourServiceAsync.WithRawResponse by lazy {
            BeamContourServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val buses: BusServiceAsync.WithRawResponse by lazy {
            BusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val channels: ChannelServiceAsync.WithRawResponse by lazy {
            ChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val closelyspacedobjects: CloselyspacedobjectServiceAsync.WithRawResponse by lazy {
            CloselyspacedobjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val collectRequests: CollectRequestServiceAsync.WithRawResponse by lazy {
            CollectRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val collectResponses: CollectResponseServiceAsync.WithRawResponse by lazy {
            CollectResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comm: CommServiceAsync.WithRawResponse by lazy {
            CommServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conjunctions: ConjunctionServiceAsync.WithRawResponse by lazy {
            ConjunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cots: CotServiceAsync.WithRawResponse by lazy {
            CotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val countries: CountryServiceAsync.WithRawResponse by lazy {
            CountryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val crew: CrewServiceAsync.WithRawResponse by lazy {
            CrewServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val deconflictset: DeconflictsetServiceAsync.WithRawResponse by lazy {
            DeconflictsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val diffOfArrival: DiffOfArrivalServiceAsync.WithRawResponse by lazy {
            DiffOfArrivalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val diplomaticClearance: DiplomaticClearanceServiceAsync.WithRawResponse by lazy {
            DiplomaticClearanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val driftHistory: DriftHistoryServiceAsync.WithRawResponse by lazy {
            DriftHistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dropzone: DropzoneServiceAsync.WithRawResponse by lazy {
            DropzoneServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ecpedr: EcpedrServiceAsync.WithRawResponse by lazy {
            EcpedrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val effectRequests: EffectRequestServiceAsync.WithRawResponse by lazy {
            EffectRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val effectResponses: EffectResponseServiceAsync.WithRawResponse by lazy {
            EffectResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val elsets: ElsetServiceAsync.WithRawResponse by lazy {
            ElsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emireport: EmireportServiceAsync.WithRawResponse by lazy {
            EmireportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emitterGeolocation: EmitterGeolocationServiceAsync.WithRawResponse by lazy {
            EmitterGeolocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val engineDetails: EngineDetailServiceAsync.WithRawResponse by lazy {
            EngineDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val engines: EngineServiceAsync.WithRawResponse by lazy {
            EngineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityServiceAsync.WithRawResponse by lazy {
            EntityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eop: EopServiceAsync.WithRawResponse by lazy {
            EopServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemeris: EphemerisServiceAsync.WithRawResponse by lazy {
            EphemerisServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemerisSets: EphemerisSetServiceAsync.WithRawResponse by lazy {
            EphemerisSetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val equipment: EquipmentServiceAsync.WithRawResponse by lazy {
            EquipmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val equipmentRemarks: EquipmentRemarkServiceAsync.WithRawResponse by lazy {
            EquipmentRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val evac: EvacServiceAsync.WithRawResponse by lazy {
            EvacServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventEvolution: EventEvolutionServiceAsync.WithRawResponse by lazy {
            EventEvolutionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val featureAssessment: FeatureAssessmentServiceAsync.WithRawResponse by lazy {
            FeatureAssessmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val flightplan: FlightplanServiceAsync.WithRawResponse by lazy {
            FlightplanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val geoStatus: GeoStatusServiceAsync.WithRawResponse by lazy {
            GeoStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalAtmosphericModel:
            GlobalAtmosphericModelServiceAsync.WithRawResponse by lazy {
            GlobalAtmosphericModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssObservations: GnssObservationServiceAsync.WithRawResponse by lazy {
            GnssObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssObservationset: GnssObservationsetServiceAsync.WithRawResponse by lazy {
            GnssObservationsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssRawIf: GnssRawIfServiceAsync.WithRawResponse by lazy {
            GnssRawIfServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groundImagery: GroundImageryServiceAsync.WithRawResponse by lazy {
            GroundImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val h3Geo: H3GeoServiceAsync.WithRawResponse by lazy {
            H3GeoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val h3GeoHexCell: H3GeoHexCellServiceAsync.WithRawResponse by lazy {
            H3GeoHexCellServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val hazard: HazardServiceAsync.WithRawResponse by lazy {
            HazardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ionoObservations: IonoObservationServiceAsync.WithRawResponse by lazy {
            IonoObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ir: IrServiceAsync.WithRawResponse by lazy {
            IrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val isrCollections: IsrCollectionServiceAsync.WithRawResponse by lazy {
            IsrCollectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val item: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val itemTrackings: ItemTrackingServiceAsync.WithRawResponse by lazy {
            ItemTrackingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val laserdeconflictrequest:
            LaserdeconflictrequestServiceAsync.WithRawResponse by lazy {
            LaserdeconflictrequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val laseremitter: LaseremitterServiceAsync.WithRawResponse by lazy {
            LaseremitterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchDetection: LaunchDetectionServiceAsync.WithRawResponse by lazy {
            LaunchDetectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchEvent: LaunchEventServiceAsync.WithRawResponse by lazy {
            LaunchEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchSite: LaunchSiteServiceAsync.WithRawResponse by lazy {
            LaunchSiteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchSiteDetails: LaunchSiteDetailServiceAsync.WithRawResponse by lazy {
            LaunchSiteDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchVehicle: LaunchVehicleServiceAsync.WithRawResponse by lazy {
            LaunchVehicleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchVehicleDetails: LaunchVehicleDetailServiceAsync.WithRawResponse by lazy {
            LaunchVehicleDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkStatus: LinkStatusServiceAsync.WithRawResponse by lazy {
            LinkStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkstatus: LinkstatusServiceAsync.WithRawResponse by lazy {
            LinkstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationServiceAsync.WithRawResponse by lazy {
            LocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val logisticsSupport: LogisticsSupportServiceAsync.WithRawResponse by lazy {
            LogisticsSupportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val maneuvers: ManeuverServiceAsync.WithRawResponse by lazy {
            ManeuverServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val manifold: ManifoldServiceAsync.WithRawResponse by lazy {
            ManifoldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val manifoldelset: ManifoldelsetServiceAsync.WithRawResponse by lazy {
            ManifoldelsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val missileTracks: MissileTrackServiceAsync.WithRawResponse by lazy {
            MissileTrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val missionAssignment: MissionAssignmentServiceAsync.WithRawResponse by lazy {
            MissionAssignmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mti: MtiServiceAsync.WithRawResponse by lazy {
            MtiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigation: NavigationServiceAsync.WithRawResponse by lazy {
            NavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigationalObstruction:
            NavigationalObstructionServiceAsync.WithRawResponse by lazy {
            NavigationalObstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notification: NotificationServiceAsync.WithRawResponse by lazy {
            NotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectOfInterest: ObjectOfInterestServiceAsync.WithRawResponse by lazy {
            ObjectOfInterestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val observations: ObservationServiceAsync.WithRawResponse by lazy {
            ObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onboardnavigation: OnboardnavigationServiceAsync.WithRawResponse by lazy {
            OnboardnavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbit: OnorbitServiceAsync.WithRawResponse by lazy {
            OnorbitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitantenna: OnorbitantennaServiceAsync.WithRawResponse by lazy {
            OnorbitantennaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitbattery: OnorbitbatteryServiceAsync.WithRawResponse by lazy {
            OnorbitbatteryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitdetails: OnorbitdetailServiceAsync.WithRawResponse by lazy {
            OnorbitdetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitevent: OnorbiteventServiceAsync.WithRawResponse by lazy {
            OnorbiteventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitlist: OnorbitlistServiceAsync.WithRawResponse by lazy {
            OnorbitlistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitsolararray: OnorbitsolararrayServiceAsync.WithRawResponse by lazy {
            OnorbitsolararrayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitthruster: OnorbitthrusterServiceAsync.WithRawResponse by lazy {
            OnorbitthrusterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitthrusterstatus:
            OnorbitthrusterstatusServiceAsync.WithRawResponse by lazy {
            OnorbitthrusterstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitassessment: OnorbitassessmentServiceAsync.WithRawResponse by lazy {
            OnorbitassessmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatingunit: OperatingunitServiceAsync.WithRawResponse by lazy {
            OperatingunitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatingunitremark: OperatingunitremarkServiceAsync.WithRawResponse by lazy {
            OperatingunitremarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orbitdetermination: OrbitdeterminationServiceAsync.WithRawResponse by lazy {
            OrbitdeterminationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orbittrack: OrbittrackServiceAsync.WithRawResponse by lazy {
            OrbittrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organization: OrganizationServiceAsync.WithRawResponse by lazy {
            OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizationdetails: OrganizationdetailServiceAsync.WithRawResponse by lazy {
            OrganizationdetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val personnelrecovery: PersonnelrecoveryServiceAsync.WithRawResponse by lazy {
            PersonnelrecoveryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val poi: PoiServiceAsync.WithRawResponse by lazy {
            PoiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val port: PortServiceAsync.WithRawResponse by lazy {
            PortServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reportAndActivities: ReportAndActivityServiceAsync.WithRawResponse by lazy {
            ReportAndActivityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfBand: RfBandServiceAsync.WithRawResponse by lazy {
            RfBandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfBandType: RfBandTypeServiceAsync.WithRawResponse by lazy {
            RfBandTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfEmitter: RfEmitterServiceAsync.WithRawResponse by lazy {
            RfEmitterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routeStats: RouteStatServiceAsync.WithRawResponse by lazy {
            RouteStatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sarObservation: SarObservationServiceAsync.WithRawResponse by lazy {
            SarObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scientific: ScientificServiceAsync.WithRawResponse by lazy {
            ScientificServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scs: ScServiceAsync.WithRawResponse by lazy {
            ScServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val secureMessaging: SecureMessagingServiceAsync.WithRawResponse by lazy {
            SecureMessagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensor: SensorServiceAsync.WithRawResponse by lazy {
            SensorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorStating: SensorStatingServiceAsync.WithRawResponse by lazy {
            SensorStatingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorMaintenance: SensorMaintenanceServiceAsync.WithRawResponse by lazy {
            SensorMaintenanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorObservationType:
            SensorObservationTypeServiceAsync.WithRawResponse by lazy {
            SensorObservationTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorPlan: SensorPlanServiceAsync.WithRawResponse by lazy {
            SensorPlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorType: SensorTypeServiceAsync.WithRawResponse by lazy {
            SensorTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataCommDetails: SeraDataCommDetailServiceAsync.WithRawResponse by lazy {
            SeraDataCommDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataEarlyWarning: SeraDataEarlyWarningServiceAsync.WithRawResponse by lazy {
            SeraDataEarlyWarningServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataNavigation: SeraDataNavigationServiceAsync.WithRawResponse by lazy {
            SeraDataNavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataOpticalPayload:
            SeradataOpticalPayloadServiceAsync.WithRawResponse by lazy {
            SeradataOpticalPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataRadarPayload: SeradataRadarPayloadServiceAsync.WithRawResponse by lazy {
            SeradataRadarPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataSigintPayload:
            SeradataSigintPayloadServiceAsync.WithRawResponse by lazy {
            SeradataSigintPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataSpacecraftDetails:
            SeradataSpacecraftDetailServiceAsync.WithRawResponse by lazy {
            SeradataSpacecraftDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sgi: SgiServiceAsync.WithRawResponse by lazy {
            SgiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sigact: SigactServiceAsync.WithRawResponse by lazy {
            SigactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val site: SiteServiceAsync.WithRawResponse by lazy {
            SiteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteRemark: SiteRemarkServiceAsync.WithRawResponse by lazy {
            SiteRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteStatus: SiteStatusServiceAsync.WithRawResponse by lazy {
            SiteStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val skyImagery: SkyImageryServiceAsync.WithRawResponse by lazy {
            SkyImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val soiObservationSet: SoiObservationSetServiceAsync.WithRawResponse by lazy {
            SoiObservationSetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val solarArray: SolarArrayServiceAsync.WithRawResponse by lazy {
            SolarArrayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val solarArrayDetails: SolarArrayDetailServiceAsync.WithRawResponse by lazy {
            SolarArrayDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sortiePpr: SortiePprServiceAsync.WithRawResponse by lazy {
            SortiePprServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val spaceEnvObservation: SpaceEnvObservationServiceAsync.WithRawResponse by lazy {
            SpaceEnvObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stage: StageServiceAsync.WithRawResponse by lazy {
            StageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val starCatalog: StarCatalogServiceAsync.WithRawResponse by lazy {
            StarCatalogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stateVector: StateVectorServiceAsync.WithRawResponse by lazy {
            StateVectorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val status: StatusServiceAsync.WithRawResponse by lazy {
            StatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val substatus: SubstatusServiceAsync.WithRawResponse by lazy {
            SubstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val supportingData: SupportingDataServiceAsync.WithRawResponse by lazy {
            SupportingDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val surface: SurfaceServiceAsync.WithRawResponse by lazy {
            SurfaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val surfaceObstruction: SurfaceObstructionServiceAsync.WithRawResponse by lazy {
            SurfaceObstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val swir: SwirServiceAsync.WithRawResponse by lazy {
            SwirServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val taiUtc: TaiUtcServiceAsync.WithRawResponse by lazy {
            TaiUtcServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tdoaFdoa: TdoaFdoaServiceAsync.WithRawResponse by lazy {
            TdoaFdoaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val track: TrackServiceAsync.WithRawResponse by lazy {
            TrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val trackDetails: TrackDetailServiceAsync.WithRawResponse by lazy {
            TrackDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val trackRoute: TrackRouteServiceAsync.WithRawResponse by lazy {
            TrackRouteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transponder: TransponderServiceAsync.WithRawResponse by lazy {
            TransponderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vessel: VesselServiceAsync.WithRawResponse by lazy {
            VesselServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val video: VideoServiceAsync.WithRawResponse by lazy {
            VideoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val weatherData: WeatherDataServiceAsync.WithRawResponse by lazy {
            WeatherDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val weatherReport: WeatherReportServiceAsync.WithRawResponse by lazy {
            WeatherReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnifieddatalibraryClientAsync.WithRawResponse =
            UnifieddatalibraryClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airEvents(): AirEventServiceAsync.WithRawResponse = airEvents

        override fun airOperations(): AirOperationServiceAsync.WithRawResponse = airOperations

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airTransportMissions(): AirTransportMissionServiceAsync.WithRawResponse =
            airTransportMissions

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        override fun aircraft(): AircraftServiceAsync.WithRawResponse = aircraft

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun aircraftSorties(): AircraftSortyServiceAsync.WithRawResponse = aircraftSorties

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        override fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync.WithRawResponse =
            aircraftStatusRemarks

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        override fun aircraftStatuses(): AircraftStatusServiceAsync.WithRawResponse =
            aircraftStatuses

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfieldSlotConsumptions():
            AirfieldSlotConsumptionServiceAsync.WithRawResponse = airfieldSlotConsumptions

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfieldSlots(): AirfieldSlotServiceAsync.WithRawResponse = airfieldSlots

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfieldStatus(): AirfieldStatusServiceAsync.WithRawResponse = airfieldStatus

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfields(): AirfieldServiceAsync.WithRawResponse = airfields

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airloadPlans(): AirloadPlanServiceAsync.WithRawResponse = airloadPlans

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airspaceControlOrders(): AirspaceControlOrderServiceAsync.WithRawResponse =
            airspaceControlOrders

        /**
         * These services provide for posting and querying of self-reported information obtained
         * from the Automatic Identification System (AIS) equipment. This contains information such
         * as unique identification, status, position, course, and speed. The AIS is an automatic
         * tracking system that uses transceivers on ships and is used by vessel traffic services.
         * Although technically and operationally distinct, the AIS system is analogous to ADS-B
         * which performs a similar function for aircraft. AIS is intended to assist a vessel's
         * watchstanding officers and allow maritime authorities to track and monitor vessel
         * movements. AIS integrates a standardized VHF transceiver with a positioning system, such
         * as Global Positioning System receiver, with other electronic navigation sensors, such as
         * gyrocompass or rate of turn indicator. Vessels fitted with AIS transceivers can be
         * tracked by AIS base stations located along coastlines or, when out of range of
         * terrestrial networks, through a growing number of satellites that are fitted with special
         * AIS receivers that are capable of deconflicting a large number of signatures.
         */
        override fun ais(): AiServiceAsync.WithRawResponse = ais

        /**
         * These services provide for posting and querying of self-reported information obtained
         * from the Automatic Identification System (AIS) equipment. This contains information such
         * as unique identification, status, position, course, and speed. The AIS is an automatic
         * tracking system that uses transceivers on ships and is used by vessel traffic services.
         * Although technically and operationally distinct, the AIS system is analogous to ADS-B
         * which performs a similar function for aircraft. AIS is intended to assist a vessel's
         * watchstanding officers and allow maritime authorities to track and monitor vessel
         * movements. AIS integrates a standardized VHF transceiver with a positioning system, such
         * as Global Positioning System receiver, with other electronic navigation sensors, such as
         * gyrocompass or rate of turn indicator. Vessels fitted with AIS transceivers can be
         * tracked by AIS base stations located along coastlines or, when out of range of
         * terrestrial networks, through a growing number of satellites that are fitted with special
         * AIS receivers that are capable of deconflicting a large number of signatures.
         */
        override fun aisObjects(): AisObjectServiceAsync.WithRawResponse = aisObjects

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun analyticImagery(): AnalyticImageryServiceAsync.WithRawResponse =
            analyticImagery

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun antennas(): AntennaServiceAsync.WithRawResponse = antennas

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun attitudeData(): AttitudeDataServiceAsync.WithRawResponse = attitudeData

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun attitudeSets(): AttitudeSetServiceAsync.WithRawResponse = attitudeSets

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun aviationRiskManagement(): AviationRiskManagementServiceAsync.WithRawResponse =
            aviationRiskManagement

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun batteries(): BatteryServiceAsync.WithRawResponse = batteries

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun batterydetails(): BatterydetailServiceAsync.WithRawResponse = batterydetails

        /**
         * This collection of services provides operations for querying and manipulation of
         * satellite antenna beams, and querying of beam contours and service areas. Beam contours
         * are the geographic representation of the relative gain levels of beam power off of the
         * maximum gain boresight points. Similarly, service areas are the geographic footprints of
         * the areas served by a particular beam, and may be made up of multiple service regions.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        override fun beam(): BeamServiceAsync.WithRawResponse = beam

        /**
         * This collection of services provides operations for querying and manipulation of
         * satellite antenna beams, and querying of beam contours and service areas. Beam contours
         * are the geographic representation of the relative gain levels of beam power off of the
         * maximum gain boresight points. Similarly, service areas are the geographic footprints of
         * the areas served by a particular beam, and may be made up of multiple service regions.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        override fun beamContours(): BeamContourServiceAsync.WithRawResponse = beamContours

        /**
         * Services for querying and manipulation of satellite buses. A bus is the physical and
         * software infrastructure backbone to which on-orbit satellite payloads are attached for
         * power, control, and other support functions.
         */
        override fun buses(): BusServiceAsync.WithRawResponse = buses

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun channels(): ChannelServiceAsync.WithRawResponse = channels

        /**
         * This collection of services provides operations for manipulating and querying of closely
         * spaced objects (on orbit) operations including docking, rendezvous, proximity and
         * reporting of payload zone engagements observed and characterized over a period of time.
         */
        override fun closelyspacedobjects(): CloselyspacedobjectServiceAsync.WithRawResponse =
            closelyspacedobjects

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun collectRequests(): CollectRequestServiceAsync.WithRawResponse = collectRequests

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun collectResponses(): CollectResponseServiceAsync.WithRawResponse =
            collectResponses

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun comm(): CommServiceAsync.WithRawResponse = comm

        /** These services provide operations for manipulation and querying of conjunctions. */
        override fun conjunctions(): ConjunctionServiceAsync.WithRawResponse = conjunctions

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun cots(): CotServiceAsync.WithRawResponse = cots

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun countries(): CountryServiceAsync.WithRawResponse = countries

        /**
         * These services provide operations for posting and querying crew data. Crew data contains
         * information about its members and their assignments.
         */
        override fun crew(): CrewServiceAsync.WithRawResponse = crew

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun deconflictset(): DeconflictsetServiceAsync.WithRawResponse = deconflictset

        /**
         * These services provide operations for querying and manipulation of Signal time and
         * frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF
         * based sensor phenomenologies and sensor triangulation. The J2000 coordinate frame is the
         * preferred frame for all observations, but in some cases observations may be in another
         * frame depending on the provider.
         */
        override fun diffOfArrival(): DiffOfArrivalServiceAsync.WithRawResponse = diffOfArrival

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun diplomaticClearance(): DiplomaticClearanceServiceAsync.WithRawResponse =
            diplomaticClearance

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun driftHistory(): DriftHistoryServiceAsync.WithRawResponse = driftHistory

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun dropzone(): DropzoneServiceAsync.WithRawResponse = dropzone

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun ecpedr(): EcpedrServiceAsync.WithRawResponse = ecpedr

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun effectRequests(): EffectRequestServiceAsync.WithRawResponse = effectRequests

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun effectResponses(): EffectResponseServiceAsync.WithRawResponse = effectResponses

        /**
         * These services provide operations for querying and manipulation of element set data
         * describing orbital characteristics of on-orbit objects. An element set is a collection of
         * parameters that are used, along with an orbit propagator, to predict the motion of a
         * satellite. The element set, or elset for short, consists of identification data, the
         * classical elements and drag parameters.
         */
        override fun elsets(): ElsetServiceAsync.WithRawResponse = elsets

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun emireport(): EmireportServiceAsync.WithRawResponse = emireport

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun emitterGeolocation(): EmitterGeolocationServiceAsync.WithRawResponse =
            emitterGeolocation

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun engineDetails(): EngineDetailServiceAsync.WithRawResponse = engineDetails

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun engines(): EngineServiceAsync.WithRawResponse = engines

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        override fun eop(): EopServiceAsync.WithRawResponse = eop

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun ephemeris(): EphemerisServiceAsync.WithRawResponse = ephemeris

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun ephemerisSets(): EphemerisSetServiceAsync.WithRawResponse = ephemerisSets

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        override fun equipment(): EquipmentServiceAsync.WithRawResponse = equipment

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        override fun equipmentRemarks(): EquipmentRemarkServiceAsync.WithRawResponse =
            equipmentRemarks

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun evac(): EvacServiceAsync.WithRawResponse = evac

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun eventEvolution(): EventEvolutionServiceAsync.WithRawResponse = eventEvolution

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun featureAssessment(): FeatureAssessmentServiceAsync.WithRawResponse =
            featureAssessment

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun flightplan(): FlightplanServiceAsync.WithRawResponse = flightplan

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun geoStatus(): GeoStatusServiceAsync.WithRawResponse = geoStatus

        /**
         * Models and Simulations is a collection of services that allow consumers to interact with
         * data products representing independent models of various phenomenon, artificial
         * intelligence models and predictions, or of mathematical parameters meant to feed mod and
         * sim tools to produce estimates of environmental entities such as atmospheric models and
         * heat maps.
         */
        override fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync.WithRawResponse =
            globalAtmosphericModel

        override fun gnssObservations(): GnssObservationServiceAsync.WithRawResponse =
            gnssObservations

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun gnssObservationset(): GnssObservationsetServiceAsync.WithRawResponse =
            gnssObservationset

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun gnssRawIf(): GnssRawIfServiceAsync.WithRawResponse = gnssRawIf

        /**
         * This collection of services provides operations for querying and manipulation of ground
         * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata
         * on the image (time, region, source, etc) as well as binary content (typically GeoTIFF).
         * Binary content must be downloaded individually by ID using the 'getFile' operation.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        override fun groundImagery(): GroundImageryServiceAsync.WithRawResponse = groundImagery

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun h3Geo(): H3GeoServiceAsync.WithRawResponse = h3Geo

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun h3GeoHexCell(): H3GeoHexCellServiceAsync.WithRawResponse = h3GeoHexCell

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun hazard(): HazardServiceAsync.WithRawResponse = hazard

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun ionoObservations(): IonoObservationServiceAsync.WithRawResponse =
            ionoObservations

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun ir(): IrServiceAsync.WithRawResponse = ir

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun isrCollections(): IsrCollectionServiceAsync.WithRawResponse = isrCollections

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun item(): ItemServiceAsync.WithRawResponse = item

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun itemTrackings(): ItemTrackingServiceAsync.WithRawResponse = itemTrackings

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        override fun laserdeconflictrequest(): LaserdeconflictrequestServiceAsync.WithRawResponse =
            laserdeconflictrequest

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        override fun laseremitter(): LaseremitterServiceAsync.WithRawResponse = laseremitter

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchDetection(): LaunchDetectionServiceAsync.WithRawResponse =
            launchDetection

        /**
         * These services provide operations for manipulation and querying of LaunchEvent data.
         * Launch Event data are known space launches, either future or historic records containing
         * items such as the launch site, launch epoch, and object.
         */
        override fun launchEvent(): LaunchEventServiceAsync.WithRawResponse = launchEvent

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchSite(): LaunchSiteServiceAsync.WithRawResponse = launchSite

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchSiteDetails(): LaunchSiteDetailServiceAsync.WithRawResponse =
            launchSiteDetails

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchVehicle(): LaunchVehicleServiceAsync.WithRawResponse = launchVehicle

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync.WithRawResponse =
            launchVehicleDetails

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        override fun linkStatus(): LinkStatusServiceAsync.WithRawResponse = linkStatus

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        override fun linkstatus(): LinkstatusServiceAsync.WithRawResponse = linkstatus

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun location(): LocationServiceAsync.WithRawResponse = location

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun logisticsSupport(): LogisticsSupportServiceAsync.WithRawResponse =
            logisticsSupport

        /**
         * This service provides operations for querying and manipulation of
         * detected/possible/confirmed on-orbit maneuvers. The J2000 coordinate frame is the
         * preferred frame for all maneuver data, but in some cases data may be in another frame
         * depending on the provider. Check the Storefront 'Data Products' section under the
         * 'Discover' tab for maneuver data provider information.
         */
        override fun maneuvers(): ManeuverServiceAsync.WithRawResponse = maneuvers

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun manifold(): ManifoldServiceAsync.WithRawResponse = manifold

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun manifoldelset(): ManifoldelsetServiceAsync.WithRawResponse = manifoldelset

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun missileTracks(): MissileTrackServiceAsync.WithRawResponse = missileTracks

        /**
         * These services provide operations for manipulation and querying of mission assignment
         * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign
         * missions, designate targets, and provide target information to non-C2 JU platforms.
         * Provision is made for the non-C2 JU platforms to acknowledge the message through
         * receipt/compliance action.
         */
        override fun missionAssignment(): MissionAssignmentServiceAsync.WithRawResponse =
            missionAssignment

        /**
         * These services provide operations for posting and querying Moving Target Indicator (MTI)
         * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less
         * detailed data for applications such as situational awareness used/derived by exploitation
         * systems.
         */
        override fun mti(): MtiServiceAsync.WithRawResponse = mti

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun navigation(): NavigationServiceAsync.WithRawResponse = navigation

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun navigationalObstruction():
            NavigationalObstructionServiceAsync.WithRawResponse = navigationalObstruction

        /**
         * A Notification Service allowing the broadcast of generic messages to the community. Users
         * can send free-form messages, publish lists, and notify the community about events or
         * alerts across various domains. Notifications and alerts are categorized by a 'msgType'
         * field and are accessible via the UDL Secure Messaging API and REST API services.
         */
        override fun notification(): NotificationServiceAsync.WithRawResponse = notification

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun objectOfInterest(): ObjectOfInterestServiceAsync.WithRawResponse =
            objectOfInterest

        override fun observations(): ObservationServiceAsync.WithRawResponse = observations

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun onboardnavigation(): OnboardnavigationServiceAsync.WithRawResponse =
            onboardnavigation

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbit(): OnorbitServiceAsync.WithRawResponse = onorbit

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitantenna(): OnorbitantennaServiceAsync.WithRawResponse = onorbitantenna

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitbattery(): OnorbitbatteryServiceAsync.WithRawResponse = onorbitbattery

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitdetails(): OnorbitdetailServiceAsync.WithRawResponse = onorbitdetails

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitevent(): OnorbiteventServiceAsync.WithRawResponse = onorbitevent

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitlist(): OnorbitlistServiceAsync.WithRawResponse = onorbitlist

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitsolararray(): OnorbitsolararrayServiceAsync.WithRawResponse =
            onorbitsolararray

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitthruster(): OnorbitthrusterServiceAsync.WithRawResponse =
            onorbitthruster

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync.WithRawResponse =
            onorbitthrusterstatus

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun onorbitassessment(): OnorbitassessmentServiceAsync.WithRawResponse =
            onorbitassessment

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun operatingunit(): OperatingunitServiceAsync.WithRawResponse = operatingunit

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun operatingunitremark(): OperatingunitremarkServiceAsync.WithRawResponse =
            operatingunitremark

        /**
         * These services provide operations for manipulating and querying Orbit Determination (OD)
         * data. Orbit Determination data contains algorithm results that describe General
         * Perturbations or Special Perturbations orbital updates.
         */
        override fun orbitdetermination(): OrbitdeterminationServiceAsync.WithRawResponse =
            orbitdetermination

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun orbittrack(): OrbittrackServiceAsync.WithRawResponse = orbittrack

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun organization(): OrganizationServiceAsync.WithRawResponse = organization

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun organizationdetails(): OrganizationdetailServiceAsync.WithRawResponse =
            organizationdetails

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun personnelrecovery(): PersonnelrecoveryServiceAsync.WithRawResponse =
            personnelrecovery

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun poi(): PoiServiceAsync.WithRawResponse = poi

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun port(): PortServiceAsync.WithRawResponse = port

        override fun reportAndActivities(): ReportAndActivityServiceAsync.WithRawResponse =
            reportAndActivities

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        override fun rfBand(): RfBandServiceAsync.WithRawResponse = rfBand

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        override fun rfBandType(): RfBandTypeServiceAsync.WithRawResponse = rfBandType

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        override fun rfEmitter(): RfEmitterServiceAsync.WithRawResponse = rfEmitter

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun routeStats(): RouteStatServiceAsync.WithRawResponse = routeStats

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun sarObservation(): SarObservationServiceAsync.WithRawResponse = sarObservation

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun scientific(): ScientificServiceAsync.WithRawResponse = scientific

        override fun scs(): ScServiceAsync.WithRawResponse = scs

        /**
         * Secure Messaging is based on Apache Kafka which is an open-source stream-processing
         * software platform developed by the Apache Software Foundation, written in Scala and Java.
         * Kafka provides a unified, high-throughput, low-latency platform for handling real-time
         * data feeds. All messaging is secured; consumers will not receive messages unless
         * authorized to do so. J2000 is the preferred coordinate frame for all observations, but in
         * some cases observations may be in another frame depending on the provider. Please see the
         * 'Discover' tab in the storefront to confirm coordinate frames by data provider.
         */
        override fun secureMessaging(): SecureMessagingServiceAsync.WithRawResponse =
            secureMessaging

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensor(): SensorServiceAsync.WithRawResponse = sensor

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorStating(): SensorStatingServiceAsync.WithRawResponse = sensorStating

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorMaintenance(): SensorMaintenanceServiceAsync.WithRawResponse =
            sensorMaintenance

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorObservationType(): SensorObservationTypeServiceAsync.WithRawResponse =
            sensorObservationType

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun sensorPlan(): SensorPlanServiceAsync.WithRawResponse = sensorPlan

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorType(): SensorTypeServiceAsync.WithRawResponse = sensorType

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun seraDataCommDetails(): SeraDataCommDetailServiceAsync.WithRawResponse =
            seraDataCommDetails

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync.WithRawResponse =
            seraDataEarlyWarning

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun seraDataNavigation(): SeraDataNavigationServiceAsync.WithRawResponse =
            seraDataNavigation

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync.WithRawResponse =
            seradataOpticalPayload

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync.WithRawResponse =
            seradataRadarPayload

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync.WithRawResponse =
            seradataSigintPayload

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun seradataSpacecraftDetails():
            SeradataSpacecraftDetailServiceAsync.WithRawResponse = seradataSpacecraftDetails

        /**
         * This service provides operations for manipulation and querying of space weather/solar,
         * geomagnetic, and radiation belt index data.
         */
        override fun sgi(): SgiServiceAsync.WithRawResponse = sgi

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun sigact(): SigactServiceAsync.WithRawResponse = sigact

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun site(): SiteServiceAsync.WithRawResponse = site

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun siteRemark(): SiteRemarkServiceAsync.WithRawResponse = siteRemark

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun siteStatus(): SiteStatusServiceAsync.WithRawResponse = siteStatus

        /**
         * This collection of services provides operations for querying and manipulation of sky
         * imagery data. Sky imagery is ground or space based telescope imagery of RSO's and
         * includes metadata on the image (time, source, etc) as well as binary image content (e.g.
         * FITS, EOSSA, EOCHIP, MP4). Binary content must be downloaded individually by ID using the
         * 'getFile' operation.
         */
        override fun skyImagery(): SkyImageryServiceAsync.WithRawResponse = skyImagery

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun soiObservationSet(): SoiObservationSetServiceAsync.WithRawResponse =
            soiObservationSet

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun solarArray(): SolarArrayServiceAsync.WithRawResponse = solarArray

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun solarArrayDetails(): SolarArrayDetailServiceAsync.WithRawResponse =
            solarArrayDetails

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun sortiePpr(): SortiePprServiceAsync.WithRawResponse = sortiePpr

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun spaceEnvObservation(): SpaceEnvObservationServiceAsync.WithRawResponse =
            spaceEnvObservation

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun stage(): StageServiceAsync.WithRawResponse = stage

        /**
         * These services provide operations for posting and querying Star Catalog data. The Star
         * Catalog model is a representation of astronomical data and photometric data for stars.
         * Astronomical data includes positional information, proper motions, parallaxes and their
         * respective uncertainties. Photometric data contains optical and near-infrared magnitudes,
         * and their uncertainties across multiple bandpasses. Note: Multiple source catalogs may
         * contribute to a single record.
         */
        override fun starCatalog(): StarCatalogServiceAsync.WithRawResponse = starCatalog

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * On-orbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that together with their time (epoch) (t) uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         */
        override fun stateVector(): StateVectorServiceAsync.WithRawResponse = stateVector

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun status(): StatusServiceAsync.WithRawResponse = status

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun substatus(): SubstatusServiceAsync.WithRawResponse = substatus

        override fun supportingData(): SupportingDataServiceAsync.WithRawResponse = supportingData

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun surface(): SurfaceServiceAsync.WithRawResponse = surface

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun surfaceObstruction(): SurfaceObstructionServiceAsync.WithRawResponse =
            surfaceObstruction

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun swir(): SwirServiceAsync.WithRawResponse = swir

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        override fun taiUtc(): TaiUtcServiceAsync.WithRawResponse = taiUtc

        override fun tdoaFdoa(): TdoaFdoaServiceAsync.WithRawResponse = tdoaFdoa

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun track(): TrackServiceAsync.WithRawResponse = track

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun trackDetails(): TrackDetailServiceAsync.WithRawResponse = trackDetails

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun trackRoute(): TrackRouteServiceAsync.WithRawResponse = trackRoute

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun transponder(): TransponderServiceAsync.WithRawResponse = transponder

        override fun user(): UserServiceAsync.WithRawResponse = user

        /**
         * This service provides operations for manipulation and querying of maritime Vessel and
         * Vessel Status data. Vessel contains the static data of the specific vessel: mmsi, cruise
         * speed, max speed, etc.
         */
        override fun vessel(): VesselServiceAsync.WithRawResponse = vessel

        /** This collection of services provides operations for video streaming. */
        override fun video(): VideoServiceAsync.WithRawResponse = video

        /**
         * These services provide for posting and querying terrestrial weather conditions over a
         * target area or region and raw sensor data used to produce condition reports. Weather
         * Reports describe current weather conditions over a target point or region to include
         * general temperatures, pressures, and moisture accumulation, as well as navigational
         * considerations such as altimeter settings, visibility, wind speeds, and cloud heights
         * etc. Weather Data contains algorithmic parameters and dynamic, raw measurements collected
         * by individual sensors such as signal power, noise level, etc., which are generally
         * processed across multiple sensors to produce weather reports.
         */
        override fun weatherData(): WeatherDataServiceAsync.WithRawResponse = weatherData

        /**
         * These services provide for posting and querying terrestrial weather conditions over a
         * target area or region and raw sensor data used to produce condition reports. Weather
         * Reports describe current weather conditions over a target point or region to include
         * general temperatures, pressures, and moisture accumulation, as well as navigational
         * considerations such as altimeter settings, visibility, wind speeds, and cloud heights
         * etc. Weather Data contains algorithmic parameters and dynamic, raw measurements collected
         * by individual sensors such as signal power, noise level, etc., which are generally
         * processed across multiple sensors to produce weather reports.
         */
        override fun weatherReport(): WeatherReportServiceAsync.WithRawResponse = weatherReport
    }
}
