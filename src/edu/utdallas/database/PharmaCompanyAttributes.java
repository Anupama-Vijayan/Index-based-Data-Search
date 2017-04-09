package edu.utdallas.database;

public class PharmaCompanyAttributes 
{
     
	Integer id;
	String company;
//	char[] drug_id = new char[6];
	String drug_id;
	short trials;
	short patients;
	short dosage_mg;
	Float reading;
	boolean double_blind;
	boolean controlled_study;
	boolean govt_funded;
	boolean fda_approved;
	String recordStr;
	
	
	
	/**
	 * @return the recordStr
	 */
	public String getRecordStr() {
		return recordStr;
	}
	/**
	 * @param recordStr the recordStr to set
	 */
	public void setRecordStr(String recordStr) {
		this.recordStr = recordStr;
	}
	/**
	 * @param id
	 * @param company
	 * @param drug_id
	 * @param trials
	 * @param patients
	 * @param dosage_mg
	 * @param reading
	 * @param double_blind
	 * @param controlled_study
	 * @param govt_funded
	 * @param fda_approved
	 * @param recordStr
	 */
	public PharmaCompanyAttributes(Integer id, String company, String drug_id,
			short trials, short patients, short dosage_mg, Float reading,
			boolean double_blind, boolean controlled_study,
			boolean govt_funded, boolean fda_approved) {
		super();
		this.id = id;
		this.company = company;
		this.drug_id = drug_id;
		this.trials = trials;
		this.patients = patients;
		this.dosage_mg = dosage_mg;
		this.reading = reading;
		this.double_blind = double_blind;
		this.controlled_study = controlled_study;
		this.govt_funded = govt_funded;
		this.fda_approved = fda_approved;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the drug_id
	 */
	public String getDrug_id() {
		return drug_id;
	}
	/**
	 * @param drug_id the drug_id to set
	 */
	public void setDrug_id(String drug_id) {
		this.drug_id = drug_id;
	}
	/**
	 * @return the trials
	 */
	public short getTrials() {
		return trials;
	}
	/**
	 * @param trials the trials to set
	 */
	public void setTrials(short trials) {
		this.trials = trials;
	}
	/**
	 * @return the patients
	 */
	public short getPatients() {
		return patients;
	}
	/**
	 * @param patients the patients to set
	 */
	public void setPatients(short patients) {
		this.patients = patients;
	}
	/**
	 * @return the dosage_mg
	 */
	public short getDosage_mg() {
		return dosage_mg;
	}
	/**
	 * @param dosage_mg the dosage_mg to set
	 */
	public void setDosage_mg(short dosage_mg) {
		this.dosage_mg = dosage_mg;
	}
	/**
	 * @return the reading
	 */
	public Float getReading() {
		return reading;
	}
	/**
	 * @param reading the reading to set
	 */
	public void setReading(Float reading) {
		this.reading = reading;
	}
	/**
	 * @return the double_blind
	 */
	public boolean isDouble_blind() {
		return double_blind;
	}
	/**
	 * @param double_blind the double_blind to set
	 */
	public void setDouble_blind(boolean double_blind) {
		this.double_blind = double_blind;
	}
	/**
	 * @return the controlled_study
	 */
	public boolean isControlled_study() {
		return controlled_study;
	}
	/**
	 * @param controlled_study the controlled_study to set
	 */
	public void setControlled_study(boolean controlled_study) {
		this.controlled_study = controlled_study;
	}
	/**
	 * @return the govt_funded
	 */
	public boolean isGovt_funded() {
		return govt_funded;
	}
	/**
	 * @param govt_funded the govt_funded to set
	 */
	public void setGovt_funded(boolean govt_funded) {
		this.govt_funded = govt_funded;
	}
	/**
	 * @return the fda_approved
	 */
	public boolean isFda_approved() {
		return fda_approved;
	}
	/**
	 * @param fda_approved the fda_approved to set
	 */
	public void setFda_approved(boolean fda_approved) {
		this.fda_approved = fda_approved;
	}
	
	public String toString(){
		return this.id+"\t"+this.company+"\t"+this.drug_id+"\t"+this.trials+"\t"+this.patients+"\t"+this.dosage_mg+"\t"+this.reading+"\t"+this.double_blind+"\t"+this.controlled_study+"\t"+this.govt_funded+"\t"+this.fda_approved;
		
	}

}
