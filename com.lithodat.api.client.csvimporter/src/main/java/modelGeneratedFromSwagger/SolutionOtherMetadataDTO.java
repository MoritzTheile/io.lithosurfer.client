/*
 * Lithosurfer API: Geochem model
 * Please have a look at the <a href=\"https://docs.google.com/presentation/d/1XcjHiopwNzasUvwC_7UZlkou82tfstEdqGZxqXITV3s/edit?usp=sharing\">High Level Docs</a> for getting the whole picture.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@lithosurfer.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package modelGeneratedFromSwagger;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * @lithoModule [ICPMS] @lithoProfile [CHILD] @lithoParent [ICPMSMetadata] @lithoDocumentation [] @lithoLabel []
 */
@ApiModel(description = "@lithoModule [ICPMS] @lithoProfile [CHILD] @lithoParent [ICPMSMetadata] @lithoDocumentation [] @lithoLabel []")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-07T06:47:05.458Z")
public class SolutionOtherMetadataDTO {
  @SerializedName("additionalGas")
  private String additionalGas = null;

  @SerializedName("additionalGasFlow")
  private Float additionalGasFlow = null;

  @SerializedName("analyticalSequence")
  private String analyticalSequence = null;

  @SerializedName("aquisitionDuration")
  private Integer aquisitionDuration = null;

  @SerializedName("calibratingReferenceMaterial")
  private String calibratingReferenceMaterial = null;

  @SerializedName("calibrationStrategy")
  private String calibrationStrategy = null;

  @SerializedName("carrierGasETV")
  private String carrierGasETV = null;

  @SerializedName("carrierGasFlowETV")
  private Float carrierGasFlowETV = null;

  @SerializedName("carrierGasFlowHG")
  private Float carrierGasFlowHG = null;

  @SerializedName("carrierGasHG")
  private String carrierGasHG = null;

  @SerializedName("chemicalModifierETV")
  private String chemicalModifierETV = null;

  @SerializedName("concentrationHCl")
  private Float concentrationHCl = null;

  @SerializedName("concentrationNaBH4")
  private Float concentrationNaBH4 = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dilutionFactors")
  private String dilutionFactors = null;

  @SerializedName("icpmsmetadataId")
  private Long icpmsmetadataId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("nebGasFlow")
  private Float nebGasFlow = null;

  @SerializedName("peltierTemp")
  private Float peltierTemp = null;

  @SerializedName("sampleWeightETV")
  private Float sampleWeightETV = null;

  @SerializedName("solutionInternalStandard")
  private String solutionInternalStandard = null;

  @SerializedName("solutionIntroSystemId")
  private Long solutionIntroSystemId = null;

  @SerializedName("solutionIntroSystemInfo")
  private String solutionIntroSystemInfo = null;

  @SerializedName("solutionIntroSystemName")
  private String solutionIntroSystemName = null;

  @SerializedName("solutionUptake")
  private Float solutionUptake = null;

  @SerializedName("solutionVolumeETV")
  private Float solutionVolumeETV = null;

  @SerializedName("sweepGasFlow")
  private Float sweepGasFlow = null;

  @SerializedName("tempStepsETV")
  private String tempStepsETV = null;

  @SerializedName("tubingMaterialId")
  private Long tubingMaterialId = null;

  @SerializedName("tubingMaterialInternalDiameterId")
  private Long tubingMaterialInternalDiameterId = null;

  @SerializedName("tubingMaterialInternalDiameterName")
  private String tubingMaterialInternalDiameterName = null;

  @SerializedName("tubingMaterialLength")
  private Float tubingMaterialLength = null;

  @SerializedName("tubingMaterialName")
  private String tubingMaterialName = null;

  @SerializedName("uptakeHCl")
  private Float uptakeHCl = null;

  @SerializedName("uptakeNaBH4")
  private Float uptakeNaBH4 = null;

  @SerializedName("washTime")
  private Integer washTime = null;

  public SolutionOtherMetadataDTO additionalGas(String additionalGas) {
    this.additionalGas = additionalGas;
    return this;
  }

   /**
   * @lithoLabel [Additional Gas (e.g. nitrogen) (desolvator only)] @lithoDocumentation [Type of additional carrier gas (e.g. N2, H)]
   * @return additionalGas
  **/
  @ApiModelProperty(value = "@lithoLabel [Additional Gas (e.g. nitrogen) (desolvator only)] @lithoDocumentation [Type of additional carrier gas (e.g. N2, H)]")
  public String getAdditionalGas() {
    return additionalGas;
  }

  public void setAdditionalGas(String additionalGas) {
    this.additionalGas = additionalGas;
  }

  public SolutionOtherMetadataDTO additionalGasFlow(Float additionalGasFlow) {
    this.additionalGasFlow = additionalGasFlow;
    return this;
  }

   /**
   * @lithoLabel [Additional Gas Flow (ml.min-1) (desolvator only)] @lithoDocumentation [Flow of additional carrier gas (ml.m-1)]
   * @return additionalGasFlow
  **/
  @ApiModelProperty(value = "@lithoLabel [Additional Gas Flow (ml.min-1) (desolvator only)] @lithoDocumentation [Flow of additional carrier gas (ml.m-1)]")
  public Float getAdditionalGasFlow() {
    return additionalGasFlow;
  }

  public void setAdditionalGasFlow(Float additionalGasFlow) {
    this.additionalGasFlow = additionalGasFlow;
  }

  public SolutionOtherMetadataDTO analyticalSequence(String analyticalSequence) {
    this.analyticalSequence = analyticalSequence;
    return this;
  }

   /**
   * @lithoLabel [Analytical sequence] @lithoDocumentation [Description of the analytical sequence/run. E.g. Sequence is composed of 2 procedurial blanks, 11 unknown, 2 BCR-2, bracketed by 2 duplicates of BHVO-2 ran as calibration solution]
   * @return analyticalSequence
  **/
  @ApiModelProperty(value = "@lithoLabel [Analytical sequence] @lithoDocumentation [Description of the analytical sequence/run. E.g. Sequence is composed of 2 procedurial blanks, 11 unknown, 2 BCR-2, bracketed by 2 duplicates of BHVO-2 ran as calibration solution]")
  public String getAnalyticalSequence() {
    return analyticalSequence;
  }

  public void setAnalyticalSequence(String analyticalSequence) {
    this.analyticalSequence = analyticalSequence;
  }

  public SolutionOtherMetadataDTO aquisitionDuration(Integer aquisitionDuration) {
    this.aquisitionDuration = aquisitionDuration;
    return this;
  }

   /**
   * @lithoLabel [Acquisition Duration (s)] @lithoDocumentation [Duration of signal acquisition on solution (s)]
   * @return aquisitionDuration
  **/
  @ApiModelProperty(value = "@lithoLabel [Acquisition Duration (s)] @lithoDocumentation [Duration of signal acquisition on solution (s)]")
  public Integer getAquisitionDuration() {
    return aquisitionDuration;
  }

  public void setAquisitionDuration(Integer aquisitionDuration) {
    this.aquisitionDuration = aquisitionDuration;
  }

  public SolutionOtherMetadataDTO calibratingReferenceMaterial(String calibratingReferenceMaterial) {
    this.calibratingReferenceMaterial = calibratingReferenceMaterial;
    return this;
  }

   /**
   * @lithoLabel [Calibrating Reference Material/Solution] @lithoDocumentation [Calibrating solution used e.g. BHVO-2; custom made solution using (e.g selenium (25 ppb) + tellurium (20 ppb) + arsenic (20 ppb))]
   * @return calibratingReferenceMaterial
  **/
  @ApiModelProperty(value = "@lithoLabel [Calibrating Reference Material/Solution] @lithoDocumentation [Calibrating solution used e.g. BHVO-2; custom made solution using (e.g selenium (25 ppb) + tellurium (20 ppb) + arsenic (20 ppb))]")
  public String getCalibratingReferenceMaterial() {
    return calibratingReferenceMaterial;
  }

  public void setCalibratingReferenceMaterial(String calibratingReferenceMaterial) {
    this.calibratingReferenceMaterial = calibratingReferenceMaterial;
  }

  public SolutionOtherMetadataDTO calibrationStrategy(String calibrationStrategy) {
    this.calibrationStrategy = calibrationStrategy;
    return this;
  }

   /**
   * @lithoLabel [Calibration Strategy] @lithoDocumentation [Strategy used for calibration of the instrument and quantification (e.g. external calibration; single internal standard addition; multiple internal standard addition; enriched isotopes addition; etc)]
   * @return calibrationStrategy
  **/
  @ApiModelProperty(value = "@lithoLabel [Calibration Strategy] @lithoDocumentation [Strategy used for calibration of the instrument and quantification (e.g. external calibration; single internal standard addition; multiple internal standard addition; enriched isotopes addition; etc)]")
  public String getCalibrationStrategy() {
    return calibrationStrategy;
  }

  public void setCalibrationStrategy(String calibrationStrategy) {
    this.calibrationStrategy = calibrationStrategy;
  }

  public SolutionOtherMetadataDTO carrierGasETV(String carrierGasETV) {
    this.carrierGasETV = carrierGasETV;
    return this;
  }

   /**
   * @lithoLabel [ETV Carrier Gas (e.g. argon, helium)] @lithoDocumentation [ETV Carrier Gas (e.g. argon, helium)]
   * @return carrierGasETV
  **/
  @ApiModelProperty(value = "@lithoLabel [ETV Carrier Gas (e.g. argon, helium)] @lithoDocumentation [ETV Carrier Gas (e.g. argon, helium)]")
  public String getCarrierGasETV() {
    return carrierGasETV;
  }

  public void setCarrierGasETV(String carrierGasETV) {
    this.carrierGasETV = carrierGasETV;
  }

  public SolutionOtherMetadataDTO carrierGasFlowETV(Float carrierGasFlowETV) {
    this.carrierGasFlowETV = carrierGasFlowETV;
    return this;
  }

   /**
   * @lithoLabel [ETV Carrier Gas Flow (l.min-1)] @lithoDocumentation [ETV Carrier Gas Flow (l.min-1) transporting analyte from furnace to ICP torch (e.g. 0.7 l.min-1)]
   * @return carrierGasFlowETV
  **/
  @ApiModelProperty(value = "@lithoLabel [ETV Carrier Gas Flow (l.min-1)] @lithoDocumentation [ETV Carrier Gas Flow (l.min-1) transporting analyte from furnace to ICP torch (e.g. 0.7 l.min-1)]")
  public Float getCarrierGasFlowETV() {
    return carrierGasFlowETV;
  }

  public void setCarrierGasFlowETV(Float carrierGasFlowETV) {
    this.carrierGasFlowETV = carrierGasFlowETV;
  }

  public SolutionOtherMetadataDTO carrierGasFlowHG(Float carrierGasFlowHG) {
    this.carrierGasFlowHG = carrierGasFlowHG;
    return this;
  }

   /**
   * @lithoLabel [Hydride Generator Carrier Gas Flow (l.min-1)] @lithoDocumentation [HG Carrier Gas Flow (l.min-1) transporting analyte from HG to ICP torch (e.g. 0.7 l.min-1)]
   * @return carrierGasFlowHG
  **/
  @ApiModelProperty(value = "@lithoLabel [Hydride Generator Carrier Gas Flow (l.min-1)] @lithoDocumentation [HG Carrier Gas Flow (l.min-1) transporting analyte from HG to ICP torch (e.g. 0.7 l.min-1)]")
  public Float getCarrierGasFlowHG() {
    return carrierGasFlowHG;
  }

  public void setCarrierGasFlowHG(Float carrierGasFlowHG) {
    this.carrierGasFlowHG = carrierGasFlowHG;
  }

  public SolutionOtherMetadataDTO carrierGasHG(String carrierGasHG) {
    this.carrierGasHG = carrierGasHG;
    return this;
  }

   /**
   * @lithoLabel [Hydride Generator Carrier Gas (e.g. argon, helium)] @lithoDocumentation [Hydride Generator Carrier Gas (e.g. argon, helium)]
   * @return carrierGasHG
  **/
  @ApiModelProperty(value = "@lithoLabel [Hydride Generator Carrier Gas (e.g. argon, helium)] @lithoDocumentation [Hydride Generator Carrier Gas (e.g. argon, helium)]")
  public String getCarrierGasHG() {
    return carrierGasHG;
  }

  public void setCarrierGasHG(String carrierGasHG) {
    this.carrierGasHG = carrierGasHG;
  }

  public SolutionOtherMetadataDTO chemicalModifierETV(String chemicalModifierETV) {
    this.chemicalModifierETV = chemicalModifierETV;
    return this;
  }

   /**
   * @lithoLabel [Chemical Modifier used and Weight (µg) or Volume (µl) (ETV only)] @lithoDocumentation [Chemical Modifier used and Weight (µg) or Volume (µl) (ETV only) e.g. ascorbic acid (300 µg) + Pd (1 µg)]
   * @return chemicalModifierETV
  **/
  @ApiModelProperty(value = "@lithoLabel [Chemical Modifier used and Weight (µg) or Volume (µl) (ETV only)] @lithoDocumentation [Chemical Modifier used and Weight (µg) or Volume (µl) (ETV only) e.g. ascorbic acid (300 µg) + Pd (1 µg)]")
  public String getChemicalModifierETV() {
    return chemicalModifierETV;
  }

  public void setChemicalModifierETV(String chemicalModifierETV) {
    this.chemicalModifierETV = chemicalModifierETV;
  }

  public SolutionOtherMetadataDTO concentrationHCl(Float concentrationHCl) {
    this.concentrationHCl = concentrationHCl;
    return this;
  }

   /**
   * @lithoLabel [HCl concentration (M) (hydride generator only)] @lithoDocumentation [HCl concentration (M) (hydride generator only)]
   * @return concentrationHCl
  **/
  @ApiModelProperty(value = "@lithoLabel [HCl concentration (M) (hydride generator only)] @lithoDocumentation [HCl concentration (M) (hydride generator only)]")
  public Float getConcentrationHCl() {
    return concentrationHCl;
  }

  public void setConcentrationHCl(Float concentrationHCl) {
    this.concentrationHCl = concentrationHCl;
  }

  public SolutionOtherMetadataDTO concentrationNaBH4(Float concentrationNaBH4) {
    this.concentrationNaBH4 = concentrationNaBH4;
    return this;
  }

   /**
   * @lithoLabel [NaBH4 Concentration (% (w/v)) (hydride generator only)] @lithoDocumentation [NaBH4 Concentration (% (w/v)) (hydride generator only)]
   * @return concentrationNaBH4
  **/
  @ApiModelProperty(value = "@lithoLabel [NaBH4 Concentration (% (w/v)) (hydride generator only)] @lithoDocumentation [NaBH4 Concentration (% (w/v)) (hydride generator only)]")
  public Float getConcentrationNaBH4() {
    return concentrationNaBH4;
  }

  public void setConcentrationNaBH4(Float concentrationNaBH4) {
    this.concentrationNaBH4 = concentrationNaBH4;
  }

  public SolutionOtherMetadataDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * @lithoLabel [Comments/additional Information] @lithoDocumentation [Additional information about Solution analytical methods]
   * @return description
  **/
  @ApiModelProperty(value = "@lithoLabel [Comments/additional Information] @lithoDocumentation [Additional information about Solution analytical methods]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SolutionOtherMetadataDTO dilutionFactors(String dilutionFactors) {
    this.dilutionFactors = dilutionFactors;
    return this;
  }

   /**
   * @lithoLabel [Dilution Factors] @lithoDocumentation [Dilution factors used e.g. BHVO-2 dilution factor 6000; blanks dilution factor 1000; sample dilution factor 4000]
   * @return dilutionFactors
  **/
  @ApiModelProperty(value = "@lithoLabel [Dilution Factors] @lithoDocumentation [Dilution factors used e.g. BHVO-2 dilution factor 6000; blanks dilution factor 1000; sample dilution factor 4000]")
  public String getDilutionFactors() {
    return dilutionFactors;
  }

  public void setDilutionFactors(String dilutionFactors) {
    this.dilutionFactors = dilutionFactors;
  }

  public SolutionOtherMetadataDTO icpmsmetadataId(Long icpmsmetadataId) {
    this.icpmsmetadataId = icpmsmetadataId;
    return this;
  }

   /**
   * Get icpmsmetadataId
   * @return icpmsmetadataId
  **/
  @ApiModelProperty(value = "")
  public Long getIcpmsmetadataId() {
    return icpmsmetadataId;
  }

  public void setIcpmsmetadataId(Long icpmsmetadataId) {
    this.icpmsmetadataId = icpmsmetadataId;
  }

  public SolutionOtherMetadataDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SolutionOtherMetadataDTO nebGasFlow(Float nebGasFlow) {
    this.nebGasFlow = nebGasFlow;
    return this;
  }

   /**
   * @lithoLabel [Nebuliser Gas Flow (l.min-1)] @lithoDocumentation [Nebuliser gas flow (l.min-1)]
   * @return nebGasFlow
  **/
  @ApiModelProperty(value = "@lithoLabel [Nebuliser Gas Flow (l.min-1)] @lithoDocumentation [Nebuliser gas flow (l.min-1)]")
  public Float getNebGasFlow() {
    return nebGasFlow;
  }

  public void setNebGasFlow(Float nebGasFlow) {
    this.nebGasFlow = nebGasFlow;
  }

  public SolutionOtherMetadataDTO peltierTemp(Float peltierTemp) {
    this.peltierTemp = peltierTemp;
    return this;
  }

   /**
   * @lithoLabel [Peltier Temperature (ºC) (cyclonic spray chamber - wet plasma only)] @lithoDocumentation [Temperature in ºC of Peltier element for cyclonic spray chamber when in wet plasma mode]
   * @return peltierTemp
  **/
  @ApiModelProperty(value = "@lithoLabel [Peltier Temperature (ºC) (cyclonic spray chamber - wet plasma only)] @lithoDocumentation [Temperature in ºC of Peltier element for cyclonic spray chamber when in wet plasma mode]")
  public Float getPeltierTemp() {
    return peltierTemp;
  }

  public void setPeltierTemp(Float peltierTemp) {
    this.peltierTemp = peltierTemp;
  }

  public SolutionOtherMetadataDTO sampleWeightETV(Float sampleWeightETV) {
    this.sampleWeightETV = sampleWeightETV;
    return this;
  }

   /**
   * @lithoLabel [Solid Sample Weight (mg) (ETV only-solid sample only)] @lithoDocumentation [Solid Sample Weight (mg) (ETV only-solid sample only)]
   * @return sampleWeightETV
  **/
  @ApiModelProperty(value = "@lithoLabel [Solid Sample Weight (mg) (ETV only-solid sample only)] @lithoDocumentation [Solid Sample Weight (mg) (ETV only-solid sample only)]")
  public Float getSampleWeightETV() {
    return sampleWeightETV;
  }

  public void setSampleWeightETV(Float sampleWeightETV) {
    this.sampleWeightETV = sampleWeightETV;
  }

  public SolutionOtherMetadataDTO solutionInternalStandard(String solutionInternalStandard) {
    this.solutionInternalStandard = solutionInternalStandard;
    return this;
  }

   /**
   * @lithoLabel [Internal Standards] @lithoDocumentation [List of natural or enriched isotopes used/added for internal standardisation e.g. 6Li, 84Sr, 115In, 147Sm, 209Bi, 235U]
   * @return solutionInternalStandard
  **/
  @ApiModelProperty(value = "@lithoLabel [Internal Standards] @lithoDocumentation [List of natural or enriched isotopes used/added for internal standardisation e.g. 6Li, 84Sr, 115In, 147Sm, 209Bi, 235U]")
  public String getSolutionInternalStandard() {
    return solutionInternalStandard;
  }

  public void setSolutionInternalStandard(String solutionInternalStandard) {
    this.solutionInternalStandard = solutionInternalStandard;
  }

  public SolutionOtherMetadataDTO solutionIntroSystemId(Long solutionIntroSystemId) {
    this.solutionIntroSystemId = solutionIntroSystemId;
    return this;
  }

   /**
   * @lithoLabel [Solution/Other Introduction System] @lithoDocumentation [Type of solution/other introduction system used (e.g. Desolvating nebulizer system, nebuliser with spray chamber, hydride generator, electrothermal vaporisation)]
   * @return solutionIntroSystemId
  **/
  @ApiModelProperty(value = "@lithoLabel [Solution/Other Introduction System] @lithoDocumentation [Type of solution/other introduction system used (e.g. Desolvating nebulizer system, nebuliser with spray chamber, hydride generator, electrothermal vaporisation)]")
  public Long getSolutionIntroSystemId() {
    return solutionIntroSystemId;
  }

  public void setSolutionIntroSystemId(Long solutionIntroSystemId) {
    this.solutionIntroSystemId = solutionIntroSystemId;
  }

  public SolutionOtherMetadataDTO solutionIntroSystemInfo(String solutionIntroSystemInfo) {
    this.solutionIntroSystemInfo = solutionIntroSystemInfo;
    return this;
  }

   /**
   * @lithoLabel [Solution Introduction System Brand and Model] @lithoDocumentation [Solution Introduction System Brand and Model (e.g. Teledyne Cetac Aridus II)]
   * @return solutionIntroSystemInfo
  **/
  @ApiModelProperty(value = "@lithoLabel [Solution Introduction System Brand and Model] @lithoDocumentation [Solution Introduction System Brand and Model (e.g. Teledyne Cetac Aridus II)]")
  public String getSolutionIntroSystemInfo() {
    return solutionIntroSystemInfo;
  }

  public void setSolutionIntroSystemInfo(String solutionIntroSystemInfo) {
    this.solutionIntroSystemInfo = solutionIntroSystemInfo;
  }

  public SolutionOtherMetadataDTO solutionIntroSystemName(String solutionIntroSystemName) {
    this.solutionIntroSystemName = solutionIntroSystemName;
    return this;
  }

   /**
   * Get solutionIntroSystemName
   * @return solutionIntroSystemName
  **/
  @ApiModelProperty(value = "")
  public String getSolutionIntroSystemName() {
    return solutionIntroSystemName;
  }

  public void setSolutionIntroSystemName(String solutionIntroSystemName) {
    this.solutionIntroSystemName = solutionIntroSystemName;
  }

  public SolutionOtherMetadataDTO solutionUptake(Float solutionUptake) {
    this.solutionUptake = solutionUptake;
    return this;
  }

   /**
   * @lithoLabel [Solution Sample Uptake (µl.min-1)] @lithoDocumentation [Uptake flow rate of solution (µl.min-1)]
   * @return solutionUptake
  **/
  @ApiModelProperty(value = "@lithoLabel [Solution Sample Uptake (µl.min-1)] @lithoDocumentation [Uptake flow rate of solution (µl.min-1)]")
  public Float getSolutionUptake() {
    return solutionUptake;
  }

  public void setSolutionUptake(Float solutionUptake) {
    this.solutionUptake = solutionUptake;
  }

  public SolutionOtherMetadataDTO solutionVolumeETV(Float solutionVolumeETV) {
    this.solutionVolumeETV = solutionVolumeETV;
    return this;
  }

   /**
   * @lithoLabel [Solution Sample Volume (µl) (ETV only-solution sample only)] @lithoDocumentation [Solution Sample Volume (µl) (ETV only-solution sample only)]
   * @return solutionVolumeETV
  **/
  @ApiModelProperty(value = "@lithoLabel [Solution Sample Volume (µl) (ETV only-solution sample only)] @lithoDocumentation [Solution Sample Volume (µl) (ETV only-solution sample only)]")
  public Float getSolutionVolumeETV() {
    return solutionVolumeETV;
  }

  public void setSolutionVolumeETV(Float solutionVolumeETV) {
    this.solutionVolumeETV = solutionVolumeETV;
  }

  public SolutionOtherMetadataDTO sweepGasFlow(Float sweepGasFlow) {
    this.sweepGasFlow = sweepGasFlow;
    return this;
  }

   /**
   * @lithoLabel [Sweep Gas Flow (l.min-1) (desolvator only)] @lithoDocumentation [Sweep gas flow rate of desolvating nebuliser systems (l.min-1)]
   * @return sweepGasFlow
  **/
  @ApiModelProperty(value = "@lithoLabel [Sweep Gas Flow (l.min-1) (desolvator only)] @lithoDocumentation [Sweep gas flow rate of desolvating nebuliser systems (l.min-1)]")
  public Float getSweepGasFlow() {
    return sweepGasFlow;
  }

  public void setSweepGasFlow(Float sweepGasFlow) {
    this.sweepGasFlow = sweepGasFlow;
  }

  public SolutionOtherMetadataDTO tempStepsETV(String tempStepsETV) {
    this.tempStepsETV = tempStepsETV;
    return this;
  }

   /**
   * @lithoLabel [ETV Temperature Steps (ºC)/Ramp (s)/Hold (s)] @lithoDocumentation [ETV temperature program steps e.g. 1-Dry: 110ºC, 10 s (ramp), 15 s (hold), 2-Pyrolisis 1100ºC, 10 s (ramp), 45 s (hold), 3-Vaporisation 2600ºC, 0.5 s (ramp), 1 s (hold)]
   * @return tempStepsETV
  **/
  @ApiModelProperty(value = "@lithoLabel [ETV Temperature Steps (ºC)/Ramp (s)/Hold (s)] @lithoDocumentation [ETV temperature program steps e.g. 1-Dry: 110ºC, 10 s (ramp), 15 s (hold), 2-Pyrolisis 1100ºC, 10 s (ramp), 45 s (hold), 3-Vaporisation 2600ºC, 0.5 s (ramp), 1 s (hold)]")
  public String getTempStepsETV() {
    return tempStepsETV;
  }

  public void setTempStepsETV(String tempStepsETV) {
    this.tempStepsETV = tempStepsETV;
  }

  public SolutionOtherMetadataDTO tubingMaterialId(Long tubingMaterialId) {
    this.tubingMaterialId = tubingMaterialId;
    return this;
  }

   /**
   * @lithoLabel [Interface Tubing Material] @lithoDocumentation [Material the interface/transport tubing is made from (e.g. Nylon, PVC, PFA)]
   * @return tubingMaterialId
  **/
  @ApiModelProperty(value = "@lithoLabel [Interface Tubing Material] @lithoDocumentation [Material the interface/transport tubing is made from (e.g. Nylon, PVC, PFA)]")
  public Long getTubingMaterialId() {
    return tubingMaterialId;
  }

  public void setTubingMaterialId(Long tubingMaterialId) {
    this.tubingMaterialId = tubingMaterialId;
  }

  public SolutionOtherMetadataDTO tubingMaterialInternalDiameterId(Long tubingMaterialInternalDiameterId) {
    this.tubingMaterialInternalDiameterId = tubingMaterialInternalDiameterId;
    return this;
  }

   /**
   * @lithoLabel [Interface Tubing Internal Diameter] @lithoDocumentation [Internal diameter of the interface/transport tubing (e.g. 1/4\&quot;, 1/8\&quot;, 6 mm)]
   * @return tubingMaterialInternalDiameterId
  **/
  @ApiModelProperty(value = "@lithoLabel [Interface Tubing Internal Diameter] @lithoDocumentation [Internal diameter of the interface/transport tubing (e.g. 1/4\", 1/8\", 6 mm)]")
  public Long getTubingMaterialInternalDiameterId() {
    return tubingMaterialInternalDiameterId;
  }

  public void setTubingMaterialInternalDiameterId(Long tubingMaterialInternalDiameterId) {
    this.tubingMaterialInternalDiameterId = tubingMaterialInternalDiameterId;
  }

  public SolutionOtherMetadataDTO tubingMaterialInternalDiameterName(String tubingMaterialInternalDiameterName) {
    this.tubingMaterialInternalDiameterName = tubingMaterialInternalDiameterName;
    return this;
  }

   /**
   * Get tubingMaterialInternalDiameterName
   * @return tubingMaterialInternalDiameterName
  **/
  @ApiModelProperty(value = "")
  public String getTubingMaterialInternalDiameterName() {
    return tubingMaterialInternalDiameterName;
  }

  public void setTubingMaterialInternalDiameterName(String tubingMaterialInternalDiameterName) {
    this.tubingMaterialInternalDiameterName = tubingMaterialInternalDiameterName;
  }

  public SolutionOtherMetadataDTO tubingMaterialLength(Float tubingMaterialLength) {
    this.tubingMaterialLength = tubingMaterialLength;
    return this;
  }

   /**
   * @lithoLabel [Interface Tubing length (cm)] @lithoDocumentation [Length of the interface/transport tubing (cm)]
   * @return tubingMaterialLength
  **/
  @ApiModelProperty(value = "@lithoLabel [Interface Tubing length (cm)] @lithoDocumentation [Length of the interface/transport tubing (cm)]")
  public Float getTubingMaterialLength() {
    return tubingMaterialLength;
  }

  public void setTubingMaterialLength(Float tubingMaterialLength) {
    this.tubingMaterialLength = tubingMaterialLength;
  }

  public SolutionOtherMetadataDTO tubingMaterialName(String tubingMaterialName) {
    this.tubingMaterialName = tubingMaterialName;
    return this;
  }

   /**
   * Get tubingMaterialName
   * @return tubingMaterialName
  **/
  @ApiModelProperty(value = "")
  public String getTubingMaterialName() {
    return tubingMaterialName;
  }

  public void setTubingMaterialName(String tubingMaterialName) {
    this.tubingMaterialName = tubingMaterialName;
  }

  public SolutionOtherMetadataDTO uptakeHCl(Float uptakeHCl) {
    this.uptakeHCl = uptakeHCl;
    return this;
  }

   /**
   * @lithoLabel [HCl Uptake (ml.min-1) (hydride generator only)] @lithoDocumentation [HCl Uptake (ml.min-1) (hydride generator only)]
   * @return uptakeHCl
  **/
  @ApiModelProperty(value = "@lithoLabel [HCl Uptake (ml.min-1) (hydride generator only)] @lithoDocumentation [HCl Uptake (ml.min-1) (hydride generator only)]")
  public Float getUptakeHCl() {
    return uptakeHCl;
  }

  public void setUptakeHCl(Float uptakeHCl) {
    this.uptakeHCl = uptakeHCl;
  }

  public SolutionOtherMetadataDTO uptakeNaBH4(Float uptakeNaBH4) {
    this.uptakeNaBH4 = uptakeNaBH4;
    return this;
  }

   /**
   * @lithoLabel [NaBH4 Uptake (ml.min-1) (hydride generator only)] @lithoDocumentation [NaBH4 Uptake (ml.min-1) (hydride generator only)]
   * @return uptakeNaBH4
  **/
  @ApiModelProperty(value = "@lithoLabel [NaBH4 Uptake (ml.min-1) (hydride generator only)] @lithoDocumentation [NaBH4 Uptake (ml.min-1) (hydride generator only)]")
  public Float getUptakeNaBH4() {
    return uptakeNaBH4;
  }

  public void setUptakeNaBH4(Float uptakeNaBH4) {
    this.uptakeNaBH4 = uptakeNaBH4;
  }

  public SolutionOtherMetadataDTO washTime(Integer washTime) {
    this.washTime = washTime;
    return this;
  }

   /**
   * @lithoLabel [Wash time (s)] @lithoDocumentation [Duration of washing time between solutions (s)]
   * @return washTime
  **/
  @ApiModelProperty(value = "@lithoLabel [Wash time (s)] @lithoDocumentation [Duration of washing time between solutions (s)]")
  public Integer getWashTime() {
    return washTime;
  }

  public void setWashTime(Integer washTime) {
    this.washTime = washTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionOtherMetadataDTO solutionOtherMetadataDTO = (SolutionOtherMetadataDTO) o;
    return Objects.equals(this.additionalGas, solutionOtherMetadataDTO.additionalGas) &&
        Objects.equals(this.additionalGasFlow, solutionOtherMetadataDTO.additionalGasFlow) &&
        Objects.equals(this.analyticalSequence, solutionOtherMetadataDTO.analyticalSequence) &&
        Objects.equals(this.aquisitionDuration, solutionOtherMetadataDTO.aquisitionDuration) &&
        Objects.equals(this.calibratingReferenceMaterial, solutionOtherMetadataDTO.calibratingReferenceMaterial) &&
        Objects.equals(this.calibrationStrategy, solutionOtherMetadataDTO.calibrationStrategy) &&
        Objects.equals(this.carrierGasETV, solutionOtherMetadataDTO.carrierGasETV) &&
        Objects.equals(this.carrierGasFlowETV, solutionOtherMetadataDTO.carrierGasFlowETV) &&
        Objects.equals(this.carrierGasFlowHG, solutionOtherMetadataDTO.carrierGasFlowHG) &&
        Objects.equals(this.carrierGasHG, solutionOtherMetadataDTO.carrierGasHG) &&
        Objects.equals(this.chemicalModifierETV, solutionOtherMetadataDTO.chemicalModifierETV) &&
        Objects.equals(this.concentrationHCl, solutionOtherMetadataDTO.concentrationHCl) &&
        Objects.equals(this.concentrationNaBH4, solutionOtherMetadataDTO.concentrationNaBH4) &&
        Objects.equals(this.description, solutionOtherMetadataDTO.description) &&
        Objects.equals(this.dilutionFactors, solutionOtherMetadataDTO.dilutionFactors) &&
        Objects.equals(this.icpmsmetadataId, solutionOtherMetadataDTO.icpmsmetadataId) &&
        Objects.equals(this.id, solutionOtherMetadataDTO.id) &&
        Objects.equals(this.nebGasFlow, solutionOtherMetadataDTO.nebGasFlow) &&
        Objects.equals(this.peltierTemp, solutionOtherMetadataDTO.peltierTemp) &&
        Objects.equals(this.sampleWeightETV, solutionOtherMetadataDTO.sampleWeightETV) &&
        Objects.equals(this.solutionInternalStandard, solutionOtherMetadataDTO.solutionInternalStandard) &&
        Objects.equals(this.solutionIntroSystemId, solutionOtherMetadataDTO.solutionIntroSystemId) &&
        Objects.equals(this.solutionIntroSystemInfo, solutionOtherMetadataDTO.solutionIntroSystemInfo) &&
        Objects.equals(this.solutionIntroSystemName, solutionOtherMetadataDTO.solutionIntroSystemName) &&
        Objects.equals(this.solutionUptake, solutionOtherMetadataDTO.solutionUptake) &&
        Objects.equals(this.solutionVolumeETV, solutionOtherMetadataDTO.solutionVolumeETV) &&
        Objects.equals(this.sweepGasFlow, solutionOtherMetadataDTO.sweepGasFlow) &&
        Objects.equals(this.tempStepsETV, solutionOtherMetadataDTO.tempStepsETV) &&
        Objects.equals(this.tubingMaterialId, solutionOtherMetadataDTO.tubingMaterialId) &&
        Objects.equals(this.tubingMaterialInternalDiameterId, solutionOtherMetadataDTO.tubingMaterialInternalDiameterId) &&
        Objects.equals(this.tubingMaterialInternalDiameterName, solutionOtherMetadataDTO.tubingMaterialInternalDiameterName) &&
        Objects.equals(this.tubingMaterialLength, solutionOtherMetadataDTO.tubingMaterialLength) &&
        Objects.equals(this.tubingMaterialName, solutionOtherMetadataDTO.tubingMaterialName) &&
        Objects.equals(this.uptakeHCl, solutionOtherMetadataDTO.uptakeHCl) &&
        Objects.equals(this.uptakeNaBH4, solutionOtherMetadataDTO.uptakeNaBH4) &&
        Objects.equals(this.washTime, solutionOtherMetadataDTO.washTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalGas, additionalGasFlow, analyticalSequence, aquisitionDuration, calibratingReferenceMaterial, calibrationStrategy, carrierGasETV, carrierGasFlowETV, carrierGasFlowHG, carrierGasHG, chemicalModifierETV, concentrationHCl, concentrationNaBH4, description, dilutionFactors, icpmsmetadataId, id, nebGasFlow, peltierTemp, sampleWeightETV, solutionInternalStandard, solutionIntroSystemId, solutionIntroSystemInfo, solutionIntroSystemName, solutionUptake, solutionVolumeETV, sweepGasFlow, tempStepsETV, tubingMaterialId, tubingMaterialInternalDiameterId, tubingMaterialInternalDiameterName, tubingMaterialLength, tubingMaterialName, uptakeHCl, uptakeNaBH4, washTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionOtherMetadataDTO {\n");
    
    sb.append("    additionalGas: ").append(toIndentedString(additionalGas)).append("\n");
    sb.append("    additionalGasFlow: ").append(toIndentedString(additionalGasFlow)).append("\n");
    sb.append("    analyticalSequence: ").append(toIndentedString(analyticalSequence)).append("\n");
    sb.append("    aquisitionDuration: ").append(toIndentedString(aquisitionDuration)).append("\n");
    sb.append("    calibratingReferenceMaterial: ").append(toIndentedString(calibratingReferenceMaterial)).append("\n");
    sb.append("    calibrationStrategy: ").append(toIndentedString(calibrationStrategy)).append("\n");
    sb.append("    carrierGasETV: ").append(toIndentedString(carrierGasETV)).append("\n");
    sb.append("    carrierGasFlowETV: ").append(toIndentedString(carrierGasFlowETV)).append("\n");
    sb.append("    carrierGasFlowHG: ").append(toIndentedString(carrierGasFlowHG)).append("\n");
    sb.append("    carrierGasHG: ").append(toIndentedString(carrierGasHG)).append("\n");
    sb.append("    chemicalModifierETV: ").append(toIndentedString(chemicalModifierETV)).append("\n");
    sb.append("    concentrationHCl: ").append(toIndentedString(concentrationHCl)).append("\n");
    sb.append("    concentrationNaBH4: ").append(toIndentedString(concentrationNaBH4)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dilutionFactors: ").append(toIndentedString(dilutionFactors)).append("\n");
    sb.append("    icpmsmetadataId: ").append(toIndentedString(icpmsmetadataId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nebGasFlow: ").append(toIndentedString(nebGasFlow)).append("\n");
    sb.append("    peltierTemp: ").append(toIndentedString(peltierTemp)).append("\n");
    sb.append("    sampleWeightETV: ").append(toIndentedString(sampleWeightETV)).append("\n");
    sb.append("    solutionInternalStandard: ").append(toIndentedString(solutionInternalStandard)).append("\n");
    sb.append("    solutionIntroSystemId: ").append(toIndentedString(solutionIntroSystemId)).append("\n");
    sb.append("    solutionIntroSystemInfo: ").append(toIndentedString(solutionIntroSystemInfo)).append("\n");
    sb.append("    solutionIntroSystemName: ").append(toIndentedString(solutionIntroSystemName)).append("\n");
    sb.append("    solutionUptake: ").append(toIndentedString(solutionUptake)).append("\n");
    sb.append("    solutionVolumeETV: ").append(toIndentedString(solutionVolumeETV)).append("\n");
    sb.append("    sweepGasFlow: ").append(toIndentedString(sweepGasFlow)).append("\n");
    sb.append("    tempStepsETV: ").append(toIndentedString(tempStepsETV)).append("\n");
    sb.append("    tubingMaterialId: ").append(toIndentedString(tubingMaterialId)).append("\n");
    sb.append("    tubingMaterialInternalDiameterId: ").append(toIndentedString(tubingMaterialInternalDiameterId)).append("\n");
    sb.append("    tubingMaterialInternalDiameterName: ").append(toIndentedString(tubingMaterialInternalDiameterName)).append("\n");
    sb.append("    tubingMaterialLength: ").append(toIndentedString(tubingMaterialLength)).append("\n");
    sb.append("    tubingMaterialName: ").append(toIndentedString(tubingMaterialName)).append("\n");
    sb.append("    uptakeHCl: ").append(toIndentedString(uptakeHCl)).append("\n");
    sb.append("    uptakeNaBH4: ").append(toIndentedString(uptakeNaBH4)).append("\n");
    sb.append("    washTime: ").append(toIndentedString(washTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

