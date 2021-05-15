package com.lithodat.api.client.csvimporter.material;

import java.io.Serializable;
import java.util.Objects;

import com.lithodat.api.client.csvimporter.material.enumeration.MaterialKind;

/**
 * A DTO for the {@link com.lithodat.app.domain.Material} entity.
 */
public class MaterialDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private MaterialKind materialKind;

	private String sourceId;

	private String name;

	private String description;

	private String entrytype;

	private String dispformulasimple;

	private String impurities;

	private String elements;

	private String sigelements;

	private String tlform;

	private String language;

	private String languagemain;

	private String occurrence;

	private String otheroccurrence;

	private String diapheny;

	private String cleavage;

	private String parting;

	private String tenacity;

	private String colour;

	private String opticalextinction;

	private String fracture;

	private String hmin;

	private String hmax;

	private String lustre;

	private String lustretype;

	private String specificgravity;

	private String streak;

	private String varietyof;

	private String synid;

	private String polytypeof;

	private String crystalform;

	private String trans;

	private String strunz1;

	private String strunz2;

	private String strunz3;

	private String strunz4;

	private String strunz9ed1;

	private String strunz9ed2;

	private String strunz9ed3;

	private String strunz9ed4;

	private String strunz10ed1;

	private String strunz10ed2;

	private String strunz10ed3;

	private String strunz10ed4;

	private String series1;

	private String series2;

	private String series3;

	private String dana1;

	private String dana2;

	private String dana3;

	private String dana4;

	private String dana8ed1;

	private String dana8ed2;

	private String dana8ed3;

	private String dana8ed4;

	private String spacing;

	private String csystem;

	private String cclass;

	private String spacegroup;

	private String a;

	private String b;

	private String c;

	private String alpha;

	private String beta;

	private String gamma;

	private String aerror;

	private String berror;

	private String cerror;

	private String alphaerror;

	private String betaerror;

	private String gammaerror;

	private String va3;

	private String z;

	private String dmeas;

	private String dmeas2;

	private String dcalc;

	private String dmeaserror;

	private String dcalcerror;

	private String cleavagetype;

	private String fracturetype;

	private String morphology;

	private String opticalbireferror;

	private String specdispm;

	private String spacegroupset;

	private String formulanotes;

	private String imaStatus;

	private String rockParent;

	private String rockParent2;

	private String rockRoot;

	private Integer treeDepth1;

	private Integer treeDepth2;

	/**
	 * The path from root to leave as a string. Useful for searching material by path.
	 */
	private String calcPath1;

	private String calcPath2;

	private Long parent1Id;

	private String parent1Name;

	private Long parent2Id;

	private String parent2Name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MaterialKind getMaterialKind() {
		return materialKind;
	}

	public void setMaterialKind(MaterialKind materialKind) {
		this.materialKind = materialKind;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEntrytype() {
		return entrytype;
	}

	public void setEntrytype(String entrytype) {
		this.entrytype = entrytype;
	}

	public String getDispformulasimple() {
		return dispformulasimple;
	}

	public void setDispformulasimple(String dispformulasimple) {
		this.dispformulasimple = dispformulasimple;
	}

	public String getImpurities() {
		return impurities;
	}

	public void setImpurities(String impurities) {
		this.impurities = impurities;
	}

	public String getElements() {
		return elements;
	}

	public void setElements(String elements) {
		this.elements = elements;
	}

	public String getSigelements() {
		return sigelements;
	}

	public void setSigelements(String sigelements) {
		this.sigelements = sigelements;
	}

	public String getTlform() {
		return tlform;
	}

	public void setTlform(String tlform) {
		this.tlform = tlform;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguagemain() {
		return languagemain;
	}

	public void setLanguagemain(String languagemain) {
		this.languagemain = languagemain;
	}

	public String getOccurrence() {
		return occurrence;
	}

	public void setOccurrence(String occurrence) {
		this.occurrence = occurrence;
	}

	public String getOtheroccurrence() {
		return otheroccurrence;
	}

	public void setOtheroccurrence(String otheroccurrence) {
		this.otheroccurrence = otheroccurrence;
	}

	public String getDiapheny() {
		return diapheny;
	}

	public void setDiapheny(String diapheny) {
		this.diapheny = diapheny;
	}

	public String getCleavage() {
		return cleavage;
	}

	public void setCleavage(String cleavage) {
		this.cleavage = cleavage;
	}

	public String getParting() {
		return parting;
	}

	public void setParting(String parting) {
		this.parting = parting;
	}

	public String getTenacity() {
		return tenacity;
	}

	public void setTenacity(String tenacity) {
		this.tenacity = tenacity;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getOpticalextinction() {
		return opticalextinction;
	}

	public void setOpticalextinction(String opticalextinction) {
		this.opticalextinction = opticalextinction;
	}

	public String getFracture() {
		return fracture;
	}

	public void setFracture(String fracture) {
		this.fracture = fracture;
	}

	public String getHmin() {
		return hmin;
	}

	public void setHmin(String hmin) {
		this.hmin = hmin;
	}

	public String getHmax() {
		return hmax;
	}

	public void setHmax(String hmax) {
		this.hmax = hmax;
	}

	public String getLustre() {
		return lustre;
	}

	public void setLustre(String lustre) {
		this.lustre = lustre;
	}

	public String getLustretype() {
		return lustretype;
	}

	public void setLustretype(String lustretype) {
		this.lustretype = lustretype;
	}

	public String getSpecificgravity() {
		return specificgravity;
	}

	public void setSpecificgravity(String specificgravity) {
		this.specificgravity = specificgravity;
	}

	public String getStreak() {
		return streak;
	}

	public void setStreak(String streak) {
		this.streak = streak;
	}

	public String getVarietyof() {
		return varietyof;
	}

	public void setVarietyof(String varietyof) {
		this.varietyof = varietyof;
	}

	public String getSynid() {
		return synid;
	}

	public void setSynid(String synid) {
		this.synid = synid;
	}

	public String getPolytypeof() {
		return polytypeof;
	}

	public void setPolytypeof(String polytypeof) {
		this.polytypeof = polytypeof;
	}

	public String getCrystalform() {
		return crystalform;
	}

	public void setCrystalform(String crystalform) {
		this.crystalform = crystalform;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public String getStrunz1() {
		return strunz1;
	}

	public void setStrunz1(String strunz1) {
		this.strunz1 = strunz1;
	}

	public String getStrunz2() {
		return strunz2;
	}

	public void setStrunz2(String strunz2) {
		this.strunz2 = strunz2;
	}

	public String getStrunz3() {
		return strunz3;
	}

	public void setStrunz3(String strunz3) {
		this.strunz3 = strunz3;
	}

	public String getStrunz4() {
		return strunz4;
	}

	public void setStrunz4(String strunz4) {
		this.strunz4 = strunz4;
	}

	public String getStrunz9ed1() {
		return strunz9ed1;
	}

	public void setStrunz9ed1(String strunz9ed1) {
		this.strunz9ed1 = strunz9ed1;
	}

	public String getStrunz9ed2() {
		return strunz9ed2;
	}

	public void setStrunz9ed2(String strunz9ed2) {
		this.strunz9ed2 = strunz9ed2;
	}

	public String getStrunz9ed3() {
		return strunz9ed3;
	}

	public void setStrunz9ed3(String strunz9ed3) {
		this.strunz9ed3 = strunz9ed3;
	}

	public String getStrunz9ed4() {
		return strunz9ed4;
	}

	public void setStrunz9ed4(String strunz9ed4) {
		this.strunz9ed4 = strunz9ed4;
	}

	public String getStrunz10ed1() {
		return strunz10ed1;
	}

	public void setStrunz10ed1(String strunz10ed1) {
		this.strunz10ed1 = strunz10ed1;
	}

	public String getStrunz10ed2() {
		return strunz10ed2;
	}

	public void setStrunz10ed2(String strunz10ed2) {
		this.strunz10ed2 = strunz10ed2;
	}

	public String getStrunz10ed3() {
		return strunz10ed3;
	}

	public void setStrunz10ed3(String strunz10ed3) {
		this.strunz10ed3 = strunz10ed3;
	}

	public String getStrunz10ed4() {
		return strunz10ed4;
	}

	public void setStrunz10ed4(String strunz10ed4) {
		this.strunz10ed4 = strunz10ed4;
	}

	public String getSeries1() {
		return series1;
	}

	public void setSeries1(String series1) {
		this.series1 = series1;
	}

	public String getSeries2() {
		return series2;
	}

	public void setSeries2(String series2) {
		this.series2 = series2;
	}

	public String getSeries3() {
		return series3;
	}

	public void setSeries3(String series3) {
		this.series3 = series3;
	}

	public String getDana1() {
		return dana1;
	}

	public void setDana1(String dana1) {
		this.dana1 = dana1;
	}

	public String getDana2() {
		return dana2;
	}

	public void setDana2(String dana2) {
		this.dana2 = dana2;
	}

	public String getDana3() {
		return dana3;
	}

	public void setDana3(String dana3) {
		this.dana3 = dana3;
	}

	public String getDana4() {
		return dana4;
	}

	public void setDana4(String dana4) {
		this.dana4 = dana4;
	}

	public String getDana8ed1() {
		return dana8ed1;
	}

	public void setDana8ed1(String dana8ed1) {
		this.dana8ed1 = dana8ed1;
	}

	public String getDana8ed2() {
		return dana8ed2;
	}

	public void setDana8ed2(String dana8ed2) {
		this.dana8ed2 = dana8ed2;
	}

	public String getDana8ed3() {
		return dana8ed3;
	}

	public void setDana8ed3(String dana8ed3) {
		this.dana8ed3 = dana8ed3;
	}

	public String getDana8ed4() {
		return dana8ed4;
	}

	public void setDana8ed4(String dana8ed4) {
		this.dana8ed4 = dana8ed4;
	}

	public String getSpacing() {
		return spacing;
	}

	public void setSpacing(String spacing) {
		this.spacing = spacing;
	}

	public String getCsystem() {
		return csystem;
	}

	public void setCsystem(String csystem) {
		this.csystem = csystem;
	}

	public String getCclass() {
		return cclass;
	}

	public void setCclass(String cclass) {
		this.cclass = cclass;
	}

	public String getSpacegroup() {
		return spacegroup;
	}

	public void setSpacegroup(String spacegroup) {
		this.spacegroup = spacegroup;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getAlpha() {
		return alpha;
	}

	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}

	public String getBeta() {
		return beta;
	}

	public void setBeta(String beta) {
		this.beta = beta;
	}

	public String getGamma() {
		return gamma;
	}

	public void setGamma(String gamma) {
		this.gamma = gamma;
	}

	public String getAerror() {
		return aerror;
	}

	public void setAerror(String aerror) {
		this.aerror = aerror;
	}

	public String getBerror() {
		return berror;
	}

	public void setBerror(String berror) {
		this.berror = berror;
	}

	public String getCerror() {
		return cerror;
	}

	public void setCerror(String cerror) {
		this.cerror = cerror;
	}

	public String getAlphaerror() {
		return alphaerror;
	}

	public void setAlphaerror(String alphaerror) {
		this.alphaerror = alphaerror;
	}

	public String getBetaerror() {
		return betaerror;
	}

	public void setBetaerror(String betaerror) {
		this.betaerror = betaerror;
	}

	public String getGammaerror() {
		return gammaerror;
	}

	public void setGammaerror(String gammaerror) {
		this.gammaerror = gammaerror;
	}

	public String getVa3() {
		return va3;
	}

	public void setVa3(String va3) {
		this.va3 = va3;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	public String getDmeas() {
		return dmeas;
	}

	public void setDmeas(String dmeas) {
		this.dmeas = dmeas;
	}

	public String getDmeas2() {
		return dmeas2;
	}

	public void setDmeas2(String dmeas2) {
		this.dmeas2 = dmeas2;
	}

	public String getDcalc() {
		return dcalc;
	}

	public void setDcalc(String dcalc) {
		this.dcalc = dcalc;
	}

	public String getDmeaserror() {
		return dmeaserror;
	}

	public void setDmeaserror(String dmeaserror) {
		this.dmeaserror = dmeaserror;
	}

	public String getDcalcerror() {
		return dcalcerror;
	}

	public void setDcalcerror(String dcalcerror) {
		this.dcalcerror = dcalcerror;
	}

	public String getCleavagetype() {
		return cleavagetype;
	}

	public void setCleavagetype(String cleavagetype) {
		this.cleavagetype = cleavagetype;
	}

	public String getFracturetype() {
		return fracturetype;
	}

	public void setFracturetype(String fracturetype) {
		this.fracturetype = fracturetype;
	}

	public String getMorphology() {
		return morphology;
	}

	public void setMorphology(String morphology) {
		this.morphology = morphology;
	}

	public String getOpticalbireferror() {
		return opticalbireferror;
	}

	public void setOpticalbireferror(String opticalbireferror) {
		this.opticalbireferror = opticalbireferror;
	}

	public String getSpecdispm() {
		return specdispm;
	}

	public void setSpecdispm(String specdispm) {
		this.specdispm = specdispm;
	}

	public String getSpacegroupset() {
		return spacegroupset;
	}

	public void setSpacegroupset(String spacegroupset) {
		this.spacegroupset = spacegroupset;
	}

	public String getFormulanotes() {
		return formulanotes;
	}

	public void setFormulanotes(String formulanotes) {
		this.formulanotes = formulanotes;
	}

	public String getImaStatus() {
		return imaStatus;
	}

	public void setImaStatus(String imaStatus) {
		this.imaStatus = imaStatus;
	}

	public String getRockParent() {
		return rockParent;
	}

	public void setRockParent(String rockParent) {
		this.rockParent = rockParent;
	}

	public String getRockParent2() {
		return rockParent2;
	}

	public void setRockParent2(String rockParent2) {
		this.rockParent2 = rockParent2;
	}

	public String getRockRoot() {
		return rockRoot;
	}

	public void setRockRoot(String rockRoot) {
		this.rockRoot = rockRoot;
	}

	public String getCalcPath1() {
		return calcPath1;
	}

	public void setCalcPath1(String calcPath1) {
		this.calcPath1 = calcPath1;
	}

	public String getCalcPath2() {
		return calcPath2;
	}

	public void setCalcPath2(String calcPath2) {
		this.calcPath2 = calcPath2;
	}

	public Long getParent1Id() {
		return parent1Id;
	}

	public void setParent1Id(Long materialId) {
		this.parent1Id = materialId;
	}

	public String getParent1Name() {
		return parent1Name;
	}

	public void setParent1Name(String materialName) {
		this.parent1Name = materialName;
	}

	public Long getParent2Id() {
		return parent2Id;
	}

	public void setParent2Id(Long materialId) {
		this.parent2Id = materialId;
	}

	public String getParent2Name() {
		return parent2Name;
	}

	public void setParent2Name(String materialName) {
		this.parent2Name = materialName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MaterialDTO materialDTO = (MaterialDTO) o;
		if (materialDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), materialDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "MaterialDTO{" +
				"id=" + getId() +
				", materialKind='" + getMaterialKind() + "'" +
				", sourceId='" + getSourceId() + "'" +
				", name='" + getName() + "'" +
				", description='" + getDescription() + "'" +
				", entrytype='" + getEntrytype() + "'" +
				", dispformulasimple='" + getDispformulasimple() + "'" +
				", impurities='" + getImpurities() + "'" +
				", elements='" + getElements() + "'" +
				", sigelements='" + getSigelements() + "'" +
				", tlform='" + getTlform() + "'" +
				", language='" + getLanguage() + "'" +
				", languagemain='" + getLanguagemain() + "'" +
				", occurrence='" + getOccurrence() + "'" +
				", otheroccurrence='" + getOtheroccurrence() + "'" +
				", diapheny='" + getDiapheny() + "'" +
				", cleavage='" + getCleavage() + "'" +
				", parting='" + getParting() + "'" +
				", tenacity='" + getTenacity() + "'" +
				", colour='" + getColour() + "'" +
				", opticalextinction='" + getOpticalextinction() + "'" +
				", fracture='" + getFracture() + "'" +
				", hmin='" + getHmin() + "'" +
				", hmax='" + getHmax() + "'" +
				", lustre='" + getLustre() + "'" +
				", lustretype='" + getLustretype() + "'" +
				", specificgravity='" + getSpecificgravity() + "'" +
				", streak='" + getStreak() + "'" +
				", varietyof='" + getVarietyof() + "'" +
				", synid='" + getSynid() + "'" +
				", polytypeof='" + getPolytypeof() + "'" +
				", crystalform='" + getCrystalform() + "'" +
				", trans='" + getTrans() + "'" +
				", strunz1='" + getStrunz1() + "'" +
				", strunz2='" + getStrunz2() + "'" +
				", strunz3='" + getStrunz3() + "'" +
				", strunz4='" + getStrunz4() + "'" +
				", strunz9ed1='" + getStrunz9ed1() + "'" +
				", strunz9ed2='" + getStrunz9ed2() + "'" +
				", strunz9ed3='" + getStrunz9ed3() + "'" +
				", strunz9ed4='" + getStrunz9ed4() + "'" +
				", strunz10ed1='" + getStrunz10ed1() + "'" +
				", strunz10ed2='" + getStrunz10ed2() + "'" +
				", strunz10ed3='" + getStrunz10ed3() + "'" +
				", strunz10ed4='" + getStrunz10ed4() + "'" +
				", series1='" + getSeries1() + "'" +
				", series2='" + getSeries2() + "'" +
				", series3='" + getSeries3() + "'" +
				", dana1='" + getDana1() + "'" +
				", dana2='" + getDana2() + "'" +
				", dana3='" + getDana3() + "'" +
				", dana4='" + getDana4() + "'" +
				", dana8ed1='" + getDana8ed1() + "'" +
				", dana8ed2='" + getDana8ed2() + "'" +
				", dana8ed3='" + getDana8ed3() + "'" +
				", dana8ed4='" + getDana8ed4() + "'" +
				", spacing='" + getSpacing() + "'" +
				", csystem='" + getCsystem() + "'" +
				", cclass='" + getCclass() + "'" +
				", spacegroup='" + getSpacegroup() + "'" +
				", a='" + getA() + "'" +
				", b='" + getB() + "'" +
				", c='" + getC() + "'" +
				", alpha='" + getAlpha() + "'" +
				", beta='" + getBeta() + "'" +
				", gamma='" + getGamma() + "'" +
				", aerror='" + getAerror() + "'" +
				", berror='" + getBerror() + "'" +
				", cerror='" + getCerror() + "'" +
				", alphaerror='" + getAlphaerror() + "'" +
				", betaerror='" + getBetaerror() + "'" +
				", gammaerror='" + getGammaerror() + "'" +
				", va3='" + getVa3() + "'" +
				", z='" + getZ() + "'" +
				", dmeas='" + getDmeas() + "'" +
				", dmeas2='" + getDmeas2() + "'" +
				", dcalc='" + getDcalc() + "'" +
				", dmeaserror='" + getDmeaserror() + "'" +
				", dcalcerror='" + getDcalcerror() + "'" +
				", cleavagetype='" + getCleavagetype() + "'" +
				", fracturetype='" + getFracturetype() + "'" +
				", morphology='" + getMorphology() + "'" +
				", opticalbireferror='" + getOpticalbireferror() + "'" +
				", specdispm='" + getSpecdispm() + "'" +
				", spacegroupset='" + getSpacegroupset() + "'" +
				", formulanotes='" + getFormulanotes() + "'" +
				", imaStatus='" + getImaStatus() + "'" +
				", rockParent='" + getRockParent() + "'" +
				", rockParent2='" + getRockParent2() + "'" +
				", rockRoot='" + getRockRoot() + "'" +
				", calcPath1='" + getCalcPath1() + "'" +
				", calcPath2='" + getCalcPath2() + "'" +
				", parent1=" + getParent1Id() +
				", parent1='" + getParent1Name() + "'" +
				", parent2=" + getParent2Id() +
				", parent2='" + getParent2Name() + "'" +
				"}";
	}

	public Integer getTreeDepth1() {
		return treeDepth1;
	}

	public void setTreeDepth1(Integer treeDepth1) {
		this.treeDepth1 = treeDepth1;
	}

	public Integer getTreeDepth2() {
		return treeDepth2;
	}

	public void setTreeDepth2(Integer treeDepth2) {
		this.treeDepth2 = treeDepth2;
	}
}
