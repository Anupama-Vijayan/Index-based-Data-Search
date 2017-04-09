package edu.utdallas.database;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportPharmaData 
{
	
	ArrayList<PharmaCompanyAttributes> listInstanceForPC = new ArrayList<PharmaCompanyAttributes>();
	FileConfiguration database;
	int counterForRecords;
	String recordForHeader;
	
	
	
	
	
	/**
	 * @return the pcList
	 */
	public ArrayList<PharmaCompanyAttributes> getPcList() {
		return listInstanceForPC;
	}


	/**
	 * @param pcList the pcList to set
	 */
	public void setPcList(ArrayList<PharmaCompanyAttributes> pcList) {
		this.listInstanceForPC = pcList;
	}


	/**
	 * @return the headerRecord
	 */
	public String getHeaderRecord() {
		return recordForHeader;
	}


	/**
	 * @param headerRecord the headerRecord to set
	 */
	public void setHeaderRecord(String headerRecord) {
		this.recordForHeader = headerRecord;
	}


	public int importFromCSVToDb(String inputFileName,FileConfiguration database) {
		Scanner inputFileScanner = null;
		counterForRecords = -1;
		try {
			inputFileScanner = new Scanner(new BufferedReader(new FileReader(
					inputFileName)));
			String record = null;
			while (inputFileScanner.hasNext()) {
				record = inputFileScanner.nextLine();

				 String otherThanQuote = " [^\"] ";
			     String quotedString = String.format(" \" %s* \" ", otherThanQuote);
			     String regex = String.format("(?x) "+ 
			                ",                         "+ 
			                "(?=                       "+ 
			                "  (                       "+ 
			                "    %s*                   "+ 
			                "    %s                    "+ 
			                "  )*                      "+ 
			                "  %s*                     "+ 
			                "  $                       "+ 
			                ")                         ", 
			                otherThanQuote, quotedString, otherThanQuote);

			    String[] tokens = record.split(regex, -1);

				if (counterForRecords == -1) {
					counterForRecords++;
				} else {
					System.out.println("before parse ");
					System.out.println(record);
					PharmaCompanyAttributes pc = processPcDataRecord(tokens);

					if (pc != null) {
						listInstanceForPC.add(pc);
						counterForRecords++;
					}
				}
				
				
			}
			
			database.createDatabase(getPcList(),getHeaderRecord());
			System.out.println("Imported " + counterForRecords + " records to "+database.getDbFileName());
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			inputFileScanner.close();
		}

		return 0;

	}
	
	
	public static PharmaCompanyAttributes processPcDataRecord(String[] record) {

		String[] columns = record;
		for(int i=0;i<columns.length;i++){
			System.out.printf(" "+columns[i]);
		}
		PharmaCompanyAttributes pc = null;
		Integer id = Integer.parseInt(columns[0]);
		String company = columns[1].replaceAll("\"", "");
		String drug_id = columns[2];
	//	char[] chdrug = drug_id.toCharArray();
		short trials = Short.parseShort(columns[3]) ;
		short patients = Short.parseShort(columns[4]) ;;
		short dosage_mg = Short.parseShort(columns[5]) ;;
		Float reading = Float.parseFloat(columns[6]);
		boolean double_blind = Boolean.parseBoolean(columns[7]);
		boolean controlled_study = Boolean.parseBoolean(columns[8]);
		boolean govt_funded = Boolean.parseBoolean(columns[9]);
		boolean fda_approved = Boolean.parseBoolean(columns[10]);
		

		System.out.println("");
		if (columns != null) {
			try {
				pc = new PharmaCompanyAttributes(id, company,drug_id,trials,patients,dosage_mg,reading,double_blind,controlled_study,govt_funded,fda_approved);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("unable to parse the record-->" + record);
				return null;
			}
		}

		return pc;
	}

	
	
	

}
