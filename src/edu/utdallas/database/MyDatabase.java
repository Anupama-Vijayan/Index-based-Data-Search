package edu.utdallas.database;

import java.io.IOException;
import java.util.Scanner;


public class MyDatabase 
{

	public static void main(String[] args) throws IOException 
	{
		
		String databasefilename = "data.db";
		String idIndexFile = "id.ndx";
		String compnyIndexFile = "company.ndx";
		String drugIdIndexFile = "drug_id.ndx";
		String trialsIndexFile = "trials_id.ndx";
		String patientsIndexFile = "patients.ndx";
		String dosageIndexFile ="dosage_mg.ndx";
		String readingIndexFile ="reading.ndx";
		String doubleBlindIndexFile = "double_blind.ndx";
		String controlledStudyIndexFile = "controlled_study.ndx";
		String govtFundedIndexFile = "govt_funded.ndx";
		String fdaApprovedIndexFile = "fda_approved.ndx";
		String inputFile ="PHARMA_TRIALS_1000B.csv";
		

		FileConfiguration database=new FileConfiguration();
		database.setDbFileName(databasefilename);
		database.setIdIndexFile(idIndexFile);
		database.setCompanyIndexFile(compnyIndexFile);
		database.setDrug_idIndexFile(drugIdIndexFile);
		database.setTrialsIndexFile(trialsIndexFile);
		database.setPatientsIndexFile(patientsIndexFile);
		database.setDosage_mgIndexFile(dosageIndexFile);
		database.setReadingIndexFile(readingIndexFile);
		database.setDouble_blindIndexFile(doubleBlindIndexFile);
		database.setControlled_studyIndexFile(controlledStudyIndexFile);
		database.setGovt_fundedIndexFile(govtFundedIndexFile);
		database.setFda_approvedIndexFile(fdaApprovedIndexFile);

		if(!FileUtility.fileExists(databasefilename)){
			
			if(FileUtility.fileExists(inputFile)){
			ImportPharmaData dataImport= new ImportPharmaData();
			
			dataImport.importFromCSVToDb(inputFile,database);
			}
			else{
				System.out.println("Cannot Import data");
			}
		}
		else{
			System.out.println("Using existing data.db file");
		}
		
		
		
		System.out.println("\nEnter search attribute ");
		System.out.println("1 for Id"+ "\n" + "2 for company" + "\n" + "3 for drug_id"+ "\n" + "4 for trials"+"\n" + "5 for patients"+"\n" + "6 for dosage_mg"+"\n" + "7 for reading"+"\n" + "8 for double_blind"+"\n" + "9 for controlled_study"+"\n" + "10 for govt_funded"+"\n" + "11 for fda_approved");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		switch(input){
		case 1:
			System.out.println("Enter ID");
			Scanner sc1 = new Scanner(System.in);
			int id = sc1.nextInt();
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s = new Scanner(System.in);
			int op = s.nextInt();
			switch(op){
				case 1:
					database.selectionByID(id,'<');
					break;
				case 2:
					database.selectionByID(id,'>');
					break;
				case 3:
					database.selectionByID(id,'=');
					break;
				case 4:
					database.selectionByID(id,'!');
					break;
				default:
					System.out.println("Invalid Selection " + op);
					break;
			}
			break;
		case 2:
			System.out.println("Enter company");
			Scanner s2 = new Scanner(System.in);
			String name = s2.nextLine();
			database.selectByString(name,"company");
			break;
		case 3:
			System.out.println("Enter drug_id");
			Scanner s3 = new Scanner(System.in);
			String drug = s3.nextLine();
			database.selectByString(drug,"drug_id");
			break;
		case 4:
			System.out.println("Enter trials");
			Scanner sc2 = new Scanner(System.in);
			String trials = sc2.nextLine();
			String regex = "\\d+";
			short tr = 0;
			if(trials.matches(regex))
			{
				 tr = Short.parseShort(trials);
			}
			else
			{
				System.out.println("Invalid value for input. System Exiting!!");
				return;
			}
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s4 = new Scanner(System.in);
			int op1 = s4.nextInt();
			switch(op1){
				case 1:
					database.selectionByShort(tr, "trials",'<');
					break;
				case 2:
					database.selectionByShort(tr,"trials",'>');
					break;
				case 3:
					database.selectionByShort(tr,"trials",'=');
					break;
				case 4:
					database.selectionByShort(tr,"trials",'!');
					break;
				default:
					System.out.println("Invalid Selection " + op1);
					break;
			}
			break;
		case 5:
			System.out.println("Enter patients");
			Scanner sc3 = new Scanner(System.in);
			Integer patients = sc3.nextInt();
			short pt = patients.shortValue();
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s5 = new Scanner(System.in);
			int op2 = s5.nextInt();
			switch(op2){
				case 1:
					database.selectionByShort(pt, "patients",'<');
					break;
				case 2:
					database.selectionByShort(pt,"patients",'>');
					break;
				case 3:
					database.selectionByShort(pt,"patients",'=');
					break;
				case 4:
					database.selectionByShort(pt,"patients",'!');
					break;
				default:
					System.out.println("Invalid Selection " + op2);
					break;
			}
			break;
		case 6:
			System.out.println("Enter dosage_mg");
			Scanner sc4 = new Scanner(System.in);
			Integer dosage_mg = sc4.nextInt();
			short dm = dosage_mg.shortValue();
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s6 = new Scanner(System.in);
			int op3 = s6.nextInt();
			switch(op3){
				case 1:
					database.selectionByShort(dm, "dosage_mg",'<');
					break;
				case 2:
					database.selectionByShort(dm,"dosage_mg",'>');
					break;
				case 3:
					database.selectionByShort(dm,"dosage_mg",'=');
					break;
				case 4:
					database.selectionByShort(dm,"dosage_mg",'!');
					break;
				default:
					System.out.println("Invalid Selection " + op3);
					break;
			}
			break;
		case 7:
		System.out.println("Enter reading");
		Scanner sc5 = new Scanner(System.in);
		String reading = sc5.nextLine();
		regex = "^[0-9]*\\.?[0-9]*$";
		Float f;
		if(reading.matches(regex)) {
			 f = Float.parseFloat(reading);
		}
		else {
			System.out.println("Invalid value for input. System Exiting!!");
			return;
		}
		
		System.out.println("\nEnter the operator");
		System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
		Scanner s7 = new Scanner(System.in);
		int op4 = s7.nextInt();
		switch(op4){
			case 1:
				database.selectionByReading(f,'<');
				break;
			case 2:
				database.selectionByReading(f,'>');
				break;
			case 3:
				database.selectionByReading(f,'=');
				break;
			case 4:
				database.selectionByReading(f,'!');
				break;
			default:
				System.out.println("Invalid Selection " + op4);
				break;
		}
		break;
		case 8:
			System.out.println("Enter double_blind");
			Scanner s8 = new Scanner(System.in);
			String double_blind = s8.nextLine();
			Boolean db = Boolean.parseBoolean(double_blind);
			database.selectByBoolean(db,"double_blind");
			break;
		case 9:
			System.out.println("Enter controlled_study");
			Scanner s9 = new Scanner(System.in);
			String controlled_study = s9.nextLine();
			Boolean cs = null;
			if (controlled_study.equalsIgnoreCase("true")||controlled_study.equalsIgnoreCase("false"))
			{
			cs = Boolean.parseBoolean(controlled_study);
			}
			database.selectByBoolean(cs,"controlled_study");
			break;
		case 10:
			System.out.println("Enter govt_funded");
			Scanner s10 = new Scanner(System.in);
			Boolean gf = null;
			String govt_funded = s10.nextLine();
			if (govt_funded.equalsIgnoreCase("true")||govt_funded.equalsIgnoreCase("false"))
			{
			gf = Boolean.parseBoolean(govt_funded);
			}
			database.selectByBoolean(gf,"govt_funded");
			break;
		case 11:
			System.out.println("Enter fda_approved");
			Scanner s11 = new Scanner(System.in);
			Boolean fa = null;
			String fda_approved = s11.nextLine();
			if (fda_approved.equalsIgnoreCase("true")||fda_approved.equalsIgnoreCase("false"))
			{
				fa = Boolean.parseBoolean(fda_approved);
			}
			database.selectByBoolean(fa,"fda_approved");
			break;
		default:
			System.out.println("Invalid selection "+input);
			break;
			
		}
	
	}
	
}
