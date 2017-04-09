package edu.utdallas.database;


import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class FileConfiguration {
	
	String dbFileName;
	String indexIdFile;
	String companyIndexFile;
	String drugIdIndexFile;
	String tailsIndexFile;
	String patientsIndexFile;
	String dosageIndexFile;
	String readingIndexFile;
	String doubleBlindIndexFile;
	String controlledStudyIndexFile;
	String govtFundsIndexFile;
	String fdaApprovedIndexFile;
	String headerConfigurationAttributes[];
	long headerConfigurationOffset;

	public String getDbFileName() {
		return dbFileName;
	}
	public void setDbFileName(String dbFileName) {
		this.dbFileName = dbFileName;
	}
		
	/**
	 * @return the idIndexFile
	 */
	public String getIdIndexFile() {
		return indexIdFile;
	}
	/**
	 * @param idIndexFile the idIndexFile to set
	 */
	public void setIdIndexFile(String idIndexFile) {
		this.indexIdFile = idIndexFile;
	}
	/**
	 * @return the companyIndexFile
	 */
	public String getCompanyIndexFile() {
		return companyIndexFile;
	}
	/**
	 * @param companyIndexFile the companyIndexFile to set
	 */
	public void setCompanyIndexFile(String companyIndexFile) {
		this.companyIndexFile = companyIndexFile;
	}
	/**
	 * @return the drug_idIndexFile
	 */
	public String getDrug_idIndexFile() {
		return drugIdIndexFile;
	}
	/**
	 * @param drug_idIndexFile the drug_idIndexFile to set
	 */
	public void setDrug_idIndexFile(String drug_idIndexFile) {
		this.drugIdIndexFile = drug_idIndexFile;
	}
	/**
	 * @return the trialsIndexFile
	 */
	public String getTrialsIndexFile() {
		return tailsIndexFile;
	}
	/**
	 * @param trialsIndexFile the trialsIndexFile to set
	 */
	public void setTrialsIndexFile(String trialsIndexFile) {
		this.tailsIndexFile = trialsIndexFile;
	}
	/**
	 * @return the patientsIndexFile
	 */
	public String getPatientsIndexFile() {
		return patientsIndexFile;
	}
	/**
	 * @param patientsIndexFile the patientsIndexFile to set
	 */
	public void setPatientsIndexFile(String patientsIndexFile) {
		this.patientsIndexFile = patientsIndexFile;
	}
	/**
	 * @return the dosage_mgIndexFile
	 */
	public String getDosage_mgIndexFile() {
		return dosageIndexFile;
	}
	/**
	 * @param dosage_mgIndexFile the dosage_mgIndexFile to set
	 */
	public void setDosage_mgIndexFile(String dosage_mgIndexFile) {
		this.dosageIndexFile = dosage_mgIndexFile;
	}
	/**
	 * @return the readingIndexFile
	 */
	public String getReadingIndexFile() {
		return readingIndexFile;
	}
	/**
	 * @param readingIndexFile the readingIndexFile to set
	 */
	public void setReadingIndexFile(String readingIndexFile) {
		this.readingIndexFile = readingIndexFile;
	}
	/**
	 * @return the double_blindIndexFile
	 */
	public String getDouble_blindIndexFile() {
		return doubleBlindIndexFile;
	}
	/**
	 * @param double_blindIndexFile the double_blindIndexFile to set
	 */
	public void setDouble_blindIndexFile(String double_blindIndexFile) {
		this.doubleBlindIndexFile = double_blindIndexFile;
	}
	/**
	 * @return the controlled_studyIndexFile
	 */
	public String getControlled_studyIndexFile() {
		return controlledStudyIndexFile;
	}
	/**
	 * @param controlled_studyIndexFile the controlled_studyIndexFile to set
	 */
	public void setControlled_studyIndexFile(String controlled_studyIndexFile) {
		this.controlledStudyIndexFile = controlled_studyIndexFile;
	}
	/**
	 * @return the govt_fundedIndexFile
	 */
	public String getGovt_fundedIndexFile() {
		return govtFundsIndexFile;
	}
	/**
	 * @param govt_fundedIndexFile the govt_fundedIndexFile to set
	 */
	public void setGovt_fundedIndexFile(String govt_fundedIndexFile) {
		this.govtFundsIndexFile = govt_fundedIndexFile;
	}
	/**
	 * @return the fda_approvedIndexFile
	 */
	public String getFda_approvedIndexFile() {
		return fdaApprovedIndexFile;
	}
	/**
	 * @param fda_approvedIndexFile the fda_approvedIndexFile to set
	 */
	public void setFda_approvedIndexFile(String fda_approvedIndexFile) {
		this.fdaApprovedIndexFile = fda_approvedIndexFile;
	}
	/**
	 * @return the idIndexMap
	 */
	public HashMap<Integer, Long> getIdIndexMap() {
		return mapInstanceForIdIndex;
	}
	/**
	 * @param idIndexMap the idIndexMap to set
	 */
	public void setIdIndexMap(HashMap<Integer, Long> idIndexMap) {
		this.mapInstanceForIdIndex = idIndexMap;
	}
	
	public HashMap<String, ArrayList<Long>> getCompanyIndexMap() {
		return mapInstanceForCompanyIndex;
	}
	public void setCompanyIndexMap(HashMap<String, ArrayList<Long>> companyIndexMap) {
		this.mapInstanceForCompanyIndex = companyIndexMap;
	}



	public HashMap<String, ArrayList<Long>> getDrug_idIndexMap() {
		return mapInstanceForDrugIndex;
	}
	public void setDrug_idIndexMap(HashMap<String, ArrayList<Long>> drug_idIndexMap) {
		this.mapInstanceForDrugIndex = drug_idIndexMap;
	}
	public HashMap<Short, ArrayList<Long>> getTrialsIndexMap() {
		return mapinstanceForTrialIndex;
	}
	public void setTrialsIndexMap(HashMap<Short, ArrayList<Long>> trialsIndexMap) {
		this.mapinstanceForTrialIndex = trialsIndexMap;
	}
	public HashMap<Short, ArrayList<Long>> getPatientsIndexMap() {
		return mapInstanceForPatientsIndex;
	}
	public void setPatientsIndexMap(HashMap<Short, ArrayList<Long>> patientsIndexMap) {
		this.mapInstanceForPatientsIndex = patientsIndexMap;
	}
	public HashMap<Short, ArrayList<Long>> getDosage_mgIndexMap() {
		return mapInstanceForDosageMgIndex;
	}
	public void setDosage_mgIndexMap(
			HashMap<Short, ArrayList<Long>> dosage_mgIndexMap) {
		this.mapInstanceForDosageMgIndex = dosage_mgIndexMap;
	}
	public HashMap<Float, ArrayList<Long>> getReadingIndexMap() {
		return mapInstanceForReadingIndex;
	}
	public void setReadingIndexMap(HashMap<Float, ArrayList<Long>> readingIndexMap) {
		this.mapInstanceForReadingIndex = readingIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getDouble_blindIndexMap() {
		return mapInstanceForDoubleBlindIndex;
	}
	public void setDouble_blindIndexMap(
			HashMap<Boolean, ArrayList<Long>> double_blindIndexMap) {
		this.mapInstanceForDoubleBlindIndex = double_blindIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getControlled_studyIndexMap() {
		return mapInstanceForControlledStudyIndex;
	}
	public void setControlled_studyIndexMap(
			HashMap<Boolean, ArrayList<Long>> controlled_studyIndexMap) {
		this.mapInstanceForControlledStudyIndex = controlled_studyIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getGovt_fundedIndexMap() {
		return mapInstanceForGovtFundedIndex;
	}
	public void setGovt_fundedIndexMap(
			HashMap<Boolean, ArrayList<Long>> govt_fundedIndexMap) {
		this.mapInstanceForGovtFundedIndex = govt_fundedIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getFda_approvedIndexMap() {
		return mapInstanceForFDAIndex;
	}
	public void setFda_approvedIndexMap(
			HashMap<Boolean, ArrayList<Long>> fda_approvedIndexMap) {
		this.mapInstanceForFDAIndex = fda_approvedIndexMap;
	}



	HashMap<Integer, Long> mapInstanceForIdIndex = new HashMap<Integer, Long>();
	HashMap<String, ArrayList<Long>> mapInstanceForCompanyIndex = new HashMap<String, ArrayList<Long>>();
	HashMap<String, ArrayList<Long>> mapInstanceForDrugIndex = new HashMap<String, ArrayList<Long>>();
	HashMap<Short, ArrayList<Long>> mapinstanceForTrialIndex = new HashMap<Short, ArrayList<Long>>();
	HashMap<Short, ArrayList<Long>> mapInstanceForPatientsIndex = new HashMap<Short, ArrayList<Long>>();
	HashMap<Short, ArrayList<Long>> mapInstanceForDosageMgIndex = new HashMap<Short, ArrayList<Long>>();
	HashMap<Float, ArrayList<Long>> mapInstanceForReadingIndex = new HashMap<Float, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> mapInstanceForDoubleBlindIndex = new HashMap<Boolean, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> mapInstanceForControlledStudyIndex = new HashMap<Boolean, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> mapInstanceForGovtFundedIndex = new HashMap<Boolean, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> mapInstanceForFDAIndex = new HashMap<Boolean, ArrayList<Long>>();
	
	boolean flag = false;
	
	
	public int createDatabase(ArrayList<PharmaCompanyAttributes> pcList,
			String headerRecord) {
		RandomAccessFile randomAccessFile = null;
		File file = new File(dbFileName);
		if (file.exists()) {
			System.out.println("Deleteing the old DB File: " + dbFileName);
			file.delete();
		}

		try {
			randomAccessFile = new RandomAccessFile(dbFileName, "rw");
			long offset = -1;
			System.out.println("Writing the records to the database");
			for (PharmaCompanyAttributes pc : pcList) {
				offset = randomAccessFile.getFilePointer();
				//System.out.println(" "+offset);
				randomAccessFile.writeInt(pc.getId());
				byte length = (byte) pc.getCompany().length();
				randomAccessFile.writeByte(length);
				randomAccessFile.writeBytes(pc.getCompany());
				randomAccessFile.writeBytes(pc.getDrug_id());
				randomAccessFile.writeShort(pc.getTrials());
				randomAccessFile.writeShort(pc.getPatients());
				randomAccessFile.writeShort(pc.getDosage_mg());
				randomAccessFile.writeFloat(pc.getReading());
				byte double_blind_mask;
				byte controlled_study_mask;
				byte govt_funded_mask;
				byte fda_approved_mask;
				
				if(pc.isDouble_blind()){
					double_blind_mask      = 0x08;
				}
				else{
					double_blind_mask      = 0x00;
				}
				if(pc.isControlled_study()){
					controlled_study_mask      = 0x04;
				}
				else{
					controlled_study_mask      = 0x00;
				}
				if(pc.isGovt_funded()){
					govt_funded_mask      = 0x02;
				}
				else{
					govt_funded_mask      = 0x00;
				}
				if(pc.isFda_approved()){
					fda_approved_mask      = 0x01;
				}
				else{
					fda_approved_mask      = 0x00;
				}
				byte commonByte = 0x00;               //  binary 0000 0000
				commonByte = (byte)(commonByte | double_blind_mask);
				commonByte = (byte)(commonByte | controlled_study_mask);
				commonByte = (byte)(commonByte | govt_funded_mask);
				commonByte = (byte)(commonByte | fda_approved_mask);
				randomAccessFile.writeByte(commonByte);			

				
				updateIDIndex(pc.getId(), offset);
				updateStringIndex(pc.getCompany(),offset,mapInstanceForCompanyIndex);
				updateStringIndex(pc.getDrug_id(),offset,mapInstanceForDrugIndex);
				updateShortIndex(pc.getTrials(),offset,mapinstanceForTrialIndex);
				updateShortIndex(pc.getPatients(),offset,mapInstanceForPatientsIndex);
				updateShortIndex(pc.getDosage_mg(),offset,mapInstanceForDosageMgIndex);
				updateReadingIndex(pc.getReading(),offset);
				updateBooleanIndex(pc.isDouble_blind(),offset,mapInstanceForDoubleBlindIndex);
				updateBooleanIndex(pc.isControlled_study(),offset,mapInstanceForControlledStudyIndex);
				updateBooleanIndex(pc.isGovt_funded(),offset,mapInstanceForGovtFundedIndex);
				updateBooleanIndex(pc.isFda_approved(),offset,mapInstanceForFDAIndex);
			}
			writeIndexFiles();
			

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable to create the database file");
			return -1;
		} finally {
			try {
				randomAccessFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}
	
	
	
	public int writeIndexFiles() {
		IndexeReadWrite.writeIndexFile(indexIdFile, mapInstanceForIdIndex);
		IndexeReadWrite.writeIndexFile(companyIndexFile, mapInstanceForCompanyIndex);
		IndexeReadWrite.writeIndexFile(drugIdIndexFile, mapInstanceForDrugIndex);
		IndexeReadWrite.writeIndexFile(tailsIndexFile, mapinstanceForTrialIndex);
		IndexeReadWrite.writeIndexFile(patientsIndexFile, mapInstanceForPatientsIndex);
		IndexeReadWrite.writeIndexFile(dosageIndexFile, mapInstanceForDosageMgIndex);
		IndexeReadWrite.writeIndexFile(readingIndexFile, mapInstanceForReadingIndex);
		IndexeReadWrite.writeIndexFile(doubleBlindIndexFile, mapInstanceForDoubleBlindIndex);
		IndexeReadWrite.writeIndexFile(controlledStudyIndexFile, mapInstanceForControlledStudyIndex);
		IndexeReadWrite.writeIndexFile(govtFundsIndexFile, mapInstanceForGovtFundedIndex);
		IndexeReadWrite.writeIndexFile(fdaApprovedIndexFile, mapInstanceForFDAIndex);
	
		
		return 0;
	}
	
	
	public int updateIDIndex(Integer id, long offset) {
		mapInstanceForIdIndex.put(id, offset);
		return 0;
	}
	
	public int updateStringIndex(String key, long offset, HashMap<String,  ArrayList<Long>> map) {
		ArrayList<Long> offsetList = map.get(key);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		map.put(key, offsetList);

		return 0;
	}

	public int updateBooleanIndex(boolean key, long offset,HashMap<Boolean,  ArrayList<Long>> map) {
		// TODO Auto-generated method stub
		ArrayList<Long> offsetList = map.get(key);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		map.put(key, offsetList);

		return 0;	
		
	}
	public int updateReadingIndex(Float reading, long offset) {
		// TODO Auto-generated method stub
		ArrayList<Long> offsetList = mapInstanceForReadingIndex.get(reading);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		mapInstanceForReadingIndex.put(reading, offsetList);

		return 0;	
		
	}
	public int updateShortIndex(short key, long offset,HashMap<Short,  ArrayList<Long>> map) {
		// TODO Auto-generated method stub
		ArrayList<Long> offsetList = map.get(key);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		map.put(key, offsetList);

		return 0;		
	}
	
	@SuppressWarnings("unchecked")
	public int readIndexes() {
		mapInstanceForIdIndex = (HashMap<Integer, Long>) IndexeReadWrite.readIndexFile(indexIdFile);
		mapInstanceForCompanyIndex = (HashMap<String, ArrayList<Long>>) IndexeReadWrite.readIndexFile(companyIndexFile);
		mapInstanceForDrugIndex = (HashMap<String, ArrayList<Long>>) IndexeReadWrite.readIndexFile(drugIdIndexFile);
		mapinstanceForTrialIndex = (HashMap<Short, ArrayList<Long>>) IndexeReadWrite.readIndexFile(tailsIndexFile);
		mapInstanceForPatientsIndex = (HashMap<Short, ArrayList<Long>>) IndexeReadWrite.readIndexFile(patientsIndexFile);
		mapInstanceForDosageMgIndex = (HashMap<Short, ArrayList<Long>>) IndexeReadWrite.readIndexFile(dosageIndexFile);
		mapInstanceForReadingIndex = (HashMap<Float, ArrayList<Long>>) IndexeReadWrite.readIndexFile(readingIndexFile);
		mapInstanceForDoubleBlindIndex = (HashMap<Boolean, ArrayList<Long>>) IndexeReadWrite.readIndexFile(doubleBlindIndexFile);
		mapInstanceForControlledStudyIndex = (HashMap<Boolean, ArrayList<Long>>) IndexeReadWrite.readIndexFile(controlledStudyIndexFile);
		mapInstanceForGovtFundedIndex = (HashMap<Boolean, ArrayList<Long>>) IndexeReadWrite.readIndexFile(govtFundsIndexFile);
		mapInstanceForFDAIndex = (HashMap<Boolean, ArrayList<Long>>) IndexeReadWrite.readIndexFile(fdaApprovedIndexFile);
		return 0;

	}
	
	
	public boolean fileExists(String fileName) {

		File file = new File(fileName);
		if (file.exists()) {
			System.out.println("File: " + fileName + " Exists");
			return true;
		} else {
			System.err.println("File: " + fileName + " doesn't Exists");
			return false;
		}
	}
	
	public int initIndexes() {
		if (!flag) {
			if (fileExists(dbFileName) &&
					fileExists(indexIdFile) &&
					fileExists(companyIndexFile)&&
					fileExists(drugIdIndexFile)&&
					fileExists(tailsIndexFile)&&
					fileExists(patientsIndexFile)&&
					fileExists(dosageIndexFile)&&
					fileExists(readingIndexFile)&&
					fileExists(doubleBlindIndexFile)&&
					fileExists(controlledStudyIndexFile)&&
					fileExists(govtFundsIndexFile)&&
					fileExists(fdaApprovedIndexFile))
					{
				readIndexes();
				flag = true;

			} else {
				System.out
						.println("Missing files.Database file and all index files are required.");
				System.out
						.println("Please run the dataImport.importCSVToDatabaseFile Method to recover the files. Before running the program again");
				System.out.println("Fatal Error: Exiting the program");
				System.exit(-1);
			}

		}
		return 0;
	}
	
	
	public PharmaCompanyAttributes readNextDataRecord(RandomAccessFile randomAccessFile)
			throws IOException {
		PharmaCompanyAttributes pc;

		try {
			Integer id =  randomAccessFile.readInt();
			byte length = randomAccessFile.readByte();
	
			String company="";
			for(int i=0;i<length;i++)
			{
			company += (char)randomAccessFile.readByte();
			}			
			String drug_id = "";
			for(int i=0;i<6;i++)
			{
				drug_id += (char)randomAccessFile.readByte();
			}
			short trials = randomAccessFile.readShort() ;
			short patients = randomAccessFile.readShort();
			short dosage_mg = randomAccessFile.readShort();
			Float reading = randomAccessFile.readFloat();
			byte commonbyte = randomAccessFile.readByte();
			
			byte double_blind_mask=0x08;
			byte controlled_study_mask= 0x04;
			byte govt_funded_mask = 0x02;
			byte fda_approved_mask= 0x01;
			
			boolean double_blind;			  
			boolean controlled_study;
			boolean govt_funded;
			boolean fda_approved;
			
			if(double_blind_mask != (commonbyte & double_blind_mask ))
				double_blind = false;
			else
				double_blind = true;
			
			if(controlled_study_mask != (commonbyte & controlled_study_mask ))
				controlled_study= false;
			else
				controlled_study = true;
			
			if(govt_funded_mask != (commonbyte & govt_funded_mask ))
				govt_funded= false;
			else
				govt_funded = true;
			
			if(fda_approved_mask != (commonbyte & fda_approved_mask ))
				fda_approved= false;
			else
				fda_approved = true;
			    
			pc = new PharmaCompanyAttributes(id, company,drug_id,trials,patients,dosage_mg,reading,double_blind,controlled_study,govt_funded,fda_approved);
			
			
		} catch (EOFException e) {
			return null;

		}
		return pc;
	}
	
	

		public  int selectionByID(int id, char op) {
			initIndexes();
			Integer idValue = id ;
			System.out.println("\nSelecting by ID : " + idValue);
			Long offset;
			Set<Integer> keys = mapInstanceForIdIndex.keySet();
			for(Iterator i= keys.iterator();i.hasNext();){
				Integer key = (Integer) i.next();
		        if(key<idValue && op=='<')
		        {
		        	if ((offset = mapInstanceForIdIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
		        	}

		    	}else if(key>idValue && op=='>')
		    	{
		    		if ((offset = mapInstanceForIdIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
		        	}
		    	}else if((int)key==(int)idValue && op=='=')
		        {
		    		if ((offset = mapInstanceForIdIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
		        	}
		    	}else if((int)key!=(int)idValue && op=='!')
		        {
		    		if ((offset = mapInstanceForIdIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
		        	}
		    	}
		    }
			return 0;
		}
		
		public int selectByIDGL(Long offset,Object key,Object idValue)
		{
			PharmaCompanyAttributes pc = null;
    		RandomAccessFile randomAccessFile = null;
    		int count=0;
			try {
    			randomAccessFile = new RandomAccessFile(dbFileName, "rw");
    			randomAccessFile.seek(offset);

    			if ((pc = readNextDataRecord(randomAccessFile)) != null) {
    					System.out.println(pc);
    					count++;
    			}

    		} catch (Exception e) {
    			e.printStackTrace();
    			System.err.println("Unable to perform search");
    			return -1;
    		} finally {
    			try {
    				randomAccessFile.close();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
			 System.out.println("\nNumber of records: "+count);
			return 0;
		}
	
		public int selectByString(String value, String index) {
		
			initIndexes();
			HashMap<String, ArrayList<Long>> map = null;
			if (index.equalsIgnoreCase("drug_id"))
			{
				map=mapInstanceForDrugIndex;
			}else if(index.equalsIgnoreCase("company"))
			{
				map=mapInstanceForCompanyIndex;

			}
			
			String strValue = value ;
			System.out.println("\nSelecting by ID : " + strValue);
			ArrayList<Long> offsets = null;
			Set<String> keys = map.keySet();
    		RandomAccessFile randomAccessFile = null; 	
    		PharmaCompanyAttributes pc = null;
		        	int count=0;
					try {
		        		randomAccessFile = new RandomAccessFile(dbFileName, "rw");
			        	for(Iterator i= keys.iterator();i.hasNext();){
			    				String key = (String) i.next();
			    				offsets = map.get(key);
			    				if(key.contains(strValue))
			    				{
			    					for (Long offset : offsets) {
			    						randomAccessFile.seek(offset);		
					        			if ((pc = readNextDataRecord(randomAccessFile)) != null) {
					        					System.out.println(pc);
					        					count++;
					        			}
		
				    				} 
			    				}
			        	}
			        	if(pc ==null){
			        		System.out.println("No records found "+strValue);
			        	}
		        	}catch (Exception e) {
		        			e.printStackTrace();
		        			System.err.println("Unable to perform search");
		        			return -1;
		        		} finally {
		        			try {
		        				randomAccessFile.close();
		        			} catch (IOException e) {
		        				// TODO Auto-generated catch block
		        				e.printStackTrace();
		        			}
		        		}
					 System.out.println("\nNumber of records: "+count);
			return 0;

		}
		
		public int selectionByShort(Short value, String index, char op) {
			initIndexes();
			HashMap<Short, ArrayList<Long>> map = null;
			if (index.equalsIgnoreCase("patients"))
			{
				map = mapInstanceForPatientsIndex;
			}else if(index.equalsIgnoreCase("trials"))
			{
				map= mapinstanceForTrialIndex;

			}
			else if(index.equalsIgnoreCase("dosage_mg")){
				map = mapInstanceForDosageMgIndex;
			}
			
			Short idValue = value ;
			System.out.println("\nSelecting : " + idValue);
			ArrayList<Long> offsets = null;
			Set<Short> keys = map.keySet();
			for(Iterator i= keys.iterator();i.hasNext();){
				Short key = (Short) i.next();
		        if(key<idValue && op=='<')
		        {
		        	if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        		}
		        	}

		    	}else if(key>idValue && op=='>')
		    	{
		    		if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        		}
		        	}
		    	}else if((int)key==(int)idValue && op=='=')
		        {
		    		if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        		}
		        	}
		    	}else if((int)key!=(int)idValue && op=='!')
		        {
		    		if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        		}
		        	}
		    	}
		    }
			if(offsets ==null){
        		System.out.println("No records found "+idValue);
        	}
		
			return 0;
		}
		
		public int selectionByReading(Float value, char op) {
			initIndexes();
			
			Float readValue = value ;
			System.out.println("\nSelecting : " + readValue);
			ArrayList<Long> offsets = null;
			Set<Float> keys = mapInstanceForReadingIndex.keySet();
			for(Iterator i= keys.iterator();i.hasNext();){
				Float key = (Float) i.next();
		        if(key<readValue && op=='<')
		        {
		        	if ((offsets = mapInstanceForReadingIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        		}
		        	}

		    	}else if(key>readValue && op=='>')
		    	{
		    		if ((offsets = mapInstanceForReadingIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        		}
		        	}
		    	}else if((float)key==(float)readValue && op=='=')
		        {
		    		if ((offsets = mapInstanceForReadingIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        		}
		        	}
		    	}else if((float)key!=(float)readValue && op=='!')
		        {
		    		if ((offsets = mapInstanceForReadingIndex.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        		}
		        	}
		    	}
		    }
			if(offsets ==null){
        		System.out.println("No records found "+readValue);
        	}
			
			return 0;
		}
		
		public int selectByBoolean(Boolean value, String index) {
			
			initIndexes();
			HashMap<Boolean, ArrayList<Long>> map = null;
			if (index.equalsIgnoreCase("double_blind"))
			{
				map=mapInstanceForDoubleBlindIndex;
			}else if(index.equalsIgnoreCase("controlled_study"))
			{
				map=mapInstanceForControlledStudyIndex;
			}else if(index.equalsIgnoreCase("govt_funded")){
				map=mapInstanceForGovtFundedIndex;
			}else if(index.equalsIgnoreCase("fda_approved")){
				map=mapInstanceForFDAIndex;
			}
			
			Boolean boolValue = value ;
			System.out.println("\nSelecting : " + boolValue);
			ArrayList<Long> offsets = null;
			Set<Boolean> keys = map.keySet();
    		RandomAccessFile randomAccessFile = null; 	
    		PharmaCompanyAttributes pc = null;
    		int count = 0;
		        	try {
		        		randomAccessFile = new RandomAccessFile(dbFileName, "rw");
			        	for(Iterator i= keys.iterator();i.hasNext();){
			    				Boolean key = (Boolean) i.next();
			    				offsets = map.get(key);
			    				if(key.equals(boolValue))
			    				{
			    					for (Long offset : offsets) {
			    						randomAccessFile.seek(offset);		
					        			if ((pc = readNextDataRecord(randomAccessFile)) != null) {
					        					System.out.println(pc);	
					        					count++;
					        			}
		
				    				} 
			    				}
			        	}
			        	if(pc ==null){
			        		System.out.println("No records found "+boolValue);
			        	}
		        	}catch (Exception e) {
		        			e.printStackTrace();
		        			System.err.println("Unable to perform search");
		        			return -1;
		        		} finally {
		        			try {
		        				randomAccessFile.close();
		        			} catch (IOException e) {
		        				// TODO Auto-generated catch block
		        				e.printStackTrace();
		        			}
		        		}
		     System.out.println("\nNumber of records: "+count);
			return 0;

		}
}//class
