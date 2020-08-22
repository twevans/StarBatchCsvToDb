package star.batch.model;

public class StarDTO {
	private Integer id;
	private Integer hip;
	private Integer draper;
	private Integer hr;
	private String gl;
	private String bf;
	private String proper;
	private Double ra;
	private Double decn;
	private Double dist;
	private Double pmra;
	private Double pmdec;
	private Double rv;
	private Double mag;
	private Double absmag;
	private String spect;
	private Double ci;
	private Double x;
	private Double y;
	private Double z;
	private Double vx;
	private Double vy;
	private Double vz;
	private Double rarad;
	private Double decrad;
	private Double pmrarad;
	private Double pmdecrad;
	private String bayer;
	private Integer flam;
	private String con;
	private Integer comp;
	private Integer comp_primary;
	private String base;
	private Double lum;
	private String var;
	private Double var_min;
	private Double var_max;


    public StarDTO() {
    }

    public StarDTO(Integer id, Integer hip, Integer draper, Integer hr, String gl, String bf, String proper, Double ra,
			Double decn, Double dist, Double pmra, Double pmdec, Double rv, Double mag, Double absmag, String spect,
			Double ci, Double x, Double y, Double z, Double vx, Double vy, Double vz, Double rarad, Double decrad,
			Double pmrarad, Double pmdecrad, String bayer, Integer flam, String con, Integer comp, Integer comp_primary,
			String base, Double lum, String var, Double var_min, Double var_max) {
		this.id = id;
		this.hip = hip;
		this.draper = draper;
		this.hr = hr;
		this.gl = gl;
		this.bf = bf;
		this.proper = proper;
		this.ra = ra;
		this.decn = decn;
		this.dist = dist;
		this.pmra = pmra;
		this.pmdec = pmdec;
		this.rv = rv;
		this.mag = mag;
		this.absmag = absmag;
		this.spect = spect;
		this.ci = ci;
		this.x = x;
		this.y = y;
		this.z = z;
		this.vx = vx;
		this.vy = vy;
		this.vz = vz;
		this.rarad = rarad;
		this.decrad = decrad;
		this.pmrarad = pmrarad;
		this.pmdecrad = pmdecrad;
		this.bayer = bayer;
		this.flam = flam;
		this.con = con;
		this.comp = comp;
		this.comp_primary = comp_primary;
		this.base = base;
		this.lum = lum;
		this.var = var;
		this.var_min = var_min;
		this.var_max = var_max;
	}

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHip() {
		return hip;
	}

	public void setHip(Integer hip) {
		this.hip = hip;
	}

	public Integer getDraper() {
		return draper;
	}

	public void setDraper(Integer draper) {
		this.draper = draper;
	}

	public Integer getHr() {
		return hr;
	}

	public void setHr(Integer hr) {
		this.hr = hr;
	}

	public String getGl() {
		return gl;
	}

	public void setGl(String gl) {
		this.gl = gl;
	}

	public String getBf() {
		return bf;
	}

	public void setBf(String bf) {
		this.bf = bf;
	}

	public String getProper() {
		return proper;
	}

	public void setProper(String proper) {
		this.proper = proper;
	}

	public Double getRa() {
		return ra;
	}

	public void setRa(Double ra) {
		this.ra = ra;
	}

	public Double getDecn() {
		return decn;
	}

	public void setDecn(Double decn) {
		this.decn = decn;
	}

	public Double getDist() {
		return dist;
	}

	public void setDist(Double dist) {
		this.dist = dist;
	}

	public Double getPmra() {
		return pmra;
	}

	public void setPmra(Double pmra) {
		this.pmra = pmra;
	}

	public Double getPmdec() {
		return pmdec;
	}

	public void setPmdec(Double pmdec) {
		this.pmdec = pmdec;
	}

	public Double getRv() {
		return rv;
	}

	public void setRv(Double rv) {
		this.rv = rv;
	}

	public Double getMag() {
		return mag;
	}

	public void setMag(Double mag) {
		this.mag = mag;
	}

	public Double getAbsmag() {
		return absmag;
	}

	public void setAbsmag(Double absmag) {
		this.absmag = absmag;
	}

	public String getSpect() {
		return spect;
	}

	public void setSpect(String spect) {
		this.spect = spect;
	}

	public Double getCi() {
		return ci;
	}

	public void setCi(Double ci) {
		this.ci = ci;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}

	public Double getVx() {
		return vx;
	}

	public void setVx(Double vx) {
		this.vx = vx;
	}

	public Double getVy() {
		return vy;
	}

	public void setVy(Double vy) {
		this.vy = vy;
	}

	public Double getVz() {
		return vz;
	}

	public void setVz(Double vz) {
		this.vz = vz;
	}

	public Double getRarad() {
		return rarad;
	}

	public void setRarad(Double rarad) {
		this.rarad = rarad;
	}

	public Double getDecrad() {
		return decrad;
	}

	public void setDecrad(Double decrad) {
		this.decrad = decrad;
	}

	public Double getPmrarad() {
		return pmrarad;
	}

	public void setPmrarad(Double pmrarad) {
		this.pmrarad = pmrarad;
	}

	public Double getPmdecrad() {
		return pmdecrad;
	}

	public void setPmdecrad(Double pmdecrad) {
		this.pmdecrad = pmdecrad;
	}

	public String getBayer() {
		return bayer;
	}

	public void setBayer(String bayer) {
		this.bayer = bayer;
	}

	public Integer getFlam() {
		return flam;
	}

	public void setFlam(Integer flam) {
		this.flam = flam;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public Integer getComp() {
		return comp;
	}

	public void setComp(Integer comp) {
		this.comp = comp;
	}

	public Integer getComp_primary() {
		return comp_primary;
	}

	public void setComp_primary(Integer comp_primary) {
		this.comp_primary = comp_primary;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Double getLum() {
		return lum;
	}

	public void setLum(Double lum) {
		this.lum = lum;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public Double getVar_min() {
		return var_min;
	}

	public void setVar_min(Double var_min) {
		this.var_min = var_min;
	}

	public Double getVar_max() {
		return var_max;
	}

	public void setVar_max(Double var_max) {
		this.var_max = var_max;
	}

	@Override
	public String toString() {
		return "StarDTO [id=" + id + ", hip=" + hip + ", draper=" + draper + ", hr=" + hr + ", gl=" + gl + ", bf=" + bf
				+ ", proper=" + proper + ", ra=" + ra + ", decn=" + decn + ", dist=" + dist + ", pmra=" + pmra
				+ ", pmdec=" + pmdec + ", rv=" + rv + ", mag=" + mag + ", absmag=" + absmag + ", spect=" + spect
				+ ", ci=" + ci + ", x=" + x + ", y=" + y + ", z=" + z + ", vx=" + vx + ", vy=" + vy + ", vz=" + vz
				+ ", rarad=" + rarad + ", decrad=" + decrad + ", pmrarad=" + pmrarad + ", pmdecrad=" + pmdecrad
				+ ", bayer=" + bayer + ", flam=" + flam + ", con=" + con + ", comp=" + comp + ", comp_primary="
				+ comp_primary + ", base=" + base + ", lum=" + lum + ", var=" + var + ", var_min=" + var_min
				+ ", var_max=" + var_max + "]";
	}
	
	
	
}
