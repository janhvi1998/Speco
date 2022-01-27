package com.api;

import java.util.ArrayList;
import java.util.List;

public class DataService 
{
	 private List<Doctors> doctor = new ArrayList<Doctors>();
	 private List<Clinic> clinic = new ArrayList<Clinic>();
	 private static DataService ourInstance = new DataService();
	 public static DataService getInstance() 
	 {
	        return ourInstance;
	 }
	 public CheckDoctors doctor(Doctors doctors) 
	 {
		 String newID=Integer.toString(doctor.size()+1);
		 doctors.setId(newID);
	 	 CheckDoctors insert=new CheckDoctors();
	 	 doctor.add(doctors);
	 	 insert.setData(doctor);
	 	 insert.setMessage("success");
	 	 insert.setStatus("200");
		 return insert;
	 }

	  public CheckDoctors getdoctors() 
	  {
		  CheckDoctors insert=new CheckDoctors();
		  insert.setData(doctor);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  public CheckDoctors getdoctorbyid(String id)
	  {
	        for (Doctors doctors : doctor) 
	        {
	            if (doctors.getId().equals(id)) {
	            	
	            	 List<Doctors> getbyid=new ArrayList<Doctors>();
		             getbyid.add(doctors);
		             CheckDoctors insert=new CheckDoctors();
		   		     insert.setData(getbyid);
		   		 	 insert.setMessage("success");
		   		 	 insert.setStatus("200");
		   			 return insert;
		         }
	               
	        }

	        return null;
	  }
	  
	  public CheckClinic clinic(Clinic clinics)
	  {
		     String newID=Integer.toString(clinic.size()+1);
			 clinics.setId(newID);
		 	 CheckClinic insert=new CheckClinic();
		 	 clinic.add(clinics);
		 	 insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  
	  
	   public CheckClinic getcliniclist() 
	   {
		     CheckClinic insert=new CheckClinic();
		     insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	   }
	 
	   public CheckClinic getClinicById(String id)
		 {
		        for (Clinic register : clinic) {
		            if (register.getId().equals(id)) 
		            {
		                
		            	 List<Clinic> getbyid=new ArrayList<Clinic>();
			             getbyid.add(register);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   			 return insert;
		              }
		        }
	
		        return null;
		 }
		 public CheckClinic getdeleteclinic(String id) 
		 {
		        for (Clinic clinics : clinic) {
		            if (clinics.getId().equals(id))
		            {
						 clinic.remove(clinics);
						 CheckClinic insert=new CheckClinic();
			   		     insert.setData(clinic);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		    return insert;
					 }
		        }
				return null;
		       
		    }
		 public CheckClinic updateclinicdetails(String id,String clinicname, String registrationno, String location
				    ,String aadharcardno,String emailid,String qualificationname,String phoneno,String institutename,
				    String clinictype,String procurementyear,String yearsofpractice,String associatedfacilites,
				    String clinicregistration,String docname)
		 {
			 for (Clinic cd : clinic) { 
		            if (cd.getId().equals(id)) 
		            {
		            	cd.setClinicname(clinicname);
		            	cd.setRegistrationno(registrationno);
		            	cd.setLocation(location);
				        cd.setAadharcard(aadharcardno);
				        cd.setEmailid(emailid);
				        cd.setQualificationname(qualificationname);
				        cd.setPhoneNumber(phoneno);
				        cd.setInstitutename(institutename);
				        cd.setClinictype(clinictype);
				        cd.setProcurementyear(procurementyear);
				        cd.setYearsofpractice(yearsofpractice);
				        cd.setAssociatedfacilites(associatedfacilites);
				        cd.setClinicregistration(clinicregistration);
				        cd.setDocname(docname);
				        
				         List<Clinic> getbyid=new ArrayList<Clinic>();
			             getbyid.add(cd);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		    return insert;
			                  }
			 }
			return null;
		 }
		 
		 
}
