package api.com;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;





 @Path("/")
public class BaseClassApi 
{
	private DataService dataService = DataService.getInstance();
	
	
	@POST
	@Path("doctor")
    @Consumes(MediaType.APPLICATION_JSON)
 	@Produces(MediaType.APPLICATION_JSON)
 	public Response getdoctors(Doctors doctor)
 	{
 		return Response.status(200).entity(dataService.doctor(doctor)).build();
 	}
	
	 @GET
	 @Path("doctor")
     @Produces(MediaType.APPLICATION_JSON)
     public CheckDoctors getdoctors() {
         return dataService.getdoctors();
     }
     
	 @GET
	 @Path("doctor/{doctorid}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getdoctor(@PathParam("doctorid") String id) {
	        CheckDoctors doctor = dataService.getdoctorbyid(id);
	        if (doctor == null) {
	        	 return Response
	   			      .status(Response.Status.NOT_FOUND).entity(dataService.getdoctorbyid(id))
	   			      .build();
	        } else {
	            return Response.ok()
	                           .entity(doctor)
	                           .build();
	        }
	    }
	
	 @GET
	 @Path("onboarding")
	 @Produces(MediaType.APPLICATION_JSON)
	 public CheckOnboarding getonboardingesponse() {
		 
		 	CheckOnboarding onboard=new CheckOnboarding();
		 	
		try
		{
			List<Onboarding> onboarding = new ArrayList<Onboarding>();
			
			Onboarding obj=null;
			obj=new Onboarding();
			obj.setTitle("Visual EMR  previous data");
			obj.setDescription("Get access to patient EMR from their previous consultation");
			obj.setImage("preview.jpg");
			
			Onboarding obj1=null;
			obj1=new Onboarding();
			obj1.setTitle("Manage appointments easily");
			obj1.setDescription("smart assistants prioritize appointments,facilitate consultation and schedule followups");
			obj1.setImage("images.png");
			
			Onboarding obj2=null;
			obj2=new Onboarding();
			obj2.setTitle("Seamless Data migration");
			obj2.setDescription("Access via app and web");
			obj2.setImage("preview.jpg");
			
			Onboarding obj4=null;
			obj4=new Onboarding();
			obj4.setTitle("Automate invoice and billing");
			obj4.setDescription("Leave your operation to us");
			obj4.setImage("image3.jpg");
			
			onboarding.add(obj);
			onboarding.add(obj1);
			onboarding.add(obj2);
			onboarding.add(obj4);
			
			onboard.setMessage("Success");
			onboard.setStatus("200");
			onboard.setData(onboarding);
			
			return onboard;
		}
		catch(Exception e)
		{
			onboard.setMessage(e.getMessage());
			onboard.setData(null);
			onboard.setStatus("400");
		}
		return onboard;
			 
		}
	 
	    @POST
		@Path("clinic")
	    @Consumes(MediaType.APPLICATION_JSON)
	 	@Produces(MediaType.APPLICATION_JSON)
	 	public Response getclinic(Clinic clinic)
	 	{
	    	return Response.status(200).entity(dataService.clinic(clinic)).build();
	 	}
	    
	     @GET
		 @Path("clinic")
	     @Produces(MediaType.APPLICATION_JSON)
	     public CheckClinic getclinics() {
	         return dataService.getcliniclist();
	     }
	     
	     @GET
		 @Path("clinic/{clinicid}")
		 @Produces(MediaType.APPLICATION_JSON)
		 public Response getclinicbyid(@PathParam("clinicid") String id) {
		        CheckClinic clinic = dataService.getClinicById(id);
		        if (clinic == null) {
		            return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
		                      .build();
		        } else {
		            return Response.ok()
		                           .entity(clinic)
		                           .build();
		        }
		    }
	     
	     @PUT
	     @Path("clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getCustomer(@PathParam("clinicid") String id,Clinic cs) {
	         CheckClinic cur = dataService.getClinicById(id);
	         if (cur == null) {
	             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
	                       .build();
	         } else {
	        	 return Response.ok()
	                            .entity(dataService.updateclinicdetails(id,cs.getClinicname(),cs.getRegistrationno(),cs.getLocation(),cs.getAadharcard(),cs.getEmailid(),cs.getQualificationname(),cs.getPhoneNumber(),cs.getInstitutename(),cs.getClinictype(),cs.getProcurementyear(),cs.getYearsofpractice(),cs.getAssociatedfacilites(),cs.getClinicregistration(),cs.getDocname()))
	                            .build();
	         }
	     }
	     
	     @DELETE
	     @Path("clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getdetail(@PathParam("clinicid") String id) {
	         CheckClinic del = dataService.getdeleteclinic(id);
	         if (del == null) {
	             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
	                       .build();
	         } else {
	        	 
	             return Response.ok()
	                            .entity(del)
	                            .build();
	         }
	     }
	     
	     @GET
		 @Path("paymentplans")
		 @Produces(MediaType.APPLICATION_JSON)
		 public CheckPaymentplans getpaymentplansesponse() 
	     {
	    	CheckPaymentplans plans=new CheckPaymentplans();
	    	List<Paymentplans> plan=new ArrayList<Paymentplans>();
	    	
	    	Paymentplans obj=null;
	    	obj=new Paymentplans();
	    	
	    	obj.setTitle("Basic plan rs999/month");
	    	obj.setDescription("your plan includes:1.advanced Calendar-manages appointment\"+ \"2.professional billing\"+ \"3.Unlimited appointment confirmation,reminders and followups\"+ \"4.share records with patients");
	    	obj.setImage("image2.jpg");
	    	obj.setButton1("Start your free 30day trial now");
	    	
	    	Paymentplans obj1=null;
	    	obj1=new Paymentplans();
	    	
	    	obj1.setTitle("Business plan rs1499/month");
	    	obj1.setDescription("your plan includes:1.advanced Calendar-manages appointment\"+\"2.professional billing\"+\"3.Unlimited appointment confirmation,reminders and followups\"+\"4.share records with patients\"+\"5.supports 13local languages\"+\"6.patient education tips and videos\"+\"24/7 helpdesk support");
	    	obj1.setImage("image2.jpg");
	    	obj1.setButton1("Start your free 30day trial now");
	    	
	    	plan.add(obj);
	    	plan.add(obj1);
	    	
	    	plans.setMessage("Success");
	    	plans.setStatus("200");
	    	plans.setData(plan);
	    	
	    	
			return plans;
				
		 }
		 
	     @GET
		 @Path("FAQs")
		 @Produces(MediaType.APPLICATION_JSON)
		 public CheckFAQs getFAQsResponse() 
	     {
	    	CheckFAQs faqs=new CheckFAQs();
	    	List<FAQs> faq=new ArrayList<FAQs>();
	    	
	    	FAQs obj=null;
	    	obj=new FAQs();
	    	obj.setTopic("Topic 01");
	    	obj.setQuestion("What does speco do");
	    	obj.setAnswer("speco");
	    	
	    	FAQs obj1=null;
	    	obj1=new FAQs();
	    	
	    	obj1.setTopic("Topic 02");
	    	obj1.setQuestion("How does online consultation work");
	    	obj1.setAnswer("speco");
	    	
	    	faq.add(obj);
	    	faq.add(obj1);
	    	
	    	faqs.setMessage("Success");
	    	faqs.setStatus("200");
	    	faqs.setData(faq);
	    	
	    	
			return faqs;
				
		 }
	     	@POST
			@Path("enquiry")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response GetEnquiryResponse(Enquiry enquiry)
		 	{
		    	return Response.status(200).entity(dataService.AddEnquiry(enquiry)).build();
		 	}
		    
	     	@POST
			@Path("appointment")
		    @Consumes(MediaType.APPLICATION_JSON)
		 	@Produces(MediaType.APPLICATION_JSON)
		 	public Response AddAppointment(Appointment appointment)
		 	{
		    	return Response.status(200).entity(dataService.AddAppointment(appointment)).build();
		 	}
	     	
	     	 @GET
			 @Path("appointment")
		     @Produces(MediaType.APPLICATION_JSON)
		     public CheckAppointment getappointments() {
		         return dataService.GetAppointment();
		     }
	     	
	     	 
	     	 @GET
			 @Path("closedappointment")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckClosedAppointment GetClosedAppointment() 
		     {
		    	return dataService.GetClosedAppointment();
					
			 }
	     	 
	     	 
	     	 @PUT
		     @Path("closedappointment/{patientid}")
		     @Produces(MediaType.APPLICATION_JSON)
		     @Consumes(MediaType.APPLICATION_JSON)
		     public Response UpdateClosedAppointment(@PathParam("patientid") String id,ClosedAppointment ca) {
		         CheckClosedAppointment cca = dataService.GetClosedAppointmentById(id);
		         if (cca == null) {
		             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
		                       .build();
		         } else {
		        	 return Response.ok()
		                            .entity(dataService.updateappointmentrequest(id,ca.getPatientname(),ca.getDescription(),ca.getDate(),ca.getTime(),ca.getAction()))
		                            .build();
		         }
		     }
	     	 
	     	 @GET
			 @Path("cancelledappointment")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckCancelledAppointment GetCancelledAppointment() 
		     {
		    	return dataService.GetCancelledAppointment();
			 }
	     	 
	     	 @PUT
		     @Path("cancelledappointment/{patientid}")
		     @Produces(MediaType.APPLICATION_JSON)
		     @Consumes(MediaType.APPLICATION_JSON)
		     public Response UpdateCancelledAppointment(@PathParam("patientid") String id,CancelledAppointment ca) {
		         CheckCancelledAppointment cca = dataService.GetCancelledAppointmentById(id);
		         if (cca == null) {
		             return Response.status(Response.Status.NOT_FOUND).entity(dataService.GetCancelledAppointmentById(id))
		                       .build();
		         } else {
		        	 return Response.ok()
		                            .entity(dataService.UpdateRejectAppointment(id,ca.getPatientname(),ca.getReason()))
		                            .build();
		         }
		     }
	     	 
	     	 @GET
			 @Path("patient")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckPatient GetPatient() 
		     {
		    	return dataService.GetPatient();					
			 }
	     	 
	     	 @GET
			 @Path("payment")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckPayment GetPaymentResponse() 
		     {
		    	CheckPayment payments=new CheckPayment();
		    	List<Payment> payment=new ArrayList<Payment>();
		    	
		    	Payment obj=null;
		    	obj=new Payment();
		    	obj.setPatientid("52562");
		    	obj.setPatientname("Hetasvi Bhatt");
		    	obj.setDate("12 oct 2021");
		    	obj.setTime("11:00 am to 12:00 pm");
		    	obj.setCharges("3890 rs");
		    	obj.setDetail("visiting charge");
		    	obj.setQuantity("0");
		    	obj.setUnitcost("0");
		    	obj.setDiscount("0");
		    	obj.setTotal("2000");
		    	
		    	Payment obj1=null;
		    	obj1=new Payment();
		    	obj1.setPatientid("52562");
		    	obj1.setPatientname("Hetasvi Bhatt");
		    	obj1.setDate("12 oct 2021");
		    	obj1.setTime("11:00 am to 12:00 pm");
		    	obj1.setCharges("3890 rs");
		    	obj1.setTotal("Paid");
		    	
		    	payment.add(obj);
		    	payment.add(obj1);
		    	
		    	payments.setMessage("Success");
		    	payments.setStatus("200");
		    	payments.setData(payment);
		    	
		    	
				return payments;
					
			 }
	     	 
	     	 @GET
			 @Path("EMR")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckEMR GetEMRResponse() 
		     {
		    	CheckEMR emrs=new CheckEMR();
		    	List<EMR> emr=new ArrayList<EMR>();
		    	
		    	EMR obj=null;
		    	obj=new EMR();
		    	obj.setPatientname("Hetasvi Bhatt");
		    	obj.setConsultedto("Dr viral vyas");
		    	obj.setGender("Female");
		    	obj.setAge("23 years");
		    	obj.setSymptoms("cough");
		    	obj.setFinding("urine output normal");
		    	obj.setDiagnosis("viral infection");
		    	obj.setInstruction("careful");
		    	obj.setFollowup("6th nov online consultation 4:00 pm to 6:00 pm");
		    	obj.setPrescription("domstal 4x3 times a day");
		    	obj.setEmrgenerated("image1.jpg");
		    	obj.setInvoicegenerated("image1.jpg");
		    	
		    	
		    	EMR obj1=null;
		    	obj1=new EMR();
		    	obj1.setPatientname("Hetasvi Bhatt");
		    	obj1.setConsultedto("Dr viral vyas");
		    	obj1.setGender("Female");
		    	obj1.setAge("23 years");
		    	obj1.setSymptoms("cough");
		    	obj1.setFinding("urine output normal");
		    	obj1.setDiagnosis("viral infection");
		    	obj1.setInstruction("careful");
		    	obj1.setFollowup("6th nov online consultation 4:00 pm to 6:00 pm");
		    	obj1.setPrescription("domstal 4x3 times a day");
		    	obj1.setEmrgenerated("image1.jpg");
		    	obj1.setInvoicegenerated("image1.jpg");
		    	
		    	emr.add(obj);
		    	emr.add(obj1);
		    	
		    	emrs.setMessage("Success");
		    	emrs.setStatus("200");
		    	emrs.setData(emr);
		    	
		    	
				return emrs;
					
			 }
	     	 
	     	 @GET
			 @Path("visit")
			 @Produces(MediaType.APPLICATION_JSON)
			 public CheckVisit GetVisitResponse() 
		     {
		    	CheckVisit visits=new CheckVisit();
		    	List<Visit> visit=new ArrayList<Visit>();
		    	
		    	Visit obj=null;
		    	obj=new Visit();
		    	obj.setPatientname("Hetasvi Bhatt");
		    	obj.setGender("Female");
		    	obj.setAge("23 years");
		    	obj.setCaseid("12345");
		    	obj.setDate("aug 07 2021");
		    	obj.setTime("13:00 pm");
		    	obj.setModeofconsultation("online consultation");
		    	obj.setVisits("visit 03");
		    	obj.setChiefcomplaint("abcs");
		    	obj.setHistoryofpastillness("xyz");
		    	obj.setHistoryofpresentillness("xyz");
		    	obj.setGeneralphysicalexamination("xyz");
		    	obj.setSystematicexamination("xyz");
		    	obj.setLocalexamination("xyz");
		    	obj.setProvisionaldiagnosis("xyz");
		    	obj.setInvestigation("xyz");
		    	obj.setFinaldiagnosis("xyz");
		    	obj.setLabreports("xyz");
		    	obj.setMedications("xyz");
		    	obj.setInvoices("xyz");
		    	
		    	Visit obj1=null;
		    	obj1=new Visit();
		    	obj1.setPatientname("Hetasvi Bhatt");
		    	obj1.setGender("Female");
		    	obj1.setAge("23 years");
		    	obj1.setCaseid("12345");
		    	obj1.setDate("aug 07 2021");
		    	obj1.setTime("13:00 pm");
		    	obj1.setModeofconsultation("online consultation");
		    	obj1.setVisits("visit 03");
		    	obj1.setChiefcomplaint("abcs");
		    	obj1.setHistoryofpastillness("xyz");
		    	obj1.setHistoryofpresentillness("xyz");
		    	obj1.setGeneralphysicalexamination("xyz");
		    	obj1.setSystematicexamination("xyz");
		    	obj1.setLocalexamination("xyz");
		    	obj1.setProvisionaldiagnosis("xyz");
		    	obj1.setInvestigation("xyz");
		    	obj1.setFinaldiagnosis("xyz");
		    	obj1.setLabreports("xyz");
		    	obj1.setMedications("xyz");
		    	obj1.setInvoices("xyz");
		    	
		    	
		    	visit.add(obj);
		    	visit.add(obj1);
		    	
		    	visits.setMessage("Success");
		    	visits.setStatus("200");
		    	visits.setData(visit);
		    	
		    	
				return visits;
					
			 }

		    
	     
}
